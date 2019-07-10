/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_sale_management_system_I;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author linhn
 */
public class Main {
    public static void main(String[] args) {
        List<Category> categoryList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int chooseNumber;
        do{
            showMenu();
            System.out.println("Your choose is: ");
            chooseNumber = Integer.parseInt(input.nextLine());
            switch(chooseNumber){
                case 1:
                    Category category = new Category();
                    System.out.println("Input category ID: ");
                    category.setCategoryID(input.nextLine());
                    System.out.println("Input category name: ");
                    category.setCategoryName(input.nextLine());
                    categoryList.add(category);
                    break;
                case 2:
                    
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
            }
        }while(chooseNumber == 10);
       
    }
    
    static void showMenu(){
        System.out.println("/*-----------Sale-Management-System-----------*/");
        System.out.println("1. Input category .");
        System.out.println("2. Input product.");
        System.out.println("3. Show list of products sold.");
        System.out.println("4. Show list of products in stock.");
        System.out.println("5. Show list of products that are out of date.");
        System.out.println("6. Show list of products that are about to expire.");
        System.out.println("7. Searching product.");
        System.out.println("8. Export to file.");
        System.out.println("9. Import to file.");
        System.out.println("10. Exit.");
        System.out.println("/*------------------------------------------------*/");
    }
}
