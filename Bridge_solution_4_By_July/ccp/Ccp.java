/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccp;

/**
 *
 * @author vazeer
 */
public class Ccp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bridge b = new Bridge();
        
        Car c[] = new Car[10];
        for(int i=0;i<c.length;i++)
            c[i]=new Car(b,i);
        
        for(int i=0;i<c.length;i++)
            c[i].start();
        
    }
    
}
