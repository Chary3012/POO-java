public abstract class Figura{
    protected String nombreFigura;

    public abstract void pideDatos();

    public abstract void imprimeArea();

    public String nombre(){
        return this.getClass().getSimpleName();
    }



}

