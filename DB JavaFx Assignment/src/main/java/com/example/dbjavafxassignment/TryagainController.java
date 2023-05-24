package com.example.dbjavafxassignment;
import javafx.application.Application;
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

import static com.example.dbjavafxassignment.Main.main;
import static javafx.application.Application.launch;

public class TryagainController  {

    @FXML
    private Label ErrorPane;

    @FXML
    private Pane blankPane;

    @FXML
    private Label invalidLabel;

    @FXML
    private Button tryagainButton;

    private Stage stage;
    private Scene scene;
    @FXML
    void tryAgain(ActionEvent event) throws IOException {
        Parent root=FXMLLoader.load(getClass().getResource("Login.fxml"));
        stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
    }



}
