package com.tms.lesson5;

public class Main {

    public static void main(String[] args) {
        Director director = new Director("Василий", "Петров", 10);
        Worker worker = new Worker("Генадий", "Иванов", 3);
        Worker worker2 = new Worker("Федотий", "Сиванов", 2);
        Worker worker3 = new Worker("Германий", "Сованов", 1);


        System.out.println(director.getFullName() + " " + director.payroll());
        System.out.println(worker.getFullName() + " " + worker.payroll());
        System.out.println(worker2.getFullName() + " " + worker.payroll());
        System.out.println(worker3.getFullName() + " " + worker.payroll());

        director.addWorker(worker);
        director.addWorker(worker2);
        System.out.println(director.getFullName() + " " + director.payroll());

        Director director10 = new Director("Андрей", "Пехота", 5);
        Director director20 = new Director("Вася", "Чук", 2);
        Director director30 = new Director("Рита", "Пехота", 3);
        Worker worker10 = new Worker("Владислав", "Корабан", 4);

        director10.addWorker(worker10);
        director30.addWorker(director20);
        director20.addWorker(worker10);
        director10.addWorker(director30);

        director.addWorker(director10);

        System.out.println(director.toString());

        System.out.println(director.searchForName(director, "Федотий"));
        System.out.println(director.searchForName(director, "Владислав"));
        System.out.println(director.deepSearchForName(director, "Владислав"));
    }
}
