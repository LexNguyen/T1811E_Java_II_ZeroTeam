/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment200;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author vuqua
 */
public class Product implements Serializable{
    String idProduct;
    String idCategory;
    String nameProduct;
    String price;
    Date dateSell;
    Date dateExp;
    Date dateBuy;

    public Product() {
    }

    public Product(String idProduct, String idCategory, String nameProduct, String price, Date dateSell, Date dateExp, Date dateBuy) {
        this.idProduct = idProduct;
        this.idCategory = idCategory;
        this.nameProduct = nameProduct;
        this.price = price;
        this.dateSell = dateSell;
        this.dateExp = dateExp;
        this.dateBuy = dateBuy;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(String idCategory) {
        this.idCategory = idCategory;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Date getDateSell() {
        return dateSell;
    }

    public void setDateSell(Date dateSell) {
        this.dateSell = dateSell;
    }

    public Date getDateExp() {
        return dateExp;
    }

    public void setDateExp(Date dateExp) {
        this.dateExp = dateExp;
    }

    public Date getDateBuy() {
        return dateBuy;
    }

    public void setDateBuy(Date dateBuy) {
        this.dateBuy = dateBuy;
    }
    
    @Override
    public String toString() {
        SimpleDateFormat df=new SimpleDateFormat("dd-MM-yyyy");
        return "Product{" + "nameProduct=" + nameProduct + ", price=" + price + ", dateSell=" + df.format(dateSell) + ", dateExp=" + df.format(dateExp) + ", dateBuy=" + df.format(dateBuy) + '}';
    }
    public void display(){
        System.out.println(this.toString());
    }
 
}
