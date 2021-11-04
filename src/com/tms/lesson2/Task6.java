package com.tms.lesson2;

public class Task6 {
    public static void main(String[] args) {

        int[] arr = {2, 6, 9, 3, 1};
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

        for (int j : arr) {
            System.out.println(j);
        }
    }
}
