package salario;

public class Empleado {
    private String nombre;
    protected double salario;

    public Empleado(String n, double s) {
        this.nombre = n;
        this.salario = s;
    }

    public void aumentarSalario() {
        salario *= 1.05;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado" +
                "\nNombre:" + nombre +
                "\nSalario:" + salario;
    }

}
