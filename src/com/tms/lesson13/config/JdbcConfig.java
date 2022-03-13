package com.tms.lesson13.config;

import java.sql.*;

import static java.sql.DriverManager.getConnection;

public class JdbcConfig {
    public static Connection getConnect() throws SQLException  {
        String url = "jdbc:postgresql://localhost:5432/";
        String database = "postgres";
        String userName = "postgres";
        String password = "password";
        return getConnection(url + database, userName, password);
    }
}
