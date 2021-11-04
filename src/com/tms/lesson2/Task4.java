package com.tms.lesson2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int start;
        int over;
        int summa = 0;
        Scanner console = new Scanner(System.in);
        System.out.println("Ввод первого числа");
        int firstScan = console.nextInt();
        System.out.println("Ввод второго числа ");
        int secondScan = console.nextInt();
        if (firstScan <= secondScan) {
            start = firstScan;
            over = secondScan;
        } else {
            start = secondScan;
            over = firstScan;
        }
        for (int i = ++start; i < over; i++) {
            if (i % 3 == 0) {
                summa += i;
            }
        }
        System.out.println("Сумма равна " + summa);
    }
}
