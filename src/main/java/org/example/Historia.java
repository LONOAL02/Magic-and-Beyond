package org.example;

import java.util.Scanner;

public class Historia {

    String nombrePJ;
    PPrincipal pj = new PPrincipal();
    Scanner scr = new Scanner(System.in);
    Armas arma = new Armas();
    Combate combate = new Combate();
    Enemigos enemy = new Enemigos();
    public void inicioJuego(){
        System.out.println("Introduce el nombre de tu personaje:");
        nombrePJ=scr.next();
    }

    public void eleccionClase(){
        System.out.println("Escoge tu clase: ");
        System.out.println("1. Heroe: "+"\n"+"Vida: 1000"+"\n"+"Fuerza: 16"+"\n"+"Destreza: 9"+"\n"+"Inteligencia: 7"+"\n"+"Fe: 8");
        System.out.println("2. Guerrero: "+"\n"+"Vida: 850"+"\n"+"Fuerza: 10"+"\n"+"Destreza: 16"+"\n"+"Inteligencia: 10"+"\n"+"Fe: 8");
        System.out.println("3. Astrólogo: "+"\n"+"Vida: 700"+"\n"+"Fuerza: 8"+"\n"+"Destreza: 12"+"\n"+"Inteligencia: 16"+"\n"+"Fe: 7");
        System.out.println("4. Profeta: "+"\n"+"Vida: 700"+"\n"+"Fuerza: 11"+"\n"+"Destreza: 10"+"\n"+"Inteligencia: 7"+"\n"+"Fe: 16");
        int eleccion= scr.nextInt();
        if (eleccion==1){
            pj.setVida(1000);
            pj.setFuerza(16);
            pj.setDestreza(9);
            pj.setInteligencia(7);
            pj.setFe(8);
        }
        if (eleccion==2){
            pj.setVida(850);
            pj.setFuerza(10);
            pj.setDestreza(16);
            pj.setInteligencia(10);
            pj.setFe(8);
        }
        if (eleccion==3){
            pj.setVida(700);
            pj.setFuerza(8);
            pj.setDestreza(12);
            pj.setInteligencia(16);
            pj.setFe(7);
        }
        if (eleccion==4){
            pj.setVida(700);
            pj.setFuerza(11);
            pj.setDestreza(10);
            pj.setInteligencia(7);
            pj.setFe(16);
        }
    }

    public void eleccionArma(){
        int num1= (int) (Math.random()*29+1);
        int num2= (int) (Math.random()*29+1);
        int num3= (int) (Math.random()*29+1);
        arma.armaComun(num1);
        System.out.println("Arma 1:\n"+arma.toString());
        arma.armaComun(num2);
        System.out.println("Arma 2:\n"+arma.toString());
        arma.armaComun(num3);
        System.out.println("Arma 3:\n"+arma.toString());
        System.out.println("Que arma quieres (1, 2, o 3): ");
        int eleccion= scr.nextInt();
        if (eleccion==1){
            arma.armaComun(num1);
            pj.numarma=num1;
        } else if (eleccion==2){
            arma.armaComun(num2);
            pj.numarma=num2;
        } else if (eleccion==3){
            arma.armaComun(num3);
            pj.numarma=num2;
        }
    }
    public void empezarCombate(){
        int enemigo= (int) (Math.random()*1+1);
        enemy.enemigoBasico(enemigo);
        System.out.println("Te encuentras con un enemigo: ");
        System.out.println(enemy.toString());
        do{
            System.out.println("Que vas a hacer: "+"\n"+"1. Atacar"+"\n"+"2. Curar");
            int eleccion= scr.nextInt();
            if (eleccion==1){
                System.out.println("A donde quieres apuntar: "+"\n"+"1. Cuerpo (90% Daño x1)"+"\n"+"2. Piernas (70% Daño x2)"+"\n"+"3. Cabeza (50% Daño x3)");
                int apuntado=scr.nextInt();
                enemy.setVida(combate.atacar(apuntado,enemy.getVida(),pj.calcularAtaque(), arma.getDaño()));
            }if (enemy.getVida()<=0){
                System.out.println("Enemigo derrotado.");
                System.out.println(pj.getVida());
                break;
            }
            pj.setVida(combate.recibirAtaque(pj.getVida(),enemy.getAtaque()));
            System.out.println("Tu vida: "+pj.getVida());
            System.out.println("Vida del enemigo: "+enemy.getVida());
        }while (enemy.getVida()>0&&pj.getVida()>0);
    }





}
