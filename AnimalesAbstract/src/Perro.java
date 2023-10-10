public class Perro extends Animal{

    private String color;

    Perro(String nombre){
        super(nombre);

    }

    public void habla(){
        System.out.println("Ladrar");
    }
}
