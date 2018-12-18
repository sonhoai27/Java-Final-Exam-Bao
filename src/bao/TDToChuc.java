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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getMucDo() {
        return mucDo;
    }

    public void setMucDo(int mucDo) {
        this.mucDo = mucDo;
    }
    
    
}
