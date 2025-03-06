package State.TinhLuong.States;

class PhoKhoa implements ChucVuState {
    public double getPhuCap() {
        return 4000000; // Phụ cấp Phó Khoa
    }

    public String getChucVu() {
        return "Phó Khoa";
    }
}
