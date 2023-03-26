package com.proyecto.personajes;

import java.io.Serializable;

public class PPrincipal extends Personajes implements Serializable {

    public String nombre;
    public float numarma;
    public float fuerza;
    public float destreza;
    public float inteligencia;
    public float fe;
    public int xp;
    public int puntosMejora;


    public PPrincipal(String nombre, float vida, float ataque, float velAtaque, float mana, float nivel,String clase, float numarma, float fuerza, float destreza, float inteligencia, float fe) {
        super(vida, ataque, velAtaque, mana, nivel, clase);
        this.nombre=nombre;
        this.numarma = numarma;
        this.fuerza = fuerza;
        this.destreza = destreza;
        this.inteligencia = inteligencia;
        this.fe = fe;
    }

    public PPrincipal() {

    }

    public float calcularAtaque(){
    float aux=0;
    float []ataques = new float[]{fuerza,destreza,inteligencia,fe};
    for (int i=0;i<ataques.length;i++){
        if (ataques[i]>aux){
            aux=ataques[i];
        }
    }
     return aux;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getFuerza() {
        return fuerza;
    }

    public void setFuerza(float fuerza) {
        this.fuerza = fuerza;
    }

    public float getDestreza() {
        return destreza;
    }

    public void setDestreza(float destreza) {
        this.destreza = destreza;
    }

    public float getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(float inteligencia) {
        this.inteligencia = inteligencia;
    }

    public float getFe() {
        return fe;
    }

    public void setFe(float fe) {
        this.fe = fe;
    }

    public float getNumarma() {
        return numarma;
    }

    public void setNumarma(float numarma) {
        this.numarma = numarma;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
        if (xp == getNivel()){
            this.xp=0;
            this.puntosMejora+=4;
            setNivel(getNivel()+1);
        }
    }

    public int getPuntosMejora() {
        return puntosMejora;
    }

    public void setPuntosMejora(int puntosMejora) {
        this.puntosMejora = puntosMejora;
    }

    @Override
    public String toString() {
        return
        "Fuerza: " + fuerza+"\n"+
        "Destreza: " + destreza+"\n"+
        "Inteligencia: " + inteligencia+"\n"+
        "Fe: " + fe+"\n"+
        "Nivel: " + nivel
        ;
    }
}
