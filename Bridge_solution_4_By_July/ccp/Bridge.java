/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccp;
    import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/**
 *
 * @author vazeer
 */
public class Bridge {

   Lock l;
    
    public Bridge()
    {
        l=new ReentrantLock();
    }
    
    public boolean crossToRight()
    {
        return(l.tryLock());
    }
    
    public boolean crossToLeft()
    {
        return(l.tryLock());
    }
    
    public void leaveBridge()
    {
        l.unlock();
    }
    
    
}

