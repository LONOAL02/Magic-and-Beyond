package com.proyecto.inv;

import com.Random.RandomLibreria;

public class DmgItems {

    public Item bomba = new Item("Bomba.", "Explosivo improvisado que se lanza provocando daño incendiario.\nDaño: 100.", 1, Item.DAÑO);
    public Item fragmentoMeteorito = new Item("Fragmento de meteorito pesado.", "Se lanza sobre el suelo para emitir una onda de choque..\nDaño: 80.", 1, Item.DAÑO);
    public Item cuchilloHueso = new Item("Cuchillo de hueso.", "Cuchillo de hueso que se arroja directamente al enemigo.\nDaño: 60.", 1, Item.DAÑO);
    public Item dagaMetalica = new Item("Daga arrojadiza.", "Daga métalica forjada para penetrar hasta la más fuerte armadura.\nDaño: 95.", 1, Item.DAÑO);


    public float hacerDaño(String nombre, float daño, float vidaEnemy){
        switch (nombre){
            case ("Bomba."):
                if (vidaEnemy-100<0){
                    return 0;
                }else{
                    return vidaEnemy-100;
                }
            case ("Fragmento de meteorito pesado."):
                if (vidaEnemy-80<0){
                    return 0;
                }else{
                    return vidaEnemy-80;
                }
            case ("Cuchillo de hueso."):
                if (vidaEnemy-60<0){
                    return 0;
                }else{
                    return vidaEnemy-60;
                }
            case ("Daga arrojadiza."):
                if (vidaEnemy-95<0){
                    return 0;
                }else{
                    return vidaEnemy-95;
                }
            default:
                if (vidaEnemy-daño<0){
                    return 0;
                }else{
                    return vidaEnemy-daño;
                }

        }
    }
    public Item getDmgI(String nombre){
        switch (nombre){
            case ("Bomba."):
                return bomba;
            case ("Fragmento de meteorito pesado."):
                return fragmentoMeteorito;
            case ("Cuchillo de hueso."):
                return cuchilloHueso;
            case ("Daga arrojadiza."):
                return dagaMetalica;
            default:
                return bomba;
        }
    }

    public Item getDmgIRandom(){
        int random = RandomLibreria.numeroAleatorio(4,1);
        switch (random){
            case 1:
                return bomba;
            case 2:
                return fragmentoMeteorito;
            case 3:
                return cuchilloHueso;
            case 4:
                return dagaMetalica;
            default:
                return null;
        }
    }
}
