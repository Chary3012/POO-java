package Circulo;

import java.util.Scanner;

public class ControlCirculo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el radio del circulo: ");
        double radio = sc.nextDouble();

        Circulo c1 = new Circulo(radio);

        c1.calcularArea();
        c1.calcularPerimetro();

    }
}
