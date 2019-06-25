/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt102.bai3;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author vuqua
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = Integer.parseInt(input.nextLine());
        List<Str> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int j=i+1;
            System.out.println("nhap chuoi "+j);
            StringBuilder str = new StringBuilder(input.nextLine());
            Str tr = new Str(str, false);
            list.add(tr);

        }
        System.out.println("Nhap chuoi searching: ");
        String s2 = input.nextLine();
        int count;
        for (Str obj : list) {
            count=0;
            StringBuilder s1= obj.getStr();
            if (s1.length() < s2.length()) {
                count = 0;
            } else {
                for (int i = 0; i <= s1.length() - s2.length(); i++) {
                    String kt = s1.substring(i, i + s2.length());
                    if (s2.equalsIgnoreCase(kt)) {
                        count++;
                    }

                }
            }
            if (count>0) obj.setKt(Boolean.TRUE);           
        }
        System.out.println("cac chuoi co"+s2+"la :");
        for (Str obj : list) 
            if (obj.getKt()==true){
                System.out.println(obj.getStr());
           
        }

    }

}
