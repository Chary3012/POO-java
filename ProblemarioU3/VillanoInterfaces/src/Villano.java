public class Villano {
    protected int edad;
    protected String nombre;

    public Villano(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public Villano() {
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
