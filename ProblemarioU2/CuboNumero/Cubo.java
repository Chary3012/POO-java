package CuboNumero;

import java.lang.Math;

public class Cubo {
    private double numero;
    private double resultado;

    Cubo() {
    }

    Cubo(double numero) {
        this.numero = numero;
    }

    public void calcularCubo() {
        resultado = Math.pow(numero, 3);
        System.out.println("El cubo de " + numero + " es " + resultado);
    }

}
