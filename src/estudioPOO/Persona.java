package estudioPOO;

public class Persona {

    // ATRIBUTOS
    private String nombre = "";
    private int edad = 19;

    // METODOS O (COMPORTAMIENTOS?)
    public void hablar() {

        System.out.println("Hola, soy "+ nombre);
        System.out.println("Tengo "+edad+" años.");

    }

    public void setNombre(String nom){
        nombre=nom;
    }

    public String getNombre(){
        return nombre;
    }

}
