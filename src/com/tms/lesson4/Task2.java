package com.tms.lesson4;

import java.util.Arrays;

public class Task2 {

    public static int[] sort(int[] arr) {
        int min;
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = arr.length - 1; i > j; i--) {
                if (arr[i] < arr[i - 1]) {
                    min = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = min;
                }
            }
        }
        return arr;
    }

    public static int maxValue(int[] arr) {
        int[] sortArray = sort(Arrays.copyOf(arr, arr.length));
        return sortArray[sortArray.length - 1];
    }

    public static int maxElementNumber(int[] arr) {
        int max = arr[0];
        int elementNumber = 0;

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                elementNumber = i;
            }
        }
        return elementNumber;
    }

    public static int searchElementNumber(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (value == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 4};
        System.out.println("Поиск максимального элемента " + Task2.maxValue(arr));
        System.out.println("Поиск номера максимального элемента " + Task2.maxElementNumber(arr));
        System.out.println("Поиск номера элемента в массиве по его значению " + Task2.searchElementNumber(arr, 4));
        System.out.println("Сортировка ");
        Arrays.stream(Task2.sort(arr)).forEach(System.out::println);
    }
}
