module com.example.ia_experimentation {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ia_experimentation to javafx.fxml;
    exports com.example.ia_experimentation;
}