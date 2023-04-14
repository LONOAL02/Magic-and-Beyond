package com.proyecto.features;

import com.Random.RandomLibreria;
import com.proyecto.core.FrameCombate;
import com.proyecto.core.Main;

public class Combate {


    public float recibirAtaque( float ataqueEnemy){
        if (RandomLibreria.numeroAleatorio(10,1)==1){
            return 0;
        }else if (FrameCombate.h.inventary.comprobarInventario(FrameCombate.h.reliq.cotaDeMalla)){
            return (ataqueEnemy * ((float) RandomLibreria.numeroAleatorio(20,10) / 10))-30;
        }else{
            return ataqueEnemy * ((float) RandomLibreria.numeroAleatorio(20,10) / 10);
        }
    }
    public float atacar(int apuntado, float ataquePj, float dañoArma){
        float critico = FrameCombate.h.arma.getPcritico();
        if (FrameCombate.h.inventary.comprobarInventario(FrameCombate.h.reliq.dagaEnsangrentada)){
            critico= critico + critico*0.15f;
        }
        float random = (float) Math.random();
        float probabilidadCritico = critico/500;
        if (apuntado==1){
            if (RandomLibreria.numeroAleatorio(10,1)==1){
                return 0;
            }
            else if (random<=probabilidadCritico){
               return (ataquePj/10* dañoArma * 1.5f);
            }
            else {
                return (ataquePj/10* dañoArma);
            }
        } else if (apuntado==2) {
            if (RandomLibreria.numeroAleatorio(10,1)<=3){
                return 0;
            }
            else if (random<=probabilidadCritico){
                return (ataquePj/10* dañoArma * 1.5f*1.5f);
            }
            else {
                return (ataquePj/10* dañoArma*1.5f);
            }
        }else if (apuntado==3) {
            if (RandomLibreria.numeroAleatorio(10,1)<=5){
                return 0;
            }
            else if (random<=probabilidadCritico){
                return (ataquePj/10* dañoArma * 1.5f*2);
            }
            else {
                return (ataquePj/10* dañoArma*2);
            }
        }

        return 0;
    }


}
