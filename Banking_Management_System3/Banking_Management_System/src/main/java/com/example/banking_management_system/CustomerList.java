package com.example.banking_management_system;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;

public class CustomerList {

    @FXML
    private TableColumn<?, ?> AccNo_Col;

    @FXML
    private TableColumn<?, ?> AccType_Col;

    @FXML
    private TableColumn<?, ?> Country_Col;

    @FXML
    private TableColumn<?, ?> DOB_Col;

    @FXML
    private TableColumn<?, ?> Gender_Col;

    @FXML
    private TableColumn<?, ?> NIC_Col;

    @FXML
    private TableColumn<?, ?> Name_Col;

    @FXML
    private TableColumn<?, ?> Phone_Col;

    @FXML
    private Button back;

    @FXML
    void onbackClicked(ActionEvent event) {

    }

}
