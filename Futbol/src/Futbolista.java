public class Futbolista extends SeleccionFut{

    private int dorsal;
    private String demarcacion;

    public Futbolista(){
        super();
    }

    public Futbolista(int id, String name, String apellido, int edad, int dorsal, String demarcacion) {
        super(id, name, apellido, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }
}
