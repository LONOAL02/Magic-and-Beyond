package com.proyecto.inventario;

import com.proyecto.core.FrameCombate;

public class Hechizos {

    public Item gritoGreyol = new Item("El grito de Greyol.","Produce el grito de Greyoll, Anciano de los Dragones. Inflige mucho daño a todos los enemigos que te rodean.\n Coste: 30.\n Daño base: 100.",1,Item.HECHIZO);
    public Item llamaCruel = new Item("Llama del Dios Cruel.","Invoca una bola de fuego devastadora, que explota e incendia el área circundante.\n Coste: 35.\n Daño base: 120.",1,Item.HECHIZO);
    public Item cometaAzur = new Item("Cometa azur.","Dispara un temible cometa al corazón de una oleada estelar. Con el equipo adecuado, este hechizo puede matar a los jefes directamente.\n Coste: 70.\n Daño base: 200.",1,Item.HECHIZO);
    public Item estrellasPerdicion = new Item("Estrellas de perdición.","Dispara 12 estrellas fugaces oscuras que acechan al enemigo.\n Coste: 20.\n Daño base: 80.",1,Item.HECHIZO);
    public Item estrellasElden = new Item("Estrellas de Elden.","Desencadena una lluvia de estrellas fugaces doradas que infligen daño en un área.\n Coste: 90.\n Daño base: 290.",1,Item.HECHIZO);
    public Item lluviaPrimigenia = new Item("Lluvia de estrellas primigenias.","Desencadena una lluvia de estrellas que persiste durante unos segundos.\n Coste: 55.\n Daño base: 175.",1,Item.HECHIZO);
    public Item lunaRanni = new Item("La luna oscura de Ranni.","Invocas una luna oscura y luego la arrojas a los enemigos.\n Coste: 110.\n Daño base: 300.",1,Item.HECHIZO);

    public float usarHechizo(String nombre, float vidaEnemy){
        switch (nombre){
            case ("El grito de Greyol."):
                FrameCombate.h.pj.setMana(FrameCombate.h.pj.getMana()-30);
                return FrameCombate.h.dmgI.hacerDaño(nombre,((FrameCombate.h.pj.getInteligencia()/100+1))*100,vidaEnemy);
            case ("Llama del Dios Cruel."):
                FrameCombate.h.pj.setMana(FrameCombate.h.pj.getMana()-35);
                return FrameCombate.h.dmgI.hacerDaño(nombre,((FrameCombate.h.pj.getInteligencia()/100+1))*120,vidaEnemy);
            case ("Cometa azur."):
                FrameCombate.h.pj.setMana(FrameCombate.h.pj.getMana()-70);
                return FrameCombate.h.dmgI.hacerDaño(nombre,((FrameCombate.h.pj.getInteligencia()/100+1))*200,vidaEnemy);
            case ("Estrellas de perdición."):
                FrameCombate.h.pj.setMana(FrameCombate.h.pj.getMana()-20);
                return FrameCombate.h.dmgI.hacerDaño(nombre,((FrameCombate.h.pj.getInteligencia()/100+1))*80,vidaEnemy);
            case ("Estrellas de Elden."):
                FrameCombate.h.pj.setMana(FrameCombate.h.pj.getMana()-90);
                return FrameCombate.h.dmgI.hacerDaño(nombre,((FrameCombate.h.pj.getInteligencia()/100+1))*290,vidaEnemy);
            case ("Lluvia de estrellas primigenias."):
                FrameCombate.h.pj.setMana(FrameCombate.h.pj.getMana()-55);
                return FrameCombate.h.dmgI.hacerDaño(nombre,((FrameCombate.h.pj.getInteligencia()/100+1))*175,vidaEnemy);
            case ("La luna oscura de Ranni."):
                FrameCombate.h.pj.setMana(FrameCombate.h.pj.getMana()-110);
                return FrameCombate.h.dmgI.hacerDaño(nombre,((FrameCombate.h.pj.getInteligencia()/100+1))*300,vidaEnemy);
            default:
                return vidaEnemy;
        }
    }


}
