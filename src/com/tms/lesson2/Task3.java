package com.tms.lesson2;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String firstScan = "";
        while (!firstScan.equals("exit")) {
            System.out.println("Введите слово");
            firstScan = console.nextLine();
        }
    }
}
