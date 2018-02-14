/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Locks;

/**
 *
 * @author vazeer
 */
public class MainClass {
    
    public static void main(String arg[])
    {
        Fork r=new Fork();
        Plate p=new Plate();
        
        Person p1=new Person(1,r,p);
        Person p2=new Person(2,r,p);
       
        
        p1.start();
        p2.start();
        
        
    }
}
