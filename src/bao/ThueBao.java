package bao;

public abstract class ThueBao {
    private String tenThueBao;
    private String soDienThoai;

    public ThueBao(String tenThueBao, String soDienThoai) {
        this.tenThueBao = tenThueBao;
        this.soDienThoai = soDienThoai;
    }

    abstract void nhanTin();
    
    abstract void goiDien(int soPhut);
    
    abstract void hienThi();
    
    public String getTenThueBao() {
        return tenThueBao;
    }

    public void setTenThueBao(String tenThueBao) {
        this.tenThueBao = tenThueBao;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
    
    
}
