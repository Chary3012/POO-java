import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Divide obj1;
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

                obj1 = new Divide(numerador, denominador);
                obj1.divi();

                double resultado = numerador / denominador;
                System.out.println("El resultado es: " + obj1.resultado);
            } catch (ArithmeticException e) {
                System.out.println("Estas pendejo pa, no puedes dividir en cero");
                System.out.println("Dos pesitos de algebra porfa");
            }catch (ExPersonzalizada e1){
                System.out.println(e1.getMessage());
            }

            finally {
                System.out.println("Gracias por usar este avanzado software");
            }

            System.out.println("Escriba '1' si desea continuar y '0' se desea terminar: ");
            bandera = temp.nextInt();
        }
    }
}