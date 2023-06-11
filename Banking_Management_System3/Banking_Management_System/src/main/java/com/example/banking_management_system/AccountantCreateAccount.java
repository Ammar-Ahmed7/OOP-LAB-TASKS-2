package com.example.banking_management_system;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

import java.io.IOException;

public class AccountantCreateAccount {

    @FXML
    private TextField Address;

    @FXML
    private DatePicker DOB;

    @FXML
    private RadioButton Female;

    @FXML
    private TextField ID;

    @FXML
    private RadioButton Male;

    @FXML
    private TextField NIC;

    @FXML
    private TextField Name;

    @FXML
    private TextField Password;

    @FXML
    private TextField Phone_No;

    @FXML
    private Button back;

    @FXML
    private Button register;

    @FXML
    private ToggleGroup tggender;

    @FXML
    void onbackClicked(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);

    }

    @FXML
    void oneRegisterClicked(ActionEvent event) {

    }

}
