package CuboNumero;

import java.util.Scanner;

public class ControlCubo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero que desea elevar al cubo: ");
        double numero = sc.nextDouble();

        Cubo n1 = new Cubo(numero);

        n1.calcularCubo();

    }
}
