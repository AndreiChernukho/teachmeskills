package com.tms.lesson4;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        boolean isContinue;
        do {
            System.out.println("Ввод месяца для определения поры года");

            String firstScan = console.nextLine();
            Task1Month month = Task1Month.month(firstScan);
            if (month == null) {
                System.out.println("Допущена ошибка");
                isContinue = true;
            } else {
                switch (month) {
                    case DECEMBER:
                    case JANUARY:
                    case FEBRUARY:
                        System.out.println("Зима");
                        isContinue = false;
                        break;
                    case MARCH:
                    case APRIL:
                    case MAY:
                        System.out.println("Весна");
                        isContinue = false;
                        break;
                    case JUNE:
                    case JULE:
                    case AUGUST:
                        System.out.println("Лето");
                        isContinue = false;
                        break;
                    case SEPTEMBER:
                    case OCTOBER:
                    case NOVEMBER:
                        System.out.println("Осень");
                        isContinue = false;
                        break;
                    default:
                        System.out.println("Допущена ошибка");
                        isContinue = true;
                }
            }
        }
        while (isContinue);
    }
}
