package com.proyecto.Npcs;

public class Alex extends NPCs{


    public static String metodo1Alex() {
        nombre="Alex Maxwell";
        profesion="Clérigo";
        int opcionDialog = (int) (Math.random() * 3 + 1);
        switch (opcionDialog) {
            case 1:
                dialogo=(" Te encuentras con un hombre joven con una túnica azul. \n" +
                        " El joven te dice: \n" +
                        " Hola, soy Alex Maxwell el clérigo de la zona, en que puedo ayudarte?\n");

            case 2:
                dialogo=(" Observas ante ti un joven. \n" +
                        " El joven, con una voz bastante aguda te comenta: \n" +
                        " Buenas viajero, soy Alex Maxwell un devoto clérigo de la zona, necesitas algo?\n");

            case 3:
                dialogo=(" Un joven clérigo aparece ante ti. \n" +
                        " El clérigo te cuenta :\n" +
                        " Buenas forastero, soy Alex Maxwell el clérigo, es raro encontrarse con alguien por aquí, precisas algo?\n");


        }
        return dialogo;
    }
    public static void metodo2Alex() {
        int opcion1Button = (int) (Math.random() * 2 + 1);
        switch (opcion1Button) {
            case 1:
                h.pj.setVida(h.curas.curarCantidad(h.pj.getVida(), h.vidaMax, (h.vidaMax * 0.2f)));
                break;
            case 2:
                h.inventary.actualizarCantidad(h.curas.getCuras100(), h.curas.getCuras100().getCantidad() + 1);
                break;
        }
        int opcion2Button = (int) (Math.random() * 2 + 1);
        switch (opcion2Button) {
            case 1:
                //le das una gran runa y te da una reliquia exclusiva que te cura un 10% de vida por turno
                break;
            case 2:
                //te da una reliquia aleatoria
                break;
        }
        int opcion3Button = (int) (Math.random() * 2 + 1);
        switch (opcion3Button) {
            case 1:
               //rezas solo y ganas 2 puntos de experiencia
                break;
            case 2:
                //rezas con él y ganas 50 de vida maxima
                break;
        }

    }
        }

