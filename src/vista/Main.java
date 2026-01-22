package vista;

import estudioPOO.Empleado;
import estudioPOO.Persona;

public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona();
        persona1.setNombre("Marcos");
        persona1.hablar();

        Empleado empleado1 = new Empleado();
        empleado1.setNombre("Arturo");
        empleado1.hablar();

    }
}
