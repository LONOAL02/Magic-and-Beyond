package com.proyecto.Npcs;

import com.proyecto.inventario.Item;

import java.util.ArrayList;
import java.util.Random;

public class Archibald extends NPCs {
    public static String metodo1Archibald() {
        nombre = "Archibald Reinhard";
        profesion = "Mercader";
        int opcionDialog = (int) (Math.random() * 3 + 1);
        switch (opcionDialog) {
            case 1:
                dialogo = (" Te encuentras con un señor mayor con una boina amarilla. \n" +
                        " El señor te dice: \n" +
                        " Hola joven, soy Archivald Reinhard, un mercader de estos lares, te interesa algo?\n");
                break;

            case 2:
                dialogo = (" Observas ante ti un señor con una curiosa vestimenta. \n" +
                        " El señor, con una voz rasgada te comenta: \n" +
                        " Buenas viajero, soy Archibald Reinhard, mercader mundialmente conocido, requieres algo?\n");
                break;

            case 3:
                dialogo = (" Un mercader mayor aparece ante ti. \n" +
                        " El mercader te cuenta :\n" +
                        " Buenas forastero, soy Archibald Reinhard, seguro que has oido hablar de mí, mis productos son de la mejor calidad, quieres comerciar algo?\n");
                break;

        }
        return dialogo;
    }
    public static String metodo2Archibald(int boton, int elec) {
        switch (boton){
            case 1:
            switch (elec) {
                case 1:
                    return "Comprar Estus mediano por 100 de oro.";
                case 2:
                    return "Comprar 'Corazón dorado' (obtén 75 de vida máxima) por 150 de oro.";
        }
            case 2:
            switch (elec) {
                case 1:
                    return "Entregar gran runa a cambio de 'Moneda antigua' (obten +20% de oro cada vez que ganas oro).";
                case 2:
                    return "Obten una reliquia aleatoria a cambio de 150 de oro.";
        }
            case 3:
            switch (elec) {
                case 1:
                return "Vende una de tus reliquias aleatoriamente por 200 de oro.";
                case 2:
                return "Vende una de tus armas aleatoriamente por 100 de oro.";
        }
            default:
                return "Error";
    }
}


    public static void metodo3Archibald(int boton, int elec) {
        ArrayList<Item> listaItems;
        Random randomN = new Random();
        switch (boton) {
            case 1:
            switch (elec) {
                case 1:
                    //comprar Estus mediano 100 de oro
                    if (FrameNPC.h.inventary.getCantidad("Monedas de oro.") < 100) {
                        FrameNPC.op1Button.setEnabled(false);
                    } else {
                        FrameNPC.h.inventary.actualizarCantidad(FrameNPC.h.oro.getOro(), FrameNPC.h.inventary.getCantidad("Monedas de oro.") - 100);
                        FrameNPC.h.inventary.actualizarCantidad(FrameNPC.h.curas.getCuras100(), FrameNPC.h.inventary.getCantidad("Estus mediano") + 1);
                    }
                    break;
                case 2:
                    //comprar una reliquia que te da 75 de vida máxima por 150 de oro.
                    if (FrameNPC.h.oro.getOro().getCantidad() < 150) {
                        FrameNPC.op2Button.setEnabled(false);
                    } else {
                        FrameNPC.h.inventary.actualizarCantidad(FrameNPC.h.oro.getOro(), FrameNPC.h.oro.getOro().getCantidad() - 150);
                        FrameNPC.h.inventary.agregarItem(FrameNPC.h.reliq.corazónDorado);
                    }
            }break;
            case 2:
            switch (elec) {
                case 1:
                    //le das una gran runa y te da una reliquia exclusiva que te da ganar +20% de oro en general.
                    if (FrameNPC.h.granRuna.getGranRuna().cantidad == 0) {
                        FrameNPC.op2Button.setEnabled(false);
                    } else {
                        FrameNPC.h.inventary.actualizarCantidad(FrameNPC.h.granRuna.getGranRuna(), FrameNPC.h.granRuna.getGranRuna().cantidad - 1);
                        FrameNPC.h.inventary.agregarItem(FrameNPC.h.reliq.monedaAntigua);
                    }
                    break;
                case 2:
                    //te vende una reliquia aleatoria por 150 de oro.
                    if (FrameNPC.h.oro.getOro().getCantidad() < 150) {
                        FrameNPC.op2Button.setEnabled(false);
                    } else {
                        FrameNPC.h.inventary.actualizarCantidad(FrameNPC.h.oro.getOro(), FrameNPC.h.oro.getOro().getCantidad() - 150);
                        int numReliq;
                        do {
                            numReliq = (int) (Math.random() * 6 + 1);
                        } while (FrameNPC.h.inventary.comprobarInventario(FrameNPC.h.reliq.RelNormales(numReliq)));
                        FrameNPC.h.inventary.agregarItem(FrameNPC.h.reliq.RelNormales(numReliq));
                    }
                    break;
            }break;
            case 3:
            switch (elec) {
                case 1:
                    //vendes una de tus reliquias aleatoriamente por 200 de oro.
                    listaItems = FrameNPC.h.inventary.getListaPorUso(Item.RELIQUIA);
                    if (listaItems.isEmpty()) {
                        FrameNPC.op3Button.setEnabled(false);
                    } else {
                        FrameNPC.h.inventary.eliminarItem(listaItems.get(randomN.nextInt(listaItems.size() - 1)));
                        FrameNPC.h.inventary.actualizarCantidad(FrameNPC.h.oro.getOro(), FrameNPC.h.oro.getOro().getCantidad() + 200);
                    }
                    break;
                case 2:
                    //vendes una de tus armas aleatoriamente por 100 de oro.
                    listaItems = FrameNPC.h.inventary.getListaPorUso(Item.ARMA);
                    if (listaItems.size() == 1) {
                        FrameNPC.op3Button.setEnabled(false);
                    } else {
                        FrameNPC.h.inventary.eliminarItem(listaItems.get(randomN.nextInt(listaItems.size() - 1)));
                        FrameNPC.h.inventary.actualizarCantidad(FrameNPC.h.oro.getOro(), FrameNPC.h.oro.getOro().getCantidad() + 100);
                    }
                    break;
            }break;
        }
    }
}
