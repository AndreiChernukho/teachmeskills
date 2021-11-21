package com.tms.lesson4;

import static com.tms.lesson4.Task3Sex.MALE;

public class Task3User {

    private String name;
    private String surname;
    private int age;
    private Task3Sex sex;
    private Address address;

    public Task3User() {
    }

    public Task3User(String name, String surname, int age, Task3Sex sex, Address address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Task3Sex getSex() {
        return sex;
    }

    public void setSex(Task3Sex sex) {
        this.sex = sex;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    private int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return name + " " + surname;
    }

    public void addAge(int number) {
        setAge(getAge() + number);
    }

    public String info() {
        return "Имя: " + name + " Фамилия: " + surname + " Возраст: " + age + " Пол: " + sex;
    }

    public static class Address {

        private String country;
        private String city;

        public Address() {
        }

        public Address(String country, String city) {
            this.country = country;
            this.city = city;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }
    }

    public static void main(String[] args) {
        Task3User user = new Task3User("Василий", "Иванов", 19, MALE, new Address("Белорусь", "Минск"));
        System.out.println("Информация по пользователю: " + user.info());
        System.out.println("Полное имя пользователя: " + user.getFullName());
        System.out.println("Возраст пользователя: " + user.getAge());
        user.addAge(5);
        System.out.println("Возраст пользователя: " + user.getAge());
    }
}
