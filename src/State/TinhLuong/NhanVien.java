package State.TinhLuong;

import State.TinhLuong.States.ChucVuState;

public class NhanVien {
    private String ten;
    private double luongCoBan;
    private ChucVuState chucVuState;

    public NhanVien(String ten, double luongCoBan) {
        this.ten = ten;
        this.luongCoBan = luongCoBan;
    }

    public void setChucVuState(ChucVuState chucVuState) {
        this.chucVuState = chucVuState;
    }

    @Override
    public String toString() {
        return "👨‍💼 Nhân viên: " + ten +
            "💰 Lương cơ bản: " + luongCoBan +
            "🎁 Phụ cấp: " + chucVuState.getPhuCap() +
            "🏦 Lương: " + luongCoBan + chucVuState.getChucVu() +
            "👔 Chức vụ: " + chucVuState.getChucVu();
    }

    public void tinhLuong() {
        if (chucVuState != null) {
            System.out.println(this);
        } else {
            System.out.println("⚠️ Nhân viên chưa có chức vụ.");
        }
    }
}

