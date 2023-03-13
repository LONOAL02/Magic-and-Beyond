package com.proyecto.core;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Main {

    public static void main (String[] args) {
    Historia h = new Historia();
    h.inicioJuego();
    h.eleccionArma();
    //new FrameNPC();
    //new FrameMapa(11,11);
    //h.inventary.limpiarInventario();
    FrameCombate.save(h);
    h.empezarCombate();
    h=FrameCombate.update(h);

    }
}