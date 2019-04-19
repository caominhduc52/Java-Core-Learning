package com.java.excercise.Asignment1;

public class NhanVien {
    private String manv;
    private String hoten;
    private double luong;

    public NhanVien() {}

    public NhanVien(String manv) {
        this.manv = manv;
    }

    public NhanVien(String manv, String hoten) {
        this.manv = manv;
        this.hoten = hoten;
    }

    public NhanVien(String manv, String hoten, double luong) {
        this.manv = manv;
        this.hoten = hoten;
        this.luong = luong;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public double getThuNhap() {
        return luong - getThueTN();
    }

    public double getThueTN() {
        if (this.luong < 9000000) {
            return 0;
        } else if (this.luong < 15000000) {
            return this.luong * 0.1;
        } else {
            return this.luong * 0.12;
        }
    }

    @Override
    public String toString() {
        return "NhanVien { " + this.manv + ", " + this.hoten + ", " + this.luong + "}";
    }
}
