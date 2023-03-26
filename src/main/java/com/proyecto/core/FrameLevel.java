
package com.proyecto.core;

import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameLevel extends JFrame implements ActionListener {

    public static Historia h = new Historia();

    private FrameMapa frameMapa;

    private int fuInicial = (int) h.pj.getFuerza();
    private int dInicial = (int) h.pj.getDestreza();
    private int iInicial = (int) h.pj.getInteligencia();
    private int feInicial = (int) h.pj.getFe();
    private int xpInicial = h.pj.getPuntosMejora();


    private JLabel attBg;
    private JLabel barra;
    private JLabel bg;
    private JLabel clase;
    private JButton confirmar;
    private JLabel destreza;
    private JButton destrezaMas;
    private JButton destrezaMenos;
    private JLabel destrezaN;
    private JLabel fe;
    private JButton feMas;
    private JButton feMenos;
    private JLabel feN;
    private JLabel fuerza;
    private JButton fuerzaMas;
    private JButton fuerzaMenos;
    private JLabel fuerzaN;
    private JLabel inteligencia;
    private JButton inteligenciaMas;
    private JButton inteligenciaMenos;
    private JLabel inteligenciaN;
    private JPanel mainPanel;
    private JLabel nivel;
    private JLabel nombre;
    private JLabel pj;
    private JLabel pjBg;
    private JLabel puntosXp;
    private JButton restablecer;
    private JLabel textoSuperior;

    public static Historia save(Historia h1){
        h = h1;
        return h;
    }

    public static Historia update(Historia h1){
        h1 = h;
        return h1;
    }



    public FrameLevel(FrameMapa frameMapa) {
        this.frameMapa = frameMapa;

        mainPanel = new JPanel();
        textoSuperior = new JLabel();
        nombre = new JLabel();
        clase = new JLabel();
        pj = new JLabel();
        pjBg = new JLabel();
        nivel = new JLabel();
        puntosXp = new JLabel();
        destrezaN = new JLabel();
        inteligenciaN = new JLabel();
        feN = new JLabel();
        fuerzaN = new JLabel();
        fuerza = new JLabel();
        destreza = new JLabel();
        inteligencia = new JLabel();
        fe = new JLabel();
        fuerzaMas = new JButton();
        fuerzaMenos = new JButton();
        destrezaMas = new JButton();
        destrezaMenos = new JButton();
        inteligenciaMas = new JButton();
        inteligenciaMenos = new JButton();
        feMas = new JButton();
        feMenos = new JButton();
        restablecer = new JButton();
        confirmar = new JButton();
        barra = new JLabel();
        attBg = new JLabel();
        bg = new JLabel();

        setUndecorated(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));


        // Obtener el tamaño de la pantalla
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();

        // Calcular la posición para centrar el JFrame
        int posX = (pantalla.width - this.getWidth()) / 2;
        int posY = (pantalla.height - this.getHeight()) / 2;

        // Establecer la posición del JFrame
        this.setLocation(posX, posY);

        // Mostrar el JFrame
        this.setVisible(true);


        mainPanel.setLayout(new AbsoluteLayout());

        textoSuperior.setFont(new Font("Mantinia", 1, 36));
        textoSuperior.setText("SUBES DE NIVEL!");
        textoSuperior.setForeground(Color.WHITE);
        mainPanel.add(textoSuperior, new AbsoluteConstraints(450, 20, 430, 50));

        nombre.setFont(new Font("Mantinia", 1, 18));
        nombre.setText("NOMBRE : "+h.pj.getNombre());
        mainPanel.add(nombre, new AbsoluteConstraints(110, 120, 250, 40));

        clase.setFont(new Font("Mantinia", 1, 18));
        clase.setText("CLASE : "+h.pj.getClase());
        mainPanel.add(clase, new AbsoluteConstraints(110, 160, 250, 40));

        pj.setIcon(new javax.swing.ImageIcon("src/main/java/com/proyecto/imagenes/ui/lobby/pj.png"));
        mainPanel.add(pj, new AbsoluteConstraints(50, 210, 270, 500));

        pjBg.setBackground(new Color(102, 102, 102));
        pjBg.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, new Color(0, 0, 0), null));
        pjBg.setOpaque(true);
        mainPanel.add(pjBg, new AbsoluteConstraints(70, 110, 310, 520));

        nivel.setFont(new Font("Mantinia", 1, 18));
        nivel.setText("NIVEL: "+(int)h.pj.getNivel());
        mainPanel.add(nivel, new AbsoluteConstraints(500, 140, 200, 40));

        puntosXp.setFont(new Font("Mantinia", 1, 18));
        puntosXp.setText("PUNTOS DE EXPERIENCIA DISPONIBLES: "+ h.pj.getPuntosMejora());
        mainPanel.add(puntosXp, new AbsoluteConstraints(500, 180, 540, 40));

        destrezaN.setFont(new Font("Mantinia", 1, 18));
        destrezaN.setText(String.valueOf(dInicial));
        mainPanel.add(destrezaN, new AbsoluteConstraints(820, 320, 40, 30));

        inteligenciaN.setFont(new Font("Mantinia", 1, 18));
        inteligenciaN.setText(String.valueOf(iInicial));
        mainPanel.add(inteligenciaN, new AbsoluteConstraints(820, 380, 40, 30));

        feN.setFont(new Font("Mantinia", 1, 18));
        feN.setText(String.valueOf(feInicial));
        mainPanel.add(feN, new AbsoluteConstraints(820, 440, 40, 30));

        fuerzaN.setFont(new Font("Mantinia", 1, 18));
        fuerzaN.setText(String.valueOf(fuInicial));
        mainPanel.add(fuerzaN, new AbsoluteConstraints(820, 260, 40, 30));

        fuerza.setFont(new Font("Mantinia", 1, 18));
        fuerza.setText("FUERZA: ");
        mainPanel.add(fuerza, new AbsoluteConstraints(630, 250, 210, 50));

        destreza.setFont(new Font("Mantinia", 1, 18));
        destreza.setText("DESTREZA:");
        mainPanel.add(destreza, new AbsoluteConstraints(630, 310, 210, 50));

        inteligencia.setFont(new Font("Mantinia", 1, 18));
        inteligencia.setText("INTELIGENCIA: ");
        mainPanel.add(inteligencia, new AbsoluteConstraints(630, 370, 210, 50));

        fe.setFont(new Font("Mantinia", 1, 18));
        fe.setText("FE: ");
        mainPanel.add(fe, new AbsoluteConstraints(630, 430, 210, 50));

        fuerzaMas.setBackground(new Color(204, 204, 204));
        fuerzaMas.setFont(new Font("Arial", 1, 24));
        fuerzaMas.setForeground(new Color(0, 0, 0));
        fuerzaMas.setText("+");
        fuerzaMas.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        fuerzaMas.addActionListener(this);
        mainPanel.add(fuerzaMas, new AbsoluteConstraints(880, 260, 30, 30));

        fuerzaMenos.setBackground(new Color(204, 204, 204));
        fuerzaMenos.setFont(new Font("Arial", 1, 24));
        fuerzaMenos.setForeground(new Color(0, 0, 0));
        fuerzaMenos.setText("-");
        fuerzaMenos.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        fuerzaMenos.addActionListener(this);
        mainPanel.add(fuerzaMenos, new AbsoluteConstraints(950, 260, 30, 30));

        destrezaMas.setBackground(new Color(204, 204, 204));
        destrezaMas.setFont(new Font("Arial", 1, 24));
        destrezaMas.setForeground(new Color(0, 0, 0));
        destrezaMas.setText("+");
        destrezaMas.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        destrezaMas.addActionListener(this);
        mainPanel.add(destrezaMas, new AbsoluteConstraints(880, 320, 30, 30));

        destrezaMenos.setBackground(new Color(204, 204, 204));
        destrezaMenos.setFont(new Font("Arial", 1, 24));
        destrezaMenos.setForeground(new Color(0, 0, 0));
        destrezaMenos.setText("-");
        destrezaMenos.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        destrezaMenos.addActionListener(this);
        mainPanel.add(destrezaMenos, new AbsoluteConstraints(950, 320, 30, 30));

        inteligenciaMas.setBackground(new Color(204, 204, 204));
        inteligenciaMas.setFont(new Font("Arial", 1, 24));
        inteligenciaMas.setForeground(new Color(0, 0, 0));
        inteligenciaMas.setText("+");
        inteligenciaMas.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        inteligenciaMas.addActionListener(this);
        mainPanel.add(inteligenciaMas, new AbsoluteConstraints(880, 380, 30, 30));

        inteligenciaMenos.setBackground(new Color(204, 204, 204));
        inteligenciaMenos.setFont(new Font("Arial", 1, 24));
        inteligenciaMenos.setForeground(new Color(0, 0, 0));
        inteligenciaMenos.setText("-");
        inteligenciaMenos.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        inteligenciaMenos.addActionListener(this);
        mainPanel.add(inteligenciaMenos, new AbsoluteConstraints(950, 380, 30, 30));

        feMas.setBackground(new Color(204, 204, 204));
        feMas.setFont(new Font("Arial", 1, 24));
        feMas.setForeground(new Color(0, 0, 0));
        feMas.setText("+");
        feMas.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        feMas.addActionListener(this);
        mainPanel.add(feMas, new AbsoluteConstraints(880, 440, 30, 30));

        feMenos.setBackground(new Color(204, 204, 204));
        feMenos.setFont(new Font("Arial", 1, 24));
        feMenos.setForeground(new Color(0, 0, 0));
        feMenos.setText("-");
        feMenos.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        feMenos.addActionListener(this);
        mainPanel.add(feMenos, new AbsoluteConstraints(950, 440, 30, 30));

        restablecer.setBackground(new Color(204, 204, 204));
        restablecer.setFont(new Font("Mantinia", 1, 18));
        restablecer.setForeground(new Color(0, 0, 0));
        restablecer.setText("REESTABLECER");
        restablecer.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        restablecer.addActionListener(this);
        mainPanel.add(restablecer, new AbsoluteConstraints(840, 550, 180, 40));

        confirmar.setBackground(new Color(204, 204, 204));
        confirmar.setFont(new Font("Mantinia", 1, 18));
        confirmar.setForeground(new Color(0, 0, 0));
        confirmar.setText("CONFIRMAR");
        confirmar.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        confirmar.addActionListener(this);
        mainPanel.add(confirmar, new AbsoluteConstraints(620, 550, 170, 40));

        barra.setOpaque(true);
        mainPanel.add(barra, new AbsoluteConstraints(600, 510, 430, 1));

        attBg.setBackground(new Color(102, 102, 102));
        attBg.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, new Color(0, 0, 0), null));
        attBg.setOpaque(true);
        mainPanel.add(attBg, new AbsoluteConstraints(460, 110, 710, 520));

        bg.setIcon(new javax.swing.ImageIcon("src/main/java/com/proyecto/imagenes/ui/lobby/bg.jpg"));
        mainPanel.add(bg, new AbsoluteConstraints(0, 0, 1280, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==fuerzaMas){
            if (h.pj.getPuntosMejora()>0) {
                h.pj.setFuerza(h.pj.getFuerza() + 1);
                fuerzaN.setText(String.valueOf((int)h.pj.getFuerza()));
                h.pj.setPuntosMejora(h.pj.getPuntosMejora() - 1);
            }
        }
        if (e.getSource()==destrezaMas){
            if (h.pj.getPuntosMejora()>0) {
                h.pj.setDestreza(h.pj.getDestreza() + 1);
                destrezaN.setText(String.valueOf((int)h.pj.getDestreza()));
                h.pj.setPuntosMejora(h.pj.getPuntosMejora() - 1);
            }
        }
        if (e.getSource()==inteligenciaMas){
            if (h.pj.getPuntosMejora()>0) {
                h.pj.setInteligencia((h.pj.getInteligencia() + 1));
                inteligenciaN.setText(String.valueOf((int)h.pj.getInteligencia()));
                h.pj.setPuntosMejora(h.pj.getPuntosMejora() - 1);
            }
        }
        if (e.getSource()==feMas){
            if (h.pj.getPuntosMejora()>0) {
                h.pj.setFe((h.pj.getFe() + 1));
                feN.setText(String.valueOf((int)h.pj.getFe()));
                h.pj.setPuntosMejora(h.pj.getPuntosMejora() - 1);
            }
        }
        if (e.getSource()==fuerzaMenos){
            if ((h.pj.getFuerza()-1)>=fuInicial) {
                h.pj.setFuerza(h.pj.getFuerza() - 1);
                fuerzaN.setText(String.valueOf((int)h.pj.getFuerza()));
                h.pj.setPuntosMejora(h.pj.getPuntosMejora() + 1);
            }
        }
        if (e.getSource()==destrezaMenos){
            if ((h.pj.getDestreza()-1)>=dInicial) {
                h.pj.setDestreza(h.pj.getDestreza() - 1);
                destrezaN.setText(String.valueOf((int)h.pj.getDestreza()));
                h.pj.setPuntosMejora(h.pj.getPuntosMejora() + 1);
            }
        }
        if (e.getSource()==inteligenciaMenos){
            if ((h.pj.getInteligencia()-1)>=iInicial) {
                h.pj.setInteligencia(h.pj.getInteligencia() - 1);
                inteligenciaN.setText(String.valueOf((int)h.pj.getInteligencia()));
                h.pj.setPuntosMejora(h.pj.getPuntosMejora() + 1);
            }
        }
        if (e.getSource()==feMenos){
            if ((h.pj.getFe()-1)>=feInicial) {
                h.pj.setFe(h.pj.getFe() - 1);
                feN.setText(String.valueOf((int)h.pj.getFe()));
                h.pj.setPuntosMejora(h.pj.getPuntosMejora() + 1);
            }
        }
        if (e.getSource()==confirmar){
            Main.h=update(Main.h);
            FrameMapa.ventana.setExtendedState(JFrame.NORMAL);
            this.dispose();
        }
        if (e.getSource()==restablecer){
            h.pj.setPuntosMejora(xpInicial);
            h.pj.setFuerza(fuInicial);
            h.pj.setDestreza(dInicial);
            h.pj.setInteligencia(iInicial);
            h.pj.setFe(feInicial);
            fuerzaN.setText(String.valueOf((int)h.pj.getFuerza()));
            destrezaN.setText(String.valueOf((int)h.pj.getDestreza()));
            inteligenciaN.setText(String.valueOf((int)h.pj.getInteligencia()));
            feN.setText(String.valueOf((int)h.pj.getFe()));
        }
        puntosXp.setText(String.valueOf("PUNTOS DE EXPERIENCIA DISPONIBLES: "+h.pj.getPuntosMejora()));
    }

}
