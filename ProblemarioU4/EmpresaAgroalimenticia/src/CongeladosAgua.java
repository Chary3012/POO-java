public class CongeladosAgua extends Congelados{

    private double nivelSal; //sal por litro

    public CongeladosAgua() {
    }

    public CongeladosAgua(int noLote, String paisOrigen, double tempRecomendada, double nivelSal) {
        super(noLote, paisOrigen, tempRecomendada);
        this.nivelSal = nivelSal;
    }

    public double getNivelSalinidad() {
        return nivelSal;
    }

    public void setNivelSalinidad(double nivelSalinidad) {
        this.nivelSal = nivelSalinidad;
    }

    @Override
    public String toString() {
        return "Congelado en agua \n" +
                "Número de lote: " + noLote +
                ", País de origen: " + paisOrigen +
                ", Nivel de salinidad (Sal/litro): " + nivelSal + "gr" +
                ", Temperatura recomendada: " + tempRecomendada + "°";
    }
}
