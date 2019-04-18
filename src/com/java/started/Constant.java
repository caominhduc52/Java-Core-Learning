package com.java.started;

/*
    In java using final keyword to declare a constant
    ex : final pi = 3.14
    Class constant : a variable available to multi methods in class
    ex : public static final pi = 3.14
 */

public class Constant {
    //class constant
    public static final double CM_PER_INCH = 3.14;

    public static void main(String[] args) {
        //usual constant
        final int temp = 5;
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Paper size in centimeters : " + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
    }
}
