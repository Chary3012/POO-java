package com.segregacionInterfeces;

public interface Estacionamiento {

    void aparcarCoche(); // Reducir el recuento de puntos vacíos en 1
    void sacarCoche(); // Aumenta los espacios vacíos en 1
    void getCapacidad(); // Devuelve la capacidad del coche
    double calcularTarifa(Coche coche); // Devuelve el precio en función del número de horas.
    void hacerPago(Coche coche) throws Exception;
}
