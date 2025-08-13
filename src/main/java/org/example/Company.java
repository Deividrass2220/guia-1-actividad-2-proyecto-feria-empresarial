package org.example;

/**
 * Clase que representa una empresa participante en la feria.
 */
public class Company {

    // Nombre de la empresa
    private String nombre;
    // Sector al que pertenece la empresa
    private String sector;
    // Email de contacto de la empresa
    private String emailContacto;
    // Stand asignado a la empresa; puede ser null si no tiene ninguno
    private Stand standAsignado;

    /**
     * Profe, este es el constructor que crea la empresa con sus datos básicos.
     * Al inicio la empresa no tiene un stand asignado, por eso queda en null.
     */
    public Company(String nombre, String sector, String emailContacto) {
        this.nombre = nombre;
        this.sector = sector;
        this.emailContacto = emailContacto;
        this.standAsignado = null;
    }

    /**
     * este método asigna un stand a la empresa.
     * Simplemente guarda la referencia del stand que se le pasa.
     */
    public void asignarStand(Stand stand) {
        this.standAsignado = stand;
    }

    /**
     * con este método podemos actualizar los datos de la empresa,
     * como su nombre, sector o email.
     */
    public void editarDatos(String nombre, String sector, String emailContacto) {
        this.nombre = nombre;
        this.sector = sector;
        this.emailContacto = emailContacto;
    }

    // Getters y setters para acceder o modificar los atributos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getEmailContacto() {
        return emailContacto;
    }

    public void setEmailContacto(String emailContacto) {
        this.emailContacto = emailContacto;
    }

    public Stand getStandAsignado() {
        return standAsignado;
    }

    public void setStandAsignado(Stand standAsignado) {
        this.standAsignado = standAsignado;
    }
}
