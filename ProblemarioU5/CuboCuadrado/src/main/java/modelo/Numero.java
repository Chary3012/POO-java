package modelo;

import static java.lang.Math.pow;

public class Numero {

    double valorNumero;

    public Numero(double valorNumero) {
        this.valorNumero = valorNumero;
    }

    public Numero() {
    }

    public double getValorNumero() {
        return valorNumero;
    }

    public void setValorNumero(double valorNumero) {
        this.valorNumero = valorNumero;
    }

    public double calcularCuadrado(){
        return pow(this.valorNumero, 2);
    }

    public double calcularCubo(){
        return pow(this.valorNumero, 3);
    }
}
