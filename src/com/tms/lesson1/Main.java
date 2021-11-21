package com.tms.lesson1;

public class Main {

    public static void main(String[] args) {
        int first = 20;
        int second = 6;
        int third = 130 + 128;

        double quotient = (double) first / second;
        System.out.println(quotient);

        byte fourth = (byte) third;
        System.out.println(fourth);

        float fifth = (float)third / 0;
        System.out.println(fifth);
    }
}
