/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProCons;

/**
 *
 * @author vazeer
 */
public class MainClass {
    public static void main(String args[])
    {
        Stock s=new Stock();
        Pro p=new Pro(s);
        Cons c=new Cons(s);
        
        p.start();
        c.start();
    }
}
