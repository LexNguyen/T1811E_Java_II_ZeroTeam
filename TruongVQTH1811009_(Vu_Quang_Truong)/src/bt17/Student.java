/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt17;

/**
 *
 * @author vuqua
 */
public class Student {
    String rollNo;
    String name;
    String sex;
    int age;
    String email;
    String Address;

    public Student() {
    }

    public Student(String rollNo, String name, String sex, int age, String email, String Address) {
        this.rollNo = rollNo;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.email = email;
        this.Address = Address;
    }

    @Override
    public String toString() {
        return "Student{" + "rollNo=" + rollNo + ", name=" + name + ", sex=" + sex + ", age=" + age + ", email=" + email + ", Address=" + Address + '}';
    }
    public void Display(){
        System.out.println(this.toString());
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    
}
