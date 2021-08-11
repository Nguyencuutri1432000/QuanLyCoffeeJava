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
public class boPhanLamViec {
   private int MABP;
   private String TENBP;
   private float LUONG;
   private float PHUCAP;

    public boPhanLamViec(int MABP, String TENBP, float LUONG, float PHUCAP) {
        this.MABP = MABP;
        this.TENBP = TENBP;
        this.LUONG = LUONG;
        this.PHUCAP = PHUCAP;
    }

    public boPhanLamViec() {
    }

    public int getMABP() {
        return MABP;
    }

    public String getTENBP() {
        return TENBP;
    }

    public float getLUONG() {
        return LUONG;
    }

    public float getPHUCAP() {
        return PHUCAP;
    }

    public void setMABP(int MABP) {
        this.MABP = MABP;
    }

    public void setTENBP(String TENBP) {
        this.TENBP = TENBP;
    }

    public void setLUONG(float LUONG) {
        this.LUONG = LUONG;
    }

    public void setPHUCAP(float PHUCAP) {
        this.PHUCAP = PHUCAP;
    }
   
}
