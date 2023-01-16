package org.example;

import java.util.Scanner;

public class Historia {

    String nombrePJ;

    Scanner scr = new Scanner(System.in);
    Armas arma = new Armas();
    public void inicioJuego(){
        System.out.println("Bienvenido a DyM, introduce el nombre de tu personaje: ");
        nombrePJ=scr.next();
    }

    public void eleccionArma(){
        arma.armaComun((int)(Math.random()*6+1));
        System.out.println(arma.toString());
    }





}
