package com.java.excercise.ObjectPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Triangle {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private int base;
    private int height;

    public Triangle() {}

    public Triangle(int base) {
        this.base = base;
    }

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getArea() {
        return 0.5 * this.base * this.height;
    }

    public void show() {
        System.out.println("Triangle base is " + this.base + "cm");
        System.out.println("Triangle height is " + this.height + "cm");
        System.out.println("Triangle area is " + this.getArea() + "square unit");
    }

    public void compare(Triangle triangle) throws IOException {
        if (this.base == 0 || this.height == 0) {
            System.out.println("Triangle is not init");
        } else {
            int base2;
            int height2;
            System.out.println("Enter base for triangle 2");
            base2 = Integer.parseInt(reader.readLine());
            System.out.println("Enter height for triangle 2");
            height2 = Integer.parseInt(reader.readLine());
            while (base2 <= 0 || height2 <= 0) {
                System.out.println("Wrong input, positive number only");
                System.out.println("Reenter base for triangle 2");
                base2 = Integer.parseInt(reader.readLine());
                System.out.println("Reenter height for triangle 2");
                height2 = Integer.parseInt(reader.readLine());
            }
            triangle.setHeight(height2);
            triangle.setBase(base2);
            int compare = Double.compare(this.getArea(), triangle.getArea());
            if (compare > 0) {
                System.out.println("Triangle1 is bigger than triangle 2");
            } else if (compare == 0) {
                System.out.println("two triangle are same");
            } else {
                System.out.println("Triangle 2 is bigger than triangle 1");
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Triangle triangle1 = new Triangle();
        Triangle triangle2 = new Triangle();
        int choice;

        do {
            System.out.println("------------------TRIANGLE----------------");
            System.out.println("-             1. Init                    -");
            System.out.println("-             2. Get area                -");
            System.out.println("-             3. Show details            -");
            System.out.println("-             4. Compare                 -");
            System.out.println("-             5. Exit                    -");
            System.out.println("------------------------------------------");
            System.out.println("Enter your choice");
            choice = Integer.parseInt(reader.readLine());
            switch (choice) {
                case 1:
                    int height;
                    int base;
                    System.out.println("Enter height : ");
                    height = Integer.parseInt(reader.readLine());
                    System.out.println("Enter base : ");
                    base = Integer.parseInt(reader.readLine());
                    triangle1.setBase(base);
                    triangle1.setHeight(height);
                    break;
                case 2:
                    System.out.println("Your triangle area is : " + triangle1.getArea());
                    break;
                case 3:
                    triangle1.show();
                    break;
                case 4:
                    triangle1.compare(triangle2);

            }
        } while (choice != 5);
    }
}
