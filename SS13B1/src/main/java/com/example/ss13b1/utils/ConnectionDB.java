package com.example.ss13b1.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    public static final String DRIVER="com.mysql.cj.jdbc.Driver";
    public static final String URL="jdbc:mysql://localhost:3306/session13b1";
    public static final String USERNAME="root";
    public static final String PASSWORD="123456";
    public static Connection openConnection(){
        Connection connection;

        try {
        Class.forName(DRIVER);
        connection= DriverManager.getConnection(URL,USERNAME,PASSWORD);
        }catch (SQLException|ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return connection;
    }
    public static void closeConnection(Connection connection){
    if(connection!=null){
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    }


}
