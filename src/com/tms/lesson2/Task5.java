package com.tms.lesson2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        int[] arr = {2, 2, 9, 3, 6, -1, 153};
        int min = arr[0];
        int max = arr[0];
        for (int i : arr) {
            if (min > i) {
                min = i;
            }
            if (max < i) {
                max = i;
            }
        }
        System.out.println("Наименьшее " + min + " Наибольшее " + max);
    }
}
