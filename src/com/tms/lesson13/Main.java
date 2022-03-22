package com.tms.lesson13;

import com.tms.lesson13.entity.People;
import com.tms.lesson13.service.PeopleServiceImpl;

import java.sql.SQLException;
import java.util.List;


public class Main {

    public static void main(String[] args) throws SQLException {
        PeopleServiceImpl peopleService = new PeopleServiceImpl();

        peopleService.createTable();
        peopleService.insertData();

        List<People> people = peopleService.getAllPeople();
        System.out.println(people.toString());
        System.out.println(peopleService.getByName("Masha"));
    }
}
