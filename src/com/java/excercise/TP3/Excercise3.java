package com.java.excercise.TP3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Excercise3 {
    public static int checkNguyenTo(int n) {
        if (n < 2) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            for (int i = 2; i <= n/2 ; i++) {
                if (n % i == 0){
                    return 0;
                }
            }
            return 1;
        }
    }

    public static int checkChinhPhuong(int n) {
        if (Math.pow(Math.sqrt(n),2) == n) {
            return 1;
        }
        return 0;
    }

    public static int checkHoanThien(int n) {
        int tmp = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                tmp += i;
            }
        }
        if (tmp == n) {
            return 1;
        }
        return 0;
    }

    public static int checkSoDoiXung(int number) {
        int res = 0;
        int n = number;
        while (n != 0) {
            int tmp = n % 10;
            n = n / 10;
            res = res * 10 + tmp;
        }
        if (res == number) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 100; i++) {
            if (checkNguyenTo(i) == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Check chinh phuong : " + checkChinhPhuong(17));
        System.out.println("Check hoan hao : " + checkHoanThien(29));
        System.out.println("Check doi xung : " + checkSoDoiXung(121));
    }
}
