
package com.proyecto.core;


import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameTienda extends JFrame implements ActionListener {

    private JButton bComprarArma;
    private JButton bComprarCuras;
    private JButton bComprarDaño;
    private JButton bComprarNivel;
    private JButton bComprarReliq;
    private JButton bComprarVida;
    private JButton bVolver;
    private JLabel bg;
    private JLabel cRestantesArma;
    private JLabel cRestantesCuras;
    private JLabel cRestantesDaño;
    private JLabel cRestantesNivel;
    private JLabel cRestantesReliq;
    private JLabel cRestantesVida;
    private JLabel cantidadOro;
    private JLabel labelOro;
    private JLabel labelTitulo;
    private JLabel opcArma;
    private JLabel opcCuras;
    private JLabel opcDaño;
    private JLabel opcNivel;
    private JLabel opcReliq;
    private JLabel opcVida;
    private JPanel panelPrincipal;
    private JLabel precioArma;
    private JLabel precioCuras;
    private JLabel precioDaño;
    private JLabel precioNivel;
    private JLabel precioReliq;
    private JLabel precioVida;
    public FrameTienda() {

        setUndecorated(true);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(1280, 720));
        setResizable(false);
        setSize(new Dimension(1280, 720));


        // Obtener el tamaño de la pantalla
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();

        // Calcular la posición para centrar el JFrame
        int posX = (pantalla.width - this.getWidth()) / 2;
        int posY = (pantalla.height - this.getHeight()) / 2;

        // Establecer la posición del JFrame
        this.setLocation(posX, posY);

        panelPrincipal = new JPanel();
        labelTitulo = new JLabel();
        labelOro = new JLabel();
        cantidadOro = new JLabel();
        opcReliq = new JLabel();
        opcVida = new JLabel();
        opcDaño = new JLabel();
        opcNivel = new JLabel();
        opcArma = new JLabel();
        opcCuras = new JLabel();
        cRestantesArma = new JLabel();
        precioArma = new JLabel();
        cRestantesDaño = new JLabel();
        precioDaño = new JLabel();
        cRestantesReliq = new JLabel();
        precioReliq = new JLabel();
        cRestantesCuras = new JLabel();
        precioCuras = new JLabel();
        cRestantesNivel = new JLabel();
        precioNivel = new JLabel();
        cRestantesVida = new JLabel();
        precioVida = new JLabel();
        bComprarVida = new JButton();
        bComprarDaño = new JButton();
        bComprarReliq = new JButton();
        bComprarArma = new JButton();
        bComprarCuras = new JButton();
        bComprarNivel = new JButton();
        bVolver = new JButton();
        bg = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        panelPrincipal.setLayout(new AbsoluteLayout());

        labelTitulo.setFont(new Font("Mantinia", 1, 48));
        labelTitulo.setText("TIENDA");
        panelPrincipal.add(labelTitulo, new AbsoluteConstraints(530, 30, 420, 100));

        labelOro.setFont(new Font("Mantinia", 1, 24));
        labelOro.setText("ORO:");
        panelPrincipal.add(labelOro, new AbsoluteConstraints(1050, 30, -1, -1));

        cantidadOro.setFont(new Font("Mantinia", 1, 24));
        cantidadOro.setToolTipText("");
        panelPrincipal.add(cantidadOro, new AbsoluteConstraints(1140, 20, 130, 50));

        opcReliq.setFont(new Font("Mantinia", 1, 18));
        opcReliq.setText("EMPIEZA CON UNA RELIQUIA ALEATORIA");
        panelPrincipal.add(opcReliq, new AbsoluteConstraints(770, 350, 440, 40));

        opcVida.setFont(new Font("Mantinia", 1, 18));
        opcVida.setText("GANA 50 DE VIDA MÁXIMA PARA TODAS LAS CLASES");
        panelPrincipal.add(opcVida, new AbsoluteConstraints(40, 190, 590, 40));

        opcDaño.setFont(new Font("Mantinia", 1, 18));
        opcDaño.setText("GANA 5 PORCIENTO DE DAÑO EXTRA ");
        panelPrincipal.add(opcDaño, new AbsoluteConstraints(770, 190, 410, 40));

        opcNivel.setFont(new Font("Mantinia", 1, 18));
        opcNivel.setText("EMPIEZA CON UN NIVEL EXTRA");
        panelPrincipal.add(opcNivel, new AbsoluteConstraints(770, 500, 410, 40));

        opcArma.setFont(new Font("Mantinia", 1, 18));
        opcArma.setText("EMPIEZA CON UN ARMA ALEATORIA EXTRA");
        panelPrincipal.add(opcArma, new AbsoluteConstraints(50, 350, 470, 40));

        opcCuras.setFont(new Font("Mantinia", 1, 18));
        opcCuras.setText("EMPIEZA CON UN ESTUS EXTRA");
        panelPrincipal.add(opcCuras, new AbsoluteConstraints(50, 500, 410, 40));

        cRestantesArma.setFont(new Font("Mantinia", 1, 14));
        cRestantesArma.setText("COMPRAS RESTANTES:");
        panelPrincipal.add(cRestantesArma, new AbsoluteConstraints(310, 420, 250, 40));

        precioArma.setFont(new Font("Mantinia", 1, 14)); //
        precioArma.setText("PRECIO:");
        panelPrincipal.add(precioArma, new AbsoluteConstraints(310, 380, 250, 40));

        cRestantesDaño.setFont(new Font("Mantinia", 1, 14));
        cRestantesDaño.setText("COMPRAS RESTANTES:");
        panelPrincipal.add(cRestantesDaño, new AbsoluteConstraints(1010, 270, 250, 40));

        precioDaño.setFont(new Font("Mantinia", 1, 14));
        precioDaño.setText("PRECIO:");
        panelPrincipal.add(precioDaño, new AbsoluteConstraints(1010, 230, 250, 40));

        cRestantesReliq.setFont(new Font("Mantinia", 1, 14));
        cRestantesReliq.setText("COMPRAS RESTANTES:");
        panelPrincipal.add(cRestantesReliq, new AbsoluteConstraints(1010, 430, 250, 40));

        precioReliq.setFont(new Font("Mantinia", 1, 14));
        precioReliq.setText("PRECIO:");
        panelPrincipal.add(precioReliq, new AbsoluteConstraints(1010, 390, 250, 40));

        cRestantesCuras.setFont(new Font("Mantinia", 1, 14));
        cRestantesCuras.setText("COMPRAS RESTANTES:");
        panelPrincipal.add(cRestantesCuras, new AbsoluteConstraints(310, 580, 250, 40));

        precioCuras.setFont(new Font("Mantinia", 1, 14));
        precioCuras.setText("PRECIO:");
        panelPrincipal.add(precioCuras, new AbsoluteConstraints(310, 540, 250, 40));

        cRestantesNivel.setFont(new Font("Mantinia", 1, 14));
        cRestantesNivel.setText("COMPRAS RESTANTES:");
        panelPrincipal.add(cRestantesNivel, new AbsoluteConstraints(1010, 580, 250, 40));

        precioNivel.setFont(new Font("Mantinia", 1, 14));
        precioNivel.setText("PRECIO:");
        panelPrincipal.add(precioNivel, new AbsoluteConstraints(1010, 540, 250, 40));

        cRestantesVida.setFont(new Font("Mantinia", 1, 14));
        cRestantesVida.setText("COMPRAS RESTANTES:");
        panelPrincipal.add(cRestantesVida, new AbsoluteConstraints(310, 280, 250, 40));

        precioVida.setFont(new Font("Mantinia", 1, 14));
        precioVida.setText("PRECIO:");
        panelPrincipal.add(precioVida, new AbsoluteConstraints(310, 240, 250, 40));

        bComprarVida.setFont(new Font("Mantinia", 1, 18));
        bComprarVida.setText("COMPRAR");
        bComprarVida.addActionListener(this);
        panelPrincipal.add(bComprarVida, new AbsoluteConstraints(60, 250, 220, 40));

        bComprarDaño.setFont(new Font("Mantinia", 1, 18));
        bComprarDaño.setText("COMPRAR");
        bComprarDaño.addActionListener(this);
        panelPrincipal.add(bComprarDaño, new AbsoluteConstraints(770, 240, 220, 40));

        bComprarReliq.setFont(new Font("Mantinia", 1, 18));
        bComprarReliq.setText("COMPRAR");
        bComprarReliq.addActionListener(this);
        panelPrincipal.add(bComprarReliq, new AbsoluteConstraints(770, 400, 220, 40));

        bComprarArma.setFont(new Font("Mantinia", 1, 18));
        bComprarArma.setText("COMPRAR");
        bComprarArma.addActionListener(this);
        panelPrincipal.add(bComprarArma, new AbsoluteConstraints(60, 390, 220, 40));

        bComprarCuras.setFont(new Font("Mantinia", 1, 18));
        bComprarCuras.setText("COMPRAR");
        bComprarCuras.addActionListener(this);
        panelPrincipal.add(bComprarCuras, new AbsoluteConstraints(60, 550, 220, 40));

        bComprarNivel.setFont(new Font("Mantinia", 1, 18));
        bComprarNivel.setText("COMPRAR");
        bComprarNivel.addActionListener(this);
        panelPrincipal.add(bComprarNivel, new AbsoluteConstraints(770, 550, 220, 40));

        bVolver.setFont(new Font("Mantinia", 1, 18));
        bVolver.setText("VOLVER");
        bVolver.addActionListener(this);
        panelPrincipal.add(bVolver, new AbsoluteConstraints(500, 640, 280, 50));

        bg.setIcon(new ImageIcon("/com/proyecto/imagenes/ui/lobby/bg.jpg"));
        panelPrincipal.add(bg, new AbsoluteConstraints(0, 0, 1280, 720));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
