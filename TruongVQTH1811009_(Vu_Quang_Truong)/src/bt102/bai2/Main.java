/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt102.bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author vuqua
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.printf("Nhap vao n: ");
        int n=Integer.parseInt(input.nextLine());
        for (int i=1;i<=n;i++){
            list.add(Integer.parseInt(input.nextLine())); 
        }
        for (int obj : list) {
            System.out.print(obj + ", ");
        }

        
        
    }
    
}
