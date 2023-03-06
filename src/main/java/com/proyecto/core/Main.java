package com.proyecto.core;

import com.proyecto.Npcs.FrameNPC;

public class Main {

    public static void main (String[] args) {
    Historia h = new Historia();
    //h.inicioJuego();
    //new FrameNPC();
    new FrameMapa(11,11);
    /*
    FrameCombate.save(h);
    h.empezarCombate();
    h=FrameCombate.update(h);
    */
    }
}