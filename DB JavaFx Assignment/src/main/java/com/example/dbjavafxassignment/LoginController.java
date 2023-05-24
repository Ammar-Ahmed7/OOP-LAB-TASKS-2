package com.example.dbjavafxassignment;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.*;

public class LoginController {

    @FXML
    private Label Logintag;

    @FXML
    private Button loginButton;

    @FXML
    private Button SignUpButton1;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField usernameTextField;

    private Stage stage;
    private Scene scene;


    @FXML
    void CheckLogin(ActionEvent event) throws IOException, SQLException {

        String username = usernameTextField.getText();
        String password = passwordField.getText();

        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/db_people","root","ammarahmed0347");

        Statement statement = connection.createStatement();


        String query = "SELECT * FROM people WHERE Username='" + username + "' AND Password='" + password + "'";

        ResultSet resultSet = statement.executeQuery(query);


        if(!resultSet.next()){
          Parent root=FXMLLoader.load(getClass().getResource("Invalid.fxml"));
          stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
          scene =new Scene(root);
          stage.setScene(scene);
      }
        else {
            Parent root=FXMLLoader.load(getClass().getResource("Welcome.fxml"));
            stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
            scene =new Scene(root);
            stage.setScene(scene);
        }
    }

    @FXML
    void SIgnUptButton1Check(ActionEvent event) throws IOException {
        Parent root=FXMLLoader.load(getClass().getResource("SignIn.fxml"));
        stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
    }


}
