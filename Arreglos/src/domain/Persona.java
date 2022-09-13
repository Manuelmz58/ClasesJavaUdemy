
package domain;


public class Persona {

    public static String[] personas;
    private String nombre;
    
    public Persona(String Nombre) {
        this.nombre = Nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + '}' + ", " + super.toString() ;
    }

    
    
}
