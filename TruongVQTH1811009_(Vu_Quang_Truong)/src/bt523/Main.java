/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt523;

/**
 *
 * @author vuqua
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread1 t1=new Thread1();
        Thread2 t2 =new Thread2();
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        
        System.out.println("Hien thi ket qua: ");
        for (int i=0;i<t1.list.size();i++){
            System.out.print(" "+t1.list.get(i));
        }
        System.out.println("\n");
        for (int i=0;i<t2.list.size();i++){
            System.out.print(" "+t2.list.get(i));
        }
        
        
    }
}
