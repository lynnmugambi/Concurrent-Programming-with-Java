/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Air;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vazeer
 */
public class Plane extends Thread{
    
    Runway r[];
    public Plane(int id,Runway r[])
    {
        super(String.valueOf(id));
        this.r=r;
    }
    public void run()
    {
        boolean o=false;
        while(true)
        {
            for(int i=0;i<r.length;i++)
                    {
                        o=r[i].request();

                        if(o==true)
                        {
                            System.out.println(this.getName()+" landed on runway "+i);
                            try {
                                Thread.sleep(500);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Plane.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            System.out.println(this.getName()+" took off from runway "+i);
                            r[i].takeoff();
                            break;
                            

                        }

                    }
            if(o==true)
                break;
        }
        
    }
}
