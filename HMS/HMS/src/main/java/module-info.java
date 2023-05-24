module com.example.hms {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;
    requires java.sql;
    requires ucanaccess;


    opens com.example.hms to javafx.fxml;
    exports com.example.hms;
}