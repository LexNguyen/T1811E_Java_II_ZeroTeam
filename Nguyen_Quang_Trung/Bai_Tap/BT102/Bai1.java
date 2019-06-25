/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai1 {
    public static void main(String[] args) {
        int dem = 0;
        String s1;
        String s2;
        String kt;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap chuoi source: ");
        s1=input.nextLine();
        System.out.println("Nhap chuoi searching: ");
        s2=input.nextLine();
        if (s1.length()<s2.length()) {
            dem=0;
        } else
            for (int i=0;i<=s1.length()-s2.length();i++){
                kt= s1.substring(i, i+s2.length());
                if (s2.equalsIgnoreCase(kt)) dem++; 
                
            }
        System.out.println("So lan xuat hien: "+ dem);
        
    }
}
