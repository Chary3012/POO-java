package com.manzanita;

import java.util.ArrayList;
import java.util.Scanner;

public class CatalogoProfesor {
    private Scanner lectura;

    public Integer SolicitarClave(){
        System.out.println("Escribe Clave del profesor. ");
        lectura = new Scanner(System.in);
        return lectura.nextInt();
    }
    public String SolicitarNombre(){
        System.out.println("Escr. Profesor ");
        lectura = new Scanner(System.in);
        return lectura.next();
    }

    public Integer SolicitarEdad(){
        System.out.println("Escr. edad ");
        lectura = new Scanner(System.in);
        return lectura.nextInt();
    }


    public String SolicitarFac() {
        System.out.println("Escr. Fac");
        lectura = new Scanner(System.in);
        return lectura.next();
    }

    public void imprimirInfoTotal(ArrayList<Profesor> profesores){

        profesores.forEach(System.out::println);
    }

    public Integer Menu(){
        lectura = new Scanner(System.in);
        System.out.println("Menú");
        System.out.println("1-Agregar Profesor ");
        System.out.println("2-Borrar Profesor ");
        System.out.println("3-Modificar Profesor");
        System.out.println("4-Desplegar lista");
        System.out.println("5-Desplegar Profesor");
        System.out.println("6-Salir");
        System.out.println("Opción: ");
        return lectura.nextInt();
    }

    public void imprimeInfoBorrado(boolean e)
    {
        if (e) {
            MsgBajaExitosa();
        }else{
            MsgNoRegistro();
        }
    }

    public void MsgBajaExitosa(){
        System.out.println("Baja exitosa");
    }
    public void MsgModificacionExitosa(){
        System.out.println("Modificación Exitosa");
    }
    public void MsgNoRegistro(){
        System.out.println("No se encuentra el elemento");
    }

    public void MsgError(Integer e,String descripcion){
        System.out.println("Error " + e);
        System.out.println(descripcion);
    }
    public void MsgError(){
        System.out.println("Error ");
    }

    public void imprimirInfoProf(Profesor obj1){
        if (obj1 != null)
            System.out.println(obj1);
        else
            MsgNoRegistro();
    }
    public void MsgGracias(){
        System.out.println("Gracias por utilizar el sistema");
    }

    public void MsgVersion(){
        System.out.println("Control Escolar ver. 0.1");
    }

    public Integer MenuModificarProf(){
        lectura = new Scanner(System.in);
        //lectura.useDelimiter("\n");
        System.out.println("Menú modificación");
        System.out.println("1-Nombre del Profesor");
        System.out.println("2-Edad del Profesor");
        System.out.println("3-facultad del Profesor");
        System.out.println("4-Salir");
        System.out.println("Opción :");
        return lectura.nextInt();
    }

    public void infoActualizacion(boolean e){
        if (e){MsgModificacionExitosa();}
        else {MsgError();}
    } ///fin del infoActulizacion
}
