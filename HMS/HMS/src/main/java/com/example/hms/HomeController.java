package com.example.hms;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;


public class HomeController {

        @FXML
        private Button doctor;

        @FXML
        private Button management;

        @FXML
        private Button patient;

        @FXML
        void onDoctorclicked(ActionEvent event) throws Exception {
            Doc_Login dat=new Doc_Login();
            dat.start(new Stage());
              Home h = new Home();
              h.stop();
        }

        @FXML
        void onmanagementclicked(ActionEvent event) throws IOException {

        }


    @FXML
    void onpatientclicked(ActionEvent event) throws Exception {
           Patient_Login pat=new Patient_Login();
           pat.start(new Stage());
    }



}


