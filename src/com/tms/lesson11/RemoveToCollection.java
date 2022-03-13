package com.tms.lesson11;

import java.util.List;

public class RemoveToCollection implements Runnable {
    List<Integer> list;

    public RemoveToCollection(List<Integer> list) {
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
        while (true) {
            try {
                removeElements();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    void removeElements() throws InterruptedException {
        if (list.size() > 0) {
            int number = list.remove(0);
            System.out.println("Remove " + number);
            Thread.sleep(1000);
        } else {
            System.out.println("Stop remove.");
            Thread.sleep(2000);
        }
    }
}
