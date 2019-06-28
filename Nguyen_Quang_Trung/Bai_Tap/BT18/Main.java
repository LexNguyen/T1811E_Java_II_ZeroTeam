/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        List<Student> Arr = new ArrayList<>();
        int choose;
        Scanner nhap = new Scanner(System.in);
        System.out.println("Choose: ");
        do {
            showMenu();
            choose = Integer.parseInt(nhap.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Nhap so luong sinh vien ");
                    int n = Integer.parseInt(nhap.nextLine());
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhap sinh vien thu : " + (i + 1));
                        Student sinhvien = new Student();
                        sinhvien.input();
                        Arr.add(sinhvien);
                    }
                    break;
                case 2:
                    System.out.println("Nhap ID sinh vien can sua: ");
                    int id = Integer.parseInt(nhap.nextLine());
                    for (Student Arr1 : Arr) {
                        if (Arr1.getId() == id) {
                            Arr1.edit();
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Nhap ID sinh vien can sua: ");
                    int delID = Integer.parseInt(nhap.nextLine());
                    for (int i = 0; i < Arr.size(); i++) {
                        if (Arr.get(i).getId() == delID) {
                            Arr.remove(i);
                            break;
                        }
                    }
                    break;

                case 4:
                    Collections.sort(Arr, new Comparator<Student>() {

                        @Override
                        public int compare(Student t, Student t1) {
                            if (t.getGpa() < t1.getGpa()) {
                                return -1;
                            }
                            return 1;
                        }
                    });
                    for (Student Arr1 : Arr) {
                        Arr1.dislay();
                    }
                    break;
                case 5:
                    Collections.sort(Arr, new Comparator<Student>() {

                        @Override
                        public int compare(Student t, Student t1) {
                            if (t.getName().compareTo(t1.getName())<0) {
                                return -1;
                            }
                            return 1;
                        }
                    });
                    for (Student Arr1 : Arr) {
                        Arr1.dislay();
                    }
                    break;
                case 6:
                    for (Student Arr1 : Arr) {
                        Arr1.dislay();
                    }
                    break;
                case 7:
                    FileOutputStream fos=null;
                    ObjectOutputStream oos=null;
                    try{
                       fos= new FileOutputStream("student.dat");
                       oos= new ObjectOutputStream(fos);
                       oos.writeObject(Arr);
                    }catch(Exception e){
                        
                    }finally{
                        try{
                            if(fos !=null){
                            fos.close();
                        }
                        if(oos!=null){
                            oos.close();
                        }
                        }catch(Exception e){}
                    }
                    break;
                case 8:
                     FileInputStream fis=null;
                    ObjectInputStream ois=null;
                    try{
                       fis= new FileInputStream("student.dat");
                       ois= new ObjectInputStream(fis);
                       Arr= (List<Student>) ois.readObject();
                    }catch(Exception e){
                        
                    }finally{
                        try{
                            if(fis !=null){
                            fis.close();
                        }
                        if(ois!=null){
                            ois.close();
                        }
                        }catch(Exception e){}
                    }
                    break;
                case 9:
                    System.out.println("Exit!!!");
                    break;
                default:
                    System.out.println("Input Failed");
            }        
            }while (choose != 9);     
    }
    static void showMenu() {
        System.out.println("1. Add student.");
        System.out.println("2. Edit student by id.");
        System.out.println("3. Delete student by id.");
        System.out.println("4. Sort student by gpa.");
        System.out.println("5. Sort student by name.");
        System.out.println("6. Show student.");
        System.out.println("7. Save.");
        System.out.println("8. Read.");
        System.out.println("9. Exit.");
    }
}

