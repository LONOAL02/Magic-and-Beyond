package com.proyecto.Npcs;

import Random.RandomLibreria;

public class Damian extends NPCs{
    public static String metodo1Damian() {
        nombre="Damian Blood";
        profesion="Guerrero";
        int opcionnDialog = RandomLibreria.numeroAleatorio(3,1);
        switch (opcionnDialog) {
            case 1:
                dialogo=(" Te encuentras con un hombre adulto con una armadura. \n" +
                        " El hombre te dice: \n" +
                        " Hola, soy Damian Blood soy el encargado de patrullar la zona, en que puedo ayudarte?\n");
                break;

            case 2:
                dialogo=(" Observas ante ti un hombre. \n" +
                        " El hombre, con una voz bastante grave te comenta: \n" +
                        " Buenas viajero, soy Damian Blood, el encargado de defender la zona, necesitas algo?\n");
                break;

            case 3:
                dialogo=(" Un guerrero adulto aparece ante ti. \n" +
                        " El guerrero te cuenta :\n" +
                        " Buenas forastero, soy Damian Blood, el guerrero, no deberias andar por aquí, es peligroso, precisas algo?\n");
                break;

        }
        return dialogo;
    }
    public static String metodo2Damian(int boton, int elec) {
        switch (boton){
            case 1:
                switch (elec) {
                    case 1:
                        return "Haces un duelo contra él.";
                    case 2:
                        return "Recibir regalo.";
                }
            case 2:
                switch (elec) {
                    case 1:
                        return "Dar gran runa a cambio de 'Espiritu indomable'.";
                    case 2:
                        return "Recibe una reliquia aleatoria.";
                }
            case 3:
                switch (elec) {
                    case 1:
                        return "Entrenar solo.";
                    case 2:
                        return "Entrenas con él.";
                }
            default:
                return "Error";
        }
    }
    public static void metodo3Damian(int boton, int elec) {
        switch (boton) {
            case 1:
            switch (elec) {
                case 1:
                    // haces un duelo contra él, te hace 100 de daño pero ganas 4 puntos de experiencia.
                    if (FrameNPC.h.pj.getVida() <= 100) {
                        FrameNPC.op1Button.setEnabled(false);
                    } else {
                        FrameNPC.h.pj.setVida(FrameNPC.h.pj.getVida() - 100);
                        FrameNPC.h.pj.setXp(FrameNPC.h.pj.getXp() + 4);
                    }
                    break;
                case 2:
                    // te regala una de sus armas, un arma exclusiva.
                    int numarma =  RandomLibreria.numeroAleatorio(2,1);
                    if (numarma == 1) {
                        FrameNPC.h.inventary.agregarItem(FrameNPC.h.arma.armaComun(32));
                        FrameNPC.h.pj.numarma=32;
                    }else if (numarma == 2){
                        FrameNPC.h.inventary.agregarItem(FrameNPC.h.arma.armaComun(33));
                        FrameNPC.h.pj.numarma=33;
                    }
            }
            break;
            case 2:
            switch (elec) {
                case 1:
                    //le das una gran runa y te da una reliquia exclusiva que te da golpe doble(puedes atacar dos veces por turno)
                    if (FrameNPC.h.granRuna.getGranRuna().cantidad == 0) {
                        FrameNPC.op2Button.setEnabled(false);
                    } else {
                        FrameNPC.h.inventary.actualizarCantidad(FrameNPC.h.granRuna.getGranRuna(), FrameNPC.h.granRuna.getGranRuna().cantidad - 1);
                        FrameNPC.h.inventary.agregarItem(FrameNPC.h.reliq.espírituIndomable);
                    }
                    break;
                case 2:
                    //te da una reliquia aleatoria
                    int numReliq;
                    do {
                        numReliq =  RandomLibreria.numeroAleatorio(6,1);
                    } while (FrameNPC.h.inventary.comprobarInventario(FrameNPC.h.reliq.relNormales(numReliq)));
                    FrameNPC.h.inventary.agregarItem(FrameNPC.h.reliq.relNormales(numReliq));
                    break;
            }
            break;
            case 3:
            switch (elec) {
                case 1:
                    //entrenas solo y ganas +2 a repartir en tus estadisticas y 1 de experiencia.
                    FrameNPC.h.pj.setPuntosMejora(FrameNPC.h.pj.getPuntosMejora() + 2);
                    FrameNPC.h.pj.setXp(FrameNPC.h.pj.getXp() + 1);
                    break;
                case 2:
                    //entrenas con él y ganas +4 a repartir en tus estadisticas.
                    FrameNPC.h.pj.setPuntosMejora(FrameNPC.h.pj.getPuntosMejora() + 4);
                    break;
            }
            break;
        }
    }
}
