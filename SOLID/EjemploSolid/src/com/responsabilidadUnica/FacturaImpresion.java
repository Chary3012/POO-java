package com.responsabilidadUnica;

public class FacturaImpresion {
    private Factura factura;

    public FacturaImpresion(Factura factura) {
        this.factura = factura;
    }

    public void imprimir() {
        System.out.println(factura.cantidad + "x " + factura.libro.nombre + " " + factura.libro.precio + " $");
        System.out.println("Tasa de Descuento: " + factura.tasaDescuento);
        System.out.println("Tasa de Impuesto: " + factura.tasaImpuesto);
        System.out.println("Total: " + factura.total + " $");
    }
}