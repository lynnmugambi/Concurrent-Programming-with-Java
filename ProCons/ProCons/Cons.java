/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProCons;

/**
 *
 * @author vazeer
 */
public class Cons extends Thread{
    Stock s;
    public Cons(Stock ss)
    {
        s=ss;
    }
    public void run()
    {
        try{
            while(true)
            {
                s.get();
                Thread.sleep(1000);
            }
            
        }catch(Exception e){}
        
    }
}
