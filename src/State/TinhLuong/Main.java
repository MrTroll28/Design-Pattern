package State.TinhLuong;

import State.TinhLuong.States.HieuTruong;
import State.TinhLuong.States.PhoHieuTruong;
import State.TinhLuong.States.TruongPhong;

public class Main {
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien("Nguyễn Văn A", 10000000);
        nv1.setChucVuState(new TruongPhong());
        nv1.tinhLuong();

        System.out.println("------------------");

        NhanVien nv2 = new NhanVien("Trần Thị B", 12000000);
        nv2.setChucVuState(new HieuTruong());
        nv2.tinhLuong();

        System.out.println("------------------");

        NhanVien nv3 = new NhanVien("Lê Văn C", 11000000);
        nv3.setChucVuState(new PhoHieuTruong());
        nv3.tinhLuong();
    }
}

