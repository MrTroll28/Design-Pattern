package Strategy.TinhLuong.Strategies;

class ToTruongStrategy implements TinhLuongStrategy {
    public double tinhLuong(double luongCoBan) {
        return luongCoBan + 3000000; // Phụ cấp Tổ Trưởng
    }

    public String getChucVu() {
        return "Tổ Trưởng";
    }
}
