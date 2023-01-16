package org.example;

public class EjemploMazmorras {

/*
import java.util.Scanner;
import java.util.Random;

    public class DungeonRogueLike {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            int x = 0;
            int y = 0;
            int health = 100;
            int gold = 0;
            int level = 1;
            int enemiesKilled = 0;
            boolean gameOver = false;

            System.out.println("Bienvenido al juego Dungeon RogueLike!");
            System.out.println("Estas en una mazmorra y debes encontrar la salida.");

            while (!gameOver) {
                System.out.println("Estas en la sala (" + x + ", " + y + ") del nivel " + level);
                System.out.println("Vida: " + health + "  |  Oro: " + gold + "  |  Enemigos matados: " + enemiesKilled);
                System.out.println("¿Hacia dónde quieres moverte? (n/s/e/o)");
                String direction = scanner.nextLine();

                if (direction.equals("n")) {
                    y--;
                } else if (direction.equals("s")) {
                    y++;
                } else if (direction.equals("e")) {
                    x++;
                } else if (direction.equals("o")) {
                    x--;
                } else {
                    System.out.println("Dirección no válida.");
                }

                //generar eventos aleatorios
                int event = random.nextInt(100);
                if (event < 30) {
                    //encontrar tesoro
                    int treasure = random.nextInt(50);
                    gold += treasure;
                    System.out.println("¡Has encontrado " + treasure + " piezas de oro!");
                } else if (event < 60) {
                    //encontrar enemigo
                    int damage = random.nextInt(20);
                    health -= damage;
                    System.out.println("¡Un enemigo te ataca y te hace " + damage + " puntos de daño!");
                } else if (event < 80) {
                    //encontrar cura
                    int healing = random.nextInt(30);
                    health += healing;
                    System.out.println("¡Has encontrado una poción de cura y recuperas " + healing + " puntos de vida!");
                }

                if (health <= 0) {
                    gameOver = true;
                    System.out.println("Game Over. Has sido asesinado en la mazmorra.");
                } else if (x == 4 && y == 4 && level == 10) {
                    gameOver = true;
                    System.out.println("¡Felicidades, has completado el juego y encontrado la salida de

 */
}
