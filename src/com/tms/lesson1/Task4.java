package com.tms.lesson1;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Ввод первого числа для сравнения");
        int firstScan = console.nextInt();
        System.out.println("Ввод второго числа для сравнения");
        int secondScan = console.nextInt();
        if (firstScan > secondScan) {
            System.out.println("Число " + firstScan + " больше числа " + secondScan);
        } else if (firstScan < secondScan) {
            System.out.println("Число " + firstScan + " меньше числа " + secondScan);
        } else {
            System.out.println("Число " + firstScan + " ровно числу " + secondScan);
        }
    }
}