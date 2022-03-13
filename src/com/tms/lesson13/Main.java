package com.tms.lesson13;

import com.tms.lesson13.config.JdbcConfig;
import com.tms.lesson13.entity.People;
import com.tms.lesson13.service.PeopleServiceImpl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) throws SQLException {
        Connection connection = JdbcConfig.getConnect();
        PeopleServiceImpl peopleService = new PeopleServiceImpl(connection);

        peopleService.createTable();
        peopleService.insertData();

        ArrayList<People> people = peopleService.getAllPeople();
        System.out.println(people.toString());
        System.out.println(peopleService.getByName("Masha"));
    }

}
