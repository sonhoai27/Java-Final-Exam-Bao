package bao;

public class TBTraSau extends ThueBao{
    private int soPhut;
    private int soTinNhan;

    public TBTraSau(int soPhut, int soTinNhan, String tenThueBao, String soDienThoai) {
        super(tenThueBao, soDienThoai);
        this.soPhut = soPhut;
        this.soTinNhan = soTinNhan;
    }
    
    public int getSoPhut() {
        return soPhut;
    }

    public void setSoPhut(int soPhut) {
        this.soPhut = soPhut;
    }

    public int getSoTinNhan() {
        return soTinNhan;
    }

    public void setSoTinNhan(int soTinNhan) {
        this.soTinNhan = soTinNhan;
    }

    @Override
    void nhanTin() {
        soTinNhan = soTinNhan + 1;
    }

    @Override
    void goiDien(int soPhut) {
        this.soPhut = soPhut + this.soPhut;
    }

    @Override
    void hienThi() {
        System.out.println("Thong tin tai khoan: ");
        System.out.println("Ten thue bao: " + getTenThueBao() + '\n');
        System.out.println("So dien thoai thue bao: " + getSoDienThoai() + '\n');
        System.out.println("So phut: " + soPhut + '\n');
        System.out.println("So tin nhan: " + soTinNhan + '\n');
    }
    
    public void thanhToan(){
        System.out.println("Thanh toan: ");
        System.out.println("So dien thoai thue bao: " + getSoDienThoai() + '\n');
        int temp = 60000 + soPhut + soTinNhan;
        System.out.println("Phí: "+temp+ "\n");
    }
    
}
