package edu.estudiante.saludo.modelo;

/**
 * Datos capturados en el caso de uso incluido "Pedir datos".
 */
public class Estudiante {
    private final String nombre;
    private final int edad;
    private final PeriodoHora periodoHora;

    public Estudiante(String nombre, int edad, PeriodoHora periodoHora) {
        this.nombre = nombre;
        this.edad = edad;
        this.periodoHora = periodoHora;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public PeriodoHora getPeriodoHora() {
        return periodoHora;
    }
}
