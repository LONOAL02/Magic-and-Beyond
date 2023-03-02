package com.proyecto.core;

public class Main {

    public static void main (String[] args) {
    Historia h = new Historia();
    h.inicioJuego();
    FrameCombate.save(h);
    h.empezarCombate();
    h=FrameCombate.update(h);

    }
}