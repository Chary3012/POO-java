module com.cubocuadrado {
    requires javafx.controls;
    requires javafx.fxml;


    opens controlador to javafx.fxml;
    exports controlador;

    exports modelo;
}