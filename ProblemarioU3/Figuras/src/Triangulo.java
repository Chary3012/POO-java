import java.util.Scanner;

public class Triangulo extends Figura{

    private float base;
    private float altura;

    Scanner sc = new Scanner(System.in);

    public Triangulo() {
    }

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void pideDatos() {
        float base = sc.nextFloat();
        float altura = sc.nextFloat();

        this.base = base;
        this.altura = altura;

    }

    @Override
    public void imprimeArea() {
        float area;
        area = (base * altura) / 2;
        System.out.println(area);
    }

    @Override
    public String toString() {
        return "Figura triangulo\n" +
                "Nombre de la figura: " + nombreFigura +
                ", Base: " + base +
                ", Altura: " + altura;
    }
}
