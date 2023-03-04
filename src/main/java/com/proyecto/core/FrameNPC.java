package com.proyecto.core;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventObject;

public class FrameNPC extends JFrame implements ActionListener {
    private String nombre;
    private String profesion;
    private String dialogo1="Hola soy un NPC";

    private JPanel imagenPj;
    private JPanel textYButtonsPanel;
    private JPanel NpcPanel;
    private JTextArea NpcDialog;
    private JButton op1Button;
    private JButton op2Button;
    private JButton op3Button;

   // @Override
    //public void actionPerformed(ActionEvent e) {



    private static class JPanelWithBackground extends JPanel {

        private Image background;

        public JPanelWithBackground() {
            background = new ImageIcon("src/main/java/com/proyecto/imagenes/npc Alex.jpg").getImage();
            setOpaque(false);
        }

        @Override
        protected void paintComponent(Graphics g) {
            g.drawImage(background, 0, 0, getWidth(), getHeight(), this);
            super.paintComponent(g);
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() ==op1Button) {
            NpcDialog.append("Hola soy alex");
        }
    }


    public FrameNPC() {

        super("Magic and Beyond");

        this.setUndecorated(true);
        this.setLocationRelativeTo(null);

        // Tamaño de la ventana
        this.setSize(new Dimension(1280, 720));

        // Ventana de Npc

        this.setMinimumSize(new Dimension(1280, 720));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        NpcPanel= new JPanel();
        op1Button=new JButton("Presentarse");
        op1Button.addActionListener(this);
        textYButtonsPanel =new JPanel();
        NpcPanel.setPreferredSize(new Dimension(1000,700));
        NpcPanel.setLayout(new BorderLayout());
    imagenPj = new JPanelWithBackground();
    imagenPj.setSize(563,676);
    NpcDialog = new JTextArea();
        NpcDialog.setOpaque(false);
        NpcDialog.setText(dialogo1);
        textYButtonsPanel.add(NpcDialog,BorderLayout.EAST);
        NpcPanel.add(imagenPj, BorderLayout.WEST);
        NpcPanel.add(textYButtonsPanel,BorderLayout.CENTER);
        textYButtonsPanel.add(op1Button,BorderLayout.SOUTH);
        add(NpcPanel, BorderLayout.CENTER);



        pack();
        setLocationRelativeTo(null);
        setVisible(true);


        }



}

