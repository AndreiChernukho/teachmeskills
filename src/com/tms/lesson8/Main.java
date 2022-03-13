package com.tms.lesson8;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        User user = new User("Вася", "male", 18);
        User user2 = new User("Петя", "male", 20);
        User user3 = new User("Максим", "male", 19);
        User user4 = new User("Василиса", "female", 18);

        List<User> list = new ArrayList<>();
        Set<User> set = new HashSet<User>();

        list.add(user);
        list.add(user2);
        list.add(user3);
        list.add(user4);

        set.add(user);
        set.add(user2);
        set.add(user3);
        set.add(user4);

        UserServiceIml iml = new UserServiceIml();

        System.out.println("осуществляем поиск пользователя по имени (учитывает дубликаты)");
        System.out.println(Arrays.toString(iml.searchByName(list, "Вася").toArray()));
        System.out.println(Arrays.toString(iml.searchByName(list, "Петро").toArray()));
        System.out.println(Arrays.toString(iml.searchByName(set, "Василиса").toArray()));

        System.out.println("возвращает коллекцию пользователей на основе пола.");
        System.out.println(Arrays.toString(iml.searchBySex(list, "male").toArray()));
        System.out.println(Arrays.toString(iml.searchBySex(set, "female").toArray()));

        System.out.println("возвращает отсортированную коллекцию по возрасту пользователей");

        System.out.println(iml.sortByAge(list).toString());
    }
}
