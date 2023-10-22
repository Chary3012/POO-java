import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner temp = new Scanner(System.in);
        int bandera = 1;
        while(bandera == 1) {
            try {
                //Lo que va a estar protegiendo

                int numerador ;
                int denominador;

                System.out.println("Escribe el númerador: ");
                numerador = temp.nextInt();

                System.out.println("Escribe el denominador: ");
                denominador = temp.nextInt();

                double resultado = numerador / denominador;
                System.out.println("El resultado es: " + resultado);
            } catch (ArithmeticException e) {
                System.out.println("Estas pendejo pa, no puedes dividir en cero");
                System.out.println("Dos pesitos de algebra porfa");
            }
            finally {
                System.out.println("Gracias por usar este avanzado software");
            }

            System.out.println("Escriba '1' si desea continuar y '0' se desea terminar: ");
            bandera = temp.nextInt();
        }
    }
}