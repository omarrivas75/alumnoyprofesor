package alumnoyprofesor;

public class Persona {
    protected String nombre;

    public Persona() {
        nombre = "Sin nombre";
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre;
    
}
}
