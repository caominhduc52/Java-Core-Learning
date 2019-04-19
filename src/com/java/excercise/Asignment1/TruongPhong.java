package com.java.excercise.Asignment1;

public class TruongPhong extends NhanVien {
    private double trachNhiem;

    public TruongPhong() {}

    public TruongPhong(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }

    public TruongPhong(String manv, double trachNhiem) {
        super(manv);
        this.trachNhiem = trachNhiem;
    }

    public TruongPhong(String manv, String hoten, double trachNhiem) {
        super(manv, hoten);
        this.trachNhiem = trachNhiem;
    }

    public TruongPhong(String manv, String hoten, double luong, double trachNhiem) {
        super(manv, hoten, luong);
        this.trachNhiem = trachNhiem;
    }

    public double getTrachNhiem() {
        return trachNhiem;
    }

    public void setTrachNhiem(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }

    @Override
    public double getThuNhap() {
        return this.getLuong() - this.getThueTN() + this.getTrachNhiem();
    }

    @Override
    public String toString() {
        return "TruongPhong {" + this.getHoten() + ", " + this.getManv() + ", " + this.getThuNhap() + "}";
    }
}
