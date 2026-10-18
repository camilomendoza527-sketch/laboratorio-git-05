module edu.estudiante.saludo {
    requires javafx.controls;
    requires javafx.fxml;

    opens edu.estudiante.saludo to javafx.fxml;
    opens edu.estudiante.saludo.ui to javafx.fxml;

    exports edu.estudiante.saludo;
}
