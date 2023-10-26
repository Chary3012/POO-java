public class Villano {
    protected int edad;
    protected String nombre;

    public Villano(int edad, String nombre){
        this.edad = edad;
        this.nombre = nombre;
    }

    public Villano() {
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Villano\n" +
                "Edad: " + edad +
                ", Nombre: " + nombre;
    }
}
