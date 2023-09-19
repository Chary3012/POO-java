package Dominio;

import java.util.Scanner;

public class ControlDominio {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de su dominio: ");
        String nombre = sc.nextLine();

        Dominio dom1 = new Dominio(nombre);

        dom1.resultado();
    }
}
