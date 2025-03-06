package State.TinhLuong.States;

public class TruongPhong implements ChucVuState {
    public double getPhuCap() {
        return 5000000; // Phụ cấp Trưởng Phòng
    }

    public String getChucVu() {
        return "Trưởng Phòng";
    }
}
