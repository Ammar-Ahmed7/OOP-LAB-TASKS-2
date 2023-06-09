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

public class ChangePin {

    @FXML
    private Label AvailableBalance_Label;

    @FXML
    private TextField AvailableBalance_TextField;

    @FXML
    private Button Change_Button;

    @FXML
    private Button Clear_Button;

    @FXML
    private Label Newpin;

    @FXML
    private TextField Newpin_TextFIeld;

    @FXML
    private Label Oldpin_Label;

    @FXML
    private TextField Oldpin_TextField;

    @FXML
    private Button back;

    @FXML
    private Button edit;

    @FXML
    void onChangeButtonClicked(ActionEvent event) {

    }

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

    @FXML
    void oneditClicked(ActionEvent event) {

    }

}
