/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locks;
import java.util.Random;
import java.util.concurrent.locks.*;

/**
 *
 * @author Jason Low
 */
public class Res {
    Lock l;
    
    public Res() {
        l = new ReentrantLock();
    }
    
    public void acc(int id) {
//        l.lock();
//        System.out.println(id + " locked resource.");
//        
//        try {
//            Thread.sleep(new Random().nextInt(7)*100);
//        }
//        catch (Exception ex) {
//            
//        }
//        System.out.println(id + " unlocked resource.");
//        l.unlock();

        boolean isLocked = true;
        while (isLocked){
            if (l.tryLock() == true) {
                isLocked = false;
                System.out.println(id + " locked resource.");
                try {
                    Thread.sleep(new Random().nextInt(7)*100);
                }
                catch (Exception ex) {
                }
                System.out.println(id + " unlocked resource.");
                l.unlock();
            }
        }
    }
}
