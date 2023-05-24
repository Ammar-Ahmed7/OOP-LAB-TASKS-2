package com.example.hms;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.io.IOException;

public class Patient_Login extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        GridPane gridPane = new GridPane();
        stage.setTitle("Form");
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        Scene scene1 = new Scene(gridPane, 300, 280);
        Text login = new Text("Login Form");
        login.setFont(Font.font("Poppins", FontWeight.BOLD, 20));
        gridPane.add(login, 1, 0, 2, 1);

        Label user = new Label("Username/Email");
        gridPane.add(user, 0, 1);
        TextField username = new TextField();
        gridPane.add(username, 1, 1, 2, 1);

        Label pswrd = new Label("Password");
        gridPane.add(pswrd, 0, 2);
        TextField pswr = new TextField();
        gridPane.add(pswr, 1, 2, 2, 1);
        PasswordField pass = new PasswordField();
        gridPane.add(pass, 1, 2, 2, 1);

        Button lgin = new Button("Login");
        gridPane.add(lgin, 1, 4);


        Text sign = new Text("If you don't have an account \n Click on Register");
        sign.setTextAlignment(TextAlignment.CENTER);
        gridPane.add(sign, 1, 6);

        Button signup = new Button("Register");
        gridPane.add(signup, 1, 7);





        stage.setScene(scene1);
        signup.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Patient_Regis pr= new Patient_Regis();

                try {
                    pr.start(new Stage());
                    stage.close();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }

            }
        });

        stage.show();
    }


}