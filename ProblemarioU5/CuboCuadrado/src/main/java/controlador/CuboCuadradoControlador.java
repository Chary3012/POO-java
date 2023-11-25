package controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import modelo.Numero;

public class CuboCuadradoControlador implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnCuadrado;

    @FXML
    private Button btnCubo;

    @FXML
    private Label labIngreseNumero;

    @FXML
    private Label labMostrarResultado;

    @FXML
    private Label lbResultado;

    @FXML
    private TextField txtNumero;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        this.labMostrarResultado.setText(" ");

    }

    @FXML
    void clickCuadrado(ActionEvent event) {
        double obtenerNumero;

        try {
            obtenerNumero = Double.parseDouble(this.txtNumero.getText());
            Numero n1 = new Numero(obtenerNumero);

            this.labMostrarResultado.setText(n1.calcularCuadrado() + " ");

        }catch (NumberFormatException e){
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setHeaderText(null);
            alerta.setTitle("Error");
            alerta.setContentText("Ingresa un número valido");
            alerta.showAndWait();
        }

    }

    @FXML
    void clickCubo(ActionEvent event) {
        double obtenerNumero;

        try {
            obtenerNumero = Double.parseDouble(this.txtNumero.getText());
            Numero n1 = new Numero(obtenerNumero);

            this.labMostrarResultado.setText(n1.calcularCubo() + " ");

        }catch (NumberFormatException e){
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setHeaderText(null);
            alerta.setTitle("Error");
            alerta.setContentText("Ingresa un número valido");
            alerta.showAndWait();
        }
    }

    @FXML
    void initialize() {
        assert btnCuadrado != null : "fx:id=\"btnCuadrado\" was not injected: check your FXML file 'CuboCuadradoVista.fxml'.";
        assert btnCubo != null : "fx:id=\"btnCubo\" was not injected: check your FXML file 'CuboCuadradoVista.fxml'.";
        assert labIngreseNumero != null : "fx:id=\"labIngreseNumero\" was not injected: check your FXML file 'CuboCuadradoVista.fxml'.";
        assert labMostrarResultado != null : "fx:id=\"labMostrarResultado\" was not injected: check your FXML file 'CuboCuadradoVista.fxml'.";
        assert lbResultado != null : "fx:id=\"lbResultado\" was not injected: check your FXML file 'CuboCuadradoVista.fxml'.";
        assert txtNumero != null : "fx:id=\"txtNumero\" was not injected: check your FXML file 'CuboCuadradoVista.fxml'.";

    }


}
