/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Air;

/**
 *
 * @author vazeer
 */
public class MainClass {
    public static void main(String args[])
    {
        Runway r[]=new Runway[4];
        for(int i=0;i<r.length;i++)
            r[i]=new Runway();
        
        
        Plane p[]=new Plane[8];
        
        for(int i=0;i<p.length;i++)
            p[i]=new Plane(i,r);
        
        
        for(int i=0;i<p.length;i++)
            p[i].start();
        
    }
}
