package com.example.banking_management_system;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.*;

public class Deposit {

    @FXML
    private Label Amount_Label;

    @FXML
    private TextField Amount_TextField;

    @FXML
    private Label AvailableBalance_Label;

    @FXML
    private TextField AvailableBalance_TextField;

    @FXML
    private Button Deposit_Button;

    @FXML
    private Label NIC_Label;

    @FXML
    private TextField NIC_TextFIeld;

    @FXML
    private TextField Name;

    @FXML
    private Label Name_Label;

    @FXML
    private Button Search_Button;

    @FXML
    private TextField TotalBalance_TExtfield;

    @FXML
    private Button back;

    public static float updatedDeposit;
    public static float currentDeposit;
    public static float amount;


    @FXML
    void onDepositButtonClicked(ActionEvent event) throws SQLException, ClassNotFoundException {
        String databaseUser = "root";
        String databasePassword = "Ammarahmed0347";
        String url = "jdbc:mysql://localhost:3306/banking_mangement_system";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, databaseUser, databasePassword);
        String name = Name.getText();
        String selectQuery = "SELECT iniDeposit FROM clients WHERE name = ?";
        PreparedStatement selectStatement = con.prepareStatement(selectQuery);
        selectStatement.setString(1, name);
        ResultSet resultSet = selectStatement.executeQuery();

        if (resultSet.next()) {
             currentDeposit = Float.parseFloat(resultSet.getString("iniDeposit"));

            // Get the amount from the Amount_TextField and perform addition
             amount = Float.parseFloat(Amount_TextField.getText());
             updatedDeposit = currentDeposit + amount;
            TotalBalance_TExtfield.setText(String.valueOf(updatedDeposit));

            // Update the iniDeposit value in the database
            String updateQuery = "UPDATE clients SET iniDeposit = ? WHERE name = ?";
            PreparedStatement updateStatement = con.prepareStatement(updateQuery);
            updateStatement.setFloat(1, updatedDeposit);
            updateStatement.setString(2, name);
            updateStatement.executeUpdate();

            // Close the database connections and resources
            updateStatement.close();
            selectStatement.close();
            resultSet.close();
            con.close();

            // Display a success message or perform any other necessary actions
            System.out.println("Deposit updated successfully.");
        } else {
            // Handle the case when the name is not found in the database
            System.out.println("Name not found in the database.");
        }



    }

    @FXML
    void onbackClicked(ActionEvent event) {

    }

    @FXML
    void onesearchClicked(ActionEvent event) throws ClassNotFoundException, SQLException {
        String databaseUser = "root";
        String databasePassword = "Ammarahmed0347";
        String url = "jdbc:mysql://localhost:3306/banking_mangement_system";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, databaseUser, databasePassword);

        String n = Name.getText();
        String sq = "SELECT clients.nic,clients.iniDeposit FROM clients WHERE name = ?";
        PreparedStatement stat = con.prepareStatement(sq);
        stat.setString(1, n);
        ResultSet resultSet = stat.executeQuery();
        while (resultSet.next()) { // Move the cursor to the first row
            String nic = resultSet.getString(1);// Retrieve the data from the first column
            String iniDep = resultSet.getString(2);
            NIC_TextFIeld.setText(nic);
            AvailableBalance_TextField.setText(iniDep);
        }
    }

}
