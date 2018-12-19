package bao;

import java.util.ArrayList;
import java.util.Scanner;

public class SuDung {
    private ArrayList<ThueBao> thueBao;
    
    public void nhap(int tong){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < tong; i++){
            System.out.println("Nhap 1: TBTraTruoc, 2: TBTraSau");
            if(sc.nextInt() == 1){
                String hanSuDung;
                System.out.println("Han su dung: ");
                sc.nextLine();
                hanSuDung = sc.nextLine();
                
                int soLan;
                System.out.println("So lan: ");
                soLan = sc.nextInt();
                sc.nextLine();
                
                String tenThueBao;
                System.out.println("Ten thue bao: ");
                tenThueBao = sc.nextLine();
                
                String soDienThoai;
                System.out.println("So thue bao: ");
                soDienThoai = sc.nextLine();
                
                TBTraTruoc tb = new TBTraTruoc(soLan, hanSuDung, tenThueBao, soDienThoai);
                thueBao.add(tb);
            }else {
                System.out.println("So phut: ");
                sc.nextLine();
                int soPhut = sc.nextInt();
                sc.nextLine();
                System.out.println("So tin nhan: ");
                int soTinNhan = sc.nextInt();
                sc.nextLine();
                System.out.println("Ten thue bao: ");
                String tenThueBao = sc.nextLine();
                System.out.println("So thue bao: ");
                String soDienThoai = sc.nextLine();
                TBTraSau tb = new TBTraSau(soPhut, soTinNhan, tenThueBao, soDienThoai);
                thueBao.add(tb); 
            }
        }
    }
    
    public void hienThi(){
        for(int i = 0; i < thueBao.size(); i++){
            thueBao.get(i).hienThi();
        }
    };
    public static void main(String[] args) {
        SuDung sd = new SuDung();
        sd.thueBao = new ArrayList<>();
        sd.nhap(2);
        sd.hienThi();   
    }
}