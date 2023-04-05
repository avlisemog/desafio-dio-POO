module com.example.desafiodiopoo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.desafiodiopoo to javafx.fxml;
    exports com.example.desafiodiopoo;
}