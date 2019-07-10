/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignement200;

import static assignement200.DanhmucSp.input;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sony
 */
public class SanPham {

    private static void showMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     private String maSP;
    private String tenSP;
    private int gia;
    private String ngayNhap;
    private String ngayBan;
    private String hsd;
    private String mota;
  
    
    public SanPham(){
    
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
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

    public String getHsd() {
        return hsd;
    }

    public void setHsd(String hsd) {
        this.hsd = hsd;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
public static void main(String[] args) {
       int choiceNumber;
       ArrayList<SanPham> sanphamList = new ArrayList<>();
       ArrayList<DanhmucSp> danhmucSpList = new ArrayList<>();
       ArrayList<SanPham> sanphamdabanList = new ArrayList<>();
       ArrayList<SanPham> sanphamcontonList = new ArrayList<>();
       ArrayList<SanPham> sanphamhethanList = new ArrayList<>();
       ArrayList<SanPham> sanphamsaphethanList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (;;) {
            System.out.println("1. Nhap thong tin danh muc");
            System.out.println("2. Nhap thong tin san pham");
            System.out.println("3. In ra danh sách các sản phẩm đã bán");
            System.out.println("4. In ra danh sách sản phầm còn tồn kho");
            System.out.println("5. In ra danh sách sản phẩm đã quá hạn sử dụng ");
            System.out.println("6. In ra danh sách sản phẩm sắp hết hạn sử dụng");
            System.out.println("7. Tìm kiếm");
            System.out.println("8. Lưu vào file");
            System.out.println("9. Đọc dữ liệu từ file và lưu ra chương trình");
            
do {        showMenu();
                System.out.println("Bấm số để chọn (1/2/3/4/5/6/7/8/9): ");
                choiceNumber = scanner.nextInt();
            } while ((choiceNumber < 1) || (choiceNumber > 9));
 switch (choiceNumber) {
                case 1:
                    System.out.println("Bạn chọn chức năng nhập!");
                    System.out.print("Ma danh muc: ");
                    String maDanhMuc = input.nextLine();
                    System.out.print("Ten danh muc: ");
                    String tenDanhMuc = input.nextLine();
                    int n = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i<n; i++){
                    DanhmucSp danhmucSp = new DanhmucSp();
                    danhmucSp.input();
                    
                    danhmucSpList.add(danhmucSp);
                    
                 
                    }
                    break;
                case 2:
                    System.out.println("Bạn chọn chức năng nhập!");
                    System.out.println("Nhap ma san pham :");
                    String maSP = input.nextLine();
                   System.out.print("Nhap ten san pham: ");
                    String tenSp = input.nextLine();
                    System.out.print("nhap gia: ");
                    String gia = input.nextLine();
                    System.out.print("nhap ngay nhap: ");
                    String ngaynhapSp = input.nextLine();
                    SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
                    df.setLenient(false); 
                    int t = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i<t; i++){
                    SanPham sanpham = new SanPham();
                    sanpham.input();
                    
                    sanphamList.add(sanpham);
                    
                    
                    
                    

                    }
                case 3:
                    sanphamdabanList.forEach((SanPham arg) -> {
                        arg.display();
                    });
                    break;
                case 4:
                    sanphamcontonList.forEach((arg) -> {
                        arg.display();
                    });

                     break;
                case 5:
                    sanphamhethanList.forEach((arg) -> {
                        arg.display();
                    });
                    break;
 }
        }
        
}
    private void input() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}