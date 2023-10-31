package Imc;

import java.util.Scanner;

public class Ejecutable {
    public static void main(String args[]) {
        VistaEstudiante vista = new VistaEstudiante();

        Scanner sc = new Scanner(System.in);

        System.out.println("Estudiante 1");
        System.out.println("ingrese el nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Ingresa tu edad: ");
        int edad = sc.nextInt();

        System.out.println("Ingresa tu sexo: ");
        char sexo = sc.next().charAt(0);

        System.out.println("Ingresa tu peso: ");
        double peso = sc.nextDouble();

        System.out.println("Ingresa tu altura: ");
        double altura = sc.nextDouble();

        System.out.println("Ingresa tu matricula: ");
        int matricula = sc.nextInt();

        Estudiante alumno1 = new Estudiante(nombre, edad, matricula, sexo, peso, altura);

        sc.nextLine();

        System.out.println("\n \nEstudiante 2");
        System.out.println("ingrese el nombre: ");
        nombre = sc.nextLine();

        System.out.println("Ingresa tu edad: ");
        edad = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingresa tu sexo: ");
        sexo = sc.next().charAt(0);

        Estudiante alumno2 = new Estudiante(nombre, edad, sexo);

        alumno2.setAltura(1.70);
        alumno2.setPeso(75);

        System.out.println("\n\n");
        System.out.println("Alumno 1");
        vista.pesoIdeal(alumno1);
        vista.mayoria(alumno1);
        System.out.println(alumno1.toString());

        System.out.println("\nAlumno 2");
        vista.pesoIdeal(alumno2);
        vista.mayoria(alumno2);
        System.out.println(alumno2.toString());

    }
}
