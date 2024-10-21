package com.spring.insurance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            Class.forName("org.postgresql.Driver"); // Load the driver explicitly
        } catch (ClassNotFoundException e) {
            System.err.println("PostgreSQL JDBC driver not found: " + e.getMessage());
            return; // Stop if the driver isn't found
        }

        String url = "jdbc:postgresql://localhost:5433/insurance";
        String user = "your_user";
        String password = "your_password";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connected successfully!");
        } catch (SQLException e) {
            System.err.println("Connection failed: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
