package com.java.excercise.Asignment1;

public class TiepThi extends NhanVien {
    private double doanhSo;
    private double hoaHong;

    public TiepThi() {}

    public TiepThi(double doanhSo, double hoaHong) {
        this.doanhSo = doanhSo;
        this.hoaHong = hoaHong;
    }

    public TiepThi(String manv, double doanhSo, double hoaHong) {
        super(manv);
        this.doanhSo = doanhSo;
        this.hoaHong = hoaHong;
    }

    public TiepThi(String manv, String hoten, double doanhSo, double hoaHong) {
        super(manv, hoten);
        this.doanhSo = doanhSo;
        this.hoaHong = hoaHong;
    }

    public TiepThi(String manv, String hoten, double luong, double doanhSo, double hoaHong) {
        super(manv, hoten, luong);
        this.doanhSo = doanhSo;
        this.hoaHong = hoaHong;
    }

    public double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public double getHoaHong() {
        return hoaHong;
    }

    public void setHoaHong(double hoaHong) {
        this.hoaHong = hoaHong;
    }

    @Override
    public double getThuNhap() {
        return this.getLuong() - this.getThueTN() + this.getHoaHong() * this.getDoanhSo();
    }

    @Override
    public String toString() {
        return "TiepThi{" + this.getHoten() + ", " + this.getManv() + ", " + this.getThuNhap() + "}";
    }
}
