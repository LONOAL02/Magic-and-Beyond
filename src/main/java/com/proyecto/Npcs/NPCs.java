package com.proyecto.Npcs;

public class NPCs {
    private static String nombre;
    private static String profesion;
    private static String dialogo;

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        NPCs.nombre = nombre;
    }

    public static String getProfesion() {
        return profesion;
    }

    public static void setProfesion(String profesion) {
        NPCs.profesion = profesion;
    }

    public static String getDialogo() {
        return dialogo;
    }

    public static void setDialogo(String dialogo) {
        NPCs.dialogo = dialogo;
    }
}
