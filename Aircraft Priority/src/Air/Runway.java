/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Air;

import java.util.concurrent.locks.*;

/**
 *
 * @author vazeer
 */
public class Runway {
    Lock l;
    
    public Runway()
    {
        l=new ReentrantLock();
    }
    public boolean request()
    {
        return(l.tryLock());
    }
    
    public void takeoff()
    {
        
        l.unlock();
    }
            
}
