import java.sql.SQLOutput;

public class Gato extends Animal{

    private String color;

    Gato(String nombre, String color){
        super(nombre);
        this.color = color;
    }

    public void habla(){
        System.out.println("Maullido");
    }
}
