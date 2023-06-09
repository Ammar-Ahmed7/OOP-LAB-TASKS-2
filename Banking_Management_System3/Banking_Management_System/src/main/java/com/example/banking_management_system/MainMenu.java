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

public class MainMenu {

    @FXML
    private TextField Date;

    @FXML
    private TextField Username;

    @FXML
    private Button back;

    @FXML
    private Button change_Pin;

    @FXML
    private Button create_Account;

    @FXML
    private Button customer_List;

    @FXML
    private Label date;

    @FXML
    private Button deposit;

    @FXML
    private Button exit;

    @FXML
    private Button profile;

    @FXML
    private Button transaction;

    @FXML
    private Button transfer;

    @FXML
    private Label username;

    @FXML
    private Button veiw_Balance;

    @FXML
    private Button withdraw;

    @FXML
    void currentDate(ActionEvent event) {

    }

    @FXML
    void onBalanceClicked(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("ViewBalance.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);

    }

    @FXML
    void onChangepinClicked(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("Change-Pin.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);

    }

    @FXML
    void onCreateaccountClicked(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("Create Account.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);

    }

    @FXML
    void onCustomerlistClicked(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("CustomerList.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);

    }

    @FXML
    void onDepositClicked(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("Deposit.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);

    }

    @FXML
    void onTransferClicked(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("Transfer.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);

    }

    @FXML
    void onTrasactionClicked(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("TransactionHistory.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
    }

    @FXML
    void onWithdrawClicked(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("withdraw.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
    }

    @FXML
    void onbackClicked(ActionEvent event) {

    }

    @FXML
    void onexitClicked(ActionEvent event) {
            System.exit(0);
    }

    @FXML
    void seeProfile(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("Profile.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);

    }

}
