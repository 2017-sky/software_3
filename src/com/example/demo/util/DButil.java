package com.example.demo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DButil {
    private static final String URL="jdbc:mysql://localhost:3306/homework?serverTimezone=GMT%2B8";
    private static final String USER="root";
    private static final String PASSWORD="123456";


    public static Connection getConnection(){
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL,USER,PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("数据库连接异常");
        }
        return connection;
    }

    public static void excuteDML(String sql,Object...objects){
        PreparedStatement preparedStatement = null;
        Connection connection = getConnection();
        int num = 0;
        try {
            preparedStatement = connection.prepareStatement(sql);
            for (Object object:objects){
                preparedStatement.setObject(++num,object);
            }
            preparedStatement.execute();
        } catch (SQLException e) {
            System.out.println("数据库操作异常");
        }
    }

}
