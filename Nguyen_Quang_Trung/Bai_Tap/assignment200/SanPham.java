/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment200;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SanPham {

    String maSanPham;
    String maDanhMuc;
    String tenSanPham;
    String price;
    String ngayNhap;
    String ngayBan;
    String hanSuDung;
    String moTaSP;

    public SanPham() {
    }

    public SanPham(String maSanPham, String maDanhMuc, String tenSanPham, String price, String ngayNhap, String ngayBan, String hanSuDung, String moTaSP) {
        this.maSanPham = maSanPham;
        this.maDanhMuc = maDanhMuc;
        this.tenSanPham = tenSanPham;
        this.price = price;
        this.ngayNhap = ngayNhap;
        this.ngayBan = ngayBan;
        this.hanSuDung = hanSuDung;
        this.moTaSP = moTaSP;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getMaDanhMuc() {
        return maDanhMuc;
    }

    public void setMaDanhMuc(String maDanhMuc) {
        this.maDanhMuc = maDanhMuc;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public String getNgayBan() {
        return ngayBan;
    }

    public void setNgayBan(String ngayBan) {
        this.ngayBan = ngayBan;
    }

    public String getHanSuDung() {
        return hanSuDung;
    }

    public void setHanSuDung(String hanSuDung) {
        this.hanSuDung = hanSuDung;
    }

    public String getMoTaSP() {
        return moTaSP;
    }

    public void setMoTaSP(String moTaSP) {
        this.moTaSP = moTaSP;
    }

    public void input2() {
        Scanner input2 = new Scanner(System.in);
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Nhap ma san pham: ");
        maSanPham = input2.nextLine();
        System.out.println("Nhap ma danh muc: ");
        maDanhMuc = input2.nextLine();
        System.out.println("Nhap gia san pham: ");
        price = input2.nextLine();
        while (true) {
            boolean kiemTra = true;
            System.out.println("nhap ngay nhap kho : ");
            ngayNhap = input2.nextLine();
            if (true) {
                df.setLenient(false);
                try {
                    df.parse(ngayNhap);

                } catch (ParseException e) {
                    System.err.println("Invalid date");
                    kiemTra = false;
                }
            }
            if (kiemTra == true) {
                break;
            }

        }
        while (true) {
            boolean kiemTra = true;
            System.out.println("nhap ngay ban: ");
            ngayBan = input2.nextLine();
            if (true) {
                df.setLenient(false);
                try {
                    df.parse(ngayBan);

                } catch (ParseException e) {
                    System.err.println("Invalid date");
                    kiemTra = false;
                }
            }
            if (kiemTra == true) {
                break;
            }

        }
        while (true) {
            boolean kiemTra = true;
            System.out.println("nhap han su dung: ");
            hanSuDung = input2.nextLine();
            if (true) {
                df.setLenient(false);
                try {
                    df.parse(hanSuDung);

                } catch (ParseException e) {
                    System.err.println("Invalid date");
                    kiemTra = false;
                }
            }
            if (kiemTra == true) {
                break;
            }
        }
        System.out.println("Nhap mo ta san pham: ");
        moTaSP=input2.nextLine();
    }

    public void display2(){
        System.out.println(toString()); 
        
    }

    @Override
    public String toString() {
        return "SanPham{" + "maSanPham=" + maSanPham + ", maDanhMuc=" + maDanhMuc + ", tenSanPham=" + tenSanPham + ", price=" + price + ", ngayNhap=" + ngayNhap + ", ngayBan=" + ngayBan + ", hanSuDung=" + hanSuDung + ", moTaSP=" + moTaSP + '}';
    }
    
}
