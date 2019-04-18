package com.java.excercise.TP1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HinhChuNhat {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Nhap chu vi cua hinh chu nhat : ");
        int chuVi = Integer.parseInt(reader.readLine());
        double chieuRong = chuVi / 5;
        double chieuDai = chieuRong * 1.5;
        double dienTich = chieuDai * chieuRong;
        System.out.println("Dien tich cua hinh chu nhat la : " + dienTich);
    }
}
