
package alumnoyprofesor;


public class Profesor extends Persona {
     private double salario;

    public Profesor(double salario) {

        nombre = "Carlos";
        this.salario = salario;

    }

    @Override
    public String toString() {

        return "Profesor\n" +
               "Nombre: " + nombre +
               "\nSalario: $" + salario;
    
}
}
