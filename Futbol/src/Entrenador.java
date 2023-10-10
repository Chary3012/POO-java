public class Entrenador extends SeleccionFut{

    private int ideFederacion;

    public Entrenador ()
    {    }

    public Entrenador(int id, String name, String apellido, int edad, int ideFederacion) {
        super(id, name, apellido, edad);
        this.ideFederacion = ideFederacion;
    }

    public Entrenador(int ideFederacion) {
        this.ideFederacion = ideFederacion;
    }

    public void entrenar(){
        System.out.println("Dirigir el entrenamiento (entrenador)");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Dirige el partido (entrenador)");
    }

    public void planificarEntrenamiento(){
        System.out.println("Planificar entrenamiento");
    }
}
