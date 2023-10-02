package com.manzanita;

public class Asignatura {
    private Integer clave;
    private String nombre;
    private Integer semestre;
    private Integer creditos;
    private String facultad;

    public Asignatura() {
        this.clave  = 0;
        this.nombre = "NA";
        this.semestre =0;
        this.creditos =0;
        this.facultad = "NA";
    }

    public Asignatura(Integer clave, String nombre, Integer semestre, Integer creditos, String facultad) {
        this.clave = clave;
        this.nombre = nombre;
        this.semestre = semestre;
        this.creditos = creditos;
        this.facultad = facultad;
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

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    public Integer getCreditos() {
        return creditos;
    }

    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "clave=" + clave +
                ", nombre='" + nombre + '\'' +
                ", semestre=" + semestre +
                ", creditos=" + creditos +
                ", facultad='" + facultad + '\'' +
                '}';
    }
}
