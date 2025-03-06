package Strategy.TinhLuong;

import Strategy.TinhLuong.Strategies.TinhLuongStrategy;

class NhanVien {
    private String ten;
    private double luongCoBan;
    private TinhLuongStrategy tinhLuongStrategy;

    public NhanVien(String ten, double luongCoBan) {
        this.ten = ten;
        this.luongCoBan = luongCoBan;
    }

    public void setTinhLuongStrategy(TinhLuongStrategy tinhLuongStrategy) {
        this.tinhLuongStrategy = tinhLuongStrategy;
    }

    public void tinhLuong() {
        if (tinhLuongStrategy != null) {
            double tongLuong = tinhLuongStrategy.tinhLuong(luongCoBan);
            System.out.println("Nhân viên: " + ten);
            System.out.println("Chức vụ: " + tinhLuongStrategy.getChucVu());
            System.out.println("Lương: " + tongLuong);
        } else {
            System.out.println("⚠️ Nhân viên chưa có chức vụ.");
        }
    }
}

