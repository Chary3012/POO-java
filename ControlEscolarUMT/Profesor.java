package com.manzanita;

public class Profesor {
    private Integer clave;
    private String nombre;
    private Integer edad;
    private String facultad;

    public Profesor() {
        this.clave =0;
        this.nombre = "NA";
        this.edad = 0;
        this.facultad = "NA";
            }

    public Profesor(Integer clave, String nombre, Integer edad, String facultad) {
        this.clave = clave;
        this.nombre = nombre;
        this.edad = edad;
        this.facultad = facultad;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "clave=" + clave +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", facultad='" + facultad + '\'' +
                '}';
    }

    public Integer getClave() {
        return clave;
    }

    public void setClave(Integer clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
}
