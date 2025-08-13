package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Profe, esta clase es la que maneja toda la lógica principal de la feria.
 * Aquí registramos empresas, stands y visitantes, además de manejar las visitas y generar reportes.
 */
public class FeriaManager {

    // Listas para guardar las empresas, stands y visitantes registrados
    private List<Company> companies;
    private List<Stand> stands;
    private List<Visitor> visitantes;

    /**
     * Constructor que inicializa las listas vacías para manejar los datos.
     */
    public FeriaManager() {
        this.companies = new ArrayList<>();
        this.stands = new ArrayList<>();
        this.visitantes = new ArrayList<>();
    }

    // Métodos para manejar empresas

    public void registrarEmpresa(String nombre, String sector, String emailContacto) {
        Company company = new Company(nombre, sector, emailContacto);
        companies.add(company);
    }

    public void editarEmpresa(Company company, String nombre, String sector, String emailContacto) {
        company.editarDatos(nombre, sector, emailContacto);
    }

    public void eliminarEmpresa(Company company) {
        companies.remove(company);
    }

    public List<Company> listarEmpresas() {
        return new ArrayList<>(companies);
    }

    // Métodos para manejar stands

    public void registrarStand(int numero, String ubicacion, String tamaño) {
        Stand stand = new Stand(numero, ubicacion, tamaño);
        stands.add(stand);
    }

    public List<Stand> listarStands() {
        return new ArrayList<>(stands);
    }

    public List<Stand> listarStandsDisponibles() {
        List<Stand> disponibles = new ArrayList<>();
        for (Stand s : stands) {
            if (s.estaDisponible()) {
                disponibles.add(s);
            }
        }
        return disponibles;
    }

    public List<Stand> listarStandsOcupados() {
        List<Stand> ocupados = new ArrayList<>();
        for (Stand s : stands) {
            if (!s.estaDisponible()) {
                ocupados.add(s);
            }
        }
        return ocupados;
    }

    // Métodos para manejar visitantes

    public void registrarVisitante(String nombre, String identificacion, String email) {
        Visitor visitante = new Visitor(nombre, identificacion, email);
        visitantes.add(visitante);
    }

    public void editarVisitante(Visitor visitante, String nombre, String email) {
        visitante.editarDatos(nombre, email);
    }

    public void eliminarVisitante(Visitor visitante) {
        visitantes.remove(visitante);
    }

    public List<Visitor> listarVisitantes() {
        return new ArrayList<>(visitantes);
    }

    /**
     * Profe, este método registra la visita de un visitante a un stand,
     * incluyendo comentario y calificación. Se delega al método del visitante.
     */
    public void registrarVisita(Visitor visitante, Stand stand, String comentario, int calificacion) {
        visitante.registrarVisita(stand, comentario, calificacion);
    }

    // Reportes para visualizar información de la feria

    public String reporteEmpresasYStands() {
        StringBuilder sb = new StringBuilder();
        sb.append("Companies y sus stands asignados:\n");
        for (Company c : companies) {
            sb.append("- ").append(c.getNombre());
            if (c.getStandAsignado() != null) {
                sb.append(" -> Stand #").append(c.getStandAsignado().getNumero());
            } else {
                sb.append(" -> Sin stand asignado");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public String reporteVisitantesYVisitas() {
        StringBuilder sb = new StringBuilder();
        sb.append("Visitantes y sus visitas:\n");
        for (Visitor v : visitantes) {
            sb.append("- ").append(v.getNombre()).append(":\n");
            for (VisitRecord vr : v.getVisitas()) {
                sb.append("  * Stand #").append(vr.getStand().getNumero())
                  .append(", Fecha: ").append(vr.getFecha())
                  .append(", Calificación: ").append(vr.getCalificacion())
                  .append(", Comentario: ").append(vr.getComentario())
                  .append("\n");
            }
        }
        return sb.toString();
    }

    public String reportePromedioPorStand() {
        StringBuilder sb = new StringBuilder();
        sb.append("Calificación promedio por stand:\n");
        for (Stand s : stands) {
            sb.append("- Stand #").append(s.getNumero())
              .append(": ").append(String.format("%.2f", s.obtenerCalificacionPromedio()))
              .append("\n");
        }
        return sb.toString();
    }
}
