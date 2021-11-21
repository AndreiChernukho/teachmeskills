package com.tms.lesson4;

public class Task456 {

    int a;
    int b;
    String str;

    public Task456(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Task456(int a, int b, String str) {
        this(a, b);
        this.str = str;
    }

    @Deprecated
    public String getStr() {
        return str;
    }

    public String convert(int a) {
        return String.valueOf(a);
    }

    public String convert(int a, int b) {
        return String.valueOf(a * b);
    }

    public static void main(String[] args) {
        Task456 task4 = new Task456(1, 5);
        task4.getStr();
        task4.convert(1);
    }
}
