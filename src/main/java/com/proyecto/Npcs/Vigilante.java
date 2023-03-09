package com.proyecto.Npcs;

public class Vigilante extends NPCs{
    public static String metodo1Vigilante() {
        nombre = "???";
        profesion = "???";
        int opcionDialog = (int) (Math.random() * 3 + 1);
        switch (opcionDialog) {
            case 1:
                dialogo = (" Observas un hombre enmascarado vestido de negro en la cornisa de un edificio .\n" +
                        " El enmascarado se da cuenta de tu presencia, baja y te dice con una voz distorsionada: \n" +
                        " Pareces una persona de bien, esta zona no está hecha para gente como tú, vuelve por donde has venido.\n");

            case 2:
                dialogo = (" Mientras caminas hacia delante por la zona, ves un rastro de cadáveres que llevan hacia un enmascarado. \n" +
                        " El hombre, al detectar tu presencia se gira rápidamente y comenta: \n" +
                        " Viajero, esto no es seguro, márchate si no quieres que un monstruo te devore.\n");

            case 3:
                dialogo = (" Un desconocido lleno de sangre se aproxima a ti lentamente. \n" +
                        " El desconocido se sacude su ropa y te cuenta :\n" +
                        " Forastero, este lugar es un caos, no deberías de estar aquí, a menos que quieres ayudar, si es así armate de valor y continua.\n");


        }
        return dialogo;
    }

    public static void metodo2Vigilante() {
        int opcion1ButtonV = (int) (Math.random() * 2 + 1);
        switch (opcion1ButtonV) {
            case 1:
                //te regala una de sus armas, un arma exclusiva

                break;
            case 2:
                //te da un hechizo, Ataúd negro: Cargas un poderoso rayo de la noche que hace un daño masivo a un solo enemigo

        }
        int opcion2ButtonV = (int) (Math.random() * 2 + 1);
        switch (opcion2ButtonV) {
            case 1:
                //le das una gran runa y te da una reliquia exclusiva que aumenta un 15% tu probabilidad de golpe crítico

                break;
            case 2:
                //te da una reliquia aleatoria

                break;
        }
        int opcion3ButtonV = (int) (Math.random() * 2 + 1);
        switch (opcion3ButtonV) {
            case 1:
                //entrenas con él y ganas 3 puntos de destreza
                FrameNPC.h.pj.setDestreza(FrameNPC.h.pj.getDestreza()+3);
                break;
            case 2:
                //Haces un duelo contra él y ganas 3 de experiencia y pierdes 75 de vida
                if (FrameNPC.h.pj.getVida()<=75){
                    FrameNPC.op3Button.setEnabled(false);
                }else {
                    FrameNPC.h.pj.setXp(FrameNPC.h.pj.getXp()+3);
                    FrameNPC.h.pj.setVida(FrameNPC.h.pj.getVida()-75);
                }
                break;
        }

    }
}
