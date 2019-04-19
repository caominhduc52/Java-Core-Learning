package com.java.excercise.TP3;

//solution for TP03 - Introduction to programming CQ2018/1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Excersice1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Nhap vao so nguyen n : ");
        int n = Integer.parseInt(reader.readLine());

        int uocSo = 0;
        int maxUocSoLe = 0;
        int res = 0;
        int count = 0;

        for (int i = 1; i <= n; i++){
            if (n % i == 0) {
                uocSo++;
                if (i % 2 == 0) {
                    res += i;
                    count++;
                } else {
                    if (i > maxUocSoLe) {
                        maxUocSoLe = i;
                    }
                }
            }
        }

        System.out.println("So luong uoc so cua " + n + " la : " +uocSo);
        System.out.println("Trung binh cong cac uoc so chan cua " + n + " la : " + (res *1.0 / count));
        System.out.println("Uoc so le lon nhat la : " + maxUocSoLe);
    }
}
