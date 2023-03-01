package com.proyecto.personajes;

public class PPrincipal extends Personajes{

    public String nombre;
    public float numarma;
    public float fuerza;
    public float destreza;
    public float inteligencia;
    public float fe;


    public PPrincipal(float vida, float ataque, float velAtaque, float mana, float nivel, float numarma, float fuerza, float destreza, float inteligencia, float fe) {
        super(vida, ataque, velAtaque, mana, nivel);
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
