package com.java.excercise.TP2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DocSo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Nhap vao so nguyen : ");
        int  a = Integer.parseInt(reader.readLine());

        while (a >= 100 || a < 0) {
            System.out.println("Nhap sai, moi ban nhap lai : ");
            a = Integer.parseInt(reader.readLine());
        }

        int donVi = a % 10;
        a /= 10;
        int chuc = a % 10;
        a /= 10;


        System.out.println("Don vi : " + donVi);
        System.out.println("Chuc : " + chuc);

        System.out.println("Cach doc so : ");
        switch (chuc) {
            case 1:
                System.out.print("muoi");
                break;
            case 2:
                System.out.print("hai muoi");
                break;
            case 3:
                System.out.print("ba muoi");
                break;
            case 4:
                System.out.print("bon muoi");
                break;
            case 5:
                System.out.print("nam muoi");
                break;
            case 6:
                System.out.print("sau muoi");
                break;
            case 7:
                System.out.print("bay muoi");
                break;
            case 8:
                System.out.print("tam muoi");
                break;
            case 9:
                System.out.print("chin muoi");
                break;
        }
        switch (donVi) {
            case 0:
                System.out.print(" khong");
                break;
            case 1:
                System.out.print(" mot");
                break;
            case 2:
                System.out.print(" hai");
                break;
            case 3:
                System.out.print(" ba");
                break;
            case 4:
                System.out.print(" bon");
                break;
            case 5:
                System.out.print(" nam");
                break;
            case 6:
                System.out.print(" sau");
                break;
            case 7:
                System.out.print(" bay");
                break;
            case 8:
                System.out.print(" tam");
                break;
            case 9:
                System.out.print(" chin");
                break;
        }
    }
}
