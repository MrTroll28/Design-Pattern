package Decorator.TinhLuong;

import Decorator.TinhLuong.decorator.PhuCapChucVu;

public class Main {
    public static void main(String[] args) {
        // Nhân viên cơ bản
        Luong nv1 = new NhanVienCoBan("Nguyễn Văn A", 10000000);

        // Thêm phụ cấp chức vụ (Trưởng Phòng) + Thâm niên + Xăng xe
        nv1 = new PhuCapChucVu(nv1, 5000000);

        System.out.println(nv1.getMoTa());
        System.out.println("Tổng lương: " + nv1.tinhLuong());

        System.out.println("------------------");

        // Nhân viên khác với phụ cấp khác
        Luong nv2 = new NhanVienCoBan("Trần Thị B", 12000000);
        nv2 = new PhuCapChucVu(nv2, 8000000);

        System.out.println(nv2.getMoTa());
        System.out.println("Tổng lương: " + nv2.tinhLuong());
    }
}

