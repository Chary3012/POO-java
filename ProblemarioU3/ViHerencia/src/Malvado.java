public class Malvado extends Villano{

    private Boolean extraterrestre;

    public Malvado(int edad, String nombre, Boolean extraterrestre) {
        super(edad, nombre);
        this.extraterrestre = extraterrestre;
    }

    public Malvado(int edad, String nombre) {
        super(edad, nombre);
    }

    public Malvado() {
    }

    public Boolean getExtraterrestre() {
        return extraterrestre;
    }

    public void setExtraterrestre(Boolean extraterrestre) {
        this.extraterrestre = extraterrestre;
    }

    @Override
    public String toString() {
        return "Malvado\n" +
                "Nombre: " + nombre +
                ", Edad: " + edad +
                ", Extraterrestre: " + extraterrestre;
    }
}
