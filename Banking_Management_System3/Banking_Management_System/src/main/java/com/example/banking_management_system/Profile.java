package com.example.banking_management_system;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Profile {

    @FXML
    private TextField AccountNo;

    @FXML
    private TextField AccountType;

    @FXML
    private TextField Address;

    @FXML
    private TextField Country;

    @FXML
    private TextField DOB;

    @FXML
    private TextField Gender;

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
    private Button edit;

    @FXML
    void onbackClicked(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);


    }

    @FXML
    void oneditClicked(ActionEvent event) {

    }

}
