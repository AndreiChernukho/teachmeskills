package com.tms.lesson1;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int firstScan = console.nextInt();
        int secondScan = console.nextInt();
        int quotient = firstScan % secondScan;
        if (quotient != 0) {
            System.out.println("Целое число " + firstScan / secondScan + " остаток " + quotient);
        } else {
            System.out.println("Делит без остатка");
        }
    }
}