package com.java.excercise.TP2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinMax {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Nhap so thu nhat : ");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Nhap so thu hai : ");
        int b = Integer.parseInt(reader.readLine());
        System.out.println("Nhap so thu ba : ");
        int c = Integer.parseInt(reader.readLine());
        System.out.println("Nhap so thu tu : ");
        int d = Integer.parseInt(reader.readLine());

        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (d > max) {
            max = d;
        }

        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        if (d < min) {
            min = d;
        }

        System.out.println("Max : " + max);
        System.out.println("Min : " + min);
    }
}
