package com.example.lab1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.io.IOException;
import java.text.spi.NumberFormatProvider;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("My Form");
        GridPane grid= new GridPane();
        GridPane grid2=new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10));
        grid.setPadding(new Insets(10,10,10,10));
        grid2.setHgap(10);
        grid2.setVgap(10);
        grid2.setPadding(new Insets(10,10,10,10));

        Scene s=new Scene(grid,500,400);

        Scene s2=new Scene(grid2,500,400);



        Text sceneAdmin=new Text("Admin");
        sceneAdmin.setTextAlignment(TextAlignment.CENTER);
        sceneAdmin.setFont(Font.font("Tahoma",FontWeight.BOLD,20));
        grid2.add(sceneAdmin,1,0);
        TextField adna=new TextField();
        grid2.add(adna,1,1);

        Label adname=new Label("Name");
        adname.setFont(Font.font("Tahoma",FontWeight.NORMAL,15));
        grid2.add(adname,0,1);



        Label adpassword=new Label("Password");
        adpassword.setFont(Font.font("Tahoma",FontWeight.NORMAL,15));
        grid2.add(adpassword,0,3);
        PasswordField adpasswordField= new PasswordField();
        grid2.add(adpasswordField,1,3);

       Button adbutton=new Button("Login");
       grid2.add(adbutton,3,4);





        Text sceneTitle= new Text("Registration Form");
        sceneTitle.setTextAlignment(TextAlignment.CENTER);
        sceneTitle.setFont(Font.font("Tahoma", FontWeight.BOLD,20));
        grid.add(sceneTitle,1,0);

        Label name=new Label("Name");
        name.setFont(Font.font("Tahoma",FontWeight.NORMAL,15));
        grid.add(name,0,1);
        TextField na=new TextField();
        grid.add(na,1,1);

        name.setPadding(new Insets(15));

        Label email=new Label("E-mail");
        email.setFont(Font.font("Tahoma",FontWeight.NORMAL,15));
        grid.add(email,0,2);
        TextField em=new TextField();
        grid.add(em,1,2,2,1);

        email.setPadding(new Insets(15));

        Label password=new Label("Password");
        password.setFont(Font.font("Tahoma",FontWeight.NORMAL,15));
        grid.add(password,0,3);
        PasswordField passwordField= new PasswordField();
        grid.add(passwordField,1,3);

        password.setPadding(new Insets(15));

        Label phone= new Label("Phone");
        phone.setFont(Font.font("Tahoma",FontWeight.NORMAL,15));
        grid.add(phone,0,4);
        TextField ph=new TextField();
        ph.setAlignment(Pos.BASELINE_RIGHT);
        grid.add(ph,1,4);
        ChoiceBox choiceBox=new ChoiceBox<TextField>();
        grid.add(choiceBox,1,4);

        phone.setPadding(new Insets(15));

        Label gender=new Label("Gender");
        gender.setFont(Font.font("Tahoma",FontWeight.NORMAL,15));
        grid.add(gender,0,5);
        ToggleGroup tg=new ToggleGroup();
        RadioButton radioButton=new RadioButton("Male");
        radioButton.setToggleGroup(tg);
        RadioButton radioButton1=new RadioButton("Female");
        radioButton1.setToggleGroup(tg);
        grid.add(radioButton,1,5);
        grid.add(radioButton1,2,5);

        gender.setPadding(new Insets(15));

        Button button=new Button("Sign up");
        grid.add(button,3,7);

        stage.setScene(s2);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}