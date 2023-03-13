package com.proyecto.Npcs;

import java.util.Random;

public class Diana extends NPCs {
    public static String metodo1Hechizera() {
        nombre = "Diana Harkness";
        profesion = "Hechizera";
        int opcionDialog = (int) (Math.random() * 3 + 1);
        switch (opcionDialog) {
            case 1:
                dialogo = (" Observas una mujer con una túnica mirando hacia el cielo.\n" +
                        " La mujer te mira y te dice: \n" +
                        " El cielo es precioso en esta época del año, por cierto soy Diana Harkness encantada de conocerte, hay algo en lo que te pueda ayudar?.\n");

            case 2:
                dialogo = (" Mientras caminas hacia delante por la zona, escuchas a una mujer hablando en un idioma que no entiendes. \n" +
                        " Te acercas y ella comenta: \n" +
                        " Viajero, parece que el destino es caprichoso y te ha hecho acabar aquí, necesitas algo para tu travesía?.\n");

            case 3:
                dialogo = (" Una mujer se aproxima a ti y coge tu mano. \n" +
                        " Ella te cuenta :\n" +
                        " Forastero, por lo que veo tu futuro está lleno de incertidumbre, deja que te ayude.\n");


        }
        return dialogo;
    }
    public static String metodo2Hechizera(int boton, int elec) {
        switch (boton){
            case 1:
                switch (elec) {
                    case 1:
                        return "Te regala un hechizo aleatorio.";
                    case 2:
                        return " Aumenta tu mana maximo en 20.";
                }
            case 2:
                switch (elec) {
                    case 1:
                        return "Le das una gran runa y te da una reliquia exclusiva que reduce a la mitad el coste de mana de tus hechizos.";
                    case 2:
                        return "Te da una reliquia aleatoria.";
                }
            case 3:
                switch (elec) {
                    case 1:
                        return "Te da un hechizo poderoso.";
                    case 2:
                        return "Te ayuda a mejorar en tu control de tu magia, aumenta +4 tu estadística de fé o inteligencia.";
                }
            default:
                return "Error";
        }
    }

    public static void metodo3Hechizera() {
        int opcion1ButtonD = (int) (Math.random() * 2 + 1);
        switch (opcion1ButtonD) {
            case 1:
                //te regala un hechizo aleatorio
                int numHechizo= (int) (Math.random() * 4 + 1);;
                FrameNPC.h.inventary.agregarItem(FrameNPC.h.hechizos.getHechizoBase(numHechizo));
                FrameNPC.h.inventary.actualizarCantidad(FrameNPC.h.hechizos.getHechizoBase(numHechizo), 1);
                break;
            case 2:
                //aumenta tu mana maximo en 20
                FrameNPC.h.manaMax = FrameNPC.h.manaMax + 20;
                break;
        }
        int opcion2ButtonD = (int) (Math.random() * 2 + 1);
        switch (opcion2ButtonD) {
            case 1:
                //le das una gran runa y te da una reliquia exclusiva que reduce a la mitad el coste de mana de tus hechizos
                if (FrameNPC.h.granRuna.getGranRuna().cantidad==0){
                    FrameNPC.op2Button.setEnabled(false);
                }else {
                    FrameNPC.h.inventary.actualizarCantidad(FrameNPC.h.granRuna.getGranRuna(), FrameNPC.h.granRuna.getGranRuna().cantidad - 1);
                    FrameNPC.h.inventary.agregarItem(FrameNPC.h.reliq.bendicionDeLaDiosa);
                }
                break;
            case 2:
                //te da una reliquia aleatoria
                int numReliq;
                do {
                    numReliq = (int) (Math.random() * 6 + 1);
                } while (FrameNPC.h.inventary.comprobarInventario(FrameNPC.h.reliq.RelNormales(numReliq)));
                FrameNPC.h.inventary.agregarItem(FrameNPC.h.reliq.RelNormales(numReliq));
                break;
        }
        int opcion3ButtonD = (int) (Math.random() * 2 + 1);
        switch (opcion3ButtonD) {
            case 1:
                //te da un hechizo poderoso
                int numHechizo= (int) (Math.random() * 3 + 1);;
                FrameNPC.h.inventary.agregarItem(FrameNPC.h.hechizos.getHechizoPoderoso(numHechizo));
                FrameNPC.h.inventary.actualizarCantidad(FrameNPC.h.hechizos.getHechizoPoderoso(numHechizo), 1);
                break;
            case 2:
                //Te ayuda a mejorar en tu control de tu magia, aumenta +4 tu estadistica de fé o inteligencia
                Random random = new Random();
                int randomN = Math.round(random.nextFloat());
                if (randomN==0){
                    FrameNPC.h.pj.setInteligencia(FrameNPC.h.pj.getInteligencia()+4);
                }else {
                    FrameNPC.h.pj.setFe(FrameNPC.h.pj.getFe()+4);
                }
                break;
        }
    }
    }
