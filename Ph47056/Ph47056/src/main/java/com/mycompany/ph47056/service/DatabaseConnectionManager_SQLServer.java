package com.mycompany.ph47056.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;

public class DatabaseConnectionManager_SQLServer {

    private final String url;

    public DatabaseConnectionManager_SQLServer(
            String databaseName,
            String username,
            String password
    ) {
        this.url = "jdbc:sqlserver://localhost:1433;database=" + databaseName
                + ";user=" + username
                + ";password=" + password
                + ";encrypt=true;" + "trustServerCertificate=true;" + "loginTimeout=30;";
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(this.url);
    }

}
