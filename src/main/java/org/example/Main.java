package org.example;

public class Main {
    public static void main (String[] args) {
    Historia h = new Historia();
    h.inicioJuego();
    h.eleccionClase();
    h.eleccionArma();
    FramePrincipal.save(h);
    h.empezarCombate();
    FramePrincipal.update(h);

    }
}