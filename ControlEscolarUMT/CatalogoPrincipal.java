package com.manzanita;

import java.util.Scanner;

public class CatalogoPrincipal {
    private Scanner lectura;
    public Integer Menu(){
        lectura = new Scanner(System.in);
        System.out.println("Menú");
        System.out.println("1- Catálogo Profesor ");
        System.out.println("2- Catálogo Estudiante ");
        System.out.println("3- Catálogo Asignaturas ");
        System.out.println("4-Salir");
        System.out.println("Opción: ");
        return lectura.nextInt();
    }

    public void MsgGracias(){
        System.out.println("Gracias por utilizar el sistema");
    }

    public void MsgVersion(){
        System.out.println("Control Escolar ver. 0.1");
    }
}
