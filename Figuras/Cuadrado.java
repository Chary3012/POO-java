package Figuras;

public class Cuadrado extends Figura {

    //hola, este es un nuevo comentario
    public Cuadrado(double var1, double var2) {
        super(var1, var2);
    }

    public void nosequehacer(){
        System.out.println("Hola");
    }

    @Override
    public void calcularArea(){
        area = var1 * var2;
    }

}
