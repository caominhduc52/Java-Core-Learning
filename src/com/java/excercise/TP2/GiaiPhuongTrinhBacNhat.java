package com.java.excercise.TP2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Nhap a");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Nhap b");
        int b = Integer.parseInt(reader.readLine());
        double res;

        if (a != 0) {
            res = -b * 1.0 / a;
            System.out.println("Phuong trinh co nghiem duy nhat : " + res);
        } else if (a == 0) {
            if (b != 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else if (b == 0) {
                System.out.println("Phuong trinh co vo so nghiem");
            }
        }
    }
}
