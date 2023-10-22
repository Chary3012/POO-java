public abstract class SeleccionFut implements IntegranteSeleccionFutbol{

    protected int id;
    protected String name;
    protected String apellido;
    protected int edad;

    public SeleccionFut(int id, String name, String apellido, int edad) {
        this.id = id;
        this.name = name;
        this.apellido = apellido;
        this.edad = edad;
    }

    public SeleccionFut() {
    }

    public void concentrarse(){
        System.out.println("Concentrarse (clase padre)");
    }


    public void viajar() {
        System.out.println("Viajar (Clase padre)");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrenar (Clase padre)");
    }

    @Override
     public void jugarPartido(){
         System.out.println("Jugar partido (Clase padre)");
     }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
