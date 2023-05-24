package com.example.hospitalmanagementsystem;
import java.sql.*;

public class DB_Connector {

    private String driver = "com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:ucanaccess://HMS.accdb";
    public void selectrecord() {
        try {
            Connection con = DriverManager.getConnection(url);
            Statement stat = con.createStatement();
            ResultSet resultSet = stat.executeQuery("Select * from Doctor");
            while (resultSet.next()){
                System.out.println(resultSet.getString("Doc_Name"));
            }
            con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
