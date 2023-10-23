public class Congelados extends Productos{
    protected double tempRecomendada;

    public Congelados() {
    }

    public Congelados(int noLote, String paisOrigen, double tempRecomendada) {
        super(noLote, paisOrigen);
        this.tempRecomendada = tempRecomendada;
    }

    public double getTempRecomendada() {
        return tempRecomendada;
    }

    public void setTempRecomendada(double tempRecomendada) {
        this.tempRecomendada = tempRecomendada;
    }
}
