package com.java.excercise.TP2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ViTriDuongThang {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Nhap a : ");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Nhap b : ");
        int b = Integer.parseInt(reader.readLine());
        System.out.println("Duong thang thu nhat la : y = " + a +"x + " + b);

        System.out.println("Nhap c : ");
        int c = Integer.parseInt(reader.readLine());
        System.out.println("Nhap d : ");
        int d = Integer.parseInt(reader.readLine());
        System.out.println("Duong thang thu hai la : y = " + c +"x + " + d);

        if (a == c && b != d) {
            System.out.println("Hai duong thang song song voi nhau");
        } else if (b == d) {
            System.out.println("Hai duong thang trung nhau");
        } else if (a != c) {
            System.out.println("Hai duong thang cat nhau");
        }
    }
}
