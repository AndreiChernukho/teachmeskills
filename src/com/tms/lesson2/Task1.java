package com.tms.lesson2;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Ввод буквы для определения");
        String firstScan = console.nextLine();
        if (firstScan.equals("a") || firstScan.equals("i")) {
            System.out.println("Это гласная");
        } else if (firstScan.equals("b") || firstScan.equals("c")) {
            System.out.println("Это согласная");
        } else {
            System.out.println("Введите другой символ");
        }
    }
}
