package com.proyecto.features;

public class Mapa {
    int x=0;
    int y=0;
    int piso=1;
    int bossx;
    int bossy;

    public void crearMapa(){
        bossx= (int) (Math.random()*5+3);
    }
}
