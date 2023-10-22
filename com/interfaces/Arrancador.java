package com.interfaces;
public class Arrancador {
    // método estático, se puede llamar sin instanciar la clase
    public static void arrancarMotor(Vehiculo vehiculo) {
        vehiculo.arrancar();
    }
}

