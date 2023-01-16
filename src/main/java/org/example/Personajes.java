package org.example;

public class Personajes {
    int vida;
    int ataque;
    int velAtaque;
    int mana;
    int nivel;

    public Personajes(int vida, int ataque, int velAtaque, int mana, int nivel) {
        this.vida = vida;
        this.ataque = ataque;
        this.velAtaque = velAtaque;
        this.mana = mana;
        this.nivel = nivel;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getVelAtaque() {
        return velAtaque;
    }

    public void setVelAtaque(int velAtaque) {
        this.velAtaque = velAtaque;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
