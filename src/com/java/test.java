package com.java;

import java.math.BigInteger;
import java.util.Scanner;

public class test {
    public static boolean isAnagram(String a, String b) {
        int tam = 0;
        int tam1 = 0;
        char soSanh;
        a = a.toLowerCase();
        b = b.toLowerCase();
        for (int i = 0; i < a.length(); i++) {
            soSanh = a.charAt(i);
            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(j) == soSanh) {
                    tam++;
                }
            }

            for (int k = 0; k < b.length(); k++) {
                if (b.charAt(k) == soSanh) {
                    tam1++;
                }
            }
            if (tam != tam1) {
                return false;
            }

            tam = 0;
            tam1 = 0;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        System.out.println(isAnagram(A, B));
    }
}
