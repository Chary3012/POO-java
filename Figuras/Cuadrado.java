package Figuras;

public class Cuadrado extends Figura {

    public Cuadrado(double var1, double var2) {
        super(var1, var2);
    }

    @Override
    public void calcularArea(){
        area = var1 * var2;
    }

}
