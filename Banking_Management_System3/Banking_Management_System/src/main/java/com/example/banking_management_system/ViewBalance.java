package com.example.banking_management_system;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewBalance {

    @FXML
    private Label Accountno;

    @FXML
    private Label Accountno_label;

    @FXML
    private Label Balance;

    @FXML
    private Label Balance_Label;

    @FXML
    private Button Clear_Button;

    @FXML
    private Label Name;

    @FXML
    private TextField Name_TextField;

    @FXML
    private Button back;

    @FXML
    void onClearButtonClicked(ActionEvent event) {

    }

    @FXML
    void onbackClicked(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);


    }

}
