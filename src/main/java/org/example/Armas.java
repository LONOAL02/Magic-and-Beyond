package org.example;

public class Armas {
    String nombreArma;
    //Escalado de las armas
    float escaladof;
    float escaladod;
    float escaladofe;
    float escaladoint;
    final float S = 2f;
    final float A = 1.75f;
    final float B = 1.50f;
    final float C = 1.25f;
    final float D = 1f;

    //Stats base de las armas
    int daño;
    int ergonomía;
    int pcritico;
    String calidad;

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

    public void armaComun(int num){
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
            case 6:
                nombreArma="Arco Largo";
                calidad="Común";
                daño=125;
                escaladof= C;
                escaladod= C;
                escaladofe= D;
                escaladoint= D;
                ergonomía=10;
                pcritico=100;
            default:
                System.out.println("????");



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

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public int getErgonomía() {
        return ergonomía;
    }

    public void setErgonomía(int ergonomía) {
        this.ergonomía = ergonomía;
    }

    public int getPcritico() {
        return pcritico;
    }

    public void setPcritico(int pcritico) {
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
                " nombreArma=" + nombreArma +
                        " escaladof=" + escaladof+
        " escaladod=" + escaladod+
        " escaladofe=" + escaladofe+
        " escaladoint=" + escaladoint+
        " daño=" + daño+
        " ergonomía=" + ergonomía+
        " pcritico=" + pcritico+
        " calidad=" + calidad
        ;
    }


/*
    public void Alabarda(){
        nombreArma="Alabarda";
        calidad="Común";
        daño=125;
        escaladof= B;
        escaladod= B;
        escaladofe= D;
        escaladoint= D;
        ergonomía=8;
        pcritico=100;
    }
    public void ArcoLargo(){
        nombreArma="Arco Largo";
        calidad="Común";
        daño=80;
        escaladof= C;
        escaladod= B;
        escaladofe= D;
        escaladoint= D;
        ergonomía=4;
        pcritico=100;
    }
    public void BastonAlbi(){
        nombreArma="Bastón Albináurico";
        calidad="Común";
        daño=200;
        escaladof= C;
        escaladod= D;
        escaladofe= D;
        escaladoint= B;
        ergonomía=3;
        pcritico=100;
    }
    public void Daga(){
        nombreArma="Daga";
        calidad="Común";
        daño=75;
        escaladof= C;
        escaladod= B;
        escaladofe= D;
        escaladoint= D;
        ergonomía=2;
        pcritico=130;
    }
    public void Antorcha(){
        nombreArma="Antorcha de Acero";
        calidad="Común";
        daño=109;
        escaladof= C;
        escaladod= B;
        escaladofe= D;
        escaladoint= D;
        ergonomía=3;
        pcritico=100;
    }
    public void ArcoGrande(){
        nombreArma="Arco Largo";
        calidad="Común";
        daño=125;
        escaladof= C;
        escaladod= C;
        escaladofe= D;
        escaladoint= D;
        ergonomía=10;
        pcritico=100;
    }
    public void Aplastagigantes(){
        nombreArma="Aplastagigantes";
        calidad="Común";
        daño=155;
        escaladof= C;
        escaladod= D;
        escaladofe= D;
        escaladoint= D;
        ergonomía=27;
        pcritico=100;
    }
    public void BalistaMano(){
        nombreArma="Balista de Mano";
        calidad="Común";
        daño=135;
        escaladof= D;
        escaladod= D;
        escaladofe= D;
        escaladoint= D;
        ergonomía=10;
        pcritico=100;
    }
    public void BallestaSoldado(){
        nombreArma="Ballesta de Soldado";
        calidad="Común";
        daño=54;
        escaladof= D;
        escaladod= D;
        escaladofe= D;
        escaladoint= D;
        ergonomía=4;
        pcritico=100;
    }
    public void Uchigatana(){
        nombreArma="Uchigatana";
        calidad="Común";
        daño=115;
        escaladof= B;
        escaladod= B;
        escaladofe= D;
        escaladoint= D;
        ergonomía=6;
        pcritico=100;
    }
    public void EspadaTroll(){
        nombreArma="Espada Dorada de Troll";
        calidad="Común";
        daño=155;
        escaladof= B;
        escaladod= B;
        escaladofe= D;
        escaladoint= D;
        ergonomía=19;
        pcritico=100;
    }
    public void Cimitarra(){
        nombreArma="Cimitarra";
        calidad="Común";
        daño=106;
        escaladof= B;
        escaladod= B;
        escaladofe= D;
        escaladoint= D;
        ergonomía=3;
        pcritico=100;
    }
    public void Estoque(){
        nombreArma="Arco Largo";
        calidad="Común";
        daño=96;
        escaladof= C;
        escaladod= A;
        escaladofe= D;
        escaladoint= D;
        ergonomía=3;
        pcritico=130;
    }
    public void GranEpee(){
        nombreArma="Gran Épée";
        calidad="Común";
        daño=124;
        escaladof= B;
        escaladod= B;
        escaladofe= D;
        escaladoint= D;
        ergonomía=7;
        pcritico=100;
    }
    public void EspadaAncha(){
        nombreArma="Espada Ancha";
        calidad="Común";
        daño=117;
        escaladof= B;
        escaladod= B;
        escaladofe= D;
        escaladoint= D;
        ergonomía=4;
        pcritico=100;
    }
    public void Claymore(){
        nombreArma="Arco Largo";
        calidad="Común";
        daño=138;
        escaladof= B;
        escaladod= B;
        escaladofe= D;
        escaladoint= D;
        ergonomía=9;
        pcritico=100;
    }
    public void Desmontadora(){
        nombreArma="Desmontadora";
        calidad="Común";
        daño=138;
        escaladof= B;
        escaladod= B;
        escaladofe= D;
        escaladoint= D;
        ergonomía=10;
        pcritico=100;
    }
    public void ColmilloPonzoñoso(){
        nombreArma="Colmillo Ponzoñoso";
        calidad="Común";
        daño=92;
        escaladof= B;
        escaladod= B;
        escaladofe= D;
        escaladoint= D;
        ergonomía=3;
        pcritico=100;
    }

    */

}
