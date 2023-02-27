package org.example;

public class Main {
    public static void main (String[] args) {
    Historia h = new Historia();
    h.inicioJuego();
    h.eleccionClase();
    h.eleccionArma();
    for(int i=0;i<10;i++){
        if(h.pj.getVida()<=0){
            System.out.println("Has muerto");
            break;
        }
      h.empezarCombate();
    }
    if (h.pj.getVida()<=0){
        System.out.println("Game over");
    }else {
        System.out.println("GGs");
    }
    }
}