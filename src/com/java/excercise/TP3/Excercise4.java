package com.java.excercise.TP3;

public class Excercise4 {
    public static void main(String[] args) {
        int tmp = 65;
        for (int i = 1; i <= 26; i++){
            for (int j = 1; j <= i; j++){
                System.out.printf("%c", tmp);
            }
            System.out.println();
            tmp++;
        }
    }
}
