/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Mang {
    public static void main(String[] args) {
        ArrayList<Integer> Array=new ArrayList<>();
        int n;
        
        Scanner nhap= new Scanner(System.in);
        System.out.println("nhap vao gia tri cua mang: ");
        n= nhap.nextInt();
        int[] Arr= new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Nhap phan tu thu "+(i+1)+": ");
            Arr[i]=nhap.nextInt();
            Array.add(Arr[i]);
        }        
            System.out.println(Array);
    }
}
