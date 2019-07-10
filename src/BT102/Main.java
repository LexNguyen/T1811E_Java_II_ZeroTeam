/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT102;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author linhn
 */
public class Main {
    public static void main(String[] args) {
/*Practice 1:
        String scoure;
        String searching;
        Scanner input = new Scanner(System.in);
        System.out.println("Input scoure string: ");
        scoure = input.nextLine();
        System.out.println("Input searching: ");
        searching = input.nextLine();
        int lastIndex = 0;
        int count = 0;
        while(lastIndex != -1){
            lastIndex = scoure.indexOf(searching,lastIndex);
            if(lastIndex != -1){
            count ++;
            lastIndex += searching.length();
        }
}
System.out.println("So lan xuat hien cua searching la: " + count);
-------------------------------------*/
/*Practice 2:
        Scanner input = new Scanner(System.in);
        int N;
        List list;
        list = new ArrayList();
        do{
            System.out.println("Input Array: ");
            N = Integer.parseInt(input.nextLine());
            list.add(N);
            System.out.println(list);
        }while (N != 0);
-------------------------------------------*/ 
/*Practice 3:*/
        Scanner input = new Scanner(System.in);
        int max;
        String N;
        String result;
        int lastIndex = 0;
        StringBuilder sb = new StringBuilder();
        System.out.println("Input length of sb: ");
        max = Integer.parseInt(input.nextLine());
        for(int i = 0; i < max; i++){
            System.out.println("Input N string: ");
            N = input.nextLine();
            sb.append(N);
        }
        System.out.println(sb);
/*----------------------------------*/
    }

}
