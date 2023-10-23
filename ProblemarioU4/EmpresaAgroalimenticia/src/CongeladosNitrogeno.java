public class CongeladosNitrogeno extends Congelados{

    private String medotoCongelacion;

    public CongeladosNitrogeno() {
    }

    public CongeladosNitrogeno(int noLote, String paisOrigen, double tempRecomendada, String medotoCongelacion) {
        super(noLote, paisOrigen, tempRecomendada);
        this.medotoCongelacion = medotoCongelacion;
    }

    public String getMedotoCongelacion() {
        return medotoCongelacion;
    }

    public void setMedotoCongelacion(String medotoCongelacion) {
        this.medotoCongelacion = medotoCongelacion;
    }

    @Override
    public String toString() {
        return "Congelado en nitrogeno\n" +
                "Número de lote: " + noLote +
                ", País de origen: " + paisOrigen +
                ", Método de congelación: " + medotoCongelacion +
                ", Temperatura recomendada: " + tempRecomendada + "°";
    }
}
