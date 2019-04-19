package com.java.excercise.Asignment1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DanhSachNhanVien {
    private ArrayList<NhanVien> list = new ArrayList<>();
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public ArrayList<NhanVien> getList() {
        return list;
    }

    public void setList(ArrayList<NhanVien> list) {
        this.list = list;
    }

    public void nhapNhanVien() throws IOException {
        while (true) {
            int choice;
            System.out.println("Ban muon nhap nhan vien loai nao ?");
            System.out.println("1. Nhan vien tiep thi ");
            System.out.println("2. Nhan vien truong phong");
            System.out.println("3.EXIT");
            choice = Integer.parseInt(reader.readLine());

            if (choice == 1) {
                TiepThi nhanvien = new TiepThi();
                System.out.println("Nhap vao ten cua nhan vien : ");
                nhanvien.setHoten(reader.readLine());
                System.out.println("Nhap vao ma so cua nhan vien : ");
                nhanvien.setManv(reader.readLine());
                System.out.println("Nhap vao luong cua nhan vien : ");
                nhanvien.setLuong(Double.parseDouble(reader.readLine()));
                System.out.println("Nhap vao doanh so cua nhan vien : ");
                nhanvien.setDoanhSo(Double.parseDouble(reader.readLine()));
                System.out.println("Nhap vao hoa hong cua nhan vien : ");
                nhanvien.setHoaHong(Double.parseDouble(reader.readLine()));

                list.add(nhanvien);
            }

            if (choice == 2) {
                TruongPhong truongPhong = new TruongPhong();
                System.out.println("Nhap vao ten cua truong phong : ");
                truongPhong.setHoten(reader.readLine());
                System.out.println("Nhap vao ma nhan vien cua truong phong : ");
                truongPhong.setManv(reader.readLine());
                System.out.println("Nhap vao luong cua truong phong : ");
                truongPhong.setLuong(Double.parseDouble(reader.readLine()));
                System.out.println("Nhap vao luong trach nhiem cua truong phong : ");
                truongPhong.setTrachNhiem(Double.parseDouble(reader.readLine()));

                list.add(truongPhong);
            }

            if (choice == 3){
                return;
            }
        }
    }

    public void xuatNhanVien() {
        for (NhanVien nv : list) {
            if (nv instanceof TiepThi) {
                System.out.println(((TiepThi) nv));
            }
            if (nv instanceof TruongPhong) {
                System.out.println((TruongPhong) nv);
            }
        }
    }

    public void timNhanVien(int maNhanVien) {
        for (NhanVien nv : list) {
            if (nv.getManv() == String.valueOf(maNhanVien)) {
                System.out.println(nv);
            }
        }
    }

    public void xoaNhanvien(int maNhanVien) {
        for (NhanVien nv : list) {
            if (nv.getManv() == String.valueOf(maNhanVien)) {
                list.remove(nv);
            }
        }
    }

    public void capNhat(int maNhanVien) throws IOException {
        for (NhanVien nv : list) {
            if (nv instanceof TiepThi){
                System.out.println("Cap nhat ho ten cua nhan vien : ");
                nv.setHoten(reader.readLine());
                System.out.println("Cap nhat ma nhan vien : ");
                nv.setManv(reader.readLine());
                System.out.println("Cap nhat luong cua nhan vien : ");
                nv.setLuong(Double.parseDouble(reader.readLine()));
                System.out.println("Cap nhat doanh so cua nhan vien : ");
                ((TiepThi) nv).setDoanhSo(Double.parseDouble(reader.readLine()));
                System.out.println("Cap nhat hoa hong cho nhan vien : ");
                ((TiepThi) nv).setHoaHong(Double.parseDouble(reader.readLine()));
            }
            if (nv instanceof TruongPhong) {
                System.out.println("Cap nhat ten cua truong phong : ");
                nv.setHoten(reader.readLine());
                System.out.println("Cap nhat ma nhan vien cua truong phong : ");
                nv.setManv(reader.readLine());
                System.out.println("Cap nhat luong cua truong phong : ");
                nv.setLuong(Double.parseDouble(reader.readLine()));
                System.out.println("Cap nhat luong trach nhiem cua truong phong : ");
                ((TruongPhong) nv).setTrachNhiem(Double.parseDouble(reader.readLine()));
            }
        }
    }

    public void timNhanvienTheoLuong(double khoangLuong) {
        for (NhanVien nv : list) {
            if (nv.getThuNhap() >= khoangLuong) {
                System.out.println("Ho ten : " + nv.getHoten() + " Luong : " + nv.getThuNhap());
            }
        }
    }

    public void sapXepTheoHoTen() {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size()-i-1 ; j++){
                if (list.get(j).getHoten().compareTo(list.get(j+1).getHoten()) > 0) {
                    NhanVien tmp = list.get(j);
                    list.set(i, list.get(j+1));
                    list.set(j+1, tmp);
                }
            }
        }
    }

    public void sapXepTheoThuNhap() {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++){
                if (list.get(j).getThuNhap() > list.get(j + 1).getThuNhap()){
                    NhanVien tmp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set((j+1), tmp);
                }
            }
        }
    }

    public void xuat5NhanVienLuongCao() {
        this.sapXepTheoThuNhap();
        for (int i = 0; i < 5; i++) {
            System.out.println("Ho ten : " + list.get(i).getHoten() + " Thu Nhap : " + list.get(i).getThuNhap());
        }
    }
}
