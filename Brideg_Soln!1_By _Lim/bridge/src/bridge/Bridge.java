package bridge;

public class Bridge {

    public static void main(String[] args) {
        cars c[] = new cars[10];
        road r[] = new road[2];
        
        
        for(int i = 0; i<r.length; i++){
            r[i] = new road();
        }
        for(int i = 0; i<c.length; i++){
            c[i] = new cars(i, r);
        }
        
        for(int i = 0; i<c.length; i++){
            c[i].start();
        }
    }
    
}
