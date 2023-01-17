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

    public float curacion50(float vidaPj){
        curas50--;
        return vidaPj+50;
    }
    public float curacion100(float vidaPj){
        curas100--;
        return vidaPj+50;

    }public float curacion200(float vidaPj){
        curas200--;
        return vidaPj+50;
    }

}
