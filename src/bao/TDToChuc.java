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
public class TDToChuc extends TienDien{
    private int mucDo;
    public TDToChuc(int mucDo, String tenKH, int soLuong) {
        super(tenKH, soLuong);
    }

    @Override
    long tinhTien() {
        if(getSoLuong() <= kiemTraMuDo(mucDo)){
            return getSoLuong()*400;
        }else {
            return getSoLuong()*1000;
        }
    }

    public int getMucDo() {
        return mucDo;
    }

    public void setMucDo(int mucDo) {
        this.mucDo = mucDo;
    }
    
    int kiemTraMuDo(int md){
        switch(md){
            case 1: return 1000;
            case 2: return 2000;
            case 3: return 5000;
            default: return 0;
        }
    }
    
}
