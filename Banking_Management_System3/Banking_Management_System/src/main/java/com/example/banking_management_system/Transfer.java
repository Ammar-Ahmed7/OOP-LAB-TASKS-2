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

public class Transfer {

    @FXML
    private Label Accountno;

    @FXML
    private Label Accountno_Label;

    @FXML
    private Label Amount_Label;

    @FXML
    private Label Amount_Label1;

    @FXML
    private TextField Amount_TextField;

    @FXML
    private TextField Amount_TextField1;

    @FXML
    private Label AvailableBalance_Label;

    @FXML
    private TextField AvailableBalance_TextField;

    @FXML
    private TextField Name;

    @FXML
    private Label Name_Label;

    @FXML
    private Button Search_Button;

    @FXML
    private TextField TotalBalance_TExtfield;

    @FXML
    private Button Total_Button;

    @FXML
    private Button Transfer_Button;

    @FXML
    private Button back;

    @FXML
    void onTotalButtonClicked(ActionEvent event) {

    }

    @FXML
    void onTransferButtonClicked(ActionEvent event) {

    }

    @FXML
    void onbackClicked(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);


    }

    @FXML
    void onesearchClicked(ActionEvent event) {

    }

}
