package com.proyecto.features;

import com.proyecto.personajes.PPrincipal;

import java.io.*;

public class GuardadoObj {

    // Archivo donde se guardará el objeto
    public static String nombreArchivo = "pjObjeto.dat";

    // Guardar el objeto en el archivo
    public static void guardarObjeto (PPrincipal objeto){
        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            salida.writeObject(objeto);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Cargar el objeto desde el archivo
    public static PPrincipal cargarObjeto(){
        try (
                ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            return (PPrincipal) entrada.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void borrarObjetos() {
        try {
            FileOutputStream fos = new FileOutputStream(nombreArchivo);
            fos.write(new byte[0]);
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
