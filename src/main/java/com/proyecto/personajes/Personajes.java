package com.proyecto.personajes;

public class Personajes {
    public float vida;
    public float ataque;
    public float velAtaque;
    public float mana;
    public float nivel;

    public Personajes(float vida, float ataque, float velAtaque, float mana, float nivel) {
        this.vida = vida;
        this.ataque = ataque;
        this.velAtaque = velAtaque;
        this.mana = mana;
        this.nivel = nivel;
    }

    public Personajes() {
    }

    public float getVida() {
        return vida;
    }

    public void setVida(float vida) {
        this.vida = vida;
    }

    public float getAtaque() {
        return ataque;
    }

    public void setAtaque(float ataque) {
        this.ataque = ataque;
    }

    public float getVelAtaque() {
        return velAtaque;
    }

    public void setVelAtaque(float velAtaque) {
        this.velAtaque = velAtaque;
    }

    public float getMana() {
        return mana;
    }

    public void setMana(float mana) {
        this.mana = mana;
    }

    public float getNivel() {
        return nivel;
    }

    public void setNivel(float nivel) {
        this.nivel = nivel;
    }
}
