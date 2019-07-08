/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai102;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai102 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String source, searching;
        int dem = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap sourch");
        source = sc.nextLine();
        System.out.println("Nhap searching");
        searching = sc.nextLine();

        for (int i = 0; i <= source.length(); i++) {
            if (source.contains(searching)) {
                dem++;
            }
            System.out.println("searching"+dem);

        }

    }

}
