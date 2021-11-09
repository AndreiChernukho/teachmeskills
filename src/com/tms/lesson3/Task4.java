package com.tms.lesson3;

public class Task4 {

    public static void main(String[] args) {
        int[] arr = {2, 5, 9, 3, 1, 3, 3, 5, 1, 5, 9, 9, 9, 9};
        int min;
        int count = 1;
        int maxCount = 1;
        int number = arr[0];

        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = arr.length - 1; i > j; i--) {
                if (arr[i] < arr[i - 1]) {
                    min = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = min;
                }
            }
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                if (count >= maxCount) {
                    maxCount = count;
                    number = arr[i];
                }
                count = 1;
            }
        }

        if (count >= maxCount) {
            number = arr[arr.length - 1];
            maxCount = count;
        }

        System.out.printf("Число %s встречается %s раз", number, maxCount);
    }
}
