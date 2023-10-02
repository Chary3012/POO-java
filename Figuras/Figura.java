package Figuras;

public abstract class Figura {

    protected double var1;
    protected double var2;
    protected double area;

    Figura(double var1, double var2) {
        this.var1 = var1;
        this.var2 = var2;
        this.area = 0;
    }

    Figura() {

    }

    public abstract void calcularArea();
    

    public double imprimirArea() {
        return area;
    }

    public double getVar1() {
        return var1;
    }

    public void setVar1(double var1) {
        this.var1 = var1;
    }

    public double getVar2() {
        return var2;
    }

    public void setVar2(double var2) {
        this.var2 = var2;
    }

    

}
