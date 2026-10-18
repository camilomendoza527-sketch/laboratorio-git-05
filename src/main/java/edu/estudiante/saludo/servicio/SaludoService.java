package edu.estudiante.saludo.servicio;

import edu.estudiante.saludo.modelo.Estudiante;

/**
 * Genera el saludo del caso de uso: nombre + edad, según AM/PM.
 */
public class SaludoService {

    public String saludar(Estudiante estudiante) {
        String anios = estudiante.getEdad() == 1 ? "año" : "años";
        return String.format(
                "%s, %s. Tienes %d %s.",
                estudiante.getPeriodoHora().getSaludo(),
                estudiante.getNombre(),
                estudiante.getEdad(),
                anios
        );
    }
}
