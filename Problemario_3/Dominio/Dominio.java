package Dominio;

public class Dominio {
    private String nombre;

    Dominio() {
    }

    Dominio(String nombre) {
        this.nombre = nombre;
    }

    public void resultado() {
        System.out.println("www." + nombre + ".com");
    }
}
