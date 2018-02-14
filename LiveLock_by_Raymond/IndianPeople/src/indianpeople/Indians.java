/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indianpeople;

/**
 *
 * @author Raymond
 */
public class Indians extends Thread {
    int id;
    Res r;
    
    public Indians(int id, Res r)
    {
        this.id = id;
        this.r = r;
    }
    
    public void run()
    {
        boolean r1 = false;
        boolean r2 = false;
        
        while(r1==false || r2==false)
        {
            r1 = r.fork(id);
            r2 = r.plate(id);
            
            if(r1==true && r2==true)
            {
                System.out.println(id + " HAS ATE THE FOOD");
            }
        }
    }
}
