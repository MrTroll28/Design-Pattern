package Strategy.TinhLuong.Strategies;

public class PhoHieuTruongStrategy implements TinhLuongStrategy {
    public double tinhLuong(double luongCoBan) {
        return luongCoBan + 7000000; // Phụ cấp Phó Hiệu Trưởng
    }

    public String getChucVu() {
        return "Phó Hiệu Trưởng";
    }
}
