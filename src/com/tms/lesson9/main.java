package com.tms.lesson9;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class main {

    public static void main(String[] args) {

        int[] array = {2, 1, 5, 7, 4, 9, 2, 6};

        System.out.println("найти максимальное (или минимальное)");
        System.out.println(Arrays
                .stream(array)
                .max()
                .getAsInt());

        System.out.println("вывести сумму всех четных чисел.");
        System.out.println(Arrays
                .stream(array)
                .filter(x -> x % 2 == 0)
                .sum());

        System.out.println("распечатать все элементы начиная с 5");
        Arrays
                .stream(array)
                .skip(5)
                .forEach(System.out::println);

        Family family1 = new Family("family1", Arrays.asList(
                new Child("child1", 10, Gender.MALE),
                new Child("child2", 15, Gender.MALE),
                new Child("child3", 20, Gender.FEMALE)
        ));

        Family family2 = new Family("family2", Arrays.asList(
                new Child("child4", 5, Gender.MALE),
                new Child("child5", 15, Gender.FEMALE),
                new Child("child3", 20, Gender.MALE)
        ));

        Family family3 = new Family("family3", Arrays.asList(
                new Child("child7", 2, Gender.MALE),
                new Child("child8", 10, Gender.FEMALE),
                new Child("child9", 15, Gender.MALE),
                new Child("child10", 20, Gender.MALE),
                new Child("child11", 20, Gender.FEMALE)
        ));

        List<Family> families = Arrays.asList(family1, family2, family3);

        System.out.println("распечатать всех детей в имени которых есть 2");

        families.stream()
                .flatMap(family -> family.getChildren().stream())
                .filter(child -> child.getName().contains("2"))
                .forEach(System.out::println);

        System.out.println("найти всех родителей у которых детей больше 3");

        families.stream()
                .filter(family -> family.getChildren().size() > 3)
                .forEach(System.out::println);

        System.out.println("вывести всех мальчиков (девочек)");

        families.stream()
                .flatMap(family -> family.getChildren().stream())
                .filter(child -> child.getGender() == Gender.MALE)
                .forEach(System.out::println);

        System.out.println("вывести все имена детей большими буквами (toUpperCase)");

        families.stream()
                .flatMap(family -> family.getChildren().stream())
                .forEach(child -> System.out.println(child.getName().toUpperCase()));

        System.out.println("найти сколько всего детей у всех родителей");

        System.out.println(families.stream()
                .flatMap(family -> family.getChildren().stream())
                .count());

        System.out.println("создать map, где ключ - имя родителя, а значение - количество детей");

        Map<String, Integer> map = families.stream()

                .collect(Collectors.toMap(Family::getName, family -> family.getChildren().size()));

        map.forEach((key, value) -> System.out.println("У семьи "+ key + " детей " + value));

    }
}
