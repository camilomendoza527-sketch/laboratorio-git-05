package edu.estudiante.saludo.ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Paso 4: el sistema saluda al estudiante por su nombre y menciona su edad.
 */
public class ResultadoController {

    @FXML
    private Label saludoLabel;

    public void mostrarSaludo(String mensaje) {
        saludoLabel.setText(mensaje);
    }

    @FXML
    private void onVolver(ActionEvent event) throws IOException {
        Parent vista = FXMLLoader.load(getClass().getResource("/edu/estudiante/saludo/ui/inicio-view.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene escena = new Scene(vista, 520, 420);
        escena.getStylesheets().add(getClass().getResource("/edu/estudiante/saludo/ui/estilos.css").toExternalForm());
        stage.setScene(escena);
    }
}
