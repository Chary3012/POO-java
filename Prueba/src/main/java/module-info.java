module com.prueba.prueba {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.prueba.prueba to javafx.fxml;
    exports com.prueba.prueba;
}