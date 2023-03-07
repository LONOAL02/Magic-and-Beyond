package com.proyecto.inventario;

import com.proyecto.core.FrameCombate;

public class DmgItems {

    public static Item bomba = new Item("Bomba.", "Explosivo improvisado que se lanza provocando daño incendiario.\nDaño: 100.", 1, Item.DAÑO);
    public static Item fragmentoMeteorito = new Item("Fragmento de meteorito pesado.", "Se lanza sobre el suelo para emitir una onda de choque..\nDaño: 80.", 1, Item.DAÑO);
    public static Item cuchilloHueso = new Item("Cuchillo de hueso.", "Cuchillo de hueso que se arroja directamente al enemigo.\nDaño: 60.", 1, Item.DAÑO);
    public static Item dagaMetalica = new Item("Daga arrojadiza", "Daga métalica forjada para penetrar hasta la más fuerte armadura.\nDaño: 95.", 1, Item.DAÑO);


    public static void hacerDaño(String nombre, float daño){
        switch (nombre){
            case ("Bomba."):
                if (FrameCombate.h.enemy.getVida()-100<0){
                    FrameCombate.h.enemy.setVida(0);
                }else{
                    FrameCombate.h.enemy.setVida(FrameCombate.h.enemy.getVida()-100);
                }
            case ("Fragmento de meteorito pesado."):
                if (FrameCombate.h.enemy.getVida()-80<0){
                    FrameCombate.h.enemy.setVida(0);
                }else{
                    FrameCombate.h.enemy.setVida(FrameCombate.h.enemy.getVida()-100);
                }
            case ("Cuchillo de hueso."):
                if (FrameCombate.h.enemy.getVida()-60<0){
                    FrameCombate.h.enemy.setVida(0);
                }else{
                    FrameCombate.h.enemy.setVida(FrameCombate.h.enemy.getVida()-100);
                }
            case ("Daga arrojadiza"):
                if (FrameCombate.h.enemy.getVida()-95<0){
                    FrameCombate.h.enemy.setVida(0);
                }else{
                    FrameCombate.h.enemy.setVida(FrameCombate.h.enemy.getVida()-100);
                }
            default:
                if (FrameCombate.h.enemy.getVida()-daño<0){
                    FrameCombate.h.enemy.setVida(0);
                }else{
                    FrameCombate.h.enemy.setVida(FrameCombate.h.enemy.getVida()-daño);
                }

        }
    }
}
