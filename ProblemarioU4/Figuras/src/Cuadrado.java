import java.util.Scanner;

public class Cuadrado extends Figura{

    private float lado;

    Scanner sc = new Scanner(System.in);

    public Cuadrado() {
    }

    public Cuadrado(float lado) {
        this.lado = lado;
    }

    public void validarLado(float lado) throws ExeptionFigura{
        if(!(lado > 5)){
            throw new ExeptionFigura("El lado tiene que ser mayor a 5");
        }
    }

    @Override
    public void pideDatos() {
        while(true){
            try {
                System.out.println("Ingresa el lado: ");
                float lado = sc.nextFloat();
                validarLado(lado);
                this.lado = lado;
                break;
            }catch (ExeptionFigura e){
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public void imprimeArea() {
        float area;
        area = lado * lado;
        System.out.println(area);
    }

    @Override
    public String toString() {
        return "Figura cuadrado\n" +
                "Nombre de la figura: " + nombreFigura +
                ", Lado: " + lado;
    }
}
