/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp;

/**
 *
 * @author lecturer
 */
public class DP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Doc d=new Doc();
        
        Pat p[]=new Pat[5];
        
        for(int i=0;i<5;i++)
        {
            p[i]=new Pat(i,d);
            p[i].start();
        }
    }
    
}
