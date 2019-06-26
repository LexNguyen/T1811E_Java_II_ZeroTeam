/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import static com.sun.org.apache.xalan.internal.lib.ExsltDynamic.map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    
    static List<Student> Arr = new ArrayList<>();
    static Scanner nhap= new Scanner(System.in);
    public static void main(String[] args) {
        int choose;
        do{
            Showmenu();
            choose = Integer.parseInt(nhap.nextLine());
            switch (choose){
                case 1:
                    input();
                    break;
                case 2:
                    dislay();
                    break;
                case 3:
                    search();
                    break;
                default:
                    System.out.println("Exit");
                    break;
            }
            
        }while (choose !=4);
        
    }
    public static void Showmenu() {
        System.out.println("1. Nhập thông tin N sinh viên");
        System.out.println("2. In thông tin N sinh viên");
        System.out.println("3. Tìm kiếm sinh viên");
    }
    public static void input(){
        System.out.println("Nhap so luong sinh vien ");
        int n=Integer.parseInt(nhap.nextLine());
        for(int i=0;i<n;i++){
            System.out.println("Nhap so nha thu : "+(i+1));
            Student sinhvien= new Student();
            sinhvien.input();
            Arr.add(sinhvien);
        }
    }
    public static void dislay(){
        for(Student student :Arr){
            student.dislay();
        }
    
    }
    public static void search(){
        System.out.println("Nhap ma sinh vien can tim: ");
        String search = nhap.nextLine();
        Map<String, Student> studentMap = new HashMap<>();
        Student std1 = new Student();
        for (Student student : Arr) {
            studentMap.put(std1.getRollNo(), std1);
            Student std = studentMap.get(search);
            System.out.println(std.Name);
        }
    }    
}

