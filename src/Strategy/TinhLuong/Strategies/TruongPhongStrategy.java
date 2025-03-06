package Strategy.TinhLuong.Strategies;

public class TruongPhongStrategy implements TinhLuongStrategy {
    public double tinhLuong(double luongCoBan) {
        return luongCoBan + 5000000; // Phụ cấp Trưởng Phòng
    }

    public String getChucVu() {
        return "Trưởng Phòng";
    }
}
