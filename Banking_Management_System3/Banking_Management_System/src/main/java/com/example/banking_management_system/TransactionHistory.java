package com.example.banking_management_system;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.stage.Stage;

import java.io.IOException;

public class TransactionHistory {

    @FXML
    private TableColumn<?, ?> AccNo_Col;

    @FXML
    private TableColumn<?, ?> AccType_Col;

    @FXML
    private TableColumn<?, ?> Deposit;

    @FXML
    private TableColumn<?, ?> Name_Col;

    @FXML
    private TableColumn<?, ?> WithDraw;

    @FXML
    private Button back;

    @FXML
    void onbackClicked(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);

    }

}
