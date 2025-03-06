package Strategy.TinhLuong.Strategies;

public class HieuTruongStrategy implements TinhLuongStrategy {
    public double tinhLuong(double luongCoBan) {
        return luongCoBan + 8000000; // Phụ cấp Hiệu Trưởng
    }

    public String getChucVu() {
        return "Hiệu Trưởng";
    }
}
