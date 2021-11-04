package com.tms.lesson2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Ввод месяца для определения поры года");
        String firstScan = console.nextLine();
        switch (firstScan) {
            case ("Декабрь"):
            case ("Январь"):
            case ("Февраль"):
                System.out.println("Зима");
                break;
            case ("Март"):
            case ("Апрель"):
            case ("Май"):
                System.out.println("Весна");
                break;
            case ("Июнь"):
            case ("Июль"):
            case ("Август"):
                System.out.println("Лето");
                break;
            case ("Сентябрь"):
            case ("Октябрь"):
            case ("Ноябрь"):
                System.out.println("Осень");
                break;
            default:
                System.out.println("Допущена ошибка");
        }
    }
}
