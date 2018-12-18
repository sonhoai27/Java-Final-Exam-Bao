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
public class TDHoCaNhan extends TienDien{

    public TDHoCaNhan(String tenKH, int soLuong) {
        super(tenKH, soLuong);
    }
    
    @Override
    long tinhTien() {
        if(getSoLuong() <= 100){
         return getSoLuong()*500;
        }
        return getSoLuong()*800;
    }
    
}
