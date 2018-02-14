/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bridge1;

/**
 *
 * @author vazeer
 */
public class Car extends Thread{
    int id;
    int dir;    //direction of this car
    Car cf=null;  //car in the front
    Brid b;
    int delay;    //car occupying random amount of time on the bridge
    public Car(int i,int d,Brid b,int delay)
    {
        id=i;
        dir=d;
        this.b=b;
        this.delay=delay;
    }
    
    public void run()
    {
        while(b.enter(this)==false);
        try{Thread.sleep(delay);}catch(Exception e){}
        while(b.leave(this)==false);
    }
}
