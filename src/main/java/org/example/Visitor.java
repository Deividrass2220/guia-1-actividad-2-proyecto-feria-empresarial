package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Profe, esta clase representa a un visitante de la feria.
 * Tiene nombre, identificación, email y un historial de visitas a stands.
 */
public class Visitor {

    // Nombre completo del visitante
    private String nombre;
    // Identificación del visitante (puede ser cédula, pasaporte, etc.)
    private String identificacion;
    // Email para contactar al visitante
    private String email;
    // Lista de visitas que ha realizado el visitante
    private List<VisitRecord> visitas;

    /**
     * Constructor que crea un visitante con sus datos personales.
     * Inicialmente sin visitas registradas.
     */
    public Visitor(String nombre, String identificacion, String email) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.email = email;
        this.visitas = new ArrayList<>();
    }

    /**
     * Registra una visita del visitante a un stand,
     * creando un comentario asociado y guardando la visita en el historial.
     * @param stand Stand visitado
     * @param comentarioTexto Comentario que deja el visitante
     * @param calificacion Calificación que da el visitante (1 a 5)
     */
    public void registrarVisita(Stand stand, String comentarioTexto, int calificacion) {
        Comment comentario = new Comment(this, getFechaActual(), calificacion, comentarioTexto);
        VisitRecord visita = new VisitRecord(stand, getFechaActual(), comentarioTexto, calificacion);
        // Agregar el comentario al stand
        stand.agregarComentario(comentario);
        // Guardar la visita en el historial del visitante
        this.visitas.add(visita);
    }

    /**
     * Permite actualizar el nombre y email del visitante.
     * @param nombre Nuevo nombre
     * @param email Nuevo email
     */
    public void editarDatos(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    // Getters y setters para los atributos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<VisitRecord> getVisitas() {
        return visitas;
    }

    public void setVisitas(List<VisitRecord> visitas) {
        this.visitas = visitas;
    }

    /**
     * Método privado que obtiene la fecha actual en formato ISO.
     * Por simplicidad usamos LocalDate.now(), pero se puede mejorar.
     */
    private String getFechaActual() {
        return java.time.LocalDate.now().toString();
    }
}
