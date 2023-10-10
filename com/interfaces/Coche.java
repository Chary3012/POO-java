package com.interfaces;
public class Coche implements Vehiculo {
    public void arrancar() {
        System.out.println("arrancando motor...");
    }
    public void detener() {
        System.out.println("deteniendo motor...");
    }
}