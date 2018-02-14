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
public class Pro extends Thread{
    Stock s;
    public Pro(Stock ss)
    {
        s=ss;
    }
    
    public void run()
    {
        try{
            while(true)
            {
                s.put();
                Thread.sleep(500);
            }
            
        }catch(Exception e){}
        
    }
}
