package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Profe, esta clase representa un stand dentro de la feria.
 * Aquí guardamos su número, ubicación, tamaño, la empresa asignada (si tiene)
 * y los comentarios que los visitantes han dejado sobre el stand.
 */
public class Stand {

    // Número identificador del stand
    private int numero;
    // Ubicación física del stand en la feria
    private String ubicacion;
    // Tamaño del stand (pequeño, mediano, grande)
    private String tamaño;
    // Empresa que tiene asignado este stand; puede ser null si está libre
    private Company empresa;
    // Lista de comentarios que los visitantes han dejado para este stand
    private List<Comment> comentarios;

    /**
     * Constructor que crea un stand con su número, ubicación y tamaño.
     * Inicialmente sin empresa asignada y sin comentarios.
     */
    public Stand(int numero, String ubicacion, String tamaño) {
        this.numero = numero;
        this.ubicacion = ubicacion;
        this.tamaño = tamaño;
        this.empresa = null;
        this.comentarios = new ArrayList<>();
    }

    /**
     * Indica si el stand está disponible para asignar.
     * Está disponible si no tiene empresa asignada.
     */
    public boolean estaDisponible() {
        return this.empresa == null;
    }

    /**
     * Asigna una empresa al stand.
     */
    public void asignarEmpresa(Company empresa) {
        this.empresa = empresa;
    }

    /**
     * Agrega un comentario dejado por un visitante al stand.
     */
    public void agregarComentario(Comment comentario) {
        this.comentarios.add(comentario);
    }

    /**
     * Calcula el promedio de las calificaciones recibidas en los comentarios.
     * Si no hay comentarios, retorna 0 para evitar errores.
     */
    public double obtenerCalificacionPromedio() {
        if (comentarios.isEmpty()) {
            return 0.0;
        }
        int suma = 0;
        for (Comment c : comentarios) {
            suma += c.getCalificacion();
        }
        return (double) suma / comentarios.size();
    }

    // Getters y setters para los atributos

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public Company getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Company empresa) {
        this.empresa = empresa;
    }

    public List<Comment> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comment> comentarios) {
        this.comentarios = comentarios;
    }
}
