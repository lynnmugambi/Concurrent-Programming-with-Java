package bridge;

import java.util.Random;

public class cars extends Thread {
    int cid;
    road r[];
    boolean i = false;
    int ran;
    
    public cars(int cid, road r[]){
        this.cid = cid;
        this.r = r;
    }
    
    public void run(){
        while(true){
            try{
                Thread.sleep(new Random().nextInt(7)*100);
            }catch(Exception ex){}
            
            while(true){
                if(i == false){
                    for (int j = 0; j < r.length; j++) {
                         i = r[j].request();                                     
                    
                        if(i == true){
                            if(j == 0){
                                System.out.println("Car " + cid + " is crossing the bridge from the left.");
                            }

                            else{
                                System.out.println("Car " + cid + " is crossing the bridge from the right.");
                            }

                            try{
                                Thread.sleep(new Random().nextInt(7)*100);
                            }catch(Exception ex){}

                            System.out.println("Car " + cid + " had crossed the brigde.");
                            r[j].cross();
                        }
                    }
                    i = false;
                    break;
                }
            }
        }
    }
}
