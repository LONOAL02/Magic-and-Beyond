package com.proyecto.personajes;

public class Enemigos extends Personajes {
    public String nombre;
    public int recompensa;
    public String imgPath;
    public int tipo;
    public static final int BASE=1;
    public static final int BOSS=2;


    public int getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(int recompensa) {
        this.recompensa = recompensa;
    }

    public Enemigos() {

    }

    public void enemigoBasico(int num) {
        switch (num) {
            case 1:
                nombre = "Soldado de Godrick";
                setAtaque(30);
                setVida(600);
                setNivel(1);
                setRecompensa(40);
                setImgPath("src/main/java/com/proyecto/imagenes/enemigos/soldadoGF.png");
                setTipo(BASE);
                break;

            case 2:
                nombre = "Murciélago Gigante";
                setAtaque(40);
                setVida(800);
                setNivel(2);
                setRecompensa(100);
                setImgPath("src/main/java/com/proyecto/imagenes/enemigos/murcielagoF.png");
                setTipo(BASE);
                break;
            case 3:
                nombre = "Guerrero Esqueleto";
                setAtaque(35);
                setVida(700);
                setNivel(2);
                setRecompensa(70);
                setImgPath("src/main/java/com/proyecto/imagenes/enemigos/esqueletoF.png");
                setTipo(BASE);
                break;

            case 4:
                nombre = "Guardia del mausoleo";
                setAtaque(30);
                setVida(650);
                setNivel(1);
                setRecompensa(50);
                setImgPath("src/main/java/com/proyecto/imagenes/enemigos/guardiaMausoleoF.png");
                setTipo(BASE);
                break;

            case 5:
                nombre = "Monje de fuego";
                setAtaque(50);
                setVida(1100);
                setNivel(3);
                setRecompensa(125);
                setImgPath("src/main/java/com/proyecto/imagenes/enemigos/monjeFuegoF.png");
                setTipo(BASE);
                break;

            case 6:
                nombre = "Campeón de los duendes";
                setAtaque(40);
                setVida(1400);
                setNivel(4);
                setRecompensa(170);
                setImgPath("src/main/java/com/proyecto/imagenes/enemigos/duendeF.png");
                setTipo(BASE);
                break;
            case 7:
                nombre = "Buhoso";
                setAtaque(45);
                setVida(1300);
                setNivel(3);
                setRecompensa(140);
                setImgPath("src/main/java/com/proyecto/imagenes/enemigos/buhosoF.png");
                setTipo(BASE);
                break;

            case 8:
                nombre = "Basilisco";
                setAtaque(60);
                setVida(900);
                setNivel(4);
                setRecompensa(180);
                setImgPath("src/main/java/com/proyecto/imagenes/enemigos/basiliscoF.png");
                setTipo(BASE);
                break;

            case 9:
                nombre = "Guerrero Golem";
                setAtaque(50);
                setVida(1600);
                setNivel(5);
                setRecompensa(230);
                setImgPath("src/main/java/com/proyecto/imagenes/enemigos/golemF.png");
                setTipo(BASE);
                break;
            case 10:
                nombre = "Troll";
                setAtaque(70);
                setVida(1400);
                setNivel(5);
                setRecompensa(250);
                setImgPath("src/main/java/com/proyecto/imagenes/enemigos/trollF.png");
                setTipo(BASE);
                break;
            case 11:
                nombre = "Hombre Lobo";
                setAtaque(80);
                setVida(1200);
                setNivel(6);
                setRecompensa(270);
                setImgPath("src/main/java/com/proyecto/imagenes/enemigos/hombreLoboF.png");
                setTipo(BASE);
                break;
            case 12:
                nombre = "Dragón Ancestral";
                setAtaque(70);
                setVida(1800);
                setNivel(6);
                setRecompensa(290);
                setImgPath("src/main/java/com/proyecto/imagenes/enemigos/dragonF.png");
                setTipo(BASE);
                break;
        }
    }
    public void enemigoBoss(int num2) {
        switch (num2) {
            case 1:
                nombre = "Godrick el Injertado";
                setAtaque(70);
                setVida(2000);
                setNivel(10);
                setRecompensa(150);
                setImgPath("src/main/java/com/proyecto/imagenes/enemigos/Godrick.png");
                setTipo(BOSS);
                break;

            case 2:
                nombre = "Rennala Reina de la Luna LLena";
                setAtaque(80);
                setVida(2200);
                setNivel(20);
                setRecompensa(250);
                setImgPath("src/main/java/com/proyecto/imagenes/enemigos/Rennala.png");
                setTipo(BOSS);
                break;
            case 3:
                nombre = "Radahn Azote de las Estrellas";
                setAtaque(100);
                setVida(3000);
                setNivel(30);
                setRecompensa(400);
                setImgPath("src/main/java/com/proyecto/imagenes/enemigos/Radahn.png");
                setTipo(BOSS);
                break;

        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
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

