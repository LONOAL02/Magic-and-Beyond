package com.proyecto.core;

import com.proyecto.features.Combate;
import com.proyecto.features.GuardadoObj;
import com.proyecto.features.Inventario;
import com.proyecto.personajes.Enemigos;
import com.proyecto.inventario.Armas;
import com.proyecto.inventario.Curas;
import com.proyecto.personajes.PPrincipal;

import java.io.*;
import java.util.Scanner;

public class Historia {

    //Nombre del personaje principal.
    String nombrePJ;
    float vidaMax;
    //Creo los objetos de las distintas clases.
    PPrincipal pj = new PPrincipal();
    PPrincipal pjSave;
    Scanner scr = new Scanner(System.in);
    Armas arma = new Armas();
    Combate combate = new Combate();
    Enemigos enemy = new Enemigos();
    Curas curas = new Curas();
    Inventario inventary = new Inventario();

    //Inicio del juego, pide el nombre del pj.
    public void inicioJuego() {
        inventary.cargarInventario();
        if (inventary.listaItems.isEmpty()) {

            System.out.println("Introduce el nombre de tu personaje:");
            nombrePJ = scr.next();
            pj.setNombre(nombrePJ);


            //Sistema de eleccion de clases (vida, fuerza, destreza, inteligencia y fe)

            int eleccion = 0;
            System.out.println("Escoge tu clase: ");
            System.out.println("1. Heroe: " + "\n" + "Vida: 1000" + "\n" + "Fuerza: 16" + "\n" + "Destreza: 9" + "\n" + "Inteligencia: 7" + "\n" + "Fe: 8");
            System.out.println("2. Guerrero: " + "\n" + "Vida: 850" + "\n" + "Fuerza: 10" + "\n" + "Destreza: 16" + "\n" + "Inteligencia: 10" + "\n" + "Fe: 8");
            System.out.println("3. Astrólogo: " + "\n" + "Vida: 700" + "\n" + "Fuerza: 8" + "\n" + "Destreza: 12" + "\n" + "Inteligencia: 16" + "\n" + "Fe: 7");
            System.out.println("4. Profeta: " + "\n" + "Vida: 700" + "\n" + "Fuerza: 11" + "\n" + "Destreza: 10" + "\n" + "Inteligencia: 7" + "\n" + "Fe: 16");
            //Pide la eleccion de la clase a traves de un scanner.
            do {
                eleccion = scr.nextInt();
                if (eleccion == 1) {
                    pj.setVida(1000);
                    vidaMax = 1000;
                    pj.setFuerza(16);
                    pj.setDestreza(9);
                    pj.setInteligencia(7);
                    pj.setFe(8);
                }
                if (eleccion == 2) {
                    pj.setVida(850);
                    vidaMax = 850;
                    pj.setFuerza(10);
                    pj.setDestreza(16);
                    pj.setInteligencia(10);
                    pj.setFe(8);
                }
                if (eleccion == 3) {
                    pj.setVida(700);
                    vidaMax = 700;
                    pj.setFuerza(8);
                    pj.setDestreza(12);
                    pj.setInteligencia(16);
                    pj.setFe(7);
                }
                if (eleccion == 4) {
                    pj.setVida(700);
                    vidaMax = 700;
                    pj.setFuerza(11);
                    pj.setDestreza(10);
                    pj.setInteligencia(7);
                    pj.setFe(16);
                }
            } while (eleccion < 1 | eleccion > 4);
            pjSave = new PPrincipal(pj.getNombre(),pj.getVida(), pj.getAtaque(), pj.getVelAtaque(), pj.getMana(),pj.getNivel(),pj.getNumarma(),pj.getFuerza(),pj.getDestreza(),pj.getInteligencia(),pj.getFe());
            GuardadoObj.guardarObjeto(pjSave);
            eleccionArma();
            addArma();
            addCuras();
            inventary.guardarInventario();
        }else {
            pj= GuardadoObj.cargarObjeto();
            inventary.cargarInventario();
        }
    }

    public void eleccionArma() {
        //Printea 3 armas aleatorias.
        int eleccion;
        int num1 = (int) (Math.random() * 29 + 1);
        int num2 = (int) (Math.random() * 29 + 1);
        int num3 = (int) (Math.random() * 29 + 1);
        arma.armaComun(num1);
        System.out.println("Arma 1:\n" + arma.nombreArma+"\n"+arma.toString());
        arma.armaComun(num2);
        System.out.println("Arma 2:\n" + arma.nombreArma+"\n"+arma.toString());
        arma.armaComun(num3);
        System.out.println("Arma 3:\n" + arma.nombreArma+"\n"+arma.toString());
        //Escoge una.
        System.out.println("Que arma quieres (1, 2, o 3): ");
        do {
            eleccion = scr.nextInt();
            if (eleccion == 1) {
                arma.armaComun(num1);
                pj.numarma = num1;
            } else if (eleccion == 2) {
                arma.armaComun(num2);
                pj.numarma = num2;
            } else if (eleccion == 3) {
                arma.armaComun(num3);
                pj.numarma = num2;
            }
        } while (eleccion < 1 | eleccion > 3);
    }


    public void empezarCombate() {
        int enemigo= (int) (Math.random()*1+1);
        enemy.enemigoBasico(enemigo);
        new FrameCombate();
    }

    public void addCuras(){
        inventary.agregarItem(curas.curas50);
        inventary.agregarItem(curas.curas100);
        inventary.agregarItem(curas.curas200);
    }

    public void addArma(){
        inventary.agregarItem(arma.arma);
    }

    public void vaciarInventario(){
        inventary.vaciarInventario();
        inventary.guardarInventario();
    }


}