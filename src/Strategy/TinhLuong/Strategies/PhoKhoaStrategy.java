package Strategy.TinhLuong.Strategies;

class PhoKhoaStrategy implements TinhLuongStrategy {
    public double tinhLuong(double luongCoBan) {
        return luongCoBan + 4000000; // Phụ cấp Phó Khoa
    }

    public String getChucVu() {
        return "Phó Khoa";
    }
}
