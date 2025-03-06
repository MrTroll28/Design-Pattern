package Decorator.TinhLuong;

public class NhanVienCoBan implements Luong {
    private String ten;
    private double luongCoBan;

    public NhanVienCoBan(String ten, double luongCoBan) {
        this.ten = ten;
        this.luongCoBan = luongCoBan;
    }

    @Override
    public double tinhLuong() {
        return luongCoBan;
    }

    @Override
    public String getMoTa() {
        return "Nhân viên: " + ten + ", Lương cơ bản: " + luongCoBan;
    }
}

