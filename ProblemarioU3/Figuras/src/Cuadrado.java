import java.util.Scanner;

public class Cuadrado extends Figura{

    private float lado;

    Scanner sc = new Scanner(System.in);

    public Cuadrado() {
    }

    public Cuadrado(float lado) {
        this.lado = lado;
    }

    @Override
    public void pideDatos() {
        float lado = sc.nextFloat();
        this.lado = lado;
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
