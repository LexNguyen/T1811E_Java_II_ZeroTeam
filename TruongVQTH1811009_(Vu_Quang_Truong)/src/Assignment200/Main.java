/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment200;

import bt18.Student;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vuqua
 */
public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<Category> listCategory = new ArrayList<>();
        List<Product> listSell = new ArrayList<>();
        List<Product> listExpire = new ArrayList<>();
        List<Product> listProduct = new ArrayList<>();
        List<Product> lstPro= new ArrayList<>();
        Product get;
        String str;
        int choose;
        FileOutputStream out=null;
        ObjectOutputStream objectOutputStream=null;
        
        List<Product> listIn =new ArrayList<>();
        List<Category> listCat =new ArrayList<>();
        FileInputStream in = null;
        ObjectInputStream inputStream = null;
        
        do {
            showMenu();
            choose = Integer.parseInt(input.nextLine());
            switch (choose) {
                case 1:
                    Category category = new Category();
                    System.out.println("Nhap ma danh muc: ");
                    category.setIdCategory(input.nextLine());
                    System.out.println("Nhap ten danh muc: ");
                    category.setNameCategory(input.nextLine());
                    listCategory.add(category);
                    break;
                case 2:
                    Product product = new Product();
                    System.out.println("Nhap ma san pham: ");
                    product.setIdProduct(input.nextLine());
                    System.out.println("Nhap ma danh muc: ");
                    product.setIdCategory(input.nextLine());
                    System.out.println("Nhap ten san pham: ");
                    product.setNameProduct(input.nextLine());
                    System.out.println("Nhap gia: ");
                    product.setPrice(input.nextLine());

                    System.out.println("Nhap ngay nhap: ");
                    String dateString = input.nextLine();
                    SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
                    df.setLenient(false); 
                    try {
                        product.setDateBuy(df.parse(dateString));

                    } catch (ParseException e) { 
                        System.out.println("Invalid date");
                    }
                    
                    System.out.println("Nhap ngay ban: ");
                    dateString = input.nextLine();
                    df.setLenient(false); 
                    try {
                        product.setDateSell(df.parse(dateString));

                    } catch (ParseException e) {
                        System.out.println("Invalid date");
                    }

                    System.out.println("Nhap Han su dung: ");
                    dateString = input.nextLine();
                    df.setLenient(false); 
                    try {
                        product.setDateExp(df.parse(dateString));

                    } catch (ParseException e) {
                        System.out.println("Invalid date");
                    }
                    java.util.Date date = new java.util.Date();
                    if (product.getDateSell().compareTo(date) <= 0) {
                        listSell.add(product);
                    } else if (date.compareTo(product.getDateExp()) > 0) {
                        listExpire.add(product);
                    } else {
                        listProduct.add(product);
                    }
                    lstPro.add(product);
                    break;
                case 3:
                    listSell.forEach((arg) -> {
                        arg.display();
                    });
                    break;
                case 4:
                    listProduct.forEach((arg) -> {
                        arg.display();
                    });

                    break;
                case 5:
                    listExpire.forEach((arg) -> {
                        arg.display();
                    });
                    break;
                case 6:
                    for (int i = 0; i < listProduct.size(); i++) {
                        get = listProduct.get(i);
                        Calendar cal=Calendar.getInstance();
                        cal.setTime(get.getDateExp());
                        cal.add(Calendar.DAY_OF_MONTH,-7);
                        Date date2=cal.getTime();
                        java.util.Date date1 = new java.util.Date();
                        if (date2.compareTo(date1)<=0 && date1.compareTo(get.getDateExp())<=0 ){
                            get.display();
                        }
                    }
                    break;
                case 7:
                    System.out.println("Nhap ten san pham tim kiem: ");
                    str=input.nextLine();
                    for (int i = 0; i < lstPro.size(); i++) {
                        get= lstPro.get(i);
                        if (str.equalsIgnoreCase(get.getNameProduct())){
                            get.display();
                        }    
                    }
                    break;
                case 8:
            {
                try {
                    out=new FileOutputStream("category.dat");
                    objectOutputStream= new ObjectOutputStream(out);
                    objectOutputStream.writeObject(listCategory);
                    out=new FileOutputStream("sell.dat");
                    objectOutputStream= new ObjectOutputStream(out);
                    objectOutputStream.writeObject(listSell);
                    out=new FileOutputStream("expire.dat");
                    objectOutputStream= new ObjectOutputStream(out);
                    objectOutputStream.writeObject(listExpire);
                    out=new FileOutputStream("product.dat");
                    objectOutputStream= new ObjectOutputStream(out);
                    objectOutputStream.writeObject(listProduct);
                } catch (Exception ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                    break;
                case 9:
            {
                try {
                    in=new FileInputStream("category.dat");
                    inputStream=new ObjectInputStream(in);
                    listCat =(List<Category>) inputStream.readObject();
                    for (int i = 0; i < listCat.size(); i++) {
                        listCat.get(i).display();     
                    }
                    
                    in=new FileInputStream("sell.dat");
                    inputStream=new ObjectInputStream(in);
                    listIn =(List<Product>) inputStream.readObject();
                    for (int i = 0; i < listIn.size(); i++) {
                        listIn.get(i).display();     
                    }
                    
                    in=new FileInputStream("expire.dat");
                    inputStream=new ObjectInputStream(in);
                    listIn =(List<Product>) inputStream.readObject();
                    for (int i = 0; i < listIn.size(); i++) {
                        listIn.get(i).display();     
                    }
                     
                    in=new FileInputStream("product.dat");
                    inputStream=new ObjectInputStream(in);
                    listIn =(List<Product>) inputStream.readObject();
                    for (int i = 0; i < listIn.size(); i++) {
                        listIn.get(i).display();     
                    }
                } catch (Exception ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                    
                    break;
                default:
                    System.out.println("Nhap sai");
            }
        } while (choose != 10);
    }

    static void showMenu() {
        System.out.println("1.Nhap thong tin danh muc");
        System.out.println("2.Nhap thong tin san pham");
        System.out.println("3.In ra danh sach san pham da ban");
        System.out.println("4.In ra danh sach san pham con ton kho");
        System.out.println("5.In ra danh sach san pham qua han su dung");
        System.out.println("6.In ra danh sach san pham sap het han");
        System.out.println("7.Tim kiem san pham");
        System.out.println("8.Luu vao file");
        System.out.println("9.Xuat ra man hinh");
        System.out.println("10.Thoat");
    }
}
