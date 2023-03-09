package com.proyecto.Npcs;

import com.proyecto.inventario.Item;

import java.util.ArrayList;
import java.util.Random;

public class Ladron extends NPCs{
    public static String metodo1Ladron() {
        nombre = "???";
        profesion = "???";
        int opcionDialog = (int) (Math.random() * 3 + 1);
        switch (opcionDialog) {
            case 1:
                dialogo = (" Te encuentras con un hombre enmascarado que se va acercando a ti.\n" +
                        " El intimidante hombre te dice: \n" +
                        " Ey tú, si tú, dame todo lo que tengas, no te resistas.\n");

            case 2:
                dialogo = (" Observas ante ti un amenazante hombre con una máscara blanca. \n" +
                        " El hombre, con una voz distorsionada te comenta: \n" +
                        " Viajero, si no quieres que aquí acabe tu viaje, no opongas resistencia.\n");

            case 3:
                dialogo = (" Un desconocido con un cuchillo se aproxima a ti lentamente. \n" +
                        " El desconocido te cuenta :\n" +
                        " Forastero, entrégame todo o tendrás una muerte horrible.\n");


        }
        return dialogo;
    }

    public static void metodo2Ladron() {
        ArrayList<Item> listaItems;
        Random randomN = new Random();
        int opcion1ButtonL = (int) (Math.random() * 2 + 1);
        switch (opcion1ButtonL) {
            case 1:
                //Peleas contra él y si ganas consigues una reliquia exclusiva(Puedes intentar huir con un 50% de probabilidades)

                break;
            case 2:
                /*Intentas huir del ladrón con un 50% de probabilidades si fallas
                 te comes un ataque de 100 de vida y entras en combate contra él sin ninguna recompensa */
        }
        int opcion2ButtonL = (int) (Math.random() * 2 + 1);
        switch (opcion2ButtonL) {
            case 1:
                //le das una reliquia aleatoria de tu inventario
                listaItems=FrameNPC.h.inventary.getListaPorUso(Item.RELIQUIA);
                if (listaItems.isEmpty()){
                    FrameNPC.op3Button.setEnabled(false);
                }else {
                    FrameNPC.h.inventary.eliminarItem(listaItems.get(randomN.nextInt(listaItems.size() - 1)));
                }
                break;
            case 2:
                //le das un arma aleatoria de tu inventario
                listaItems=FrameNPC.h.inventary.getListaPorUso(Item.ARMA);
                if (listaItems.size()==1){
                    FrameNPC.op3Button.setEnabled(false);
                }else {
                    FrameNPC.h.inventary.eliminarItem(listaItems.get(randomN.nextInt(listaItems.size() - 1)));
                }
                break;
        }
        int opcion3ButtonL = (int) (Math.random() * 2 + 1);
        switch (opcion3ButtonL) {
            case 1:
                //le das todos tus estus
                FrameNPC.h.inventary.actualizarCantidad(FrameNPC.h.curas.getCuras50(),0);
                FrameNPC.h.inventary.actualizarCantidad(FrameNPC.h.curas.getCuras100(),0);
                FrameNPC.h.inventary.actualizarCantidad(FrameNPC.h.curas.getCuras200(),0);
                break;
            case 2:
                //le das todo tu oro
                FrameNPC.h.inventary.actualizarCantidad(FrameNPC.h.oro.getOro(),0);
                break;
        }

    }
}
