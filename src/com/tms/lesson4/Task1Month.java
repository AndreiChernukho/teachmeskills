package com.tms.lesson4;

public enum Task1Month {

    DECEMBER("Декабрь"),
    JANUARY("Январь"),
    FEBRUARY("Февраль"),

    MARCH("Март"),
    APRIL("Апрель"),
    MAY("Май"),

    JUNE("Июнь"),
    JULE("Июль"),
    AUGUST("Август"),

    SEPTEMBER("Сентябрь"),
    OCTOBER("Октябрь"),
    NOVEMBER("Ноябрь");

    private final String name;

    Task1Month(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Task1Month month(String monthName) {
        for (Task1Month month : Task1Month.values()) {
            if (month.getName().equals(monthName)) {
                return month;
            }
        }
        return null;
    }
}
