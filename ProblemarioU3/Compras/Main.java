package ProblemarioU4.Compras;


import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Compra> listaCompras = new ArrayList<Compra>();

        Compra compra1 = new Compra("dsf325", 22, "Octubre", 2023, 10, 11);
        Compra compra2 = new Compra("dgshyt", 30 , "Diciembre", 2023, 18, 43);
        Compra compra3 = new Compra("798ggds", 8, "Abril", 2023, 11, 11);
        listaCompras.add(compra1);
        listaCompras.add(compra2);
        listaCompras.add(compra3);

        for(int i = 0; i < listaCompras.size(); i++)
        {
            System.out.println("Compra " + (i+1));
            System.out.println(listaCompras.get(i));
            System.out.println(" ");

        }



    }
}