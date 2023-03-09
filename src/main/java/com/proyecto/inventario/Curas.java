package com.proyecto.inventario;

public class Curas {

    public Item curas50 = new Item("Estus pequeño", "El Frasco de Estus es el objeto restaurativo básico, cura 50 PV", 3, Item.CURACION);
    public Item curas100 = new Item("Estus mediano", "Mejora de el Frasco de Estus básico, cura 100 PV", 0, Item.CURACION);
    public Item curas200 = new Item("Estus grande", "Mejora de el Frasco de Estus mediano, cura 200 PV", 0, Item.CURACION);



    public Curas(Item curas50, Item curas100, Item curas200) {
        this.curas50 = curas50;
        this.curas100 = curas100;
        this.curas200 = curas200;
    }

    public Curas() {
    }

    public Item getCuras50() {
        return curas50;
    }

    public void setCuras50(Item curas50) {
        this.curas50 = curas50;
    }

    public Item getCuras100() {
        return curas100;
    }

    public void setCuras100(Item curas100) {
        this.curas100 = curas100;
    }

    public Item getCuras200() {
        return curas200;
    }

    public void setCuras200(Item curas200) {
        this.curas200 = curas200;
    }

    public float curacion50(float vidaPj, float vidaMax){
        if (curas50.getCantidad()>0){
            if (50+vidaPj>vidaMax){
                curas50.setCantidad(curas50.getCantidad()-1);
                return vidaMax;
            }else
                curas50.setCantidad(curas50.getCantidad()-1);
                return vidaPj+50;
        }else{
            return vidaPj;
        }

    }
    public float curacion100(float vidaPj, float vidaMax){
        if (curas100.getCantidad()>0){
            if (100+vidaPj>vidaMax){
                curas100.setCantidad(curas100.getCantidad()-1);
                return vidaMax;
            }else
                curas100.setCantidad(curas100.getCantidad()-1);
            return vidaPj+100;
        }else{
            return vidaPj;
        }

    }
    public float curacion200(float vidaPj, float vidaMax){
        if (curas200.getCantidad()>0){
            if (200+vidaPj>vidaMax){
                curas200.setCantidad(curas200.getCantidad()-1);
                return vidaMax;
            }else
                curas200.setCantidad(curas200.getCantidad()-1);
                return vidaPj+200;
        }else{
            return vidaPj;
        }
    }

    public float curarCantidad(float vidaPj, float vidaMax, float cantidad){
            if (cantidad+vidaPj>vidaMax){
                return vidaMax;
            }else
                return vidaPj+cantidad;
        }

    public int getCantidad(String nombre){
        switch (nombre){
            case ("Estus pequeño"):
                return 50;
            case ("Estus mediano"):
                return 100;
            case ("Estus grande"):
                return 200;
            default:
                return 0;
        }
    }
    public Item getCura(String nombre){
        switch (nombre){
            case ("Estus pequeño"):
                return curas50;
            case ("Estus mediano"):
                return curas100;
            case ("Estus grande"):
                return curas200;
            default:
                return curas50;
        }
    }
}

