package com.example.banking_management_system;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;

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
    void onbackClicked(ActionEvent event) {

    }

}
