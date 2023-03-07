package com.proyecto.core;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

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
        this.esMeta= esMeta();

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
        if (!casillaOcupada&&!esPared&&esDescubierta){
            g.drawImage(new ImageIcon("src/main/java/com/proyecto/imagenes/sueloAdoquin.jpg").getImage(),0,0,null);
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
        if (casillaOcupada&&!esMeta) {
            crearImagen();
            g.drawImage(new ImageIcon("src/main/java/com/proyecto/imagenes/combined.png").getImage(),0,0,null);

        }
    }

    public void crearImagen() {
        try {
            // cargar el background y la imagen
            File backgroundFile = new File("src/main/java/com/proyecto/imagenes/sueloAdoquin.jpg");
            File imageFile = new File("src/main/java/com/proyecto/imagenes/pjPrincipal.png");
            BufferedImage backgroundImage = ImageIO.read(backgroundFile);
            BufferedImage image = ImageIO.read(imageFile);

            // crear una nueva imagen con el mismo tamaño que el background
            BufferedImage combined = new BufferedImage(174, 98, BufferedImage.TYPE_INT_ARGB);

            // dibujar el background en la nueva imagen
            Graphics2D g = (Graphics2D) combined.getGraphics();
            g.drawImage(backgroundImage, 0, 0, null);

            // dibujar la imagen encima del background
            g.drawImage(image, 68, 5, null);

            // guardar la imagen combinada en un archivo
            File outputFile = new File("src/main/java/com/proyecto/imagenes/combined.png");
            ImageIO.write(combined, "png", outputFile);
        }catch (IOException e){
            System.out.println(e.getMessage());
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
