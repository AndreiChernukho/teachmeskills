package com.tms.lesson8;

import java.util.*;

public class UserServiceIml implements UserService {

    @Override
    public List<User> searchByName(Collection<User> users, String name) {
        List<User> userCollection = new ArrayList<>();
        for (User user : users) {
            if (user.getName().equals(name)) {
                userCollection.add(user);
            }
        }
        return userCollection;
    }

    @Override
    public Collection<User> searchBySex(Collection<User> users, String sex) {
        Collection<User> userCollection = users;
        userCollection.removeIf(user -> !user.getSex().equals(sex));
        return userCollection;
    }

    @Override
    public List<User> sortByAge(List<User> users) {
        List<User> list = users;
        Comparator<User> userComparator = Comparator.comparing(User::getAge);
        list.sort(userComparator);
        return list;
    }
}
