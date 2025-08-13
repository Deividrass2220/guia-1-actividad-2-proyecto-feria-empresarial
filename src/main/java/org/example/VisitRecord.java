package org.example;

/**
 * Esta clase representa un registro de visita de un visitante a un stand.
 * Guarda el stand visitado, la fecha, el comentario y la calificación dada.
 */
public class VisitRecord {

    // Stand al que se realizó la visita
    private Stand stand;
    // Fecha en la que se realizó la visita (en formato String)
    private String fecha;
    // Comentario que dejó el visitante sobre el stand
    private String comentario;
    // Calificación dada por el visitante (por ejemplo, de 1 a 5)
    private int calificacion;

    /**
     * Constructor para crear un registro de visita con todos los datos necesarios.
     */
    public VisitRecord(Stand stand, String fecha, String comentario, int calificacion) {
        this.stand = stand;
        this.fecha = fecha;
        this.comentario = comentario;
        this.calificacion = calificacion;
    }

    // Getters y setters para acceder y modificar cada atributo

    public Stand getStand() {
        return stand;
    }

    public void setStand(Stand stand) {
        this.stand = stand;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
}
