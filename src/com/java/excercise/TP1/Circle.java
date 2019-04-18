package com.java.excercise.TP1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Circle {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Nhap ban kinh cua hinh tron : ");
        int r = Integer.parseInt(reader.readLine());
        double chuVi;
        double dienTich;
        chuVi = 2 * 3.14 * r;
        dienTich = 3.14 * r * r;
        System.out.println("Chu vi cua hinh tron la : " + chuVi);
        System.out.println("Dien tich cua hinh tron la : " + dienTich);
    }
}
