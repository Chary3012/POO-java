public class Productos {
    protected int noLote;
    protected String paisOrigen;

    public Productos() {
    }

    public Productos(int noLote, String paisOrigen) {
        this.noLote = noLote;
        this.paisOrigen = paisOrigen;
    }

    public int getNoLote() {
        return noLote;
    }

    public void setNoLote(int noLote) {
        this.noLote = noLote;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
}
