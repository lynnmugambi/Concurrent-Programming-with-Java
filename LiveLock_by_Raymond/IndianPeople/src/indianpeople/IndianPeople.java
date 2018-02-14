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
public class IndianPeople {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Res r = new Res();
        Indians[] i = new Indians[2];
        i[0] = new Indians(1, r);
        i[1] = new Indians(2, r);
        
        i[0].start();
        i[1].start();
    }
    
}
