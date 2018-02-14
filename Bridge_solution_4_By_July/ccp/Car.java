/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccp;
import java.util.Random;
/**
 *
 * @author vazeer
 */
public class Car extends Thread{
    
    Bridge b;
    int id;
    boolean left;
    
    public Car (Bridge b, int id)
    {
        this.b=b;
        this.id=id;
        if(new Random().nextInt(10+id)%2==0)
            left=true;
        else
            left=false;
    }
    
    public void run()
    {
        boolean bridgeUsageRight = false;
        boolean bridgeUsageLeft = false;
        int noOfCars = 0;
        
        while(true)
        {
                  if (id%2==0 && bridgeUsageLeft==false)
                  {
                      bridgeUsageRight = b.crossToRight();
                      
                      if(bridgeUsageRight==true && bridgeUsageLeft==false && noOfCars<2)
                      {
                          noOfCars++;
                          System.out.println("Car "+id+" is crossing the bridge from left to right");
                          try {
                            Thread.sleep(1000);  
                          } catch (Exception e) {
                          }
                          System.out.println("Car "+id+" has arrived on the right side of the bridge");
                          b.leaveBridge();
                          noOfCars--;
                          //bridgeUsageRight = false;
                      }
                  }
                  else if(id%2!=0 && bridgeUsageRight==false)
                  {
                      bridgeUsageLeft = b.crossToLeft();
                      
                      if(bridgeUsageLeft==true && bridgeUsageRight==false && noOfCars<2)
                      {
                          noOfCars++;
                          System.out.println("Car "+id+" is crossing the bridge from right to left");
                          try {
                            Thread.sleep(1000);  
                          } catch (Exception e) {
                          }
                          System.out.println("Car "+id+" has arrived on the left side of the bridge");
                          b.leaveBridge();
                          noOfCars--;
                          //bridgeUsageLeft = false;
                      }
                  }
        }
    }
}
