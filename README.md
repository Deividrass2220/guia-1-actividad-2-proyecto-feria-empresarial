{\rtf1\ansi\ansicpg1252\cocoartf2818
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww30040\viewh17760\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 # Feria Empresarial - Gesti\'f3n de Empresas, Stands y Visitantes\
\
## Descripci\'f3n\
\
Este proyecto es una aplicaci\'f3n en Java que simula la gesti\'f3n de una feria empresarial.  \
Permite registrar empresas, stands y visitantes, adem\'e1s de gestionar las interacciones entre ellos, como la asignaci\'f3n de stands a empresas y el registro de visitas con comentarios y calificaciones.\
\
## Estructura del Proyecto\
\
- **Company.java**: Clase que representa una empresa participante.  \
- **Stand.java**: Clase que representa un stand en la feria.  \
- **Visitor.java**: Clase que representa un visitante.  \
- **Comment.java**: Clase que representa un comentario realizado por un visitante.  \
- **VisitRecord.java**: Clase que registra las visitas de los visitantes a los stands.  \
- **FeriaManager.java**: Clase controladora que maneja el registro, edici\'f3n y reportes de los elementos del sistema.  \
- **Main.java**: Punto de entrada de la aplicaci\'f3n para probar las funcionalidades.\
\
## M\'e9todos principales por clase\
\
### Company.java\
- `asignarStand(Stand stand)`: Asigna un stand a la empresa.  \
- `editarDatos(String nombre, String sector, String emailContacto)`: Edita los datos de la empresa.  \
- Getters y setters para todos los atributos.\
\
### Stand.java\
- `estaDisponible()`: Indica si el stand est\'e1 disponible (sin empresa asignada).  \
- `asignarEmpresa(Company empresa)`: Asigna una empresa al stand.  \
- `agregarComentario(Comment comentario)`: A\'f1ade un comentario al stand.  \
- `obtenerCalificacionPromedio()`: Calcula y retorna la calificaci\'f3n promedio basada en los comentarios.  \
- Getters y setters para todos los atributos.\
\
### Visitor.java\
- `registrarVisita(Stand stand, String comentario, int calificacion)`: Registra una visita a un stand con comentario y calificaci\'f3n.  \
- `editarDatos(String nombre, String email)`: Edita los datos del visitante.  \
- Getters y setters para todos los atributos.\
\
### Comment.java\
- Getters y setters para visitante, fecha, texto y calificaci\'f3n.\
\
### VisitRecord.java\
- Getters y setters para stand, fecha, comentario y calificaci\'f3n.\
\
### FeriaManager.java\
- M\'e9todos para registrar, editar, eliminar y listar empresas, stands y visitantes.  \
- `registrarVisita(Visitor visitante, Stand stand, String comentario, int calificacion)`: Registra una visita/interacci\'f3n.  \
- Reportes:\
  - `reporteEmpresasYStands()`: Muestra empresas y sus stands asignados.  \
  - `reporteVisitantesYVisitas()`: Muestra visitantes y sus visitas con detalles.  \
  - `reportePromedioPorStand()`: Muestra calificaciones promedio por stand.\
\
## Requisitos\
\
- Java 8 o superior  \
- IDE recomendado: IntelliJ IDEA, Eclipse o Visual Studio Code con extensi\'f3n Java  \
\
## C\'f3mo ejecutar el proyecto\
\
1. Clonar o descargar el repositorio.  \
2. Abrir el proyecto en tu IDE favorito.  \
3. Compilar las clases (el IDE usualmente lo hace autom\'e1ticamente).  \
4. Ejecutar la clase `Main.java` para ver un ejemplo de uso del sistema con empresas, stands y visitantes.  \
\
## Uso\
\
- En `Main.java` se encuentran ejemplos para:  \
  - Registrar empresas y stands.  \
  - Asignar stands a empresas.  \
  - Registrar visitantes y sus visitas a stands con comentarios y calificaciones.  \
  - Mostrar reportes de empresas, visitantes y calificaciones promedio por stand.\
\
## Mejoras futuras\
\
- Implementar manejo de fechas con clases de Java Time (`LocalDate`, `LocalDateTime`).  \
- Persistencia de datos en archivos o bases de datos.  \
- Interfaz gr\'e1fica para facilitar la interacci\'f3n con el usuario.  \
- Validaciones m\'e1s robustas y manejo de errores.  \
\
---\
\
\'a1Gracias por usar este proyecto! Si tienes dudas o sugerencias, no dudes en contactarme.\
}