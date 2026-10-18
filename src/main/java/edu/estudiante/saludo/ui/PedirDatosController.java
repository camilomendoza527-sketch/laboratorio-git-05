package edu.estudiante.saludo.ui;

import edu.estudiante.saludo.modelo.Estudiante;
import edu.estudiante.saludo.modelo.PeriodoHora;
import edu.estudiante.saludo.servicio.SaludoService;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Caso de uso incluido "Pedir datos": nombre, edad y hora (AM/PM).
 */
public class PedirDatosController {

    private final SaludoService saludoService = new SaludoService();

    @FXML
    private TextField nombreField;
    @FXML
    private TextField edadField;
    @FXML
    private ComboBox<PeriodoHora> horaCombo;
    @FXML
    private Label errorLabel;

    @FXML
    private void initialize() {
        horaCombo.setItems(FXCollections.observableArrayList(PeriodoHora.values()));
        horaCombo.getSelectionModel().selectFirst();
    }

    @FXML
    private void onEnviar(ActionEvent event) throws IOException {
        String nombre = nombreField.getText() == null ? "" : nombreField.getText().trim();
        String edadTexto = edadField.getText() == null ? "" : edadField.getText().trim();
        PeriodoHora periodo = horaCombo.getValue();

        if (nombre.isEmpty()) {
            errorLabel.setText("Ingresa tu nombre.");
            return;
        }
        int edad;
        try {
            edad = Integer.parseInt(edadTexto);
        } catch (NumberFormatException ex) {
            errorLabel.setText("La edad debe ser un número entero.");
            return;
        }
        if (edad < 0 || edad > 120) {
            errorLabel.setText("Ingresa una edad válida (0 a 120).");
            return;
        }
        if (periodo == null) {
            errorLabel.setText("Selecciona la hora (AM o PM).");
            return;
        }

        Estudiante estudiante = new Estudiante(nombre, edad, periodo);
        String mensaje = saludoService.saludar(estudiante);

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/edu/estudiante/saludo/ui/resultado-view.fxml"));
        Parent vista = loader.load();
        ResultadoController controlador = loader.getController();
        controlador.mostrarSaludo(mensaje);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene escena = new Scene(vista, 520, 420);
        escena.getStylesheets().add(getClass().getResource("/edu/estudiante/saludo/ui/estilos.css").toExternalForm());
        stage.setScene(escena);
    }
}
