package com.proyecto.inv;

public class Item {
    public String nombre;
    public String descripcion;
    public int cantidad;
    public int uso;

    public static final int NONUSABLE=0;
    public static final int ARMA=1;
    public static final int HECHIZO=2;
    public static final int DAÑO=3;
    public static final int ORO=4;
    public static final int CURACION=5;
    public static final int RELIQUIA=6;


    public Item(String nombre, String descripcion, int cantidad,int uso) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.uso= uso;
    }

    public Item(){

    }

    // getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getUso() {
        return uso;
    }

    public void setUso(int uso) {
        this.uso = uso;
    }
}