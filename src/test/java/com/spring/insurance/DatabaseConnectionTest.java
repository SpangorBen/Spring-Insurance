package com.spring.insurance;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:context.xml")
class DatabaseConnectionTest {

    @Autowired
    private DataSource dataSource;

    @Test
    void testConnection() throws SQLException {
        try (Connection connection = dataSource.getConnection()) {
            assertNotNull(connection, "Connection should not be null");

            // Optional: Get and print metadata for more detailed verification
            DatabaseMetaData metaData = connection.getMetaData();
            System.out.println("Database Product Name: " + metaData.getDatabaseProductName());
            System.out.println("Database Product Version: " + metaData.getDatabaseProductVersion());
            System.out.println("Driver Name: " + metaData.getDriverName());
            System.out.println("Driver Version: " + metaData.getDriverVersion());


            String catalog = connection.getCatalog();
            if (catalog != null) {
                System.out.println("Current Catalog: " + catalog);
            } else {
                System.out.println("Catalog is null"); // PostgreSQL doesn't use catalogs
            }


            // Getting schema name is database specific, for example in SQL Server, the getSchema method returns null
            try {
                String schema = connection.getSchema();
                if (schema != null) {
                    System.out.println("Current Schema: " + schema);
                } else {
                    System.out.println("Schema is null");
                }

            } catch (SQLException e){
                System.out.println("Error getting schema. The getSchema method is not supported by this driver: " + e.getMessage());
            }




        }
    }
}