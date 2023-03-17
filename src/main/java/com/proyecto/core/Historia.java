package com.proyecto.core;

import com.proyecto.features.Combate;
import com.proyecto.features.Inventario;
import com.proyecto.inventario.*;
import com.proyecto.personajes.Enemigos;
import com.proyecto.personajes.PPrincipal;

import java.util.Scanner;

public class Historia {

    //Nombre del personaje principal.
    public String nombrePJ;
    public float vidaMax;
    public float manaMax;
    //Creo los objetos de las distintas clases.
    public PPrincipal pj = new PPrincipal();
    public PPrincipal pjSave;
    public Scanner scr = new Scanner(System.in);
    public Armas arma = new Armas();
    public Combate combate = new Combate();
    public Enemigos enemy = new Enemigos();
    public Curas curas = new Curas();
    public DmgItems dmgI = new DmgItems();
    public Hechizos hechizos = new Hechizos();
    public Reliquias reliq = new Reliquias();

    public Inventario inventary = new Inventario();
    public Oro oro = new Oro();
    public GrandesRunas granRuna = new GrandesRunas();

    //Inicio del juego, pide el nombre del pj.
    public void selecClase(String eleccion) {
                if (eleccion.equals("Heroe")) {
                    pj.setNivel(1);
                    pj.setVida(1000);
                    pj.setMana(100);
                    manaMax=100;
                    vidaMax = 1000;
                    pj.setFuerza(16);
                    pj.setDestreza(9);
                    pj.setInteligencia(7);
                    pj.setFe(8);
                }
                if (eleccion.equals("Guerrero")) {
                    pj.setNivel(1);
                    pj.setVida(850);
                    pj.setMana(150);
                    manaMax=150;
                    vidaMax = 850;
                    pj.setFuerza(10);
                    pj.setDestreza(16);
                    pj.setInteligencia(10);
                    pj.setFe(8);
                }
                if (eleccion.equals("Astrólogo")) {
                    pj.setNivel(1);
                    pj.setVida(700);
                    pj.setMana(300);
                    manaMax=300;
                    vidaMax = 700;
                    pj.setFuerza(8);
                    pj.setDestreza(12);
                    pj.setInteligencia(16);
                    pj.setFe(7);
                }
                if (eleccion.equals("Profeta")) {
                    pj.setNivel(1);
                    pj.setVida(700);
                    pj.setMana(300);
                    manaMax=300;
                    vidaMax = 700;
                    pj.setFuerza(11);
                    pj.setDestreza(10);
                    pj.setInteligencia(7);
                    pj.setFe(16);
                }
    }

    public void eleccionArma(int eleccion, int num1, int num2, int num3) {

            if (eleccion == 1) {
                inventary.agregarItem(arma.armaComun(num1));
                pj.numarma = num1;
            } else if (eleccion == 2) {
                inventary.agregarItem(arma.armaComun(num2));
                pj.numarma = num2;
            } else if (eleccion == 3) {
                inventary.agregarItem(arma.armaComun(num3));
                pj.numarma = num2;
            }
    }


    public void empezarCombate(int numenemigo) {
        if (numenemigo==0) {
            int enemigo= (int) (Math.random()*12+1);
            enemy.enemigoBasico(enemigo);
        }
        else{
            enemy.enemigoBoss(numenemigo);
        }
    }

    public void addCuras(){
        inventary.agregarItem(curas.curas50);
        inventary.actualizarCantidad(curas.curas50, 3);
    }


    public void vaciarInventario(){
        inventary.vaciarInventario();
        inventary.guardarInventario();
    }


}
