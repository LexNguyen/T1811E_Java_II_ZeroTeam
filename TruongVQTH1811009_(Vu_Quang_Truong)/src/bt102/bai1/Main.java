/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt102.bai1;

import java.util.Scanner;
import jdk.nashorn.internal.objects.NativeString;

/**
 *
 * @author vuqua
 */
public class Main {
    public static void main(String[] args) {
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap chuoi source: ");
        String s1=input.nextLine();
        System.out.println("Nhap chuoi searching: ");
        String s2=input.nextLine();
        if (s1.length()<s2.length()) {
            count=0;
        } else
            for (int i=0;i<=s1.length()-s2.length();i++){
                String kt= s1.substring(i, i+s2.length());
                if (s2.equalsIgnoreCase(kt)) count++; 
                
            }
        System.out.println("So lan xuat hien: "+ count);
        
    }
    
            
    
    
}
