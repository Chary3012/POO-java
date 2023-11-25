package modelo;

import java.io.Serializable;

public class Cliente implements Serializable {

    private int clave;
    private String nombre;
    private String apellido;
    private double lineadeCredito;

    public Cliente(int clave, String nombre, String apellido, double lineadeCredito) {
        this.clave = clave;
        this.nombre = nombre;
        this.apellido = apellido;
        this.lineadeCredito = lineadeCredito;
    }

    public Cliente() {
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getLineadeCredito() {
        return lineadeCredito;
    }

    public void setLineadeCredito(double lineadeCredito) {
        this.lineadeCredito = lineadeCredito;
    }

    @Override
    public String toString() {
        return "Clave: " + clave +
                ", Nombre: " + nombre +
                ", Apellido: " + apellido +
                ", Linea de credito: " + lineadeCredito ;
    }
}
