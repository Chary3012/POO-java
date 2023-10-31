package com.Liskov;

class Test {

    static void getAreaTest(Rectangulo r) {
        int ancho = r.getAncho();
        r.setAlto(10);
        System.out.println("Area esperada de " + (ancho * 10) + ", tiene " + r.getArea());
    }

    public static void main(String[] args) {
        Rectangulo rc = new Rectangulo(2, 3);
        getAreaTest(rc);

        Rectangulo sq = new Cuadrado();
        sq.setAncho(5);
        getAreaTest(sq);
    }
}
