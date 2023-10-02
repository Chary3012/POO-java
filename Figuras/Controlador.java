package Figuras;

import java.util.ArrayList;

public class Controlador {
    
    public static void main(String args[])
    {
        ArrayList<Figura> lista = new ArrayList<Figura>();
        lista.add(new Cuadrado(2,2));
        lista.add(new Triangulo(3, 4));

        for(int i = 0; i < lista.size(); i++)
        {
            lista.get(i).calcularArea();
            System.out.println(lista.get(i).imprimirArea());
        }

    }


}
