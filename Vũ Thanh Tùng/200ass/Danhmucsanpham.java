/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bt200;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LQT
 */
public class Danhmucsanpham implements Serializable{
    public static ArrayList<Danhmucsanpham> listDanhmuc = new ArrayList<>();
    String idCategory;
    String nameCategory;
    
    public static Scanner input = new Scanner(System.in);
    
    public Danhmucsanpham() {
    }

    public Danhmucsanpham(String idCategory, String nameCategory) {
        this.idCategory = idCategory;
        this.nameCategory = nameCategory;
    }

    public String getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(String idCategory) {
        this.idCategory = idCategory;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }
    
    public void Nhap(){
        System.out.println("Nhập vào tên danh mục : ");
        nameCategory = input.nextLine();
        System.out.println("Nhập vào mã danh mục : ");
        idCategory = input.nextLine();
        
    }
    
    public void HienThiDanhMuc(){
        System.out.println("Tên danh mục : " + nameCategory);
        System.out.println("Mã danh mục : " + idCategory);
    }
}