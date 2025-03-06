package Decorator.TinhLuong.decorator;

import Decorator.TinhLuong.Luong;

public class PhuCapChucVu extends LuongDecorator {
    private double phuCap;

    public PhuCapChucVu(Luong luong, double phuCap) {
        super(luong);
        this.phuCap = phuCap;
    }

    @Override
    public double tinhLuong() {
        return super.tinhLuong() + phuCap;
    }

    @Override
    public String getMoTa() {
        return super.getMoTa() + ", Phụ cấp chức vụ: " + phuCap;
    }
}

