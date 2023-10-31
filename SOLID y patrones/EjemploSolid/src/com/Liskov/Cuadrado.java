package com.Liskov;

class Cuadrado extends Rectangulo {
public Cuadrado() {}

public Cuadrado(int talla) {
        ancho = alto = talla;
        }

@Override
public void setAncho(int ancho) {
        super.setAncho(ancho);
        super.setAlto(ancho);
        }

@Override
public void setAlto(int alto) {
        super.setAlto(alto);
        super.setAncho(alto);
        }
        }