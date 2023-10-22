package com.interfaces;

public class Main {
    public static void main(String[] args) {
        Vehiculo tesla = new Coche();
        Vehiculo tata = new Camion();

        Arrancador.arrancarMotor(tesla); // arrancando motor...
        Arrancador.arrancarMotor(tata); // arrancar el motor del camión...
    }


}
