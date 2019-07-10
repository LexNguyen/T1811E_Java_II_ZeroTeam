/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment200;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    static List<DanhMucSanPham> listDanhMuc = new ArrayList<>();
    static List<SanPham> listSanPham = new ArrayList<>();
    static List<SanPham> listSanPhamDaBan = new ArrayList<>();
    static List<SanPham> listSanPhamHetHan = new ArrayList<>();
    static List<SanPham> listSanPhamConLai = new ArrayList<>();
    static Scanner nhap = new Scanner(System.in);

    public static void main(String[] args) throws ParseException, FileNotFoundException, IOException {
        int choose;
        SanPham get;
        do {
            showMenu();
            System.out.println(" nhap muc muon chon");
            choose = Integer.parseInt(nhap.nextLine());

            switch (choose) {
                case 1:
                    int n;
                    System.out.println("nhap so danh muc can them : ");
                    n = Integer.parseInt(nhap.nextLine());
                    for (int i = 0; i < n; i++) {
                        DanhMucSanPham dmsp = new DanhMucSanPham();
                        System.out.println("nhap danh muc thu : " + (i + 1));
                        dmsp.input();
                        listDanhMuc.add(dmsp);
                    }
                    break;
                case 2:
                    int m;
                    System.out.println("nhap so san pham can them : ");
                    m = Integer.parseInt(nhap.nextLine());
                    for (int i = 0; i < m; i++) {
                        SanPham sp = new SanPham();
                        System.out.println("nhap san pham thu : " + (i + 1));
                        sp.input2();

                        listSanPham.add(sp);
                    }
                    break;
                case 3:
                    boolean chuoi;
                    int count = 0;
                    for (SanPham listSanPham1 : listSanPham) {
                        SanPham sp = new SanPham();
                        chuoi = listSanPham1.getNgayBan().isEmpty();
                        if (chuoi == false) {
                            listSanPham1.display2();
                            listSanPhamDaBan.add(listSanPham1);
                            count++;
                        }
                    }
                    if (count == 0) {
                        System.out.println("ko co san pham nao dk ban ");
                    }
                    break;
                case 4:
                    boolean chuoi2 = false;
                    for (SanPham listSanPham1 : listSanPham) {
                        SanPham sp2 = new SanPham();
                        chuoi2 = listSanPham1.getNgayBan().isEmpty();
                        if (chuoi2 == true) {
                            listSanPham1.display2();
                            listSanPhamConLai.add(listSanPham1);
                        }
                    }
                    if (!chuoi2) {
                        System.out.println("ko co san pham ton kho : ");
                    }
                    break;
                case 5:
                    SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
                    Date thoiGian = new Date();
                    String thoigianthuc = dateformat.format(thoiGian.getTime());
                    int count2 = 0;
                    for (SanPham listSanPham1 : listSanPham) {
                        thoiGian = dateformat.parse(thoigianthuc);
                        Date date = dateformat.parse(listSanPham1.getHanSuDung());
                        if (thoiGian.compareTo(date) > 0) {
                            listSanPham1.display2();
                            listSanPhamHetHan.add(listSanPham1);
                            count2++;
                        }
                    }
                    if (count2 == 0) {
                        System.out.println("ko co san pham nao het han : ");
                    }
                    break;
                case 6:

                    break;
                case 7:
                    System.out.println("nhap ten san pham can tim");
                    String searech = nhap.nextLine();

                    for (SanPham sanPham : listSanPham) {
                        if (searech.equalsIgnoreCase(sanPham.getTenSanPham())) {
                            System.out.println(" ten san pham : " + sanPham.tenSanPham + " ; " + " gia san pham : " + sanPham.price + " ; "
                                    + " ngay nhap hang : " + sanPham.ngayNhap + " ; "
                                    + "ngay ban hang : " + sanPham.ngayBan + " ; "
                                    + "ngay het han su dung : " + sanPham.hanSuDung + " ; "
                            );
                        }
                    }
                    break;
                case 8:
                    FileOutputStream fos = null;
                    ObjectOutputStream oss = null;

                    try {
                        fos = new FileOutputStream("category.dat");
                        oss = new ObjectOutputStream(fos);
                        oss.writeObject(listDanhMuc);

                    } catch (IOException e) {
                    } finally {
                        try {
                            if (fos != null) {
                                fos.close();
                            }

                            if (oss != null) {
                                oss.close();
                            }
                        } catch (IOException ex) {
                            System.out.println("loi ghi file : " + ex);
                        }
                    }
                    FileOutputStream fos2 = null;

                    ObjectOutputStream oss2 = null;

                    try {
                        fos2 = new FileOutputStream("sell.dat");
                        oss2 = new ObjectOutputStream(fos2);
                        oss2.writeObject(listSanPhamDaBan);

                    } catch (IOException e) {
                    } finally {
                        try {
                            if (fos2 != null) {
                                fos2.close();
                            }

                            if (oss2 != null) {
                                oss2.close();
                            }
                        } catch (IOException e) {
                            System.out.println("loi ghi file : ");
                        }
                    }
                    FileOutputStream fos3 = null;
                    ObjectOutputStream oss3 = null;

                    try {
                        fos3 = new FileOutputStream("expire.dat");
                        oss3 = new ObjectOutputStream(fos3);
                        oss3.writeObject(listSanPhamHetHan);

                    } catch (IOException e) {
                    } finally {
                        try {
                            if (fos3 != null) {
                                fos3.close();
                            }

                            if (oss3 != null) {
                                oss3.close();
                            }
                        } catch (IOException e) {
                            System.out.println("loi ghi file ");
                        }
                    }
                    FileOutputStream fos4 = null;
                    ObjectOutputStream oss4 = null;

                    try {
                        fos4 = new FileOutputStream("product.dat");
                        oss4 = new ObjectOutputStream(fos4);
                        oss4.writeObject(listSanPhamConLai);

                    } catch (IOException e) {
                    } finally {
                        try {
                            if (fos4 != null) {
                                fos4.close();
                            }

                            if (oss4 != null) {
                                oss4.close();
                            }
                        } catch (IOException e) {
                            System.out.println("loi ghi file ");
                        }
                    }
                    break;
                case 9:
                    FileInputStream fis = null;
                    ObjectInputStream ois = null;

                    try {
                        fis = new FileInputStream("category.dat");
                        ois = new ObjectInputStream(fis);

                        listDanhMuc = (List<DanhMucSanPham>) ois.readObject();

                        for (DanhMucSanPham danhMuc : listDanhMuc) {
                            System.out.println(danhMuc.toString());
                        }
                    } catch (Exception e) {
                    } finally {
                        try {
                            if (fis != null) {
                                fis.close();
                            }
                            if (ois != null) {
                                ois.close();
                            }

                        } catch (IOException e) {
                            System.out.println("loi doc file : " );
                        }
                    }
                    FileInputStream fis2 = null;
                    ObjectInputStream ois2 = null;

                    try {
                        fis2 = new FileInputStream("sell.dat");
                        ois2 = new ObjectInputStream(fis2);

                        listSanPhamDaBan = (List<SanPham>) ois2.readObject();

                        for (SanPham sp : listSanPhamDaBan) {
                            System.out.println(sp.toString());
                        }
                    } catch (Exception e) {
                    } finally {
                        try {
                            if (fis2 != null) {
                                fis2.close();
                            }
                            if (ois2 != null) {
                                ois2.close();
                            }

                        } catch (IOException e) {
                            System.out.println("loi doc file : " );
                        }
                    }
                    FileInputStream fis3 = null;
                    ObjectInputStream ois3 = null;

                    try {
                        fis3 = new FileInputStream("expire.dat");
                        ois3 = new ObjectInputStream(fis3);

                        listSanPhamHetHan = (List<SanPham>) ois3.readObject();

                        for (SanPham sp : listSanPhamHetHan) {
                            System.out.println(sp.toString());
                        }
                    } catch (Exception e) {
                    } finally {
                        try {
                            if (fis3 != null) {
                                fis3.close();
                            }
                            if (ois3 != null) {
                                ois3.close();
                            }

                        } catch (IOException e) {
                            System.out.println("loi doc file : " );
                        }
                    }
                    FileInputStream fis4 = null;
                    ObjectInputStream ois4 = null;

                    try {
                        fis4 = new FileInputStream("product.dat");
                        ois4 = new ObjectInputStream(fis4);

                        listSanPhamConLai = (List<SanPham>) ois4.readObject();

                        for (SanPham sp : listSanPhamConLai) {
                            System.out.println(sp.toString());
                        }
                    } catch (Exception e) {
                    } finally {
                        try {
                            if (fis4 != null) {
                                fis4.close();
                            }
                            if (ois4 != null) {
                                ois4.close();
                            }

                        } catch (IOException e) {
                            System.out.println("loi doc file : " );
                        }
                    }

                    break;
                case 10:
                    System.exit(0);
                    break;
                default:
                    System.out.println("moi chon lai");
                    break;

            }
        } while (choose != 10);
    }

    public static void showMenu() {
        System.out.println("1. Nhập thông tin danh mục");
        System.out.println("2. Nhập thông tin sản phẩm ");
        System.out.println("3. In ra danh sách các sản phẩm đã bán");
        System.out.println("4. In ra danh sách sản phầm còn tồn kho");
        System.out.println("5. In ra danh sách sản phẩm đã quá hạn sử dụng");
        System.out.println("6. In ra danh sách sản phẩm sắp hết hạn sử dụng");
        System.out.println("7. Tìm kiếm >>> nhập tên sản phẩm -> in ra tất cả các sản phẩm có tên nhập vào và số sản phẩm.");
        System.out.println("8. Lưu vào file ");
        System.out.println("9. Đọc dữ liệu từ file và lưu ra chương trình.");
    }

}
