public class Refrigerados extends Productos{

    private String orSupAlimantaria;

    public Refrigerados(int noLote, String paisOrigen, String orSupAlimantaria) {
        super(noLote, paisOrigen);
        this.orSupAlimantaria = orSupAlimantaria;
    }

    public Refrigerados() {
    }

    public String getOrSupAlimantaria() {
        return orSupAlimantaria;
    }

    public void setOrSupAlimantaria(String orSupAlimantaria) {
        this.orSupAlimantaria = orSupAlimantaria;
    }

    @Override
    public String toString() {
        return "Refrigerado\n" +
                "Número de lote: " + noLote +
                ", País de origen: " + paisOrigen +
                ", Organización alimanteria: " + orSupAlimantaria;
    }
}
