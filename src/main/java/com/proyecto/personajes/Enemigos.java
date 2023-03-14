package com.proyecto.personajes;

public class Enemigos extends Personajes {
    public String nombre;

    public Enemigos(float vida, float ataque, float velAtaque, float mana, float nivel, String nombre) {
        super(vida, ataque, velAtaque, mana, nivel);
        this.nombre = nombre;
    }

    public Enemigos() {

    }

    public void enemigoBasico(int num) {
        switch (num) {
            case 1:
                nombre = "Soldado de Godrick";
                setAtaque(30);
                setVida(1000);
                setNivel(1);
                break;

            case 2:
                nombre = "Murciélago Gigante";
                setAtaque(40);
                setVida(800);
                setNivel(1);
                break;
            case 3:
                nombre = "Guerrero Esqueleto";
                setAtaque(35);
                setVida(700);
                setNivel(1);
                break;

            case 4:
                nombre = "Guardia del mausoleo";
                setAtaque(30);
                setVida(650);
                setNivel(1);
                break;

            case 5:
                nombre = "Monje de fuego";
                setAtaque(50);
                setVida(1100);
                setNivel(1);
                break;

            case 6:
                nombre = "Rey de los duendes";
                setAtaque(40);
                setVida(1400);
                setNivel(1);
                break;
            case 7:
                nombre = "Buhoso";
                setAtaque(45);
                setVida(1300);
                setNivel(1);
                break;

            case 8:
                nombre = "Basilisco";
                setAtaque(60);
                setVida(900);
                setNivel(1);
                break;

            case 9:
                nombre = "Guerrero Golem";
                setAtaque(50);
                setVida(1600);
                setNivel(1);
                break;
            case 10:
                nombre = "Troll";
                setAtaque(70);
                setVida(1400);
                setNivel(1);
                break;
            case 11:
                nombre = "Hombre Lobo";
                setAtaque(80);
                setVida(1200);
                setNivel(1);
                break;
            case 12:
                nombre = "Dragón Ancestral";
                setAtaque(70);
                setVida(1800);
                setNivel(1);
                break;
        }
    }
    public void enemigoBoss(int num2) {
        switch (num2) {
            case 1:
                nombre = "Godrick";
                setAtaque(70);
                setVida(2000);
                setNivel(1);
                break;

            case 2:
                nombre = "Rennala";
                setAtaque(80);
                setVida(2200);
                setNivel(1);
                break;
            case 3:
                nombre = "Radahn";
                setAtaque(100);
                setVida(3000);
                setNivel(1);
                break;
        }
    }

        @Override
        public String toString () {
            return
                    " Nombre: " + nombre + "\n" +
                            " Vida: " + getVida() + "\n" +
                            " Ataque: " + getAtaque() + "\n" +
                            " Velocidad de ataque: " + getVelAtaque() + "\n" +
                            " Nivel: " + getNivel()
                    ;
        }

}

