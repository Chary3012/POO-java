public abstract class SeleccionFut implements IntegranteSeleccionFutbol{

    protected int id;
    protected String name;
    protected String apellido;
    protected int edad;

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
}
