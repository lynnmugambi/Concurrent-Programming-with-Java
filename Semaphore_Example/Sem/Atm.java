/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sem;

import java.util.Random;
import java.util.concurrent.*;

/**
 *
 * @author vazeer
 */
public class Atm {
    Semaphore s;
    
    public Atm()
    {
        s=new Semaphore(2);
    }
    
    public void serve(int id)
    {
        try
        {
            s.acquire();
            System.out.println(id+ " using ATM");
            Thread.sleep(new Random().nextInt(7)*1000);
            System.out.println(id+ " left");
            s.release();
            
        }catch(Exception e){}       
    }
    
}
