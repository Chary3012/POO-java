public class Factura {

    Libro libro;
    int cantidad;
    double tasaDescuento;
    double tasaImpuesto;
    double total;

    public Factura(Libro libro, int cantidad, double tasaDescuento, double tasaImpuesto) {
        this.libro = libro;
        this.cantidad = cantidad;
        this.tasaDescuento = tasaDescuento;
        this.tasaImpuesto = tasaImpuesto;
        this.total = this.calculaTotal();
    }

    public double calculaTotal() {
        double precio = ((libro.precio - libro.precio * tasaDescuento) * this.cantidad);

        double precioConImpuestos = precio * (1 + tasaImpuesto);

        return precioConImpuestos;
    }

    public void imprimeFactura() {
        System.out.println(cantidad + "x " + libro.nombre + " " +          libro.precio + "$");
        System.out.println("Tasa de Descuento: " + tasaDescuento);
        System.out.println("Tasa de Impuesto: " + tasaImpuesto);
        System.out.println("Total: " + total);
    }

    public void guardarArchivo (String nombreArchivo) {
        // Crea un archivo con el nombre dado y escribe la factura.
    }

}