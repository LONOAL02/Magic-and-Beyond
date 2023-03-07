package com.proyecto.Npcs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventObject;

public class FrameNPC extends JFrame implements ActionListener {
    private JPanel imagenPj;
    private JPanel textYButtonsPanel;
    private JPanel NpcPanel;
    private JTextArea NpcDialog;
    private JButton op1Button;
    private JButton op2Button;
    private JButton op3Button;
    private JButton button1;

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
            NpcDialog.append("Hola soy alex"+"\n");
        }
    }


    public FrameNPC() {

        super("Magic and Beyond");

        this.setLocation(GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint());

        this.setUndecorated(true);
        this.setLocationRelativeTo(null);

        // Tamaño de la ventana
        this.setPreferredSize(new Dimension(1280, 720));

        // Ventana de Npc
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        NpcPanel= new JPanel();
        op1Button=new JButton("Presentarse");
        op1Button.addActionListener(this);
        textYButtonsPanel =new JPanel();
        textYButtonsPanel.setLayout(new BorderLayout());
        textYButtonsPanel.setPreferredSize(new Dimension(717,720));
        NpcPanel.setPreferredSize(new Dimension(1280,720));
        NpcPanel.setLayout(new BorderLayout());
        imagenPj = new JPanelWithBackground();
        imagenPj.setPreferredSize(new Dimension(563,720));
        NpcDialog = new JTextArea();
        NpcDialog.setOpaque(false);
        NpcDialog.setText(Alex.metodo1Alex());
        textYButtonsPanel.add(NpcDialog,BorderLayout.CENTER);
        textYButtonsPanel.add(op1Button,BorderLayout.SOUTH);
        NpcPanel.add(imagenPj, BorderLayout.WEST);
        NpcPanel.add(textYButtonsPanel,BorderLayout.CENTER);
        add(NpcPanel, BorderLayout.CENTER);



        pack();
        setLocationRelativeTo(null);
        setVisible(true);


        }



}

