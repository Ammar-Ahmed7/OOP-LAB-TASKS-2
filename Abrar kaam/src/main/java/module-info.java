module com.example.abrarkaam {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.abrarkaam to javafx.fxml;
    exports com.example.abrarkaam;
}