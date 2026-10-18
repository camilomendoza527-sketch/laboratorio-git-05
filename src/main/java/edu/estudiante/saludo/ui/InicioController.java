package edu.estudiante.saludo.ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Paso 1 del caso de uso: el estudiante hace clic en Solicitar saludo.
 */
public class InicioController {

    @FXML
    private void onSolicitarSaludo(ActionEvent event) throws IOException {
        Parent vista = FXMLLoader.load(getClass().getResource("/edu/estudiante/saludo/ui/pedir-datos-view.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene escena = new Scene(vista, 520, 480);
        escena.getStylesheets().add(getClass().getResource("/edu/estudiante/saludo/ui/estilos.css").toExternalForm());
        stage.setScene(escena);
    }
}
