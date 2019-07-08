/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt18;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Studennt implements Serializable {

    int id;
    String name;
    int age;
    String address;
    float gpa;

    public Studennt() {
    }

    public Studennt(int id, String name, int age, String address, float gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public float getGpa() {
        return gpa;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        name = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap dia chi: ");
        address = sc.nextLine();
        System.out.println("Nhap GPA: ");
        gpa = Float.parseFloat(sc.nextLine());
    }

    @Override
    public String toString() {
        return "Studennt{" + "id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + ", gpa=" + gpa + '}';
    }

    public void dislay() {
        System.out.println(toString());
    }

    void edit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
