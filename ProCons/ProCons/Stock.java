/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProCons;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vazeer
 */
public class Stock {
 int i=0;
 
 public synchronized void put()
 {
     while(i==5)
     {
         try {
             System.out.println("PRO WAITING...");
             wait();
         } catch (Exception ex) {} 
     }
     i++;
     System.out.println("Produced 1 S="+i);
     notify();
     
 }
 
 public synchronized void get()
 {
     while(i==0)
     {
         try {
             System.out.println("CONS WAITING...");
             wait();
         } catch (Exception ex) {} 
     }
     i--;
     System.out.println("Consumed 1 S="+i);
     notify();
     
 }
}
