package com.proyecto.Npcs;

import com.proyecto.core.Historia;
import com.proyecto.inventario.Item;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventObject;

public class FrameNPC extends JFrame implements ActionListener {

    public static Historia h = new Historia();

    private JPanel imagenPj;
    private JPanel textYButtonsPanel;
    private JPanel NpcPanel;
    private JTextArea NpcDialog;
    public static JButton op1Button;
    public static JButton op2Button;
    public static JButton op3Button;



    public static Historia save(Historia h1){
        h = h1;
        return h;
    }

    public static Historia update(Historia h1){
        h1 = h;
        return h1;
    }


    private static class JPanelWithBackground extends JPanel {
        String npc;
        public String NpcAleatorio(){

            int numNpc;
            int numOp1 = (int) (Math.random() * 2 + 1);
            int numOp2 = (int) (Math.random() * 2 + 1);
            int numOp3 = (int) (Math.random() * 2 + 1);
            numNpc=(int) (Math.random() * 6 + 1);
            switch (numNpc) {
                case 1:
                    npc="Alex";
                    op1Button.setText(Alex.metodo2Alex(1,numOp1));
                    op2Button.setText(Alex.metodo2Alex(2,numOp2));
                    op3Button.setText(Alex.metodo2Alex(3,numOp3));
                    break;
                case 2:
                    npc="Archibald";
                    op1Button.setText(Archibald.metodo2Archibald(1,numOp1));
                    op2Button.setText(Archibald.metodo2Archibald(2,numOp2));
                    op3Button.setText(Archibald.metodo2Archibald(3,numOp3));
                    break;
                case 3:
                    npc="Damian";
                    op1Button.setText(Damian.metodo2Damian(1,numOp1));
                    op2Button.setText(Damian.metodo2Damian(2,numOp2));
                    op3Button.setText(Damian.metodo2Damian(3,numOp3));
                    break;
                case 4:
                    npc="Diana";
                    op1Button.setText(Diana.metodo2Hechizera(1,numOp1));
                    op2Button.setText(Diana.metodo2Hechizera(2,numOp2));
                    op3Button.setText(Diana.metodo2Hechizera(3,numOp3));
                    break;
                case 5:
                    npc="Ladrón";
                    op1Button.setText(Ladron.metodo2Ladron(1,numOp1));
                    op2Button.setText(Ladron.metodo2Ladron(2,numOp2));
                    op3Button.setText(Ladron.metodo2Ladron(3,numOp3));
                    break;
                case 6:
                    npc="Vigilante";
                    op1Button.setText(Vigilante.metodo2Vigilante(1,numOp1));
                    op2Button.setText(Vigilante.metodo2Vigilante(2,numOp2));
                    op3Button.setText(Vigilante.metodo2Vigilante(3,numOp3));
                    break;
            }
            return npc;
        }

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
        op1Button=new JButton();
        op2Button=new JButton();
        op3Button=new JButton();
        op1Button.addActionListener(this);
        op2Button.addActionListener(this);
        op3Button.addActionListener(this);
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

