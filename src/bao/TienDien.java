/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bao;

/**
 *
 * @author mojave
 */
public abstract class TienDien {
    private String tenKH;
    private int soLuong;

    
    public TienDien(String tenKH, int soLuong) {
        this.tenKH = tenKH;
        this.soLuong = soLuong;
    }
    
    abstract long tinhTien();
    
    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    
}
