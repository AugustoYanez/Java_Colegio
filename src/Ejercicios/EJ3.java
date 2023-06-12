package Ejercicios;




import Personas.Persona;

import java.util.ArrayList;


public class EJ3 {
    public static void main(String[] args) {


        Persona d = new Persona("Damian", "Bazurco", 43);
        Persona r = new Persona("Daniel", "Bazurco", 30);
        Persona x = new Persona("Nico", "Bazurco", 33);

        ArrayList<Persona> Personas = new ArrayList<Persona>();

        Personas.add(d);
        Personas.add(r);
        Personas.add(x);


        for (Persona xpersonas : Personas) {
   if ( xpersonas .getEdad() > 30){
       System.out.println(xpersonas .mostrarDatos());
   }
    }


    }
}
