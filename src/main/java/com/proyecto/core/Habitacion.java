package com.proyecto.core;

import javax.swing.*;
import java.awt.*;

public class Habitacion extends JPanel {
    private String id;
    private boolean esCasillaInicial;
    private boolean esPared;
    private boolean casillaOcupada;
    private boolean esMeta;
    private boolean esDescubierta;
    private boolean esCercana;
    private Color color;
    private Image interrogacion= new ImageIcon("src/main/java/com/proyecto/imagenes/interrogacion3.png").getImage();


    public Habitacion(String id, boolean esPared) {
        this.id = id;
        this.esPared = esPared;
        this.casillaOcupada = false;

        // Configurar el tamaño y el borde de la casilla
        setPreferredSize(new Dimension(256, 144));
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (esPared) {
            g.setColor(Color.BLACK);
            g.fillRect(0, 0, getWidth(), getHeight());
        }
        if (casillaOcupada) {
            g.drawImage(new ImageIcon("src/main/java/com/proyecto/imagenes/pjPrincipal.png").getImage(),68,5,null);
        }
        if (!casillaOcupada&&!esPared&&esDescubierta){
            g.setColor(Color.WHITE);
            g.fillRect(0,0,getWidth(),getHeight());
        }
        if (!esDescubierta && !esPared && !esCercana) {
            g.setColor(Color.BLACK);
            g.fillRect(0, 0, getWidth(), getHeight());
        }
        if (!esDescubierta&&!esPared&&esCercana){
            g.setColor(Color.GRAY);
            g.fillRect(0,0,getWidth(),getHeight());
            g.drawImage(interrogacion,68,5,null);
        }
        if (esMeta&&!esDescubierta&&esCercana) {
            g.setColor(Color.GREEN);
            g.fillRect(0, 0, getWidth(), getHeight());
        }
    }



    public String getId() {
        return id;
    }

    public boolean esCasillaInicial() {
        return esCasillaInicial;
    }

    public boolean esPared() {
        return esPared;
    }

    public boolean esCasillaOcupada() {
        return casillaOcupada;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEsCasillaInicial(boolean esCasillaInicial) {
        this.esCasillaInicial = esCasillaInicial;
    }

    public void setEsPared(boolean esPared) {
        this.esPared = esPared;
        if (esPared) {
            setBackground(Color.BLACK);
        } else {
            setBackground(null);
        }
    }

    public void setCasillaOcupada(boolean casillaOcupada) {
        this.casillaOcupada = casillaOcupada;
    }

    public boolean esMeta() {
        return esMeta;
    }

    public void setEsMeta(boolean esMeta) {
        this.esMeta = esMeta;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
        setBackground(color);
    }

    public boolean esDescubierta() {
        return esDescubierta;
    }

    public void setEsDescubierta(boolean esDescubierta) {
        this.esDescubierta = esDescubierta;
    }

    public boolean essCercana() {
        return esCercana;
    }

    public void setEsCercana(boolean esCercana) {
        this.esCercana = esCercana;
    }
}
