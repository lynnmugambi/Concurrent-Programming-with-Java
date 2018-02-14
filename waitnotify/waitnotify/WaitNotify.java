/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waitnotify;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vazeer
 */
public class WaitNotify {

   
    public static void main(String[] args) {
       
        Sum ob=new Sum();
        
        ob.start();
        synchronized(ob)
        {
            try {
                ob.wait();
            } catch (Exception ex) {}
        }
        
        System.out.println(ob.s);
    }
    
}
