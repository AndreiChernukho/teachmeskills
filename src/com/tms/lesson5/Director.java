package com.tms.lesson5;

import java.util.Arrays;

public class Director extends Employee {

    private int employeePay = 1000;

    private Person[] people;

    public Person[] getPeople() {
        return people;
    }

    public Director(String name, String surname) {
        super(name, surname, EmployeeType.DIRECTOR);
    }

    public Director(String name, String surname, int experience) {
        super(name, surname, EmployeeType.DIRECTOR, experience);
    }

    public int getEmployeePay() {
        return employeePay;
    }

    public void setEmployeePay(int employeePay) {
        this.employeePay = employeePay;
    }

    public void addWorker(Person person) {
        people = people == null ? new Person[1] : Arrays.copyOf(people, people.length + 1);
        people[people.length - 1] = person;
    }

    @Override
    public int payroll() {
        int coefficientSalary = people != null ? employeePay * people.length : 0;
        return super.payroll() + coefficientSalary;
    }

    @Override
    public String toString() {
        return "Director {" +
                "Full name = " + getFullName() +
                ", salary = " + payroll() +
                ", experience = " + getExperienceYear() +
                ", position = " + getPosition().toString() +
                ", people = " + Arrays.toString(people) +
                '}';
    }

    public Person searchForName(String name) {
        for (Person person : people) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }

    public Person deepSearchForName(String name) {
        Person result = searchForName(name);
        if (result != null) {
            return result;
        }

        for (Person person : people) {
            if (person instanceof Director) {
                result = ((Director) person).deepSearchForName(name);
            }
        }
        return result;
    }
}
 