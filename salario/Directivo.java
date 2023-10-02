package salario;

public class Directivo extends Empleado {
    private String nombreSecretaria;

    public Directivo(String n, double s, String ns) {
        super(n, s);
        this.nombreSecretaria = ns;
    }

    public void aumentarSalario() {
        this.salario *= 1.10;
    }

    public String getNombreSecretaria() {
        return nombreSecretaria;
    }

    public void setNombreSecretaria(String nombreSecretaria) {
        this.nombreSecretaria = nombreSecretaria;
    }

    // @Override
    // public String toString() {
    // return "Directivo \nNombre:" + getNombre() + "\nSalario:" + salario +
    // "\nNombre de secretaria:" + nombreSecretaria;
    // }

}
