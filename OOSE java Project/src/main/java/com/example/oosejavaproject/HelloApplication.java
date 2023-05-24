package com.example.oosejavaproject;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @FXML
    @Override
    public void start(Stage stage) throws IOException {
        GridPane gridpane =new GridPane();
        stage.setTitle("Home");
        gridpane.setHgap(10);
        gridpane.setVgap(10);
        gridpane.setPadding(new Insets(10,10,10,10));

        Scene scene1=new Scene(gridpane,300,280);
        Text menu= new Text("Menu");
        menu.setFont(Font.font("Poppins",FontWeight.BOLD,20));
        gridpane.add(menu,9,1,1,1);


        Button button1 =new Button();
        button1.setText("Manager");
        gridpane.add(button1,9,3,1,1);

        Button button2=new Button();
        button2.setText("Bank Employee");
        gridpane.add(button2,9,5,1,1);
        stage.setScene(scene1);

        button1.setOnAction(new EventHandler<ActionEvent>(){

            @Override
            public void handle(ActionEvent actionEvent) {
                GridPane gp2 =new GridPane();
                gp2.setVgap(10);
                gp2.setHgap(10);
                gp2.setPadding(new Insets(10,10,10,10));

                Scene scene2=new Scene(gp2,500,300);

                Label user =new Label("Username");
                gp2.add(user,5,1,1,1);

                TextField textField = new TextField();
                gp2.add(textField,9,1,1,1);

                Label pass =new Label("Password");
                gp2.add(pass,5,3,1,1);

                PasswordField passwordField=new PasswordField();
                gp2.add(passwordField,9,3,1,1);

                stage.setScene(scene2);




            }
        });

        stage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}