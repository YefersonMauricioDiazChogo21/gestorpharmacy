package com.pharmacy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static final String URL ="jdbc:mysql://localhost:3306/pharmacy";
    private static final String USSER ="campus2023";
    private static final String PASSWORD ="campus2023";

    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL, USSER, PASSWORD);
    }
}
