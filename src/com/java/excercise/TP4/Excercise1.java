package com.java.excercise.TP4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Excercise1 {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void nhapMang(int a[], int n) throws IOException {
        for (int i = 0; i < a.length; i++){
            a[i] = Integer.parseInt(reader.readLine());
        }
    }

    public static void xuatMang(int a[], int n) {
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }

    public static int findMax(int a[], int n) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static int findMin(int a[], int n) {
        int min = a[0];
        for (int i = 0; i < a.length; i++){
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    public static void sapXep(int a[], int n) {
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

    public static int[] find2ndMaxMin(int a[], int n) {
        int[] res = new int[2];
        sapXep(a,n);
        res[0] = a[a.length - 1]; //max
        res[1] = a[1]; //min
        return res;
    }

    public static int findMaxPos(int a[], int n) {
        int max = a[0];
        int maxPos = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                maxPos = i;
            }
        }
        return maxPos;
    }

    public static int findMinPos(int a[], int n) {
        int min = a[0];
        int minPos = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] < min) {
                min = a[i];
                minPos = i;
            }
        }
        return minPos;
    }

    public static void main(String[] args) throws IOException {
        int[] a = new int[5];
        nhapMang(a,5);
        sapXep(a,5);
        xuatMang(a,5);

        //test driver tu viet
    }
}
