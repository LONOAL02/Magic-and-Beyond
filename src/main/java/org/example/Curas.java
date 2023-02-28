package org.example;

public class Curas {

    float curas50= 3;
    float curas100;
    float curas200;

    public Curas(float curas50, float curas100, float curas200) {
        this.curas50 = curas50;
        this.curas100 = curas100;
        this.curas200 = curas200;
    }

    public Curas() {
    }

    public float getCuras50() {
        return curas50;
    }

    public void setCuras50(float curas50) {
        this.curas50 = curas50;
    }

    public float getCuras100() {
        return curas100;
    }

    public void setCuras100(float curas100) {
        this.curas100 = curas100;
    }

    public float getCuras200() {
        return curas200;
    }

    public void setCuras200(float curas200) {
        this.curas200 = curas200;
    }

    public float curacion50(float vidaPj, float vidaMax){
        if (curas50>0){
            if (50+vidaPj>vidaMax){
                curas50--;
                return vidaMax;
            }else
                curas50--;
                return vidaPj+50;
        }else{
            return vidaPj;
        }

    }
    public float curacion100(float vidaPj, float vidaMax){
        if (curas100>0){
            if (100+vidaPj>vidaMax){
                curas100--;
                return vidaMax;
            }else
                curas100--;
            return vidaPj+100;
        }else{
            return vidaPj;
        }

    }
    public float curacion200(float vidaPj, float vidaMax){
        if (curas200>0){
            if (200+vidaPj>vidaMax){
                curas200--;
                return vidaMax;
            }else
                curas200--;
                return vidaPj+200;
        }else{
            return vidaPj;
        }

    }
}

