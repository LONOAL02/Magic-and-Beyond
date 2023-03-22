
package com.proyecto.core;


import org.netbeans.lib.awtextra.AbsoluteConstraints;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameCofre extends javax.swing.JFrame implements ActionListener {

    private JLabel bg;
    private JLabel cofreAbierto;
    private JLabel cofreCerrado;
    private JButton botonP;
    private JPanel panelP;
    private JLabel labelObj;

    public FrameCofre() {

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


        labelObj = new JLabel();
        panelP = new JPanel();
        botonP = new JButton();
        cofreAbierto = new JLabel();
        cofreCerrado = new JLabel();
        bg = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        panelP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelObj.setFont(new Font("Mantinia", 1, 36));
        labelObj.setForeground(new Color(255, 255, 255));
        labelObj.setText("Cofre");
        panelP.add(labelObj, new AbsoluteConstraints(590, 20,340,70));

        botonP.setBackground(new Color(51, 51, 51));
        botonP.setFont(new Font("Mantinia", 2, 40));
        botonP.setText("ABRIR");
        botonP.setForeground(new Color(255, 255, 255));
        botonP.addActionListener(this);

        panelP.add(botonP, new AbsoluteConstraints(480, 550, 340, 110));


        cofreAbierto.setIcon(new ImageIcon("src/main/java/com/proyecto/imagenes/ui/cofre/cofreAbierto.png"));
        panelP.add(cofreAbierto, new AbsoluteConstraints(470, 130, 550, 440));
        cofreAbierto.setVisible(false);

        cofreCerrado.setIcon(new ImageIcon("src/main/java/com/proyecto/imagenes/ui/cofre/cofreCerrado.png"));
        panelP.add(cofreCerrado, new AbsoluteConstraints(470, 120, 550, 440));

        bg.setIcon(new ImageIcon("src/main/java/com/proyecto/imagenes/ui/cofre/bg.png"));
        panelP.add(bg, new AbsoluteConstraints(0, 0, 1280, 720));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(panelP, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(panelP, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== botonP){
            if(botonP.getText().equals("ABRIR")){
                cofreAbierto.setVisible(true);
                cofreCerrado.setVisible(false);
                botonP.setText("COGER");
            }else{
                this.dispose();
            }
        }
    }
}
