package com.java.excercise.TP1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Expression {
    public  static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Nhap vao so nguyen duong n : ");
        int n = Integer.parseInt(reader.readLine());
        System.out.println("Nhap vao so thuc x : ");
        double x = Float.parseFloat(reader.readLine());
        double res;
        res = Math.pow(x*x + 1,n);
        System.out.println("Ket qua can tinh la : " + res);
    }
}
