/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Student {
    String Name;
    String Sex;
    int age;
    String Email;
    String Address;
    String rollNo;

    public Student() {
    }

    public Student(String Name, String Sex, int age, String Email, String Address) {
        this.Name = Name;
        this.Sex = Sex;
        this.age = age;
        this.Email = Email;
        this.Address = Address;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }
    
public void input(){
    Scanner input=new Scanner(System.in);
    System.out.println("Nhap ma sinh vien: ");
    rollNo=input.nextLine();
    System.out.println("Nhap ten sinh vien: ");
    Name=input.nextLine();
    System.out.println("Nhap gioi tinh sinh vien: ");
    Sex=input.nextLine();
    System.out.println("Nhap tuoi sinh vien: ");
    age=Integer.parseInt(input.nextLine());
    System.out.println("Nhap email sinh vien: ");
    Email=input.nextLine();
    System.out.println("nhap dia chi sinh vien: ");
    Address=input.nextLine();
    
    
}   

public void dislay(){
    System.out.println("Ma sinh vien: "+rollNo);
    System.out.println("Ten sinh vien: "+Name);
    System.out.println("Gioi tinh sinh vien: "+Sex);
    System.out.println("Tuoi sinh vien: "+age);
    System.out.println("Email sinh vien: "+Email);
    System.out.println("Dia chi sinh vien: "+Address);
    
    
    }
}
