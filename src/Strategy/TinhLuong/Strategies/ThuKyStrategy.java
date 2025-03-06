package Strategy.TinhLuong.Strategies;

class ThuKyStrategy implements TinhLuongStrategy {
    public double tinhLuong(double luongCoBan) {
        return luongCoBan + 2000000; // Phụ cấp Thư Ký
    }

    public String getChucVu() {
        return "Thư Ký";
    }
}
