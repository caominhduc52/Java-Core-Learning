package com.java.excercise.TP3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Excercise5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Nhap chieu cao cua tam giac : ");
        int n = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++){
                if (i == 1 || i == 2 || i == n) {
                    System.out.print("*");
                } else if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
