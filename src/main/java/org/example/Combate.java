package org.example;

public class Combate {


    public float recibirAtaque(float vidaPj, float ataqueEnemy){
        if (Math.random()*10+1==1){
            System.out.println("El enemigo fallo");
            return vidaPj;
        }else {
            return vidaPj = vidaPj - ataqueEnemy * ((float) (Math.random() * 20 + 10) / 10);
        }
    }
    public float atacar(int apuntado, float vidaEnemy, float ataquePj, float dañoArma){
        if (apuntado==1){
            if ((Math.random()*10+1)==1){
                System.out.println("Fallaste");
                return vidaEnemy;
            }else {
               return vidaEnemy=(vidaEnemy- ataquePj/10* dañoArma);
            }
        } else if (apuntado==2) {
            if (Math.random()*10+1<=3){
                System.out.println("Fallaste");
                return vidaEnemy;
            }else {
                return vidaEnemy=(vidaEnemy- ataquePj/10* dañoArma*1.5f);
            }
        }else if (apuntado==3) {
            if (Math.random()*10+1<=5){
                System.out.println("Fallaste");
                return vidaEnemy;
            }else {
                return vidaEnemy=(vidaEnemy- ataquePj/10* dañoArma*2);
            }
        }

        return vidaEnemy;
    }


}
