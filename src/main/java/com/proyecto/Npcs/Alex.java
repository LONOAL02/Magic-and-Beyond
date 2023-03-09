package com.proyecto.Npcs;

import com.proyecto.core.FrameCombate;
import com.proyecto.inventario.Curas;

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

    public static void metodo2Alex() {
        int opcion1Button = (int) (Math.random() * 2 + 1);
        switch (opcion1Button) {
            case 1:
                FrameNPC.h.pj.setVida(FrameNPC.h.curas.curarCantidad(FrameNPC.h.pj.getVida(),FrameNPC.h.vidaMax,(FrameNPC.h.vidaMax*0.2f)));
                break;
            case 2:
                FrameNPC.h.inventary.actualizarCantidad(FrameNPC.h.curas.getCuras100(), FrameNPC.h.curas.getCuras100().getCantidad()+1);
                break;
        }
    }
}
