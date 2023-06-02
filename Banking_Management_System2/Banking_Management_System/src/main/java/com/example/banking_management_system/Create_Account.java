package com.example.banking_management_system;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;
import java.sql.*;
import java.time.LocalDate;


public class Create_Account implements Initializable {

    @FXML
    private TextField AccountNo;

    @FXML
    private TextField AccountType;

    @FXML
    private TextField Address;

    @FXML
    private TextField Country;

    @FXML
    private DatePicker DOB;

    @FXML
    private TextField Ini_Deposit;

    @FXML
    private TextField NIC;

    @FXML
    private TextField Name;

    @FXML
    private TextField Phone_No;

    @FXML
    private Button back;

    @FXML
    private Button register;

    @FXML
    private RadioButton female;

    @FXML
    private RadioButton male;

    @FXML
    private TextField pin;

    @FXML
    void onbackClicked(ActionEvent event) {

    }

    @FXML
    void oneRegisterClicked(ActionEvent event) throws ClassNotFoundException, SQLException {
        Connection dataBaselink;
        String databaseUser="root";
        String databasePassword="zamanlew6732";
        String url="jdbc:mysql://localhost:3306/registrationpro";
        Class.forName("com.mysql.cj.jdbc.Driver");
        dataBaselink=DriverManager.getConnection(url,databaseUser,databasePassword);
        PreparedStatement stat = dataBaselink.prepareStatement("INSERT Into sign_up  (full_name,phone,email,password,dob,gender,qualification,city) values (?,?,?,?,?,?,?,?)");

        stat.setString(1,Name.getText());
        LocalDate localDate = DOB.getValue();
        Date date = Date.valueOf(localDate);
        stat.setDate(2, date);
        stat.setString(3,Country.getText());
        ToggleGroup group =new ToggleGroup();
        RadioButton male = new RadioButton("Male");
        male.setToggleGroup(group);
        RadioButton female =new RadioButton("Female");
        female.setToggleGroup(group);
        stat.setString(4,group.toString());
        stat.setString(5,NIC.getText());
        stat.setString(6,pin.getText());
        stat.setString(7,AccountNo.getText());
        stat.setString(8,AccountType.getText());
        stat.setString(9,Ini_Deposit.getText());
        stat.setString(10,Phone_No.getText());
        stat.setString(11,Address.getText());
        stat.execute();
        stat.close();
        dataBaselink.close();

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
