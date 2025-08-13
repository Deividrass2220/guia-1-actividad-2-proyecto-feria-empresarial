package org.example;

/**
 * Clase principal para ejecutar la aplicación de la feria empresarial.
 * Aquí se hacen registros de empresas, stands, visitantes y se simula una visita.
 */
public class Main {

    public static void main(String[] args) {
        // Crear el gestor principal de la feria
        FeriaManager feria = new FeriaManager();

        // Registrar algunas empresas participantes
        feria.registrarEmpresa("Tech Innovators", "Tecnología", "contacto@techinnovators.com");
        feria.registrarEmpresa("Green Energy", "Energía", "info@greenenergy.com");

        // Registrar algunos stands disponibles en la feria
        feria.registrarStand(101, "Pabellón A", "grande");
        feria.registrarStand(102, "Pabellón B", "mediano");

        // Obtener la primera empresa y el primer stand disponible para asignarlos
        Company company1 = feria.listarEmpresas().get(0);
        Stand stand1 = feria.listarStandsDisponibles().get(0);
        // Asignar el stand a la empresa y viceversa
        stand1.asignarEmpresa(company1);
        company1.asignarStand(stand1);

        // Registrar un visitante
        feria.registrarVisitante("Ana Pérez", "123456789", "ana.perez@email.com");
        Visitor visitante1 = feria.listarVisitantes().get(0);

        // Obtener un stand para que el visitante lo visite
        Stand standVisitado = feria.listarStands().get(0);
        // Registrar la visita con comentario y calificación
        feria.registrarVisita(visitante1, standVisitado, "Muy interesante la presentación", 5);

        // Imprimir reportes para ver el estado actual de la feria
        System.out.println(feria.reporteEmpresasYStands());
        System.out.println(feria.reporteVisitantesYVisitas());
        System.out.println(feria.reportePromedioPorStand());
    }
}
