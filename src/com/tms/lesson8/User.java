package com.tms.lesson8;


import java.util.Objects;

public class User implements Comparable<User> {

    private String name;
    private String sex;
    private Integer age;

    public User(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && name.equals(user.name) && sex.equals(user.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex, age);
    }

    @Override
    public int compareTo(User user) {
        if (user == null || user.getAge() == null || user.getName() == null) {
            throw new IllegalArgumentException("The argument cannot be null");
        }
        int result = Integer.compare(age, user.age);
        if (result == 0) {
            return Character.compare(name.charAt(0), user.name.charAt(0));
        } else return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
