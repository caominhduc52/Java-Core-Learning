package com.java.excercise.TP2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NamNhuan {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Nhap vao so nam : ");
        int year = Integer.parseInt(reader.readLine());

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println(year + " La nam nhuan");
        } else  {
            System.out.println(year + " La nam khong nhuan");
        }
    }
}
