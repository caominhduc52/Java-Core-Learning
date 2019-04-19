package com.java.excercise.TP3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Excersice6 {
    public static int demSoLuong(int number) {
        int n = number;
        int res = 0;
        while (n != 0) {
            int tmp = n % 10;
            n /= 10;
            res++;
        }
        return res;
    }

    public static int daoNguoc(int number) {
        int res = 0;
        int n = number;
        while (n != 0) {
            int tmp = n % 10;
            n /= 10;
            res = res*10 + tmp;
        }
        return res;
    }

    public static int tinhTongChuSoLe(int number) {
        int res = 0;
        int n = number;
        while (n != 0) {
            int tmp = n % 10;
            n /= 10;
            if (tmp % 2 != 0) {
                res += tmp;
            }
        }
        return res;
    }

    public static boolean soToanLe(int number) {
        int n = number;
        while (n != 0) {
            int tmp = n % 10;
            n /= 10;
            if (tmp % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean soToanChan(int number) {
        int n = number;
        while (n != 0) {
            int tmp = n % 10;
            n /= 10;
            if (tmp % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    public static int chuSoMax(int number) {
        int n = number;
        int max = 0;
        while (n != 0) {
            int tmp = n % 10;
            n /= 10;
            if (tmp > max) {
                max = tmp;
            }
        }
        return max;
    }

    public static int chuSoMin(int number) {
        int n = number;
        int min = Integer.MIN_VALUE;
        while (n != 0) {
            int tmp = n % 10;
            n /= 10;
            if (tmp < min) {
                min = tmp;
            }
        }
        return min;
    }

    public static void main(String[] args) throws IOException {
        //tu viet
    }
}
