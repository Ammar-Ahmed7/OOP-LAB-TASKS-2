package com.example.hms;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.io.*;

public class Doc_Login extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        GridPane gridPane = new GridPane();
        stage.setTitle("Doctor Login");

        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        Scene scene1 = new Scene(gridPane, 1000, 600);
        Text login = new Text("Doctor Login Form");

       login.setFont(Font.font("Poppins", FontWeight.BOLD, 20));
        gridPane.add(login, 9, 6, 2, 1);

        Label user = new Label("Username/Email");
        gridPane.add(user, 8, 7);
        TextField username = new TextField();
        gridPane.add(username, 9, 7, 2, 1);

        Label pswrd = new Label("Password");
        gridPane.add(pswrd, 8, 8);
//        TextField pswr = new TextField();
//        gridPane.add(pswr, 6, 2, 2, 1);
        PasswordField pass = new PasswordField();
        gridPane.add(pass, 9, 8, 2, 1);

        Button lgin = new Button("Login");
        gridPane.add(lgin, 9, 9);


        Text sign = new Text("If you don't have an account \n Click on Register");
        sign.setTextAlignment(TextAlignment.CENTER);
        gridPane.add(sign, 9, 11);

        Button signup = new Button("Register");
        gridPane.add(signup, 9, 13);





        stage.setScene(scene1);
        signup.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Doctor_Regis dr = new Doctor_Regis();

                try {
                    dr.start(new Stage());
                    stage.close();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }

            }
        });

        stage.show();
    }


}