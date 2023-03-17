package com.proyecto.core;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Main {

    public static Historia h = new Historia();

    public static void main (String[] args) {
        try {
            // Cargar el archivo de música
            File file = new File("cancion.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(file);

            // Crear un objeto Clip
            Clip clip = AudioSystem.getClip();

            // Abrir el archivo de música con el objeto Clip
            clip.open(audioIn);

            // Reproducir la música
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    new FrameLobbyPrueba();
    }
}