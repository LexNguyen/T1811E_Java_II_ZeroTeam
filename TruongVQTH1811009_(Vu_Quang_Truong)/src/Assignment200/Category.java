/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment200;

import java.io.Serializable;

/**
 *
 * @author vuqua
 */
public class Category implements Serializable{
    String nameCategory;
    String idCategory;

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public String getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(String IdCategory) {
        this.idCategory = IdCategory;
    }

    public Category() {
    }

    public Category(String nameCategory, String IdCategory) {
        this.nameCategory = nameCategory;
        this.idCategory = IdCategory;
    }

    @Override
    public String toString() {
        return "Category{" + "nameCategory=" + nameCategory + ", idCategory=" + idCategory + '}';
    }
    public void display(){
        System.out.println(this.toString());
    }
    
    
}
