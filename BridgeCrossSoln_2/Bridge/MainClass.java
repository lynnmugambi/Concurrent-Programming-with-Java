/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bridge;

/**
 *
 * @author vazeer
 */
public class MainClass {
    public static void main(String ar[])
    {
        Brid b=new Brid();
        Car c1=new Car(1,-1,b,100);
        Car c2=new Car(2,1,b,200);
        Car c3=new Car(3,-1,b,300);
        Car c4=new Car(4,1,b,300);
         Car c5=new Car(5,-1,b,300);
        Car c6=new Car(6,1,b,300);
         Car c7=new Car(7,-1,b,300);
        Car c8=new Car(8,1,b,300);
        
        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();
        c6.start();
        c7.start();
        c8.start();
        
        
    }
    
}
