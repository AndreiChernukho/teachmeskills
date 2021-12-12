package com.tms.lesson5;

public enum EmployeeType {

    DIRECTOR(10),
    WORKER(1);

    private final int salaryCoefficient;

    public int getSalaryCoefficient() {
        return salaryCoefficient;
    }

    EmployeeType(int salaryCoefficient) {
        this.salaryCoefficient = salaryCoefficient;
    }
}
