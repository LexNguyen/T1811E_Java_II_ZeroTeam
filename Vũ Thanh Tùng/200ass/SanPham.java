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
public class SanPham implements Serializable{
    public static Scanner input = new Scanner(System.in);
    public static ArrayList<SanPham> listSP = new ArrayList<>();
    String Masanpham;
    String Madanhmuc;
    String Tensanpham;
    int Gia;
    String Ngaynhap;
    String Ngayban;
    String Hansudung;
    String Motasanpham;

    public SanPham() {
    }

    public SanPham(String Masanpham, String Madanhmuc, String Tensanpham, int Gia, String Ngaynhap, String Ngayban, String Hansudung, String Motasanpham) {
        this.Masanpham = Masanpham;
        this.Madanhmuc = Madanhmuc;
        this.Tensanpham = Tensanpham;
        this.Gia = Gia;
        this.Ngaynhap = Ngaynhap;
        this.Ngayban = Ngayban;
        this.Hansudung = Hansudung;
        this.Motasanpham = Motasanpham;
    }

    public static Scanner getInput() {
        return input;
    }

    public static ArrayList<SanPham> getListProduct() {
        return listSP;
    }

    public String getMasanpham() {
        return Masanpham;
    }

    public String getMadanhmuc() {
        return Madanhmuc;
    }

    public String getTensanpham() {
        return Tensanpham;
    }

    public int getGia() {
        return Gia;
    }

    public String getNgaynhap() {
        return Ngaynhap;
    }

    public String getNgayban() {
        return Ngayban;
    }

    public String getHansudung() {
        return Hansudung;
    }

    public String getMotasanpham() {
        return Motasanpham;
    }

    public static void setInput(Scanner input) {
        SanPham.input = input;
    }

    public static void setListProduct(ArrayList<SanPham> listProduct) {
        SanPham.listSP = listProduct;
    }

    public void setMasanpham(String Masanpham) {
        this.Masanpham = Masanpham;
    }

    public void setMadanhmuc(String Madanhmuc) {
        this.Madanhmuc = Madanhmuc;
    }

    public void setTensanpham(String Tensanpham) {
        this.Tensanpham = Tensanpham;
    }

    public void setGia(int Gia) {
        this.Gia = Gia;
    }

    public void setNgaynhap(String Ngaynhap) {
        this.Ngaynhap = Ngaynhap;
    }

    public void setNgayban(String Ngayban) {
        this.Ngayban = Ngayban;
    }

    public void setHansudung(String Hansudung) {
        this.Hansudung = Hansudung;
    }

    public void setMotasanpham(String Motasanpham) {
        this.Motasanpham = Motasanpham;
    }

   
    
    public void Nhap(){
        System.out.println("Nhập vào mã sản phẩm : ");
        Masanpham = input.nextLine();
        System.out.println("Các danh mục hiện có");
        for (int i = 0; i < Danhmucsanpham.listDanhmuc.size(); i++) {
            System.out.println(Danhmucsanpham.listDanhmuc.get(i).getIdCategory() +" : " +Danhmucsanpham.listDanhmuc.get(i).getNameCategory());
        }
        System.out.println("Nhập và mã danh mục : ");
        Madanhmuc = input.nextLine();
        System.out.println("Nhập vào tên sản phẩm : ");
        Tensanpham = input.nextLine();
        System.out.println("Nhập vào giá sản phẩm : ");
        Gia = Integer.parseInt(input.nextLine());
        System.out.println("Nhập vào ngày thêm (dd-mm-yyyy) : ");
        Ngaynhap = input.nextLine();
        System.out.println("Nhập vào ngày bán (dd-mm-yyyy) : ");
        Ngayban = input.nextLine();
        System.out.println("Nhập vào hạn sử dụng (dd-mm-yyyy): ");
        Hansudung = input.nextLine();
    }
    
    public void HienThongTin(){
        System.out.println("Mã sản phẩm : " + Masanpham);
        System.out.println("Mã danh mục " + Madanhmuc);
        System.out.println("Tên sản phẩm : " + Tensanpham);
        System.out.println("Giá sản phẩm : "+ Gia);
        System.out.println("Ngày thêm " + Ngaynhap);
        System.out.println("Ngày bán : " + Ngayban);
        System.out.println("Hạn sử dụng : " + Hansudung);
    }
}
    