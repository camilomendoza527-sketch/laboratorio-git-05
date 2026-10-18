package edu.estudiante.saludo.modelo;

public enum PeriodoHora {
    AM("AM", "Buenos días"),
    PM("PM", "Buenas tardes");

    private final String etiqueta;
    private final String saludo;

    PeriodoHora(String etiqueta, String saludo) {
        this.etiqueta = etiqueta;
        this.saludo = saludo;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public String getSaludo() {
        return saludo;
    }

    @Override
    public String toString() {
        return etiqueta;
    }
}
