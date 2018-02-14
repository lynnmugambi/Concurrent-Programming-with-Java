/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indianpeople;

import java.util.Random;
import java.util.concurrent.locks.*;

/**
 *
 * @author Raymond
 */
public class Res {
    
    Lock l1;
    Lock l2;
    
    public Res()
    {
        l1 = new ReentrantLock();
        l2 = new ReentrantLock();
    }
    
    public boolean fork(int id)
    {
        if(l1.tryLock()==true)
        {
            System.out.println(id + " Has taken the fork");
            
             try
                {
                    Thread.sleep(new Random().nextInt(7)*100);
                }
                catch(Exception e)
                {}

                System.out.println(id + " returned the fork");
                l1.unlock(); 
            return(true);
        }
        else
        {
            return(false);
        }
    }
    
    public boolean plate(int id)
    {
        if(l2.tryLock()==true)
        {
            System.out.println(id + " Has taken the plate");
            
            try
                {
                    Thread.sleep(new Random().nextInt(7)*100);
                }
                catch(Exception e)
                {}

                System.out.println(id + " returned the plate");
                l2.unlock();
                
            return(true);
        }
        else
        {
            return(false);
        }
    }
    
}
