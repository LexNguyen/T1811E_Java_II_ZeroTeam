/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt523;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vuqua
 */
public class Thread2 extends Thread{
    List<Character> list = new ArrayList<>();
    @Override
    public void run() {
        int min =(int) 'a';
        int max = (int) 'z';
        int limit=max-min;
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int rad=random.nextInt(limit)+min;
            char c=(char) rad;
            list.add(c);
            System.out.println("t2 > "+c);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        
    }
    
    
}
