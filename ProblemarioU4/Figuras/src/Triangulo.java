import java.util.Scanner;

public class Triangulo extends Figura {

    private float base;
    private float altura;

    Scanner sc = new Scanner(System.in);

    public Triangulo() {
    }

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public void validarAltura(float base, float altura) throws ExeptionFigura{
        if(!(altura >= base)){
            throw new ExeptionFigura("La altura tiene que ser mayor o igual a la base");
        }

    }

    @Override
    public void pideDatos() {

        while(true){
            try {
                System.out.println("Ingresa la base: ");
                float base = sc.nextFloat();
                System.out.println("Ingresa la altura: ");
                float altura = sc.nextFloat();
                validarAltura(base, altura);
                this.base = base;
                this.altura = altura;
                break;
            } catch (ExeptionFigura e) {
                System.out.println(e.getMessage());
            }
        }
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
