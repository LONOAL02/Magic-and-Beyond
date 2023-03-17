package com.proyecto.inventario;

import com.proyecto.core.FrameCombate;

public class Armas {

    public String nombreArma;
    //Escalado de las armas
    public float escaladof;
    public float escaladod;
    public float escaladofe;
    public float escaladoint;
    public final float S = 2f;
    public final float A = 1.75f;
    public final float B = 1.50f;
    public final float C = 1.25f;
    public final float D = 1f;

    //Stats base de las armas
    public float daño;
    public float ergonomía;
    public float pcritico;
    public String calidad;


    public Armas() {
    }

    public Armas(String nombreArma, float escaladof, float escaladod, float escaladofe, float escaladoint, int daño, int ergonomía, int pcritico, String calidad) {
        this.nombreArma = nombreArma;
        this.escaladof = escaladof;
        this.escaladod = escaladod;
        this.escaladofe = escaladofe;
        this.escaladoint = escaladoint;
        this.daño = daño;
        this.ergonomía = ergonomía;
        this.pcritico = pcritico;
        this.calidad = calidad;
    }

    public Item armaComun(int num){
        int narma=num;

        switch (narma){
            case 1:
                nombreArma="Alabarda";
                calidad="Común";
                daño=125;
                escaladof= B;
                escaladod= B;
                escaladofe= D;
                escaladoint= D;
                ergonomía=8;
                pcritico=100;
                break;
            case 2:
                nombreArma="Arco Largo";
                calidad="Común";
                daño=80;
                escaladof= C;
                escaladod= B;
                escaladofe= D;
                escaladoint= D;
                ergonomía=4;
                pcritico=100;
                break;
            case 3:
                nombreArma="Bastón Albináurico";
                calidad="Común";
                daño=200;
                escaladof= C;
                escaladod= D;
                escaladofe= D;
                escaladoint= B;
                ergonomía=3;
                pcritico=100;
                break;
            case 4:
                nombreArma="Daga";
                calidad="Común";
                daño=75;
                escaladof= C;
                escaladod= B;
                escaladofe= D;
                escaladoint= D;
                ergonomía=2;
                pcritico=130;
                break;
            case 5:
                nombreArma="Antorcha de Acero";
                calidad="Común";
                daño=109;
                escaladof= C;
                escaladod= B;
                escaladofe= D;
                escaladoint= D;
                ergonomía=3;
                pcritico=100;
                break;
            case 6:
                nombreArma="Arco Grande";
                calidad="Común";
                daño=125;
                escaladof= C;
                escaladod= C;
                escaladofe= D;
                escaladoint= D;
                ergonomía=10;
                pcritico=100;
                break;
            case 7:
                nombreArma="Aplastagigantes";
                calidad="Común";
                daño=155;
                escaladof= C;
                escaladod= D;
                escaladofe= D;
                escaladoint= D;
                ergonomía=27;
                pcritico=100;
                break;
            case 8:
                nombreArma="Balista de Mano";
                calidad="Común";
                daño=135;
                escaladof= D;
                escaladod= D;
                escaladofe= D;
                escaladoint= D;
                ergonomía=10;
                pcritico=100;
                break;
            case 9:
                nombreArma="Ballesta de Soldado";
                calidad="Común";
                daño=54;
                escaladof= D;
                escaladod= D;
                escaladofe= D;
                escaladoint= D;
                ergonomía=4;
                pcritico=100;
                break;
            case 10:
                nombreArma="Uchigatana";
                calidad="Común";
                daño=115;
                escaladof= B;
                escaladod= B;
                escaladofe= D;
                escaladoint= D;
                ergonomía=6;
                pcritico=100;
                break;
            case 11:
                nombreArma="Espada Dorada de Troll";
                calidad="Común";
                daño=155;
                escaladof= B;
                escaladod= B;
                escaladofe= D;
                escaladoint= D;
                ergonomía=19;
                pcritico=100;
                break;
            case 12:
                nombreArma="Cimitarra";
                calidad="Común";
                daño=106;
                escaladof= B;
                escaladod= B;
                escaladofe= D;
                escaladoint= D;
                ergonomía=3;
                pcritico=100;
                break;
            case 13:
                nombreArma="Estoque";
                calidad="Común";
                daño=96;
                escaladof= C;
                escaladod= A;
                escaladofe= D;
                escaladoint= D;
                ergonomía=3;
                pcritico=130;
                break;
            case 14:
                nombreArma="Gran Épée";
                calidad="Común";
                daño=124;
                escaladof= B;
                escaladod= B;
                escaladofe= D;
                escaladoint= D;
                ergonomía=7;
                pcritico=100;
                break;
            case 15:
                nombreArma="Espada Ancha";
                calidad="Común";
                daño=117;
                escaladof= B;
                escaladod= B;
                escaladofe= D;
                escaladoint= D;
                ergonomía=4;
                pcritico=100;
                break;
            case 16:
                nombreArma="Claymore";
                calidad="Común";
                daño=138;
                escaladof= B;
                escaladod= B;
                escaladofe= D;
                escaladoint= D;
                ergonomía=9;
                pcritico=100;
                break;
            case 17:
                nombreArma="Desmontadora";
                calidad="Común";
                daño=138;
                escaladof= B;
                escaladod= B;
                escaladofe= D;
                escaladoint= D;
                ergonomía=10;
                pcritico=100;
                break;
            case 18:
                nombreArma="Colmillo Ponzoñoso";
                calidad="Común";
                daño=92;
                escaladof= B;
                escaladod= B;
                escaladofe= D;
                escaladoint= D;
                ergonomía=3;
                pcritico=100;
                break;
            case 19:
                nombreArma="Gran Hacha";
                calidad="Común";
                daño=151;
                escaladof= B;
                escaladod= B;
                escaladofe= D;
                escaladoint= D;
                ergonomía=13;
                pcritico=100;
                break;
            case 20:
                nombreArma="Gran Maza";
                calidad="Común";
                daño=134;
                escaladof= A;
                escaladod= D;
                escaladofe= D;
                escaladoint= D;
                ergonomía=12;
                pcritico=100;
                break;
            case 21:
                nombreArma="Guadaña";
                calidad="Común";
                daño=125;
                escaladof= C;
                escaladod= A;
                escaladofe= D;
                escaladoint= D;
                ergonomía=8;
                pcritico=100;
                break;
            case 22:
                nombreArma="Destral Bifurcado";
                calidad="Común";
                daño=101;
                escaladof= B;
                escaladod= B;
                escaladofe= D;
                escaladoint= D;
                ergonomía=3;
                pcritico=100;
                break;
            case 23:
                nombreArma="Hoja Doble";
                calidad="Común";
                daño=119;
                escaladof= B;
                escaladod= B;
                escaladofe= D;
                escaladoint= D;
                ergonomía=7;
                pcritico=100;
                break;
            case 24:
                nombreArma="Lanza de Hierro";
                calidad="Común";
                daño=114;
                escaladof= B;
                escaladod= B;
                escaladofe= D;
                escaladoint= D;
                ergonomía=5;
                pcritico=100;
                break;
            case 25:
                nombreArma="Lanza de Justas";
                calidad="Común";
                daño=123;
                escaladof= B;
                escaladod= B;
                escaladofe= D;
                escaladoint= D;
                ergonomía=9;
                pcritico=100;
                break;
            case 26:
                nombreArma="Latigo con Espinas";
                calidad="Común";
                daño=102;
                escaladof= C;
                escaladod= A;
                escaladofe= D;
                escaladoint= D;
                ergonomía=3;
                pcritico=100;
                break;
            case 27:
                nombreArma="Garrote";
                calidad="Común";
                daño=103;
                escaladof= A;
                escaladod= D;
                escaladofe= D;
                escaladoint= D;
                ergonomía=4;
                pcritico=100;
                break;
            case 28:
                nombreArma="Mayal de Cadenas";
                calidad="Común";
                daño=109;
                escaladof= A;
                escaladod= C;
                escaladofe= D;
                escaladoint= D;
                ergonomía=3;
                pcritico=100;
                break;
            case 29:
                nombreArma="Cestus con Pinchos";
                calidad="Común";
                daño=91;
                escaladof= B;
                escaladod= B;
                escaladofe= D;
                escaladoint= D;
                ergonomía=2;
                pcritico=100;
                break;
            case 34:
                nombreArma="Libro de Vishanti";
                calidad="Especial";
                daño=225;
                escaladof= B;
                escaladod= B;
                escaladofe= A;
                escaladoint= S;
                ergonomía=6;
                pcritico=100;
                break;
            case 30:
                nombreArma=" Katana Rios de Sangre";
                calidad="Especial";
                daño=250;
                escaladof= A;
                escaladod= S;
                escaladofe= B;
                escaladoint= B;
                ergonomía=4;
                pcritico=120;
                break;
            case 31:
                nombreArma="Espada de la Noche y la Llama";
                calidad="Especial";
                daño=240;
                escaladof= S;
                escaladod= A;
                escaladofe= B;
                escaladoint= B;
                ergonomía=3;
                pcritico=110;
                break;
            case 32:
                nombreArma="Rompetormentas";
                calidad="Especial";
                daño=260;
                escaladof= S;
                escaladod= B;
                escaladofe= B;
                escaladoint= B;
                ergonomía=7;
                pcritico=130;
                break;
            case 33:
                nombreArma="Espadón Ancestral";
                calidad="Especial";
                daño=255;
                escaladof= A;
                escaladod= S;
                escaladofe= B;
                escaladoint= B;
                ergonomía=9;
                pcritico=110;
                break;
            case 35:
                nombreArma="Bastón Arcano";
                calidad="Especial";
                daño=230;
                escaladof= B;
                escaladod= B;
                escaladofe= S;
                escaladoint= A;
                ergonomía=4;
                pcritico=100;
                break;
            case 36:
                nombreArma="Cañón de la Media Luna";
                calidad="Especial";
                daño=240;
                escaladof= B;
                escaladod= S;
                escaladofe= B;
                escaladoint= A;
                ergonomía=8;
                pcritico=125;
                break;
            case 37:
                nombreArma="Hoja del Rey Arruinado";
                calidad="Especial";
                daño=250;
                escaladof= S;
                escaladod= A;
                escaladofe= B;
                escaladoint= B;
                ergonomía=6;
                pcritico=140;
                break;
            default:
        }
        Item arma = new Item();
        arma.setNombre(nombreArma);
        arma.setDescripcion(toString());
        arma.setCantidad(1);
        arma.setUso(Item.ARMA);
        return arma;
    }

    public int getNumArma(String nombre){
        switch (nombre){
            case ("Alabarda"):
                return 1;
            case ("Arco Largo"):
                return 2;
            case ("Bastón Albináurico"):
                return 3;
            case ("Daga"):
                return 4;
            case ("Antorcha de Acero"):
                return 5;
            case ("Arco Grande"):
                return 6;
            case ("Aplastagigantes"):
                return 7;
            case ("Balista de Mano"):
                return 8;
            case ("Ballesta de Soldado"):
                return 9;
            case ("Uchigatana"):
                return 10;
            case ("Espada Dorada de Troll"):
                return 11;
            case ("Cimitarra"):
                return 12;
            case ("Estoque"):
                return 13;
            case ("Gran Épée"):
                return 14;
            case ("Espada Ancha"):
                return 15;
            case ("Claymore"):
                return 16;
            case ("Desmontadora"):
                return 17;
            case ("Colmillo Ponzoñoso"):
                return 18;
            case ("Gran Hacha"):
                return 19;
            case ("Gran Maza"):
                return 20;
            case ("Guadaña"):
                return 21;
            case ("Destral Bifurcado"):
                return 22;
            case ("Hoja Doble"):
                return 23;
            case ("Lanza de Hierro"):
                return 24;
            case ("Lanza de Justas"):
                return 25;
            case ("Latigo con Espinas"):
                return 26;
            case ("Garrote"):
                return 27;
            case ("Mayal de Cadenas"):
                return 28;
            case ("Cestus con Pinchos"):
                return 29;
            case ("Libro de Vishanti"):
                return 34;
            case ("Katana Rios de Sangre "):
                return 30;
            case ("Espada de la Noche y la Llama"):
                return 31;
            case ("Rompetormentas"):
                return 32;
            case ("Espadón Ancestral"):
                return 33;
            case ("Bastón Arcano"):
                return 35;
            case ("Cañón de la Media Luna"):
                return 36;
            case ("Hoja del Rey Arruinado"):
                return 37;
            default:
                return (int) FrameCombate.h.pj.getNumarma();
        }
    }


    public String getNombreArma() {
        return nombreArma;
    }

    public void setNombreArma(String nombreArma) {
        this.nombreArma = nombreArma;
    }

    public float getEscaladof() {
        return escaladof;
    }

    public void setEscaladof(float escaladof) {
        this.escaladof = escaladof;
    }

    public float getEscaladod() {
        return escaladod;
    }

    public void setEscaladod(float escaladod) {
        this.escaladod = escaladod;
    }

    public float getEscaladofe() {
        return escaladofe;
    }

    public void setEscaladofe(float escaladofe) {
        this.escaladofe = escaladofe;
    }

    public float getEscaladoint() {
        return escaladoint;
    }

    public void setEscaladoint(float escaladoint) {
        this.escaladoint = escaladoint;
    }

    public float getDaño() {
        return daño;
    }

    public void setDaño(float daño) {
        this.daño = daño;
    }

    public float getErgonomía() {
        return ergonomía;
    }

    public void setErgonomía(float ergonomía) {
        this.ergonomía = ergonomía;
    }

    public float getPcritico() {
        return pcritico;
    }

    public void setPcritico(float pcritico) {
        this.pcritico = pcritico;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }


    @Override
    public String toString() {
        return
        " Escalado de fuerza: " + escaladof+"\n"+
        " Escalado de destreza: " + escaladod+"\n"+
        " Escalado de fe: " + escaladofe+"\n"+
        " Escalado de Inteligencia: " + escaladoint+"\n"+
        " Daño: " + daño+"\n"+
        " Peso: " + ergonomía+"\n"+
        " Critico: " + pcritico+"\n"+
        " Calidad: " + calidad
        ;
    }



}
