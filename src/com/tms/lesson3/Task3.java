package com.tms.lesson3;

public class Task3 {

    public static void main(String[] args) {
        int[] arr = {2, 6, 9, 3, 1, 4, 2, 4, 5};
        int oddAmount = 0;
        int evenAmount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                oddAmount += arr[i];
            } else {
                evenAmount += arr[i];
            }
        }
        System.out.printf(
                "Разница между суммой элементов стоящих на четных и нечетных местах %s", evenAmount - oddAmount);
    }
}
