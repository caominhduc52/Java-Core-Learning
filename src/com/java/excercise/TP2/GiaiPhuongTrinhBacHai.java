package com.java.excercise.TP2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GiaiPhuongTrinhBacHai {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Nhap a : ");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Nhap b : ");
        int b = Integer.parseInt(reader.readLine());
        System.out.println("Nhap c : ");
        int c = Integer.parseInt(reader.readLine());

        double nghiemKep;
        double nghiem1;
        double nghiem2;
        double res;

        if (a != 0) {
            int delta = b*b - 4*a*c;
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else if (delta == 0) {
                nghiemKep = -b / (2 * a);
                System.out.println("Phuong trinh co nghiem kep : " + nghiemKep);
            } else if (delta > 0) {
                nghiem1 = -b + Math.sqrt(delta) / 2 * a * 1.0;
                nghiem2 = -b - Math.sqrt(delta) / 2 * a * 1.0;
                System.out.println("Phuong trinh co hai nghiem phan biet X1 = " + nghiem1 +" X2 = " + nghiem2);
            }
        } else if (a == 0) {
            if (b != 0) {
                res = -c / b;
                System.out.println("Phuong trinh co nghiem duy nhat : " + res);
            } else if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh co vo so nghiem !");
                } else if (c != 0) {
                    System.out.println("Phuong trinh vo nghiem");
                }
            }
        }
    }
}
