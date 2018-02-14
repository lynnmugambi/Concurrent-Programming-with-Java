/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exec;

/**
 *
 * @author vazeer
 */
public class Cal extends Thread{
    int id;
    int n;
    
    public Cal(int i,int in)
    {
        id=i;
        n=in;
    }
    public void run()
    {
        try{
            int f=1;
            for(int i=1;i<=n;i++)
            {
                f=f*i;
                Thread.sleep(500);
                if(i%5==0 || i%5==1||i%5==2)
                    System.out.println(id+"  "+ n+"f upto"+ i+ " = "+f);
            }
            System.out.println(id+"  "+ n+"f = "+f);
        }catch(Exception e){}
    }
}
