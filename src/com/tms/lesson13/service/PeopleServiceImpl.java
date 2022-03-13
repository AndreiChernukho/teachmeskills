package com.tms.lesson13.service;

import com.tms.lesson13.entity.People;

import java.sql.*;
import java.util.ArrayList;

public class PeopleServiceImpl {
    private Connection connection;

    public PeopleServiceImpl(Connection connection) {
        this.connection = connection;
    }

    public void createTable()  {
        Statement statement = null;
        try {
            statement = connection.createStatement();
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS people ( " +
                    "id                      BIGSERIAL    NOT NULL PRIMARY KEY," +
                    "name                    VARCHAR(255)  NOT NULL," +
                    "sex                     VARCHAR(255)  NOT NULL," +
                    "birthday                date         NOT NULL )");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void insertData(){
        Statement statement = null;
        try {
            statement = connection.createStatement();
            statement.executeUpdate("insert into people (name,sex, birthday)\n" +
                    "values\n" +
                    "('Vasya','male','2000-01-01'),\n" +
                    "('Kostja','male','2001-01-01'),\n" +
                    "('Misha','male','2002-01-01'),\n" +
                    "('Jan','male','2003-01-01'),\n" +
                    "('Aleksandr','male','2004-01-01'),\n" +
                    "('Nina','female','2005-01-01'),\n" +
                    "('Masha','female','2006-01-01'),\n" +
                    "('Alena','female','2007-01-01'),\n" +
                    "('Alesja','female','2008-01-01'),\n" +
                    "('Irina','female','2009-01-01');");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public String getByName(String name) {

        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM people WHERE name = ?");
            statement.setString(1, name);
            ResultSet resultSet = statement.executeQuery();
            resultSet.next();

            int id = resultSet.getInt(1);
            String sex = resultSet.getString(3);
            Date birthday = resultSet.getDate(4);
            return id + ", " + name + ", " + sex + ", " + birthday;
        } catch (SQLException exc) {
            return "Name " + name +" not found";
        }
    }

    public ArrayList<People> getAllPeople() {

        ArrayList<People> people = new ArrayList<People>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM people");

            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String sex = resultSet.getString(3);
                Date birthday = resultSet.getDate(4);

                People human = new People(id, name, sex, birthday);
                people.add(human);
            }
        } catch (SQLException exc) {
            exc.printStackTrace();
        }
        return people;
    }
}
