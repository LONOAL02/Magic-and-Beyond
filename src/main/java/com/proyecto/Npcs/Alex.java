package com.proyecto.Npcs;


public class Alex extends NPCs{


    public static String metodo1Alex() {
        nombre="Alex";
        profesion="Clérigo";
        int opcionDialog = (int) (Math.random() * 3 + 1);
        switch (opcionDialog) {
            case 1:
                dialogo=(" Te encuentras con un hombre joven con una túnica azul. \n" +
                        " El joven te dice: \n" +
                        " Hola, soy Alex el clérigo de la ciudad, en que puedo ayudarte?\n");
                return dialogo;
            case 2:
                dialogo=(" Observas ante ti un joven. \n" +
                        " El joven, con una voz bastante aguda te comenta: \n" +
                        " Buenas viajero, soy Alex un devoto clérigo de la zona, necesitas algo?\n");
                return dialogo;
            case 3:
                dialogo=(" Un joven clérigo aparece ante ti. \n" +
                        " El clérigo te cuenta :\n" +
                        " Buenas forastero, soy Alex el clérigo, es raro encontrarse con alguien por aquí, precisas algo?\n");
                return dialogo;

        }
        return "error";
    }
    public static String metodo2Alex(int boton, int elec) {
        switch (boton){
            case 1:
                switch (elec) {
                    case 1:
                        return "Te cura un 20% de la vida.";
                    case 2:
                        return " Obtén un estus mediano.";
                }
            case 2:
                switch (elec) {
                    case 1:
                        return "Le das una gran runa y te da una reliquia exclusiva que te cura un 10% de vida por turno).";
                    case 2:
                        return "Te da una reliquia aleatoria.";
                }
            case 3:
                switch (elec) {
                    case 1:
                        return "Rezas solo y ganas 2 puntos de experiencia";
                    case 2:
                        return "Rezas con él y ganas 50 de vida maxima.";
                }
            default:
                return "Error";
        }
    }

    public static void metodo3Alex() {
        int opcion1Button = (int) (Math.random() * 2 + 1);
        switch (opcion1Button) {
            case 1:
                //cura un 20% de la vida
                FrameNPC.h.pj.setVida(FrameNPC.h.pj.getVida()+(FrameNPC.h.vidaMax*0.2f));
                break;
            case 2:
                //obten un estus mediano
                FrameNPC.h.inventary.actualizarCantidad(FrameNPC.h.curas.getCuras100(), FrameNPC.h.curas.getCantidad("Estus mediano")+1);
                break;
        }
        int opcion2Button = (int) (Math.random() * 2 + 1);
        switch (opcion2Button) {
            case 1:
                //le das una gran runa y te da una reliquia exclusiva que te cura un 10% de vida por turno
                if (FrameNPC.h.granRuna.getGranRuna().cantidad == 0) {
                    FrameNPC.op2Button.setEnabled(false);
                } else {
                    FrameNPC.h.inventary.actualizarCantidad(FrameNPC.h.granRuna.getGranRuna(), FrameNPC.h.granRuna.getGranRuna().cantidad - 1);
                    FrameNPC.h.inventary.agregarItem(FrameNPC.h.reliq.aguaBendita);
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
        int opcion3Button = (int) (Math.random() * 2 + 1);
        switch (opcion3Button) {
            case 1:
                //rezas solo y ganas 2 puntos de experiencia
                FrameNPC.h.pj.setXp(FrameNPC.h.pj.getXp()+2);
                break;
            case 2:
                //rezas con él y ganas 50 de vida maxima
                FrameNPC.h.vidaMax=FrameNPC.h.vidaMax+50;
                break;
        }
    }
}
