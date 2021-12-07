package com.tms.lesson8;

import java.util.Collection;
import java.util.List;

public interface UserService {

     List<User> searchByName(Collection<User> users, String name);

     Collection<User> searchBySex(Collection<User> users, String sex);

     List<User> sortByAge(List<User> users);

}
