package com.tms.lesson5;

public abstract class Employee extends Person implements SearchForNameInterface {

    public static final int BAS_TAX = 1000;

    private EmployeeType position;
    private int experienceYear;

    public Employee(String name, String surname, EmployeeType position) {
        super(name, surname);
        this.position = position;
    }

    public Employee(String name, String surname, EmployeeType position, int experienceYear) {
        this(name, surname, position);
        this.experienceYear = experienceYear;
    }

    public EmployeeType getPosition() {
        return position;
    }

    public void setPosition(EmployeeType position) {
        this.position = position;
    }

    public int getExperienceYear() {
        return experienceYear;
    }

    public void setExperienceYear(int experienceYear) {
        this.experienceYear = experienceYear;
    }

    public int payroll() {
        return experienceYear * BAS_TAX * position.getSalaryCoefficient();
    }

    public abstract void addWorker(Person person);

    @Override
    public String searchForName(Director director, String name) {
        Person person = director.searchForName(name);
        return person == null
                ? String.format("Сотрудника с именем '%s' нет в подчинении", name)
                : String.format("Сотрудник с именем '%s' есть в подчинении", name);
    }

    @Override
    public String deepSearchForName(Director director, String name) {
        Person person = director.deepSearchForName(name);
        return person == null
                ? String.format("Сотрудника с именем '%s' нет в подчинении", name)
                : String.format("Сотрудник с именем '%s' есть в подчинении", name);
    }
}
