package com.tms.lesson2;

import java.util.Scanner;

public class Task1Switch {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        boolean isContinue;
        do {
            System.out.println("Ввод буквы для определения");
            String firstScan = console.nextLine();
            switch (firstScan) {
                case ("a"):
                case ("i"):
                    System.out.println("Это гласная");
                    isContinue = false;
                    break;
                case ("b"):
                case ("c"):
                    System.out.println("Это согласная");
                    isContinue = false;
                    break;
                default:
                    System.out.println("Введен некоректный символ");
                    isContinue = true;
            }
        }
        while (isContinue);
    }
}
