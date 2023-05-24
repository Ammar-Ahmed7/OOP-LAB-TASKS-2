package com.example.dbjavafxassignment;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class Added {

    @FXML
    private Label ErrorPane;

    @FXML
    private Button InsertnewButton;

    @FXML
    private Button LoginButton1;

    @FXML
    private Pane blankPane;

    @FXML
    private Label invalidLabel;

    private Stage stage;
    private Scene scene;
    @FXML
    void Insertnew(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("SignIn.fxml"));
        stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
    }

    @FXML
    void LoginButton1(ActionEvent event) throws IOException {

        Parent root= FXMLLoader.load(getClass().getResource("Login.fxml"));
        stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
    }

}
