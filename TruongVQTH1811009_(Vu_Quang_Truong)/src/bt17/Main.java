/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt17;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author vuqua
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String, Student> studentList = new HashMap<>();
        System.out.println("Nhap so sinh vien: ");
        int n = Integer.parseInt(input.nextLine());
        for (int i = 1; i <= n; i++) {
            Student studentInfo = new Student();
            System.out.println("Nhap thong tin sinh vien thu "+ i+ ":");
            System.out.println("RollNo: ");
            studentInfo.setRollNo(input.nextLine());
            System.out.println("Name: ");
            studentInfo.setName(input.nextLine());
            System.out.println("Age: ");
            studentInfo.setAge(Integer.parseInt(input.nextLine()));
            System.out.println("Sex: ");
            studentInfo.setSex(input.nextLine());
            System.out.println("Email: ");
            studentInfo.setEmail(input.nextLine());
            System.out.println("Address: ");
            studentInfo.setAddress(input.nextLine());
            studentList.put(studentInfo.rollNo, studentInfo);

        }
        for (String key : studentList.keySet()) {
            studentList.get(key).Display();
        }
        System.out.println("Nhap rollNo can tim: ");
        String sreach=input.nextLine();
        for (String key : studentList.keySet()) {
            if (sreach == null ? key == null : sreach.equals(key)){
                studentList.get(key).Display();
            }
        }
    }

}
