package com.segregacionInterfeces;

public class EstacionamientoGratis implements Estacionamiento {

    @Override
    public void aparcarCoche() {

    }

    @Override
    public void sacarCoche() {

    }

    @Override
    public void getCapacidad() {

    }

    @Override
    public double calcularTarifa(Coche coche) {
        return 0;
    }

    @Override
    public void hacerPago(Coche coche) throws Exception {
        throw new Exception("Estacionamiento es gratis");
    }
}