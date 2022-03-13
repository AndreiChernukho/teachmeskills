package com.tms.lesson11;

import java.util.List;

public class AddToCollection implements Runnable {
    List<Integer> list;

    public AddToCollection(List<Integer> list) {
        this.list = list;
    }

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true){
            try {
                addElements();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    void addElements() throws InterruptedException {
        if (list.size() < 10) {
            int number = (int) (Math.random() * 10);
            list.add(number);
            System.out.println("Add " + number);
            Thread.sleep(1000);
        } else {
            System.out.println("Stop add.");
            Thread.sleep(2000);
        }
    }
}
