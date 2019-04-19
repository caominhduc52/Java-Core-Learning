package com.java.excercise.TP3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Excersice2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Nhap N : ");
        int n = Integer.parseInt(reader.readLine());
        int res1 = 0;
        int res2 = 1;
        int res3 = 0;

        for (int i = 1; i <= n; i++){
            res1 += Math.pow(i,2);
        }

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                res2 = res2 * j;
            }
            res3 += res2;
            res2 = 1;
        }


        System.out.println("1^2 + 2^2 + .... + n^2 = " + res1);
        System.out.println("1 + 1.2 + 1.2.3 + .... 1.2.3...n = " + (res3));
    }
}
