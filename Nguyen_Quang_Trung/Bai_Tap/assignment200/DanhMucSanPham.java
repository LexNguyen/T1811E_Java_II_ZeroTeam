/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment200;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class DanhMucSanPham implements Serializable{
    String maDanhMuc;
    String tenDanhMuc;

    public DanhMucSanPham() {
    }

    public DanhMucSanPham(String maDanhMuc, String tenDanhMuc) {
        this.maDanhMuc = maDanhMuc;
        this.tenDanhMuc = tenDanhMuc;
    }

    public String getMaDanhMuc() {
        return maDanhMuc;
    }

    public void setMaDanhMuc(String maDanhMuc) {
        this.maDanhMuc = maDanhMuc;
    }

    public String getTenDanhMuc() {
        return tenDanhMuc;
    }

    public void setTenDanhMuc(String tenDanhMuc) {
        this.tenDanhMuc = tenDanhMuc;
    }
    
    public void input(){
        Scanner input =new Scanner(System.in);
        System.out.println("Nhap ma danh muc: ");
        maDanhMuc= input.nextLine();
        System.out.println("Nhap ten danh muc: ");
        tenDanhMuc=input.nextLine();
    }
    public void display()
    {
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return "DanhMucSanPham{" + "maDanhMuc=" + maDanhMuc + ", tenDanhMuc=" + tenDanhMuc + '}';
    }
        
}


