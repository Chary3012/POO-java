package Figuras;

public class Triangulo extends Figura {


    Triangulo(double var1, double var2) {
        super(var1, var2);
       
    }

    public void calcularArea() {
        area = (var1 * var2)/2;
    }

}
