package Circulo;

public class Circulo {
    private double radio;
    final double pi = 3.1415;

    Circulo() {
    }

    Circulo(double radio) {
        this.radio = radio;
    }

    public void calcularArea() {
        double area = pi * radio * radio;
        System.out.println("El área es " + area);
    }

    public void calcularPerimetro() {
        double perimetro = 2 * pi * radio;
        System.out.println("El perimetro es " + perimetro);
    }
}
