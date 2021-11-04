package com.tms.lesson1;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int firstScan = console.nextInt();

        if (firstScan >= 0 && firstScan < 10000) {
            System.out.println("Тысяч " + firstScan / 1000 + " сотен " + firstScan / 100 % 10 + " десяток "
                    + firstScan / 10 % 10 + " единиц " + firstScan % 10);
        } else {
            System.out.println("Число не соответствует диапазону");
        }
    }
}