package com.java.excercise.TP2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ViTriDuongTron {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Nhap ban kinh duong tron thu nhat : ");
        int r1 = Integer.parseInt(reader.readLine());
        System.out.println("Nhap ban kinh duong tron thu hai : ");
        int r2 = Integer.parseInt(reader.readLine());
        System.out.println("Nhap khoang cach d giua hai duong tron : ");
        int d = Integer.parseInt(reader.readLine());

        if ((Math.abs(r1 - r2) < d) && (d < r1 + r2)) {
            System.out.println("Hai duong tron cat nhau");
        } else if (Math.abs(r1 - r2) == d) {
            System.out.println("Hai duong tron tiep xuc voi nhau");
        } else {
            System.out.println("Hai duong tron khong giao nhau");
        }
    }
}
