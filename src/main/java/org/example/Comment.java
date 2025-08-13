package org.example;

/**
 * Esta clase representa un comentario que un visitante deja en un stand.
 * Incluye quién lo hizo, la fecha, la calificación y el texto del comentario.
 */
public class Comment {

    // Visitante que hizo el comentario
    private Visitor visitante;
    // Fecha en la que se dejó el comentario
    private String fecha;
    // Calificación que dio el visitante (por ejemplo, de 1 a 5)
    private int calificacion;
    // Texto del comentario que dejó el visitante
    private String texto;

    /**
     * Constructor para crear un comentario con todos sus datos.
     */
    public Comment(Visitor visitante, String fecha, int calificacion, String texto) {
        this.visitante = visitante;
        this.fecha = fecha;
        this.calificacion = calificacion;
        this.texto = texto;
    }

    // Getters y setters para acceder y modificar cada atributo

    public Visitor getVisitante() {
        return visitante;
    }

    public void setVisitante(Visitor visitante) {
        this.visitante = visitante;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
}
