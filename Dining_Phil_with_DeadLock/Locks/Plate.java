/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Locks;

import java.util.concurrent.locks.*;

/**
 *
 * @author vazeer
 */
public class Plate {
    
    Lock l;
    public Plate()
    {
        l=new ReentrantLock();
    }
   public boolean use(int id)
    {
        boolean i;
        i=l.tryLock();
        if(i==true) System.out.println(id+" took Plate");
        return(i);
               
    }
    
    public void put(int id)
    {
        System.out.println(id+" put Plate");
        l.unlock();
        
    }
}
