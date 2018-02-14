/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locks;

/**
 *
 * @author Jason Low
 */
public class Users extends Thread{
    int id;
    Res r;
    
    public Users(int id, Res r) {
        this.id = id;
        this.r = r;
    }
    
    @Override
    public void run(){
        r.acc(id);
    }
}
