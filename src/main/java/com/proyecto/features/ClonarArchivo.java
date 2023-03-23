package com.proyecto.features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.io.*;

public class ClonarArchivo {
    public static void clonarInventario(String original, String copia) {
        try {
            // Ruta del archivo original y la copia
            String rutaArchivoOriginal = "src/main/java/com/proyecto/files/"+original;
            String rutaArchivoCopia = "src/main/java/com/proyecto/files/"+copia;

            // Crear objetos FileInputStream y FileOutputStream
            FileInputStream fis = new FileInputStream(rutaArchivoOriginal);
            FileOutputStream fos = new FileOutputStream(rutaArchivoCopia);

            // Leer y escribir el contenido del archivo
            byte[] buffer = new byte[1024];
            int length;
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }

            // Cerrar los objetos FileInputStream y FileOutputStream
            fis.close();
            fos.close();
        }catch (IOException e) {
            e.getMessage();
        }
    }
}
