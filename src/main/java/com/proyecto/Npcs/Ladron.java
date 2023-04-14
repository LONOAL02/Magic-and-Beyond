package com.proyecto.Npcs;

import com.Random.RandomLibreria;
import com.proyecto.inv.Item;

import java.util.ArrayList;
import java.util.Random;

public class Ladron extends NPCs{
    public static String metodo1Ladron() {
        nombre = "???";
        profesion = "???";
        int opcionDialog =  RandomLibreria.numeroAleatorio(3,1);
        switch (opcionDialog) {
            case 1:
                dialogo = (" Te encuentras con un hombre enmascarado que se va acercando a ti.\n" +
                        " El intimidante hombre te dice: \n" +
                        " Ey tú, si tú, dame todo lo que tengas, no te resistas.\n");
                break;

            case 2:
                dialogo = (" Observas ante ti un amenazante hombre con una máscara blanca. \n" +
                        " El hombre, con una voz distorsionada te comenta: \n" +
                        " Viajero, si no quieres que aquí acabe tu viaje, no opongas resistencia.\n");
                break;

            case 3:
                dialogo = (" Un desconocido con un cuchillo se aproxima a ti lentamente. \n" +
                        " El desconocido te cuenta :\n" +
                        " Forastero, entrégame todo o tendrás una muerte horrible.\n");
                break;
        }
        return dialogo;
    }
    public static String metodo2Ladron(int boton, int elec) {
        switch (boton){
            case 1:
                switch (elec) {
                    case 1:
                        return "Intentar robarle.";
                    case 2:
                        return "Intentar huir.";
                }
            case 2:
                switch (elec) {
                    case 1:
                        return "Entregar reliquia aleatoria de tu inventario.";
                    case 2:
                        return "Entregar un arma aleatoria de tu inventario.";
                }
            case 3:
                switch (elec) {
                    case 1:
                        return "Entregar todos tus estus";
                    case 2:
                        return "Entregar todo tu oro.";
                }
            default:
                return "Error";
        }
        }


        public static void metodo3Ladron(int boton, int elec) {
        ArrayList<Item> listaItems;
        Random randomN = new Random();
        switch (boton) {
            case 1:
                switch (elec) {
                    case 1:
                        //Intentas robarle con un 20% de probabilidades de conseguir una reliquia exclusiva o si no te comes 300 de daño.
                        int probabilidad=RandomLibreria.numeroAleatorio(10,1);
                        if (probabilidad>2) {
                            FrameNPC.h.pj.setVida(FrameNPC.h.pj.getVida() - 300);

                        }
                        else
                            FrameNPC.h.inventary.agregarItem(FrameNPC.h.reliq.abrigoDeSombras);

                            break;
                    case 2:
                /*Intentas huir del ladrón con un 50% de probabilidades si fallas
                 te comes un ataque de 300 de vida y pierdes 200 de oro */
                        int probabilidad2=RandomLibreria.numeroAleatorio(10,1);
                        if (probabilidad2>5) {
                            break;

                        }
                        else
                        FrameNPC.h.pj.setVida(FrameNPC.h.pj.getVida()-300);
                        FrameNPC.h.inventary.actualizarCantidad(FrameNPC.h.oro.getOro(), FrameNPC.h.oro.getOro().getCantidad() - 200);
                        break;
                }
                break;
            case 2:
                switch (elec) {
                    case 1:
                        //le das una reliquia aleatoria de tu inventario
                        listaItems = FrameNPC.h.inventary.getListaPorUso(Item.RELIQUIA);
                        if (listaItems.isEmpty()) {
                            FrameNPC.op3Button.setEnabled(false);
                        } else {
                            FrameNPC.h.inventary.eliminarItem(listaItems.get(randomN.nextInt(listaItems.size() - 1)));
                        }
                        break;
                    case 2:
                        //le das un arma aleatoria de tu inventario
                        listaItems = FrameNPC.h.inventary.getListaPorUso(Item.ARMA);
                        if (listaItems.size() == 1) {
                            FrameNPC.op3Button.setEnabled(false);
                        } else {
                            FrameNPC.h.inventary.eliminarItem(listaItems.get(randomN.nextInt(listaItems.size() - 1)));
                        }
                        break;
                }
                break;
            case 3:
                switch (elec) {
                    case 1:
                        //le das todos tus estus
                        FrameNPC.h.inventary.actualizarCantidad(FrameNPC.h.curas.getCuras50(), 0);
                        FrameNPC.h.inventary.actualizarCantidad(FrameNPC.h.curas.getCuras100(), 0);
                        FrameNPC.h.inventary.actualizarCantidad(FrameNPC.h.curas.getCuras200(), 0);
                        break;
                    case 2:
                        //le das todo tu oro
                        FrameNPC.h.inventary.actualizarCantidad(FrameNPC.h.oro.getOro(), 0);
                        break;
                }
                break;
        }
    }
}
