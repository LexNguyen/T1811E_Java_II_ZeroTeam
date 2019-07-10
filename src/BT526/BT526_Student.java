/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT526;

/**
 *
 * @author linhn
 */
public class BT526_Student {
    String stdName;
    String stdSex;
    String stdRollNo;
    String stdEmail;
    String stdAddress;

    public BT526_Student() {
    }

    public BT526_Student(String stdName, String stdSex, String stdRollNo, String stdEmail, String stdAddress) {
        this.stdName = stdName;
        this.stdSex = stdSex;
        this.stdRollNo = stdRollNo;
        this.stdEmail = stdEmail;
        this.stdAddress = stdAddress;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public String getStdSex() {
        return stdSex;
    }

    public void setStdSex(String stdSex) {
        this.stdSex = stdSex;
    }

    public String getStdRollNo() {
        return stdRollNo;
    }

    public void setStdRollNo(String stdRollNo) {
        this.stdRollNo = stdRollNo;
    }

    public String getStdEmail() {
        return stdEmail;
    }

    public void setStdEmail(String stdEmail) {
        this.stdEmail = stdEmail;
    }

    public String getStdAddress() {
        return stdAddress;
    }

    public void setStdAddress(String stdAddress) {
        this.stdAddress = stdAddress;
    }
    
}
