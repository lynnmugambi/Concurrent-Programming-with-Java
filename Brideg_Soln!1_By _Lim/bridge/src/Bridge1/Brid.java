/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bridge1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vazeer
 */
public class Brid {
    int c=0; //number of cars on bridge
    Car cc=null; //currently entered car
    int bdir=0;  //current direction of flow in bridge
    public synchronized boolean enter(Car nc)
    {
        
                        if(c==3)
                             try {
                                 wait();
                             } catch (Exception ex) {}

                         if(c==0 || bdir==nc.dir)
                         {

                             if(c==0) cc=null;
                             c++;
                             bdir=nc.dir;
                             nc.cf=cc;
                             cc=nc;
                             if(nc.cf==null)
                                 System.out.println(nc.id+" entered bridge from "+nc.dir+" with no cars in front.");
                             else
                                 System.out.println(nc.id+" entered bridge from "+nc.dir+" with "+nc.cf.id+" in front.");




                             return(true);
                         }
                         return(false);
                                                
    }
    
    public synchronized boolean leave(Car nc)
    {
        
                if(nc.cf!=null && nc.cf.isAlive())
                    return(false);
                else if(nc.cf!=null && nc.cf.isAlive()==false)
                    {
                        System.out.println(nc.id+" exited");
                        c--;
                        
                    }
                else if(nc.cf==null)
                    {
                        System.out.println(nc.id+" exited");
                        c--;
                       
                    }
                
                notify();
                return(true);
                         
    }
}
