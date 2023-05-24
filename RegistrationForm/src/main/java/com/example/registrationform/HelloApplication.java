package com.example.registrationform;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;
import java.util.Objects;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        GridPane gridPane = new GridPane();
        stage.setTitle("Form");
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(10,10,10,10));
        Scene scene1 = new Scene( gridPane,300, 280);
        Text login = new Text("Login Form");
        login.setFont(Font.font("Poppins", FontWeight.BOLD,20));
        gridPane.add(login,1,0,2,1);

        Label user = new Label("Username/Email");
        gridPane.add(user,0,1);
        TextField username= new TextField();
        gridPane.add(username,1,1,2,1);

        Label pswrd = new Label("Password");
        gridPane.add(pswrd,0,2);
        PasswordField pass = new PasswordField();
        gridPane.add(pass,1,2,2,1);

        Button lgin = new Button("Login");
        gridPane.add(lgin,1,4);


        Text sign = new Text("If you don't have an account \n Click on Register");
        sign.setTextAlignment(TextAlignment.CENTER);
        gridPane.add(sign,1,6);

        Button signup = new Button("Register");
        gridPane.add(signup,1,7);




        GridPane gp=new GridPane();
        gp.setHgap(10);
        gp.setVgap(10);
        gp.setPadding(new Insets(25,25,25,25));
        Scene scene = new Scene( gp,450, 500);

        Text sc=new Text("Registration Form");
        sc.setFont(Font.font("Poppins", FontWeight.BOLD,20));
        gp.add(sc,1,0,2,1);

        TextField name= new TextField();
        gp.add(name,1,1,2,1);
        Label lab1= new Label("Name");
        gp.add(lab1,0,1);

        Label lab3= new Label("Phone");
        gp.add(lab3,0,2);
        TextField phone=new TextField();
        gp.add(phone,1,2,2,1);

        Label lab6 =new Label("Date Of Birth");
        gp.add(lab6,0,3);
        //TextField dob=new TextField();
        DatePicker dob= new DatePicker();
        gp.add(dob,1,3,2,1);

        Label lab2 =new Label("Email");
        gp.add(lab2,0,4);
        TextField email=new TextField();
        gp.add(email,1,4,2,1);

        Label lab4=new Label("Password");
        gp.add(lab4,0,5);

        PasswordField lab4p=new PasswordField();
        gp.add(lab4p,1,5);


        Label lab5=new Label("Repeat Password");
        gp.add(lab5,0,6);


        PasswordField rpass = new PasswordField();
        gp.add(rpass,1,6,2,1);


        Label lab7 = new Label("Gender");
        gp.add(lab7,0,7);

        RadioButton male = new RadioButton("Male");

        ToggleGroup group = new ToggleGroup();
        male.setToggleGroup(group);
        gp.add(male,1,7);

        RadioButton female = new RadioButton("Female");
        female.setToggleGroup(group);
        gp.add(female,2,7);

        RadioButton other = new RadioButton("Other");
        other.setToggleGroup(group);
        gp.add(other,1,8);

        Label lab8= new Label("Expert");
        gp.add(lab8,0,9);

        CheckBox cricket = new CheckBox("Cricket");
        gp.add(cricket,1,10);

        CheckBox tennis = new CheckBox("Tennis");
        gp.add(tennis,2,9);

        CheckBox badmintin = new CheckBox("Badminton");
        gp.add(badmintin,1,9);

        CheckBox football = new CheckBox("FootBall");
        gp.add(football,2,10);

        Button signin = new Button("Sumbit");
        gp.add(signin,1,13);



        ChoiceBox<String> choiceBox2=new ChoiceBox<>();
        choiceBox2.getItems().add("+92");
        choiceBox2.getItems().add("+94");
        choiceBox2.getItems().add("+91");
        gp.add(choiceBox2,1,2);

        ChoiceBox<String> choiceBox=new ChoiceBox<>();
        Label lab9 = new Label("Qualification");
        gp.add(lab9,0,11);
        choiceBox.getItems().add("Matric");
        choiceBox.getItems().add("Intermediate");
        choiceBox.getItems().add("Bachelor's");
        choiceBox.getItems().add("Master's");
        choiceBox.getItems().add("Ph.D");
        gp.add(choiceBox,1,11);
        ChoiceBox<String> choiceBox3=new ChoiceBox<>();
        Label lab10 = new Label("Location");
        gp.add(lab10,0,12);
        choiceBox3.getItems().add("Lahore");
        choiceBox3.getItems().add("Karachi");
        choiceBox3.getItems().add("Islamabad");
        choiceBox3.getItems().add("Gujarawala");
        gp.add(choiceBox3,1,12);
        String gender = null;
        if (male.isSelected()) {
            gender = "Male";
        } else if (female.isSelected()) {
            gender = "Female";
        } else if (other.isSelected()) {
            gender = "others";
        }
        String expert=null;
        if (cricket.isSelected()) {
            expert = "Cricket";
        }
        if (tennis.isSelected()) {
            expert = "Tennis";
        }
        if (badmintin.isSelected()) {
            expert = "Badmintan";
        }
        if (football.isSelected()) {
            expert = "Football";
        }


        File  f = new File("database.txt");
        File t = new File("temp.txt");

        stage.setScene(scene1);

        signup.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(scene);
            }
        });

        String finalGender1 = gender;
        String finalExpert1 = expert;
        signin.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent actionEvent) {

                try {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(f, true));
                    // StringBuilder sb = new StringBuilder();




                    Record r = new Record(name.getText(), phone.getText(), dob.getEditor().getText(), email.getText(),
                            rpass.getText(), finalGender1, finalExpert1, choiceBox.getValue(), choiceBox3.getValue());
                    name.clear();
                    phone.clear();
                    dob.getEditor().clear();
                    email.clear();
                    rpass.clear();
                    lab4p.clear();
                    choiceBox.getItems().clear();
                    choiceBox3.getItems().clear();


                    bw.append(r.toString());
                    bw.append('\n');
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Dialog<String> dialog = new Dialog<>();
                ButtonType buttonType = new ButtonType("OK",ButtonBar.ButtonData.OK_DONE);
                dialog.getDialogPane().getButtonTypes().add(buttonType);
                dialog.setContentText("Congratulation! You are Successfully Registered");
                dialog.showAndWait();
            }
        });



        lgin.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                try {
                    BufferedReader br = new BufferedReader(new FileReader("database.txt"));
                    BufferedWriter bw = new BufferedWriter(new FileWriter(t));

                    ArrayList <String> r= new ArrayList<>();
                    ArrayList <String> al = new ArrayList<>();

//                    ArrayList<Record> records = new ArrayList<>();
//                    records.add(new Record(name.getText(), phone.getText(), dob.getEditor().getText(), email.getText(),
//                            rpass.getText(), finalGender, finalExpert, choiceBox.getValue(), choiceBox3.getValue()));
//                    System.out.println(records.get(0));

                    String rec = null;
                    // String s = null;

                    while ((rec = br.readLine())!=null) {
                        r.add(rec);
                    }

                    for (int k = 1; k<=r.size(); k++) {
                        if ((r.get(k - 1).contains(username.getText()) && r.get(k - 1).contains(pass.getText()))) {
                            r.remove(k-1);
                        }
                    }

                    for (int l = 1; l<=r.size(); l++) {
                        al.add(r.get(l - 1));
                        al.add("\n");}
                    bw.append(al.toString());
                    if(t.renameTo(f)){
                        System.out.println("hello");
                    }
                    bw.close();
                    br.close();






//                        for (int i = 1; i <= r.size(); i++) {
//                            if (r.get(i-1).contains(username.getText()) && r.get(i-1).contains(pass.getText())) {
//                                r.remove(i-1);
//                            }else {
//                                for (int j = 1; j <= r.size(); j++) {
//                                    al.add(r.get(j - 1));
//                                }
//                                bw.append(al.toString());
//                                t.renameTo(f);
//                            }





//                                TableView<Record> table = new TableView<>();
//                                Scene scene = new Scene(new Group());
//                                stage.setTitle("Profile View");
//                                stage.setWidth(1000);
//                                stage.setHeight(600);
//
//                                final Label label = new Label("Profile View");
//                                label.setFont(new Font("Arial", 20));
//                                table.setEditable(true);
//                                final VBox vbox = new VBox();
//                                vbox.setSpacing(10);
//                                vbox.setPadding(new Insets(10, 0, 0, 10));
//
//                                ObservableList<Record> ol = FXCollections.observableArrayList();
//                                TableColumn<Record,String> name = new TableColumn<>("Name");
//                                TableColumn<Record,String> number = new TableColumn<>("Number");
//                                TableColumn<Record,String> dob = new TableColumn<>("DOB");
//                                TableColumn<Record,String> email = new TableColumn<>("        Email           ");
//                                TableColumn<Record,String> password = new TableColumn<>("Password");
//                                TableColumn<Record,String> gender = new TableColumn<>("Gender");
//                                TableColumn<Record,String> expert = new TableColumn<>("Expert");
//                                TableColumn<Record,String> qualification = new TableColumn<>("Qualification");
//                                TableColumn<Record,String> location = new TableColumn<>("Location");
//
//                                table.getColumns().addAll(name,number,dob,email,password,gender,expert,qualification,location);
//                                vbox.getChildren().addAll(label, table);
//
//                                String [] s =r.get(0).split(",");
//
//
//                              Record rr = new Record(s[0],s[1],s[2],s[3],s[4],s[5],s[6],s[7],s[8]);
//                               ol.add(rr);
//                                name.setCellValueFactory(new PropertyValueFactory<>(rr.getName()));
//                                number.setCellValueFactory(new PropertyValueFactory<>(rr.getPhone()));
//                                dob.setCellValueFactory(new PropertyValueFactory<>(rr.getDOB()));
//                                email.setCellValueFactory(new PropertyValueFactory<>(rr.getEmail()));
//                                password.setCellValueFactory(new PropertyValueFactory<>(rr.getPassword()));
//                                gender.setCellValueFactory(new PropertyValueFactory<>(rr.getGender()));
//                                expert.setCellValueFactory(new PropertyValueFactory<>(rr.getExpert()));
//                                qualification.setCellValueFactory(new PropertyValueFactory<>(rr.getQualification()));
//                                location.setCellValueFactory(new PropertyValueFactory<>(rr.getLocation()));
//
//                                table.setItems(ol);
//                                table.setMaxSize(650, 100);
//
//                                ((Group) scene.getRoot()).getChildren().addAll(vbox);
//
//                                stage.setScene(scene);
//                                stage.show();


//                            }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}


//                    sb.append(name.getText());
//                    sb.append("  ");
//                    sb.append(choiceBox2.getValue());
//                    sb.append(phone.getText());
//                    sb.append("  ");
//                    sb.append(dob.getEditor().getText());
//                    if (!email.getText().contains("@")){
//                        System.out.println("Invalid Email");
//                    }else {
//                        sb.append("  ");
//                        sb.append(email.getCharacters());
//                    }
//                    if(!Objects.equals(lab5p.getText(), rpass.getText())){
//                        System.out.println("Invalid Password! Enter Again");
//                    } else {
//                        sb.append("  ");
//                        sb.append(lab5p.getCharacters());
//                        sb.append(" ");
//                        sb.append(rpass.getCharacters());
//                    }
//                    sb.append("  ");
//                    String gender =null;
//                   if(male.isSelected()){
//                       gender="Male";
//                   }
//                   else if(female.isSelected()){
//                       gender="Female";
//                   }else if(other.isSelected()){
//                       gender= "others";
//                   }
//                   sb.append(gender);
//                   String expert;
//                   if(cricket.isSelected()){
//                       expert="Cricket";
//                   }if(tennis.isSelected()){
//                        expert="Tennis";
//                   }if(badmintin.isSelected()){
//                        expert="Badmintan";
//                   }if (football.isSelected()) {
//                        expert="Football";
//                    sb.append("  ");
//                   sb.append(choiceBox.getValue());
//                    sb.append("  ");
//                    sb.append(choiceBox3.getValue());
//                    sb.append("\n");





//                    StringBuilder s = new StringBuilder();
//                    String temp ;
//                    while ((temp = br.readLine())!= null){
//                        s.append(temp);
//                        s.append(br.readLine());
//                        if (temp.equals(username.getText())) {
//                            System.out.println("temp");
//                            if (temp.equals(pass.getText())) {
//                                //System.out.println(br.readLine());
//                                System.out.println(s);
//                           }
//                        }
//                    }
//                    System.out.println(s);
//                    while (s!=null) {
//                       if (Objects.equals(user.getText(), name.getText())) {
//                            if (Objects.equals(pass.getText(), lab4p.getText())) {
//                                System.out.println(br.readLine());
//                           }
//                        }
//                    }