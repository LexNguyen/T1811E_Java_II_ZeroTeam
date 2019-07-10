/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignement200;

import java.util.Scanner;

/**
 *
 * @author sony
 */
public class DanhmucSp {

    private String maDanhMuc;
    private String tenDanhMuc;
    
    public DanhmucSp() {
        
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
    
    static Scanner input = new Scanner(System.in);
    public static void nhapdulieu(DanhmucSp DanhmucSp) {
        System.out.print("Ma danh muc: ");
        String maDanhMuc = input.nextLine();
        DanhmucSp.setMaDanhMuc(maDanhMuc);
        
        System.out.print("Ten danh muc: ");
        String tenDanhMuc = input.nextLine();
        DanhmucSp.setTenDanhMuc(tenDanhMuc);
    }
    public static void hienthidulieu(DanhmucSp DanhmucSp) {
       System.out.println("Ma danh muc: "+ DanhmucSp.maDanhMuc);
       System.out.println("Ten danh muc: "+ DanhmucSp.tenDanhMuc);
    }
    public static void main(String[] args){
     DanhmucSp sanpham;
        sanpham = new DanhmucSp();
        nhapdulieu(sanpham);
        hienthidulieu(sanpham);
    }

    void input() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
