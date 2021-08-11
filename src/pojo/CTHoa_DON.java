/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author LENOVO
 */
public class CTHoa_DON {
    private char tenSP;
    private int soLuong;
    private float giamGia,donGia;

    public CTHoa_DON() {
    }

    public CTHoa_DON(char tenSP, int soLuong, float giamGia, float donGia) {
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.giamGia = giamGia;
        this.donGia = donGia;
    }

    public char getTenSP() {
        return tenSP;
    }

    public void setTenSP(char tenSP) {
        this.tenSP = tenSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(float giamGia) {
        this.giamGia = giamGia;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }
    
}
