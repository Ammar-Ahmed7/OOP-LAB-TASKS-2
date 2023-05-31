package com.example.dbjavafxassignment;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import java.sql.*;

import java.io.IOException;

public class SignInController {

    @FXML
    private Button SubmitButton;

    @FXML
    private ImageView image1;

    @FXML
    private ImageView image2;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField usernameTextField;

    @FXML
    private Button LoginButton0;

    private Scene scene;
    private  Stage stage;

    @FXML
    void CheckSubmit(ActionEvent event) throws IOException {

       // String username = usernameTextField.getText();
       // String password = passwordField.getText();


        try{

            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Test","root","Ammarahmed0347");

            Statement statement = connection.createStatement();


            ResultSet resultSet = statement.executeQuery("select * from clients");

            while(resultSet.next()){
                System.out.println(resultSet.getString("Username"));
            }

            String sql= "INSERT INTO clients(username,password) VALUES(?,?)";
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,usernameTextField.getText());
            preparedStatement.setString(2,passwordField.getText());
            int rowInserted=preparedStatement.executeUpdate();
            if(rowInserted>0){
                System.out.println("A new Person has been added successfully"+"  ("+usernameTextField.getText()+")");
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch(Exception e){
            e.printStackTrace();
        }

       Parent root= FXMLLoader.load(getClass().getResource("Added.fxml"));
        stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);

    }

    @FXML
    void LoginButton0Check(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("Login.fxml"));
        stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
    }

}
