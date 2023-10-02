package com.manzanita;

public class Main {

    public static void main(String[] args) {
	    CatalogoPrincipal vistaPrincipal = new CatalogoPrincipal();
        ControladorPrincipal sistema   = new ControladorPrincipal(vistaPrincipal);
        sistema.MenuPrincipal();
    }
}
