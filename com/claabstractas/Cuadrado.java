package com.claabstractas;

public class Cuadrado implements Figura{

    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }



    @Override
    public double calcularArea() {
        double resultado = lado * lado;
        return resultado;
    }
}
