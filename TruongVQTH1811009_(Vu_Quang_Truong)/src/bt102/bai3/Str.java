/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt102.bai3;

/**
 *
 * @author vuqua
 */
public class Str {
    StringBuilder str;
    Boolean kt;

    public Str() {
    }

    public Str(StringBuilder str, Boolean kt) {
        this.str = str;
        this.kt = kt;
    }

    public StringBuilder getStr() {
        return str;
    }

    public void setStr(StringBuilder str) {
        this.str = str;
    }

    public Boolean getKt() {
        return kt;
    }

    public void setKt(Boolean kt) {
        this.kt = kt;
    }
    
    
}
