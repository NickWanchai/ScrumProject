package com.example.demo.Repository;

import org.springframework.stereotype.Repository;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

@Repository
public class DBConnectionManager {

    private static String user = "scrumproject";
    private static String password = "Pw6G0o-IiO9?";
    private static String url = "jdbc:mysql://scrumproject@den1.mysql1.gear.host:3306/scrumproject?serverTimezone=UTC";
    private static Connection connection = null;



    public static Connection getConnection() {
        if (connection != null) return connection;
//        try (InputStream input = new FileInputStream("src/main/resources/application.properties")) {
//            Properties properties = new Properties();
//            properties.load(input);
//            url = properties.getProperty("url");
//            user = properties.getProperty("user");
//            password = properties.getProperty("password");
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(url + " " + user + " " + password);
        }
        return connection;
    }
}
