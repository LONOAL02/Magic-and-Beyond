package com.proyecto.Npcs;

public class Diana extends NPCs {
    public static String metodo1Hechizera() {
        nombre = "Diana Harkness";
        profesion = "Hechizera";
        int opcionDialog = (int) (Math.random() * 3 + 1);
        switch (opcionDialog) {
            case 1:
                dialogo = (" Observas una mujer con una túnica mirando hacia el cielo.\n" +
                        " La mujer te mira y te dice: \n" +
                        " El cielo es precioso en esta época del año, por cierto soy Diana Harkness encantada de conocerte, hay algo en lo que te pueda ayudar?.\n");

            case 2:
                dialogo = (" Mientras caminas hacia delante por la zona, escuchas a una mujer hablando en un idioma que no entiendes. \n" +
                        " Te acercas y ella comenta: \n" +
                        " Viajero, parece que el destino es caprichoso y te ha hecho acabar aquí, necesitas algo para tu travesía?.\n");

            case 3:
                dialogo = (" Una mujer se aproxima a ti y coge tu mano. \n" +
                        " Ella te cuenta :\n" +
                        " Forastero, por lo que veo tu futuro está lleno de incertidumbre, deja que te ayude.\n");


        }
        return dialogo;
    }

    public static void metodo2Hechizera() {
        int opcion1ButtonD = (int) (Math.random() * 2 + 1);
        switch (opcion1ButtonD) {
            case 1:
                //te regala un hechizo aleatorio


                break;
            case 2:
                /*aumenta tu mana maximo en 20  */
        }
        int opcion2ButtonD = (int) (Math.random() * 2 + 1);
        switch (opcion2ButtonD) {
            case 1:
                //le das una gran runa y te da una reliquia exclusiva que reduce a la mitad el coste de mana de tus hechizos
                break;
            case 2:
                //te da una reliquia aleatoria
                break;
        }
        int opcion3ButtonD = (int) (Math.random() * 2 + 1);
        switch (opcion3ButtonD) {
            case 1:
                //te da un hechizo poderoso
                break;
            case 2:
                /*Te ayuda a mejorar en tu control de tu magia, aumenta +4 tu estadistica de fé o inteligencia */
                break;
        }

    }
    }
