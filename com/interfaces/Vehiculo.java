package com.interfaces;

public interface Vehiculo {
    public String matricula = "";

    public void arrancar();

    public void detener();

    public float maxVel = 0;

    default void claxon() {
        System.out.println("Sonando claxon");
    }
}
