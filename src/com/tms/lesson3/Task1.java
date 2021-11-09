package com.tms.lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Ввод колличества элементов масива");
        int n = console.nextInt();
        if (n < 3) {
            System.out.println("Колличества элементов масива должно быть больше 2");
        } else {
            int[] array = new int[n];
            array[0] = array[1] = 1;
            for (int i = 2; i < array.length; i++) {
                array[i] = array[i - 1] + array[i - 2];
            }
            System.out.println(Arrays.toString(array));
        }
    }
}
