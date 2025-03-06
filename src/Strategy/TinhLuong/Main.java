package Strategy.TinhLuong;

import Strategy.TinhLuong.Strategies.HieuTruongStrategy;
import Strategy.TinhLuong.Strategies.PhoHieuTruongStrategy;
import Strategy.TinhLuong.Strategies.TruongPhongStrategy;

public class Main {
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien("Nguyễn Văn A", 10000000);
        nv1.setTinhLuongStrategy(new TruongPhongStrategy());
        nv1.tinhLuong();

        System.out.println("------------------");

        NhanVien nv2 = new NhanVien("Trần Thị B", 12000000);
        nv2.setTinhLuongStrategy(new HieuTruongStrategy());
        nv2.tinhLuong();

        System.out.println("------------------");

        NhanVien nv3 = new NhanVien("Lê Văn C", 11000000);
        nv3.setTinhLuongStrategy(new PhoHieuTruongStrategy());
        nv3.tinhLuong();
    }
}

