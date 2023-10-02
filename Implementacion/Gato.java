package Implementacion;

public class Gato extends Felino implements Animal, Mascota {
    public Gato(String colorPiel) {
        super(colorPiel);
    }

    public void modoDeComunicar() {
        System.out.println("maullar");
    }

    public void pedirNombre() {
        System.out.println("Pedir nombre de gato: ");
    }

    public void imprimerNombre() {
        System.out.println("Imprime nombre de gato: ");
    }
}
