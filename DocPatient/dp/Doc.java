/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lecturer
 */
public class Doc {
    int cap=0;
    
    public synchronized int enter(int id)
    {
        while(cap==2)
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Doc.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        cap=cap+1;
        System.out.println(id+" Entered Doc Room. Capacity  "+cap);
        return(1);
               
    }
    
    public synchronized int leave(int id)
    {
        cap=cap-1;
        System.out.println(id+" Left Doc Room. Capacity  "+cap);
        notifyAll();
        return(0);
               
    }
    
}
