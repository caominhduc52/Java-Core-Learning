package com.java.excercise.Asignment2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ui {
    public static void main(String[] args) {
        BeeHive bh = null;
        boolean keepRunning = true;
        Scanner sc = new Scanner(System.in);
        int choice;
        while (keepRunning) {
            System.out.println("---------------------Bee hive---------------");
            System.out.println("\t1 - Create bee list");
            System.out.println("\t2 - Attack Bees");
            System.out.println("\t3 - Exit");
            System.out.println("Enter your choice (1, 2 or 3) : ");
            choice = sc.nextInt();
            ArrayList<Bee> bees;
            switch (choice) {
                case 1:
                    bh = new BeeHive();
                    bh.init();
                    bees = bh.getAllBees();
                    System.out.println("Bees details at the beginning");
                    showBees(bees);
                    break;
                case 2:
                    if (bh == null) {
                        System.out.println("No bee!");
                    } else {
                        bh.attackBees();
                        bees = bh.getAllBees();
                        System.out.println("Bees details at the moment");
                        showBees(bees);
                    }
                    break;
                default:
                    keepRunning = false;
            }
        }
    }

    public static void showBees(ArrayList<Bee> bees) {
       for (int i = 0; i < bees.size(); i++) {
           Bee tmp = bees.get(i);
           if (tmp.getType() == "Drone") {
               if (tmp.getHealth() < 50) {
                   tmp.setAlive(false);
               }
           } else if (tmp.getType() == "Worker") {
               if (tmp.getHealth() < 70) {
                   tmp.setAlive(false);
               }
           } else if (tmp.getType() == "Queen") {
               if (tmp.getHealth() < 20) {
                   tmp.setAlive(false);
               }
           }
           String isAlive = tmp.isAlive() == true ? "Alive" : "Dead";
           System.out.println(i + 1 + ") " + "\t" + tmp.getType() + "\t" + tmp.getHealth() + "\t\t\t" + isAlive);
       }
    }
}
