module com.example.oosejavaproject {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.oosejavaproject to javafx.fxml;
    exports com.example.oosejavaproject;
}