package com.java.excercise.TP2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TimMax {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Nhap vao so nguyen thu nhat : ");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Nhap vao so nguyen thu hai : ");
        int b = Integer.parseInt(reader.readLine());
        System.out.println("Nhap vao so nguyen thu ba : ");
        int c = Integer.parseInt(reader.readLine());

        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        System.out.println("So lon nhat la : " + max);
    }
}
