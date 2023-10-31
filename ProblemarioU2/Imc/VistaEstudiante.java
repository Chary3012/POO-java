package Imc;

import java.util.Scanner;

public class VistaEstudiante {

    VistaEstudiante() {
    }

    public void pesoIdeal(Estudiante estu) {
        int resultado = estu.calcularIMC();

        switch (resultado) {
            case 1:
                System.out.println("Sobrepeso");
                break;

            case 0:
                System.out.println("Peso ideal");
                break;

            case -1:
                System.out.println("Infrapeso");
                break;
        }

    }

    public void mayoria(Estudiante estu) {
        boolean mayor = estu.esMayorDeEdad(estu.getEdad());

        if (mayor == true) {
            System.out.println("Es mayor de edad");

        } else {
            System.out.println("No es mayor de edad");
        }

    }

}
