/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priority;

/**
 *
 * @author vazeer
 */
public class Worker extends Thread{
    
    public Worker(int id)
    {
        super(String.valueOf(id));
    }
    
    public void run()
    {
        System.out.println(this.getName()+" working & p ="+this.getPriority());
    }
}
