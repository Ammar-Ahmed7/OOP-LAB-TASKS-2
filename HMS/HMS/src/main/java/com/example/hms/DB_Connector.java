package com.example.hms;
import java.sql.*;

public class DB_Connector {


    public void selectrecord() {
        try {
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://HMS.accdb");
            Statement stat = con.createStatement();
            ResultSet resultSet = stat.executeQuery("Select * from Doctor");
            while (resultSet.next()){
                System.out.println(resultSet.getString(1));
            }
            con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
