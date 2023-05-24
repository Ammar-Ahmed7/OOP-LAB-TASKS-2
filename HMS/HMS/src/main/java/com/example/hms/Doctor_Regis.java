package com.example.hms;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Side;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.*;

import java.io.FilterInputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Doctor_Regis extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        InputStream stream = new FileInputStream("C:\\Users\\Zaman Khan\\Desktop\\HMS\\HMS\\project-01.jpg");
        Image img =new Image(stream);
//        ImageView imgv= new ImageView();
//        imgv.setFitWidth(400.0);
//        imgv.setFitHeight(400.0);
//        imgv.setImage(img);
//        gp.add(root,10,3);
//        Group root = new Group(imgv);


        GridPane gp = new GridPane();

        gp.setHgap(15);
        gp.setVgap(15);
        gp.setPadding(new Insets(25, 25, 25, 25));
        Scene scene = new Scene(gp, 1000, 600);
        BackgroundImage bImg = new BackgroundImage(img,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        Background bGround = new Background(bImg);
        gp.setBackground(bGround);

        Text sc = new Text("Doctor Credentials");
        sc.setFont(Font.font("Poppins", FontWeight.BOLD, 20));
        gp.add(sc, 6, 0, 2, 1);

        TextField name = new TextField();
        gp.add(name, 6, 1, 2, 1);
        Label lab1 = new Label("Name");
        gp.add(lab1, 5, 1);

        Label lab3 = new Label("Phone");
        gp.add(lab3, 5, 2);
        TextField phone = new TextField();
        gp.add(phone, 6, 2, 2, 1);

        Label lab6 = new Label("Date Of Birth");
        gp.add(lab6, 5, 3);
        //TextField dob=new TextField();
        DatePicker dob = new DatePicker();
        gp.add(dob, 6, 3, 2, 1);

        Label lab2 = new Label("Email");
        gp.add(lab2, 5, 4);
        TextField email = new TextField();
        gp.add(email, 6, 4, 2, 1);

        Label lab4 = new Label("Password");
        gp.add(lab4, 5, 5);

        PasswordField p = new PasswordField();
        gp.add(p, 6, 5,2,1);

//        TextField password=new TextField();
//        gp.add(password,1,5,2,1);

        Label lab5 = new Label("Repeat Password");
        gp.add(lab5, 5, 6);
//        TextField repeatPassword=new TextField();
//        gp.add(repeatPassword,1,5,2,1);


        PasswordField rpass = new PasswordField();
        gp.add(rpass, 6, 6, 2, 1);


        Label lab7 = new Label("Gender");
        gp.add(lab7, 5, 7);

        RadioButton male = new RadioButton("Male");

        ToggleGroup group = new ToggleGroup();
        male.setToggleGroup(group);
        gp.add(male, 6, 7);

        RadioButton female = new RadioButton("Female");
        female.setToggleGroup(group);
        gp.add(female, 7, 7);

        RadioButton other = new RadioButton("Other");
        other.setToggleGroup(group);
        gp.add(other, 6, 8);


        ChoiceBox<String> choiceBox2 = new ChoiceBox<>();
        choiceBox2.getItems().add("+92");
        choiceBox2.getItems().add("+94");
        choiceBox2.getItems().add("+91");
        gp.add(choiceBox2, 6, 2);
        ChoiceBox<String> choiceBox = new ChoiceBox<>();
        Label lab9 = new Label("Specialization");
        gp.add(lab9, 5, 9);
        choiceBox.getItems().add("Allergy & immunology");
        choiceBox.getItems().add("Anesthesiology");
        choiceBox.getItems().add("Dermatology");
        choiceBox.getItems().add("Diagnostic");
        choiceBox.getItems().add("Neurology");
        choiceBox.getItems().add("Pathology");
        choiceBox.getItems().add("Psychiatry");
        choiceBox.getItems().add("Urology");
        gp.add(choiceBox, 6, 9);

        Label lab8 = new Label("Blood Group");
        gp.add(lab8, 5, 10);
        ChoiceBox<String> choiceBox3 = new ChoiceBox<>();
        choiceBox3.getItems().add("A");
        choiceBox3.getItems().add("A+");
        choiceBox3.getItems().add("B");
        choiceBox3.getItems().add("B+");
        choiceBox3.getItems().add("AB+");
        choiceBox3.getItems().add("AB-");
        choiceBox3.getItems().add("O+");
        choiceBox3.getItems().add("O-");
        gp.add(choiceBox3, 6, 10);

        Label lab10 = new Label("Address");
        gp.add(lab10, 5, 11);
        TextField Address = new TextField();
        gp.add(Address, 6, 11, 2, 1);


        Button signin = new Button("Sumbit");
        gp.add(signin, 7, 13);

        Button goback= new Button("Go Back");
        gp.add(goback, 6, 13);

        goback.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent actionEvent) {
                Patient_Login pl = new Patient_Login();
                try {
                    pl.start(new Stage());
                    stage.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        });


        stage.setScene(scene);
        stage.show();

        signin.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                  Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                    Connection con = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/Zaman Khan/Desktop/HMS/HMS/HMS.accdb");
                    PreparedStatement stat = con.prepareStatement("INSERT Into Doctor_Credentials  (Doc_Name,Doc_Num,Doc_Email,Doc_Pass,Doc_RePass,Doc_DOB,Doc_Specialization,Doc_Gender,Doc_BG,Doc_Address) values (?,?,?,?,?,?,?,?,?,?)");
                    stat.setString(1,name.getText());
                    stat.setString(2,phone.getText());
                    stat.setString(3,email.getText());
                    stat.setString(4,p.getText());
                    stat.setString(5,rpass.getText());
                    stat.setString(6,dob.getEditor().getText());
                    stat.setString(7,choiceBox.getValue());
                    String gender =null;
                    if(male.isSelected()){
                        gender="Male";
                    }
                    else if(female.isSelected()){
                        gender="Female";
                    }else if(other.isSelected()){
                        gender= "others";
                    }
                    stat.setString(8,gender);
                    stat.setString(9,choiceBox3.getValue());
                    stat.setString(10,Address.getText());
                    stat.executeUpdate();
                    stat.close();
                    con.close();

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                Dialog<String> dialog = new Dialog<>();
                ButtonType buttonType = new ButtonType("OK",ButtonBar.ButtonData.OK_DONE);
                dialog.getDialogPane().getButtonTypes().add(buttonType);
                dialog.setContentText("Congratulation! You are Successfully Registered");
                dialog.showAndWait();

            }
        });
    }
}
