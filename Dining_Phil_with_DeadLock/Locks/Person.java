/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Locks;

import java.util.Random;

/**
 *
 * @author vazeer
 */
public class Person extends Thread{
    Fork r;
    Plate p;
    int s=0;
    int id;
    boolean i=false,j=false;
    
    public Person(int id,Fork r, Plate p)
    {
        this.id=id;
        this.r=r;
        this.p=p;
    }
    public void run()
    {
        while(true)
        {
        try{Thread.sleep(new Random().nextInt(7)*100);}catch(Exception e){}
        while(true)
        {
            if(i==false)
                i=r.use(id);
            try{Thread.sleep(new Random().nextInt(7)*100);}catch(Exception e){}
            if(j==false)
                j=p.use(id);
        
            if(i==true && j==true)
            {
                try{Thread.sleep(500);}catch(Exception e){}
                System.out.println(id+" ate food");
                r.put(id);
                try{Thread.sleep(500);}catch(Exception e){}
                p.put(id);
                i=false;
                j=false;
                break;
            }
                 
        }
        }//
    }
}
