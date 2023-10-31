package com.abiertoCerrado;
import com.responsabilidadUnica.Factura;

public class FacturaPersistencia {
    Factura factura;

    public FacturaPersistencia(Factura factura) {
        this.factura = factura;
    }

    public void guardarArchivo(String nombreArchivo) {
        // Crea un archivo con el nombre dado y escribe la factura.
    }

    public void guardarEnBaseDatos() {
        // Guarda la factura en la base de datos
    }
}