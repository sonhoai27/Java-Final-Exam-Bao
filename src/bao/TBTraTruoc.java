/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public final class TBTraTruoc extends ThueBao {
    private int soTien;
    private Date hanSuDung;

    public TBTraTruoc(int soTien, String hanSuDung, String tenThueBao, String soDienThoai) {
        super(tenThueBao, soDienThoai);
        this.soTien = soTien;
        this.hanSuDung = chuyenStringThanhDate(hanSuDung);
    }
    
    @Override
    void nhanTin() {
        if(soTien > 500 && kiemTraConThoiHan()) {
            soTien = soTien - 500;
        }
    }

    @Override
    void goiDien(int soPhut) {
        if(soTien > soPhut*1000 && kiemTraConThoiHan()){
            soTien = soTien - soPhut*1000;
        }
    }
    
    @Override
    public void hienThi() {
        System.out.println("Thong tin tai khoan: ");
        System.out.println("Ten thue bao: " + getTenThueBao() + '\n');
        System.out.println("So dien thoai thue bao: " + getSoDienThoai() + '\n');
        System.out.println("So tien: " + soTien + '\n');
        System.out.println("Han su dung: " + hanSuDung + '\n');
    }
    
    public void napTien(int soTien) {
        if(soTien <= 100000){
            this.soTien = this.soTien+ soTien;
            hanSuDung = congNgay(30);
        }else {
            this.soTien = this.soTien+ soTien;
            hanSuDung = congNgay(90);
        }
    }
    
    public Boolean kiemTraConThoiHan (){
        Date temp = new Date();
        return hanSuDung.compareTo(temp) != -1;
    }
    
    public Date chuyenStringThanhDate(String ngay) {
        Date date = null;
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        df.setLenient(false);
        try {
            date = df.parse(ngay);
        }
        catch (ParseException e) {
           System.out.println("Invalid date");
        }
        return date;
    }

    public int getSoTien() {
        return soTien;
    }

    public Date getHanSuDung() {
        return hanSuDung;
    }
    
    public Date congNgay (int thang) {
        Calendar c = Calendar.getInstance();
        c.setTime(hanSuDung);
        c.add(Calendar.DATE, thang);
        return c.getTime();
    }
}
