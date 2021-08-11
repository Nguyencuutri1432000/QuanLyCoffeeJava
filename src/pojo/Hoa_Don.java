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
public class Hoa_Don {
    private char tenKH,ngayban;
    private int tongTien;

    public Hoa_Don() {
    }

    public Hoa_Don(char tenKH, char ngayban, int tongTien) {
        this.tenKH = tenKH;
        this.ngayban = ngayban;
        this.tongTien = tongTien;
    }

    public char getTenKH() {
        return tenKH;
    }

    public void setTenKH(char tenKH) {
        this.tenKH = tenKH;
    }

    public char getNgayban() {
        return ngayban;
    }

    public void setNgayban(char ngayban) {
        this.ngayban = ngayban;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

}
