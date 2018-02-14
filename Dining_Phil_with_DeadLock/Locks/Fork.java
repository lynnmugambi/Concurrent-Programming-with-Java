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
public class Fork {
    
    
    Lock l;
    public Fork()
    {
        l=new ReentrantLock();
    }
    public boolean use(int id)
    {
        boolean i;
        i=l.tryLock();
        if(i==true) System.out.println(id+" took Fork");
        return(i);
               
    }
    
    public void put(int id)
    {
        System.out.println(id+" put Fork");
        l.unlock();
        
    }
}
