Feria Empresarial - Gestión de Empresas, Stands y Visitantes

Descripción

Este proyecto es una aplicación en Java que simula la gestión de una feria empresarial.
Permite registrar empresas, stands y visitantes, además de gestionar las interacciones entre ellos, como la asignación de stands a empresas y el registro de visitas con comentarios y calificaciones.

Estructura del Proyecto

Company.java: Clase que representa una empresa participante.

Stand.java: Clase que representa un stand en la feria.

Visitor.java: Clase que representa un visitante.

Comment.java: Clase que representa un comentario realizado por un visitante.

VisitRecord.java: Clase que registra las visitas de los visitantes a los stands.

FeriaManager.java: Clase controladora que maneja el registro, edición y reportes del sistema.

Main.java: Punto de entrada para probar las funcionalidades del sistema.

Métodos principales por clase

Company.java

asignarStand(Stand stand): Asigna un stand a la empresa.

editarDatos(String nombre, String sector, String emailContacto): Edita los datos de la empresa.

Getters y setters para todos los atributos.

Stand.java

estaDisponible(): Indica si el stand está disponible (sin empresa asignada).

asignarEmpresa(Company empresa): Asigna una empresa al stand.

agregarComentario(Comment comentario): Añade un comentario al stand.

obtenerCalificacionPromedio(): Calcula y retorna la calificación promedio basada en los comentarios.

Getters y setters para todos los atributos.

Visitor.java

registrarVisita(Stand stand, String comentario, int calificacion): Registra una visita a un stand con comentario y calificación.

editarDatos(String nombre, String email): Edita los datos del visitante.

Getters y setters para todos los atributos.

Comment.java

Getters y setters para visitante, fecha, texto y calificación.

VisitRecord.java

Getters y setters para stand, fecha, comentario y calificación.

FeriaManager.java

Métodos para registrar, editar, eliminar y listar empresas, stands y visitantes.

registrarVisita(Visitor visitante, Stand stand, String comentario, int calificacion): Registra una visita/interacción.

Reportes:

reporteEmpresasYStands(): Muestra empresas y sus stands asignados.

reporteVisitantesYVisitas(): Muestra visitantes y sus visitas con detalles.

reportePromedioPorStand(): Muestra calificaciones promedio por stand.

Requisitos

Java 8 o superior.

IDE recomendado: IntelliJ IDEA, Eclipse o Visual Studio Code con extensión Java.

Cómo ejecutar el proyecto

Clonar o descargar el repositorio.

Abrir el proyecto en tu IDE favorito.

Compilar las clases (el IDE usualmente lo hace automáticamente).

Ejecutar la clase Main.java para ver un ejemplo de uso del sistema con empresas, stands y visitantes.

Uso

En Main.java se encuentran ejemplos para:

Registrar empresas y stands.

Asignar stands a empresas.

Registrar visitantes y sus visitas a stands con comentarios y calificaciones.

Mostrar reportes de empresas, visitantes y calificaciones promedio por stand.

Mejoras futuras

Implementar manejo avanzado de fechas con clases de Java Time (LocalDate, LocalDateTime).

Persistencia de datos en archivos o bases de datos.

Interfaz gráfica para facilitar la interacción con el usuario.

Validaciones más robustas y manejo de errores.

¡Gracias por usar este proyecto!
Si tienes dudas o sugerencias, no dudes en contactarme.