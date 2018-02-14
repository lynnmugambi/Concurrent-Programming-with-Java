/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author vazeer
 */
public class MainClass {
    public static void main(String ar[])
    {
        Plate p=new Plate();
        Fork f=new Fork();
    
    Phil p1=new Phil(p,f,1);
    Phil p2=new Phil(p,f,2);
    //Phil p3=new Phil(p,f,3);
    //Phil p4=new Phil(p,f,4);
    
    p1.start();
    p2.start();
    //p3.start();
    //p4.start();
    }
    
    
    
}
