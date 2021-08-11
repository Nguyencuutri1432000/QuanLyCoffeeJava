/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author FINELAPTOP.VN
 */
public class Khach_Hang 
{
    private String HOTEN,DIACHI,GIOITINH,SDT;
    private int MAKH;

    public Khach_Hang() {
    }

    public Khach_Hang(String HOTEN, String DIACHI, String GIOITINH, String SDT, int MAKH) {
        this.HOTEN = HOTEN;
        this.DIACHI = DIACHI;
        this.GIOITINH = GIOITINH;
        this.SDT = SDT;
        this.MAKH = MAKH;
    }

    public String getHOTEN() {
        return HOTEN;
    }

    public void setHOTEN(String HOTEN) {
        this.HOTEN = HOTEN;
    }

    public String getDIACHI() {
        return DIACHI;
    }

    public void setDIACHI(String DIACHI) {
        this.DIACHI = DIACHI;
    }

    public String getGIOITINH() {
        return GIOITINH;
    }

    public void setGIOITINH(String GIOITINH) {
        this.GIOITINH = GIOITINH;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public int getMAKH() {
        return MAKH;
    }

    public void setMAKH(int MAKH) {
        this.MAKH = MAKH;
    }
    
}
