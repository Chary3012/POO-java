package com.prueba.prueba;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private Button btnAgregar;

    @FXML
    private Button btnEliminar;

    @FXML
    private Button btnModificar;

    @FXML
    private TableColumn<?, ?> tabApellido;

    @FXML
    private TableColumn<?, ?> tabEdad;

    @FXML
    private TableColumn<?, ?> tabNombre;

    @FXML
    private TextField txApellido;

    @FXML
    private TextField txEdad;

    @FXML
    private TextField txNombre;

    public HelloController() {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
