/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp;

import java.util.Random;

/**
 *
 * @author lecturer
 */
public class Pat extends Thread {
    Doc d;
    int id;
    int status=0;
    int duration;
    public Pat(int idd,Doc dd)
    {
        id=idd;
        d=dd;
       
        duration=new Random().nextInt(7)*100;
    }
    
    public void run()
    {
        while(status==0)
            status=d.enter(id);
        
        try{
            Thread.sleep(duration);
        }catch(Exception e){}
        
        while(status==1)
            status=d.leave(id);
    }
}
