/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt18;
import java.util.List;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.Comparator;


/**
 *
 * @author Admin
 */
public class Bt18 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        List<Studennt> liststd = new ArrayList<>();
        int chon;
        System.out.println("Chon: ");
        do {
            showMenu();
            chon = Integer.parseInt(System.console().readLine());
            switch (chon) {
                case 1:
                    System.out.println("Nhap so luong sinh vien ");
                    int n = Integer.parseInt(System.console().readLine());
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhap sinh vien thu : " + (i + 1));
                        Studennt std = new Studennt();
                        std.nhap();
                        liststd.add(std);
                    }
                    break;
                case 2:
                    System.out.println("Nhap ID sinh vien can sua: ");
                    int id = Integer.parseInt(System.console().readLine());
                        for(int i=0;i<liststd.size();i++){
                            if(liststd.get(i).getId() == id){
                                liststd.get(i).edit();
                                break;
                            }
                    }
                    break;
                case 3:
                    System.out.println("Nhap ID sinh vien can sua: ");
                    int delID = Integer.parseInt(System.console().readLine());
                    for (int i = 0; i < liststd.size(); i++) {
                        if (liststd.get(i).getId() == delID) {
                            liststd.remove(i);
                            break;
                        }
                    }
                    break;

                case 4:
                    Collections.sort(liststd, new Comparator<Studennt>() {

                        @Override
                        public int compare(Studennt t, Studennt t1) {
                            if (t.getGpa() < t1.getGpa()) {
                                return -1;
                            }
                            return 1;
                        }
                    });
                    for (Studennt Arr1 : liststd) {
                        Arr1.dislay();
                    }
                    break;
                case 5:
                    Collections.sort(liststd, new Comparator<Studennt>() {

                        @Override
                        public int compare(Studennt t, Studennt t1) {
                            if (t.getName().compareTo(t1.getName())<0) {
                                return -1;
                            }
                            return 1;
                        }
                    });
                    for (Studennt Arr1 : liststd) {
                        Arr1.dislay();
                    }
                    break;
                case 6:
                    for (int i=0;i<liststd.size();i++) {
                        liststd.get(i).display();
                    }
                    break;
                case 7:
                    FileOutputStream fos=null;
                    ObjectOutputStream oos=null;
                    try{
                       fos= new FileOutputStream("student.dat");
                       oos= new ObjectOutputStream(fos);
                       oos.writeObject(liststd);
                    }catch(Exception e){
                        
                    }finally{
                        try{
                            if(fos !=null){
                            fos.close();
                        }
                        if(oos!=null){
                            oos.close();
                        }
                        }catch(Exception e){}
                    }
                    break;
                case 8:
                     FileInputStream fis=null;
                    ObjectInputStream ois=null;
                    try{
                       fis= new FileInputStream("student.dat");
                       ois= new ObjectInputStream(fis);
                       liststd= (List<Studennt>) ois.readObject();
                    }catch(Exception e){
                        
                    }finally{
                        try{
                            if(fis !=null){
                            fis.close();
                        }
                        if(ois!=null){
                            ois.close();
                        }
                        }catch(Exception e){}
                    }
                    break;
                case 9:
                    System.out.println("Exit!!!");
                    break;
                default:
                    System.out.println("Input Failed");
            }        
            }while (chon != 9); 
    }
     static void showMenu() {
        System.out.println("1. Add student.");
        System.out.println("2. Edit student by id.");
        System.out.println("3. Delete student by id.");
        System.out.println("4. Sort student by gpa.");
        System.out.println("5. Sort student by name.");
        System.out.println("6. Show student.");
        System.out.println("7. Save.");
        System.out.println("8. Read.");
        System.out.println("9. Exit.");
    }
}
