package com.example.abrarkaam;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
       stage.setTitle("sum");
//
        GridPane gp = new GridPane();
       Scene sc= new Scene(gp,600,400);
       gp.setVgap(100);
       gp.setHgap(100);

       Label l1=new Label("SUM OF  2 NUMBERS");
       gp.add(l1,0,0);
        TextField tx=new TextField();
        gp.add(tx,1,1);
        TextField tx1=new TextField();
        gp.add(tx1,1,2);



        Dialog<String> dialog=new Dialog<>();
        ButtonType buttonType=new ButtonType("ok",ButtonBar.ButtonData.OK_DONE);


        dialog.getDialogPane().getButtonTypes().add(buttonType);
        Button button=new Button("show ans");

        gp.add(button,1,3);
        button.setOnAction(actionEvent ->{
                  int a=Integer.parseInt(tx.getText())+Integer.parseInt(tx1.getText());
                    String s=String.valueOf(a);
                    dialog.setContentText(s);
                    dialog.showAndWait();
        });


        stage.setScene(sc);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}