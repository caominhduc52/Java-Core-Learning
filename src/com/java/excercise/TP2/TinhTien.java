package com.java.excercise.TP2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TinhTien {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Nhap vao loai phong");
        String type = reader.readLine();
        System.out.println("Nhap vao so ngay thue phong");
        int day = Integer.parseInt(reader.readLine());
        int total;

        if (day < 10) {
            switch (type) {
                case "A":
                    total = 450000 * day;
                    System.out.println("Tien thue phong la : " + total);
                    break;
                case "B":
                    total = 350000 * day;
                    System.out.println("Tien thue phong la : " + total);
                    break;
                case "C":
                    total = 250000 * day;
                    System.out.println("Tien thue phong la : " + total);
                    break;
            }
        } else {
            switch (type) {
                case "A":
                    total = 450000 * day;
                    System.out.println("Tien thue phong la : " + (total - total*0.1));
                    break;
                case "B":
                    total = 350000 * day;
                    System.out.println("Tien thue phong la : " + (total - total * 0.8));
                    break;
                case "C":
                    total = 250000 * day;
                    System.out.println("Tien thue phong la : " + (total - total * 0.8));
                    break;

            }
        }
    }
}
