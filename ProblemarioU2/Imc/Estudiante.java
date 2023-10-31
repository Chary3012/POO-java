package Imc;

public class Estudiante {
    private String nombre;
    private int edad;
    private int matricula;
    private char sexo;
    private double peso;
    private double altura;

    Estudiante() {
    }

    Estudiante(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    Estudiante(String nombre, int edad, int matricula, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.matricula = matricula;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC() {
        double resultado = peso / (altura * altura);

        if (resultado > 25) {
            return 1;
        } else if (resultado >= 18 && resultado <= 25) {
            return 0;
        } else {
            return -1;
        }
    }

    public boolean esMayorDeEdad(int edad) {
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public void comprobarSexo(char sexo) {
        if (sexo != 'H' || sexo != 'M') {
            sexo = 'H';
        }

        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public String toString() {
        return "Matricula: " + matricula + "\nNombre: " + nombre + "\nEdad: " + edad + "\nSexo: " + sexo + "\nPeso: "
                + peso + "\nAltura: " + altura;
    }
}
