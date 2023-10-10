package com.claabstractas;

public class Circulo extends Figura{

    private double radio;
    private final double pi = 3.14159;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo(double x, double y, double radio) {
        super(x, y);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        double resultado = pi * radio * radio;
        return resultado;
    }
}
