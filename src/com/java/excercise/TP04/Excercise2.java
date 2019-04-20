package com.java.excercise.TP04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Excercise2 {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void nhapMang(int a[], int n) throws IOException {
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(reader.readLine());
        }
    }

    public static void xuatMang(int a[], int n) {
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }

    public static void sapXepTang(int a[], int n) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
    }

    public static void sapXepGiam(int a[], int n) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
    }

    public static void sapXepSoChanTangDan(int a[], int n) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[j] % 2 == 0) {
                        if (a[i] > a[j]) {
                            int temp = a[i];
                            a[i] = a[j];
                            a[j] = temp;
                        }
                    }
                }
            }
        }
    }


    public static void main(String[] args) throws IOException {
        int a[] = new int[7];
        nhapMang(a,7);
        sapXepSoChanTangDan(a, 7);
        xuatMang(a, 7);
    }
}

