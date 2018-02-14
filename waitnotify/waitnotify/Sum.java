/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waitnotify;

/**
 *
 * @author vazeer
 */
public class Sum extends Thread{
    public int s=0;
    public void run()
    {
        synchronized(this)
        {
            for(int i=1;i<=1000;i++)
                    s=s+i;
        
            this.notify();
        }
    }
}
