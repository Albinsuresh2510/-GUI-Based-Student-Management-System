package com.example.studentmanagement.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {
     public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/studentdb",
            "root",
            "root"
        );
    }
}
