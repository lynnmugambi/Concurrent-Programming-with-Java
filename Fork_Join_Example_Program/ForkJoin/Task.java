/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ForkJoin;

import java.util.concurrent.*;

/**
 *
 * @author vazeer
 */
public class Task extends Thread
{
    int strt;
    int stop;
    int sum=0;
    public Task(int strt,int stop)
    {
        super(String.valueOf(strt));
        this.strt=strt;
        this.stop=stop;
        
    }
    
    public void run()
    {
        if(stop-strt<=10)
        {
            
            for(int i=strt;i<=stop;i++)
                sum=sum+i;
            
            System.out.println(this.getName()+" ->  "+sum);
            
        }
        else
        {
            int span=(stop-strt+1)/2;
            Task t1=new Task(strt,strt+span-1);
            Task t2=new Task(strt+span,stop);
            t1.start();
            t2.start();
            try{
                t1.join();
                t2.join();
            }catch(Exception e){}
            sum=sum+t1.sum+t2.sum;
            System.out.println("Total = "+sum);
        }
    }
 

    

    
}
