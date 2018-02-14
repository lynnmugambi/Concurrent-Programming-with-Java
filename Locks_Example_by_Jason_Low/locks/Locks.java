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
public class Locks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Res r = new Res();
        Users u1 = new Users(1234, r);
        Users u2 = new Users(1235, r);
        Users u3 = new Users(1236, r);
        
        u1.start();
        u2.start();
        u3.start();
    }
    
}
