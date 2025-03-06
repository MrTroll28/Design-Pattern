package Decorator.TinhLuong.decorator;

import Decorator.TinhLuong.Luong;

abstract class LuongDecorator implements Luong {
    protected Luong luong;

    public LuongDecorator(Luong luong) {
        this.luong = luong;
    }

    @Override
    public double tinhLuong() {
        return luong.tinhLuong();
    }

    @Override
    public String getMoTa() {
        return luong.getMoTa();
    }
}

