package com.proyecto.Npcs;

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

            case 2:
                dialogo = (" Observas ante ti un señor con una curiosa vestimenta. \n" +
                        " El señor, con una voz rasgada te comenta: \n" +
                        " Buenas viajero, soy Archibald Reinhard, mercader mundialmente conocido, requieres algo?\n");

            case 3:
                dialogo = (" Un mercader mayor aparece ante ti. \n" +
                        " El mercader te cuenta :\n" +
                        " Buenas forastero, soy Archibald Reinhard, seguro que has oido hablar de mí, mis productos son de la mejor calidad, quieres comerciar algo?\n");


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
                //vendes una de tus reliquias aleatoriamente   por 100 de oro.
                case 2:
                //vendes una de tus armas aleatoriamente por 200 de oro.
        }
            default:
                return "Error";
    }
}


    public static void metodo3Archibald(int elec1, int elec2, int elec3) {
        switch (elec1) {
            case 1:
                //comprar Estus mediano 100 de oro
                if (FrameNPC.h.inventary.getCantidad("Monedas de oro.")<100){
                    FrameNPC.op1Button.setEnabled(false);
                }else{
                    FrameNPC.h.inventary.actualizarCantidad(FrameNPC.h.oro.getOro(),FrameNPC.h.inventary.getCantidad("Monedas de oro.")-100);
                    FrameNPC.h.inventary.actualizarCantidad(FrameNPC.h.curas.getCuras100(),FrameNPC.h.inventary.getCantidad("Estus mediano")+1);
                }
                break;
            case 2:
                // comprar una reliquia que te da 75 de vida máxima por 150 de oro.
        }
        switch (elec2) {
            case 1:
                //le das una gran runa y te da una reliquia exclusiva que te da ganar +20% de oro en general.
                break;
            case 2:
                //te vende una reliquia aleatoria por 150 de oro.               break;
        }
        switch (elec3) {
            case 1:
                //vendes una de tus reliquias aleatoriamente   por 100 de oro.
                break;
            case 2:
                //vendes una de tus armas aleatoriamente por 200 de oro.
                break;
        }

    }

}
