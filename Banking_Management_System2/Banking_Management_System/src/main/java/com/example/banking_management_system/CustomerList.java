package com.example.banking_management_system;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.fxml.Initializable;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class CustomerList implements Initializable{


    @FXML
    private TableView<TableModel> table;

    @FXML
    private TableColumn<TableModel, String> AccNo_Col;

    @FXML
    private TableColumn<TableModel, String> AccType_Col;

    @FXML
    private TableColumn<TableModel, String> Country_Col;

    @FXML
    private TableColumn<TableModel, String> DOB_Col;

    @FXML
    private TableColumn<TableModel, String> Gender_Col;

    @FXML
    private TableColumn<TableModel, String> NIC_Col;

    @FXML
    private TableColumn<TableModel, String> Name_Col;

    @FXML
    private TableColumn<?, ?> Phone_Col;

    @FXML
    private Button back;

    ObservableList<TableModel> listview= FXCollections.observableArrayList();


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
       AccNo_Col.setCellValueFactory(new PropertyValueFactory<>("AccNo_Col"));
        AccType_Col.setCellValueFactory(new PropertyValueFactory<>("AccType_Col"));
        Country_Col.setCellValueFactory(new PropertyValueFactory<>("Country_Col"));
        DOB_Col.setCellValueFactory(new PropertyValueFactory<>("DOB_Col"));
        Gender_Col.setCellValueFactory(new PropertyValueFactory<>("Gender_Col"));
        NIC_Col.setCellValueFactory(new PropertyValueFactory<>("NIC_Col"));
        Name_Col.setCellValueFactory(new PropertyValueFactory<>("Name_Col"));
        Phone_Col.setCellValueFactory(new PropertyValueFactory<>("Phone_Col"));
    }


    @FXML
    void onbackClicked(ActionEvent event) {

    }



}
