package com.tms.lesson5;

public class Worker extends Employee {

    public Worker(String name, String surname) {
        super(name, surname, EmployeeType.WORKER);
    }

    public Worker(String name, String surname, int experience) {
        super(name, surname, EmployeeType.WORKER, experience);
    }

    @Override
    public void addWorker(Person person) {
        throw new UnsupportedOperationException("Добавление подчиненного не поддерживается");
    }

    @Override
    public String toString() {
        return "Worker {" +
                "Full name = " + getFullName() +
                ", salary = " + payroll() +
                ", experience = " + getExperienceYear() +
                '}';
    }
}
