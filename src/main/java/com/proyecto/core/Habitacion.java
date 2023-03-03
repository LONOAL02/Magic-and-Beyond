package com.proyecto.core;

import javax.swing.*;
import java.awt.*;

public class Habitacion extends JPanel {
    private String id;
    private boolean esCasillaInicial;
    private boolean esPared;
    private boolean casillaOcupada;
    private boolean esMeta;
    private Color color;


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
            g.setColor(Color.RED);
            g.fillOval(getWidth() / 4, getHeight() / 4, getWidth() / 2, getHeight() / 2);
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
}
