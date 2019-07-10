/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bt200;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LQT
 */
public class Main {
    public static Scanner input = new Scanner(System.in);
    public static ArrayList<SanPham> sanphamdaban = new ArrayList<>(); 
    public static ArrayList<SanPham> Sanphamhethan = new ArrayList<>(); 
    public static ArrayList<SanPham> sanphamconhan = new ArrayList<>(); 

    public static void main(String[] args) {
        int choose;
        do {
            showMenu();
            System.out.println("Mời bạn chọn 1 mục : ");
            choose = Integer.parseInt(input.nextLine());

            switch (choose) {
                case 1:
                    System.out.println("Thêm danh mục");
                    Danhmucsanpham Danhmucsanpham = new Danhmucsanpham();
                    Danhmucsanpham.Nhap();
                   Danhmucsanpham.listDanhmuc.add(Danhmucsanpham);
                    break;

                case 2:
                    System.out.println("Thêm sản phẩm");
                    SanPham SanPham = new SanPham();
                    SanPham.Nhap();
                    SanPham.listSP.add(SanPham);
                    break;

                case 3:
                    for (int i = 0; i < SanPham.listSP.size(); i++) {
                        DateFormat df = new SimpleDateFormat();
                        Date dfDateSale = null;
                        try {
//                        Product.listProduct.get(i).getDateSale()
                            dfDateSale = df.parse( SanPham.listSP.get(i).getNgayban());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        // convert to Long
                        Long dateNowByLong = new java.util.Date().getTime();
                        Long dateSaleByLong = dfDateSale.getTime();
                        System.out.println("Các sản phẩm đã bán");
                        if (dateNowByLong - dateSaleByLong > 0) {
                            SanPham.listSP.get(i).HienThongTin();
                            sanphamdaban.add(SanPham.listSP.get(i));
                        }

                    }
                    break;

                case 4:
                    for (int i = 0; i < SanPham.listSP.size(); i++) {
                        DateFormat df = new SimpleDateFormat();
                        Date dfDateSale = null;
                        try {
                            dfDateSale = df.parse(SanPham.listSP.get(i).getNgayban());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        // convert to Long
                        Long dateNowByLong = new java.util.Date().getTime();
                        Long dateSaleByLong = dfDateSale.getTime();
                        System.out.println("Các sản phẩm còn tồn kho");
                        if (dateNowByLong - dateSaleByLong < 0) {
                            SanPham.listSP.get(i).HienThongTin();
                        }

                    }
                    break;

                case 5:
                    for (int i = 0; i < SanPham.listSP.size(); i++) {
                        DateFormat df = new SimpleDateFormat();
                        Date dfDateExpiry = null;
                        try {
                            dfDateExpiry = df.parse(SanPham.listSP.get(i).getHansudung());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        // convert to Long
                        Long dateNowByLong = new java.util.Date().getTime();
                        Long dateExpiryByLong = dfDateExpiry.getTime();
                        System.out.println("Các sản phẩm hết hạn sử dụng");
                        if (dateNowByLong - dateExpiryByLong > 0) {
                            SanPham.listSP.get(i).HienThongTin();
                            Sanphamhethan.add(SanPham.listSP.get(i));
                        }

                    }
                    break;

                case 6:
                    for (int i = 0; i < SanPham.listSP.size(); i++) {
                        DateFormat df = new SimpleDateFormat();
                        Date dfDateExpiry = null;
                        try {
                            dfDateExpiry = df.parse(SanPham.listSP.get(i).getHansudung());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        // convert to Long
                        Long dateNowByLong = new java.util.Date().getTime();
                        Long dateExpiryByLong = dfDateExpiry.getTime();
                        System.out.println("San Pham het han su dung");
                        if (- 86400000 * 7 < dateNowByLong - dateExpiryByLong && dateNowByLong - dateExpiryByLong < 0) {
                            SanPham.listSP.get(i).HienThongTin();
                        }

                    }
                    break;

                case 7:
                    int count = 0;
                    System.out.println("Nhap ten san pham can tim: ");
                    String s = input.nextLine();
                    System.out.println("San Pham can tim la: ");
                    for (int i = 0; i < SanPham.listSP.size(); i++) {
                        if (SanPham.listSP.get(i).getTensanpham().contains(s)) {
                            SanPham.listSP.get(i).HienThongTin();
                            count++;
                        }
                    }
                    System.out.println("Số sản phẩm : " + count);
                    break;

                case 8:
                    createFileList(sanphamdaban, "E:/sell.dat");
                    createFileList(Sanphamhethan, "E:/expire.dat");
                    KiemTraSanPham();
                    createFileList(sanphamconhan, "E:/product.dat");
                    System.out.println("Đã lưu các thông tin sản phẩm vào file");
                    break;

                case 9:
                    ArrayList<Danhmucsanpham> listCategory = readFileList("E:/category.dat");
                    for (Danhmucsanpham SanPham1 : listCategory) {
                        SanPham1.HienThiDanhMuc();
                    }

                    ArrayList<SanPham> sellDat1 = readFileList("E:/sell.dat");
                    for (SanPham SanPham1 : sellDat1) {
                        SanPham1.HienThongTin();
                    }

                    ArrayList<SanPham> expire1 = readFileList("E:/expire.dat");
                    for (SanPham SanPham1 : expire1) {
                        SanPham1.HienThongTin();
                    }

                    ArrayList<SanPham> productStillValid1 = readFileList("E:/product.dat");
                    for (SanPham product1 : productStillValid1) {
                        product1.HienThongTin();
                    }
                    break;

                case 0:
                    System.out.println("Thoát chương trình");
                    break;
            }

        } while (choose != 0);
    }

    static void showMenu() {
        System.out.println("=== Menu ===");
        System.out.println("1. Nhập thông tin danh mục");
        System.out.println("2. Nhập thông tin sản phẩm");
        System.out.println("3. In ra danh sách các sản phẩm đã bán");
        System.out.println("4. In ra danh sách các sản phẩm còn tồn kho");
        System.out.println("5. In ra danh sách các sản phẩm quá hạn sử dụng");
        System.out.println("6. In ra danh sách các sản phẩm sắp hết hạn sử dụng");
        System.out.println("7. Tìm kiếm theo tên sản phẩm");
        System.out.println("8. Lưu dữ liệu vào file");
        System.out.println("9. Đọc dữ liệu từ file");
        System.out.println("0. Thoát");
    }

    public static void createFileList(ArrayList list, String nameFileOutPut) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(new File(nameFileOutPut));
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    static ArrayList readFileList(String nameFileInPut) {
        FileInputStream fis = null;
        ArrayList list = new ArrayList();
        try {
            fis = new FileInputStream(new File(nameFileInPut));
            ObjectInputStream ois = new ObjectInputStream(fis);
            list = (ArrayList) ois.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return list;
    }

    static void KiemTraSanPham() {
        for (int i = 0; i < SanPham.listSP.size(); i++) {
            DateFormat df = new SimpleDateFormat();
            Date dfDateExpiry = null;
            try {
                dfDateExpiry = df.parse(SanPham.listSP.get(i).getHansudung());
            } catch (Exception e) {
                e.printStackTrace();
            }
            // convert to Long
            Long dateNowByLong = new java.util.Date().getTime();
            Long dateExpiryByLong = dfDateExpiry.getTime();
            if (- 86400000 * 7 < dateNowByLong - dateExpiryByLong && dateNowByLong - dateExpiryByLong < 0) {
                sanphamconhan.add(SanPham.listSP.get(i));
            }

        }
    }
}