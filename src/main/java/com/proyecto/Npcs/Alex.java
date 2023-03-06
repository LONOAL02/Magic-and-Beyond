package com.proyecto.Npcs;

public class Alex {
    public String nombreAl;
    public String profesionAl;
    public String dialogoAl;

    public void Metodo1Alex() {
        NPCs.setNombre("Alex");
        nombreAl = NPCs.getNombre();
        NPCs.setProfesion("Clérigo");
        profesionAl = NPCs.getProfesion();
        int opcionDialog = (int) (Math.random() * 3 + 1);
        switch (opcionDialog) {
            case 1:
                NPCs.setDialogo(" Te encuentras con un hombre joven con una túnica azul. \n" +
                        " El joven te dice: \n" +
                        " Hola, soy Alex el clérigo de la ciudad, en que puedo ayudarte? ");
                break;
            case 2:
                NPCs.setDialogo(" Observas ante ti un joven. \n" +
                        "El joven, con una voz bastante aguda te comenta: " +
                        " Buenas viajero, soy Alex un devoto clérigo de la zona, necesitas algo?");
                break;
            case 3:
                NPCs.setDialogo(" Un joven clérigo aparece ante ti. \n" +
                        "El clérigo te cuenta :\n" +
                        " Buenas forastero, soy Alex el clérigo, es raro encontrarse con alguien por aquí, precisas algo?");
                break;

        }
        dialogoAl = NPCs.getDialogo();
    }

    public void Metodo2Alex() {
        int opcion1Button = (int) (Math.random() * 2 + 1);
        switch (opcion1Button) {
            case 1:
                //te cura un 20% de vida
                break;
            case 2:
               // te da un estus mediano
                break;

        }
        int opcion2Button = (int) (Math.random() * 2 + 1);
        switch (opcion1Button) {
            case 1:
                //te cura un 20% de vida
                break;
            case 2:
                // te da un estus mediano
                break;

        }
    }

    public String getNombreAl() {
        return nombreAl;
    }
    public String getProfesionAl() {
        return profesionAl;
    }
}
