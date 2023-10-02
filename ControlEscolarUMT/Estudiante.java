package com.manzanita;

import java.util.ArrayList;

/**
 * esta clase corresponde a estu.
 * @version 1.0
 * @author Jose Luis
 */
public class Estudiante {
    private Integer matricula;
    private String nombre;
    private Integer edad;
    private Integer semestre;
    private String facultad;
    private Double promedio;
    private ArrayList<Asignatura> lista;

    public Estudiante() {
        this.matricula = 0;
        this.nombre = "NA";
        this.edad = 0;
        this.semestre = 0;
        this.facultad = "NA";
        this.promedio = 0.;
        lista = new ArrayList<Asignatura>();
    }

    /**
     * Constructor de la clase estudiante que recibe los sig atributods
     * @param matricula La matricula es de tipo Integer
     * @param nombre   nombre del estudiante
     * @param edad      edad del estudiante
     * @param semestre  semestre
     * @param facultad
     * @param promedio
     */
    public Estudiante(Integer matricula, String nombre, Integer edad, Integer semestre, String facultad, Double promedio) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.edad = edad;
        this.semestre = semestre;
        this.facultad = facultad;
        this.promedio = promedio;
        lista = new ArrayList<Asignatura>();
    }

    /**
     * Método para obtener el valor de la matricula del estudiate
     * @return matricula devuelve un objeto de tipo integer
     */
    public Integer getMatricula() {
        return matricula;
    }

    /**
     * Método para asignar valor a la matricula del estudiante
     * @param matricula se asigna a la matricula del estudiante de tipo Integer
     */
    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    /**
     * método para obtener el nombre
     * @return  nombre del estudiante
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * método que regresa el nombre
     * @param nombre nombre del estudiante
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "matricula=" + matricula +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", semestre=" + semestre +
                ", facultad='" + facultad + '\'' +
                ", promedio=" + promedio +
                '}';
    }
}
