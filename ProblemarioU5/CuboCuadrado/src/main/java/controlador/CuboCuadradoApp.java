package controlador;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CuboCuadradoApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CuboCuadradoApp.class.getResource("/vista/CuboCuadradoVista.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 370, 300);
        stage.setTitle("Calcular el cubo y cuadrado");
        stage.setScene(scene);
        stage.show();
    }
}
