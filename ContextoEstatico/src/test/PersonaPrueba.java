
package test;

import domain.Persona;


public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Manuel");
        //System.out.println("persona1 = " + persona1);
    
        Persona persona2 = new Persona("Dulce");
        //System.out.println("persona2 = " + persona2);
    
         imprimir(persona1);
         imprimir(persona2);
         
    }
    
    public static void imprimir(Persona persona){
        System.out.println("persona = " + persona);
    }
}
