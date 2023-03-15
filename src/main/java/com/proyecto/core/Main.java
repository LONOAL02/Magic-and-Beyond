package com.proyecto.core;

public class Main {

    public static Historia h = new Historia();

    public static void main (String[] args) {
    //new FrameNPC();
    h.inicioJuego();
    h.eleccionArma();
    new FrameMapa(11,11);
    FrameCombate.save(h);
    h.empezarCombate();
    h=FrameCombate.update(h);
    }
}