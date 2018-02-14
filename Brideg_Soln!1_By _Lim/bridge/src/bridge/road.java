package bridge;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class road {
    Lock l;
    
    public road(){
        l = new ReentrantLock();
    }
    
    public boolean request(){
        boolean i;
        i = l.tryLock();
        return(i);
    }
    
    public void cross(){
        l.unlock();
    }
}
