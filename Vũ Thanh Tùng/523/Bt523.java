/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt523;

/**
 *
 * @author Admin
 */
public class Bt523 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        
        t1.start();
        t2.start();
        
        t1.join();
        t2.join();
        
        System.out.println("Ket qua");
        for (int i = 0; i < t1.list.size(); i++) {
            System.out.println(""+t1.list.get(i));
        }
         for (int i = 0; i < t2.list.size(); i++) {
            System.out.println(""+t2.list.get(i));
        }
    }
    
}
