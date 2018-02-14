/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

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
    
    int take(int id)
    {
        if(l.tryLock()==true)
        {
            System.out.println(id+" took fork");
            return(1);
        }
        else
            return(0);
            
    }
    
    int put(int id)
    {
        System.out.println(id+" put fork");
        l.unlock();
        return(1);
    }
}
