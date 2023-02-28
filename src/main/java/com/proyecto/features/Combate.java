package com.proyecto.features;

public class Combate {


    public float recibirAtaque( float ataqueEnemy){
        if (Math.random()*10+1==1){
            return 0;
        }else {
            return ataqueEnemy * ((float) (Math.random() * 20 + 10) / 10);
        }
    }
    public float atacar(int apuntado, float ataquePj, float dañoArma){
        if (apuntado==1){
            if ((Math.random()*10+1)==1){
                return 0;
            }else {
               return (ataquePj/10* dañoArma);
            }
        } else if (apuntado==2) {
            if (Math.random()*10+1<=3){
                return 0;
            }else {
                return (ataquePj/10* dañoArma*1.5f);
            }
        }else if (apuntado==3) {
            if (Math.random()*10+1<=5){
                return 0;
            }else {
                return (ataquePj/10* dañoArma*2);
            }
        }

        return 0;
    }


}
