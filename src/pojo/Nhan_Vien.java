/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author PC
 */
public class Nhan_Vien {
    private int MANV;
    private String TENNV;
    private int MABP;
    private String SDT;
    private String DIACHI;
    private String GIOITINH;

    public Nhan_Vien() {
    }

    public Nhan_Vien(int MANV, String TENNV, int MABP, String SDT, String DIACHI, String GIOITINH) {
        this.MANV = MANV;
        this.TENNV = TENNV;
        this.MABP = MABP;
        this.SDT = SDT;
        this.DIACHI = DIACHI;
        this.GIOITINH = GIOITINH;
    }

    public int getMANV() {
        return MANV;
    }

    public String getTENNV() {
        return TENNV;
    }

    public int getMABP() {
        return MABP;
    }

    public String getSDT() {
        return SDT;
    }

    public String getDIACHI() {
        return DIACHI;
    }

    public String getGIOITINH() {
        return GIOITINH;
    }

    public void setMANV(int MANV) {
        this.MANV = MANV;
    }

    public void setTENNV(String TENNV) {
        this.TENNV = TENNV;
    }

    public void setMABP(int MABP) {
        this.MABP = MABP;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public void setDIACHI(String DIACHI) {
        this.DIACHI = DIACHI;
    }

    public void setGIOITINH(String GIOITINH) {
        this.GIOITINH = GIOITINH;
    }
    
}
