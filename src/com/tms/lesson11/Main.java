package com.tms.lesson11;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Runnable addToCollection = new Increasing(list);
        Runnable removeToCollection = new Decrease(list);

        Thread threadAddToCollection = new Thread(addToCollection);
        Thread threadRemoveToCollection = new Thread(removeToCollection);

        threadAddToCollection.start();
        threadRemoveToCollection.start();
    }
}
