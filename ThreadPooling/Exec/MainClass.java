/*
Simple Program to understand Thread Pooling.
Thread pooling helps us to limit the number of currently 
active threads in the system. 
The below program allows only two active threads at any given time.
ExecutorService defines the pool size, here=2.
*/
package Exec;

import java.util.Random;
import java.util.concurrent.*;

/**
 *
 * @author vazeer
 */
public class MainClass {
    public static void main(String args[])
    {
        
        Cal c[]=new Cal[7];
        ExecutorService es=Executors.newFixedThreadPool(2);
        
        for(int i=0;i<c.length;i++)
        {
            int n=new Random().nextInt(10);
            c[i]=new Cal(i,n);
        }
        
        for(int i=0;i<c.length;i++)
        {
	    //Instead of starting a thread by threadname.start() we submit the thread to 
	    //ExecutorService object as below
		
            es.execute(c[i]);
            
        }
        
        es.shutdown();
        
        
        //System.out.println("Hai");
        
    }
}
