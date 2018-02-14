/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Random;

/**
 *
 * @author vazeer
 */
public class Phil extends Thread {
    Plate p;
    Fork f;
    int id;
    public Phil(Plate p,Fork f,int id)
    {
        this.p=p;
        this.f=f;
        this.id=id;
    }
    public void run()
    {
        try{Thread.sleep( new Random().nextInt(7)*100);}catch(Exception e){}
        
        
                int pf=0,ff=0;
                pf=p.take(id);
                ff=f.take(id);

                

                 if(pf==1 && ff==1)
                 {
                     System.out.println("Able to eat...");
                     p.put(id);
                     f.put(id);
                    
                 }
                 
                     
         
        
    }
}
