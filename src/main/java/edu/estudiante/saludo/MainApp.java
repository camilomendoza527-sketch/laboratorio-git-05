package edu.estudiante.saludo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Punto de entrada de la aplicación JavaFX.
 * Caso de uso: Solicitar saludo (incluye Pedir datos).
 */
public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/edu/estudiante/saludo/ui/inicio-view.fxml"));
        Scene scene = new Scene(loader.load(), 520, 420);
        scene.getStylesheets().add(MainApp.class.getResource("/edu/estudiante/saludo/ui/estilos.css").toExternalForm());
        stage.setTitle("Solicitar saludo");
        stage.setScene(scene);
        stage.setMinWidth(480);
        stage.setMinHeight(380);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
