
package alumnoyprofesor;


public class Alumno extends Persona {
      private String carrera;

    public Alumno() {

        nombre = "Juan";
        carrera = "Ingeniería";

    }

    @Override
    public String toString() {

        return "Alumno\n" +
               "Nombre: " + nombre +
               "\nCarrera: " + carrera;
    
}
}
