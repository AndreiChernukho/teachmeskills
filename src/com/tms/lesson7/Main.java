package com.tms.lesson7;

import java.util.Scanner;

public class Main {

    private static final String GET = "get";
    private static final Cash CASH = new Cash();

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Зарезервированное слово '" + GET
                + "' удаляет самое старое значение из кэша и не может быть добавленно в кэш");

        while (true) {
            System.out.println("Ведите значение");
            String value = console.nextLine();
            try {
                if (GET.equals(value)) {
                    System.out.println("Самый старый элемент " + CASH.removeFirst());
                } else {
                    CASH.add(value);
                    System.out.println("Добавлен элемент " + value);
                }
            } catch (CashElementNotFoundException | CacheOverflowException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
