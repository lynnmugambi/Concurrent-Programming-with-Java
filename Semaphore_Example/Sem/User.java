/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sem;

/**
 *
 * @author vazeer
 */
public class User extends Thread{
    int id;
    Atm a;
    public User(int id, Atm a)
    {
        this.id=id;
        this.a=a;
    }
    
    public void run()
    {
        a.serve(id);
    }
}
