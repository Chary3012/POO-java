public class Frescos extends Productos{

    private int anioEvasado;

    public Frescos() {

    }

    public Frescos(int noLote, String paisOrigen, int anioEvasado) {
        super(noLote, paisOrigen);
        this.anioEvasado = anioEvasado;
    }

    public int getAnioEvasado() {
        return anioEvasado;
    }

    public void setAnioEvasado(int anioEvasado) {
        this.anioEvasado = anioEvasado;
    }

    @Override
    public String toString() {
        return "Fresco\n" +
                "Número de lote: " + noLote +
                ", País de origen: " + paisOrigen +
                ", Año de envasado: " + anioEvasado;
    }
}
