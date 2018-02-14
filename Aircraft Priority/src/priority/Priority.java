/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priority;

import java.util.Random;

/**
 *
 * @author vazeer
 */
public class Priority {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Worker w[]=new Worker[15];
        int r;
        for(int i=0;i<w.length;i++)
        {
            w[i]=new Worker(i);
            r=new Random().nextInt(10);
            if(r%2==0)
                r=1;
            else
                r=10;
            w[i].setPriority(r);
        }
        
        for(int i=0;i<w.length;i++)
            w[i].start();
    }
    
}
