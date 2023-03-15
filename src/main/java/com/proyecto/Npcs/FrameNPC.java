package com.proyecto.Npcs;

import com.proyecto.core.FrameMapa;
import com.proyecto.core.Historia;
import com.proyecto.core.Main;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class FrameNPC extends JFrame implements ActionListener {

    public static Historia h = new Historia();
    private final FrameMapa frameMapa;

    String npc;
    int numOp1 = (int) (Math.random() * 2 + 1);
    int numOp2 = (int) (Math.random() * 2 + 1);
    int numOp3 = (int) (Math.random() * 2 + 1);
    int numNpc = (int) (Math.random() * 6 + 1);


    private JPanel imagenNPC;
    private JPanel textYButtonsPanel;
    private JPanel NpcPanel;
    private JTextArea NpcDialog;
    public static JButton op1Button;
    public static JButton op2Button;
    public static JButton op3Button;

    private static String npcImage;
    private static String bgPath;


    public static Historia save(Historia h1) {
        h = h1;
        return h;
    }

    public static Historia update(Historia h1) {
        h1 = h;
        return h1;
    }


    private static class JPanelWithBackground extends JPanel {

        public JPanelWithBackground() {
            setOpaque(false);
        }

        @Override
        protected void paintComponent(Graphics g) {
            g.drawImage(new ImageIcon(bgPath).getImage(), 0, 0, getWidth(), getHeight(), this);
            super.paintComponent(g);
        }
    }

    private static class JPanelWithBackground2 extends JPanel {

        private Image background;

        public JPanelWithBackground2() {
            background = new ImageIcon("src/main/java/com/proyecto/imagenes/fondo3.jpeg").getImage();
            setOpaque(false);
        }

        @Override
        protected void paintComponent(Graphics g) {
            g.drawImage(background, 0, 0, getWidth(), getHeight(), this);
            super.paintComponent(g);
        }
    }





    public void crearImagen(String path) {
        try {
            // cargar el background y la imagen
            File backgroundFile = new File("src/main/java/com/proyecto/imagenes/fondoNPC2.png");
            File imageFile = new File(path);
            BufferedImage backgroundImage = ImageIO.read(backgroundFile);
            BufferedImage image = ImageIO.read(imageFile);

            // crear una nueva imagen con el mismo tamaño que el background
            BufferedImage combined = new BufferedImage(543, 720, BufferedImage.TYPE_INT_ARGB);

            // dibujar el background en la nueva imagen
            Graphics2D g = (Graphics2D) combined.getGraphics();
            g.drawImage(backgroundImage, 0, 0, null);

            // dibujar la imagen encima del background
            g.drawImage(image, 68, 150, null);

            // guardar la imagen combinada en un archivo
            File outputFile = new File("src/main/java/com/proyecto/imagenes/bgNPC.png");
            ImageIO.write(combined, "png", outputFile);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public String NpcAleatorio() {
        switch (numNpc) {
            case 1:
                npc = "Alex";
                op1Button.setText(Alex.metodo2Alex(1, numOp1));
                op2Button.setText(Alex.metodo2Alex(2, numOp2));
                op3Button.setText(Alex.metodo2Alex(3, numOp3));
                imagenNPC.repaint();
                break;
            case 2:
                npc = "Archibald";
                op1Button.setText(Archibald.metodo2Archibald(1, numOp1));
                op2Button.setText(Archibald.metodo2Archibald(2, numOp2));
                op3Button.setText(Archibald.metodo2Archibald(3, numOp3));
                imagenNPC.repaint();
                break;
            case 3:
                npc = "Damian";
                op1Button.setText(Damian.metodo2Damian(1, numOp1));
                op2Button.setText(Damian.metodo2Damian(2, numOp2));
                op3Button.setText(Damian.metodo2Damian(3, numOp3));
                imagenNPC.repaint();
                break;
            case 4:
                npc = "Diana";
                op1Button.setText(Diana.metodo2Hechizera(1, numOp1));
                op2Button.setText(Diana.metodo2Hechizera(2, numOp2));
                op3Button.setText(Diana.metodo2Hechizera(3, numOp3));
                imagenNPC.repaint();
                break;
            case 5:
                npc = "Ladrón";
                op1Button.setText(Ladron.metodo2Ladron(1, numOp1));
                op2Button.setText(Ladron.metodo2Ladron(2, numOp2));
                op3Button.setText(Ladron.metodo2Ladron(3, numOp3));
                imagenNPC.repaint();
                break;
            case 6:
                npc = "Vigilante";
                op1Button.setText(Vigilante.metodo2Vigilante(1, numOp1));
                op2Button.setText(Vigilante.metodo2Vigilante(2, numOp2));
                op3Button.setText(Vigilante.metodo2Vigilante(3, numOp3));
                imagenNPC.repaint();
                break;
        }
        return npc;
    }

    public void setPaths() {
        switch (numNpc) {
            case 1:
                npcImage= "src/main/java/com/proyecto/imagenes/Alex.png";
                bgPath="src/main/java/com/proyecto/imagenes/bgNPC.png";

                break;
            case 2:
                npcImage= "src/main/java/com/proyecto/imagenes/Archibald.png";
                bgPath="src/main/java/com/proyecto/imagenes/bgNPC.png";

                break;
            case 3:
                npcImage= "src/main/java/com/proyecto/imagenes/Damian.png";
                bgPath="src/main/java/com/proyecto/imagenes/bgNPC.png";

                break;
            case 4:
                npcImage= "src/main/java/com/proyecto/imagenes/Diana.png";
                bgPath="src/main/java/com/proyecto/imagenes/bgNPC.png";

                break;
            case 5:
                npcImage= "src/main/java/com/proyecto/imagenes/Ladron.png";
                bgPath="src/main/java/com/proyecto/imagenes/bgNPC.png";

                break;
            case 6:
                npcImage= "src/main/java/com/proyecto/imagenes/Vigilante.png";
                bgPath="src/main/java/com/proyecto/imagenes/bgNPC.png";

                break;
        }
    }

    public void textoNPCs() {
        switch (NpcAleatorio()){
            case "Alex":
                NpcDialog.setText(Alex.metodo1Alex());
                break;
            case "Archibald":
                NpcDialog.setText(Archibald.metodo1Archibald());
                break;
            case "Damian":
                NpcDialog.setText(Damian.metodo1Damian());
                break;
            case "Diana":
                NpcDialog.setText(Diana.metodo1Hechizera());
                break;
            case "Ladrón":
                NpcDialog.setText(Ladron.metodo1Ladron());
                break;
            case "Vigilante":
                NpcDialog.setText(Vigilante.metodo1Vigilante());
                break;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == op1Button) {
            switch (NpcAleatorio()) {
                case "Alex":
                    Alex.metodo3Alex(1,numOp1);
                    break;
                case "Archibald":
                    Archibald.metodo3Archibald(1,numOp1);
                    break;
                case "Damian":
                    Damian.metodo3Damian(1,numOp1);
                    break;
                case "Diana":
                    Diana.metodo3Hechizera(1,numOp1);
                    break;
                case "Ladrón":
                    Ladron.metodo3Ladron(1,numOp1);
                    break;
                case "Vigilante":
                    Vigilante.metodo3Vigilante(1,numOp1);
                    break;
            }
            this.dispose();
        }
        if (e.getSource() == op2Button) {
            switch (NpcAleatorio()) {
                case "Alex":
                    Alex.metodo3Alex(2,numOp2);
                    break;
                case "Archibald":
                    Archibald.metodo3Archibald(2,numOp2);
                    break;
                case "Damian":
                    Damian.metodo3Damian(2,numOp2);
                    break;
                case "Diana":
                    Diana.metodo3Hechizera(2,numOp2);
                    break;
                case "Ladrón":
                    Ladron.metodo3Ladron(2,numOp2);
                    break;
                case "Vigilante":
                    Vigilante.metodo3Vigilante(2,numOp2);
                    break;
            }
            Main.h=FrameNPC.update(Main.h);
            FrameMapa.ventana.setExtendedState(JFrame.NORMAL);
        }
        if (e.getSource() == op3Button) {
            switch (NpcAleatorio()) {
                case "Alex":
                    Alex.metodo3Alex(3,numOp3);
                    break;
                case "Archibald":
                    Archibald.metodo3Archibald(3,numOp3);
                    break;
                case "Damian":
                    Damian.metodo3Damian(3,numOp3);
                    break;
                case "Diana":
                    Diana.metodo3Hechizera(3,numOp3);
                    break;
                case "Ladrón":
                    Ladron.metodo3Ladron(3,numOp3);
                    break;
                case "Vigilante":
                    Vigilante.metodo3Vigilante(3,numOp3);
                    break;
            }
            this.dispose();
        }
    }



    public FrameNPC(FrameMapa frameMapa) {
        this.frameMapa = frameMapa;

        this.setTitle("NPC");

        this.setLocation(GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint());

        this.setUndecorated(true);
        this.setLocationRelativeTo(null);

        // Tamaño de la ventana
        this.setPreferredSize(new Dimension(1280, 720));

        setPaths();
        crearImagen(npcImage);

        // Ventana de Npc
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        NpcPanel = new JPanel();
        op1Button = new JButton();
        op1Button.setBackground(new Color(209, 190, 150));
        op1Button.setForeground(Color.BLACK);
        op1Button.setBorder(new BevelBorder(0,new Color(67, 56, 50),new Color(31,26,17)));
        op2Button = new JButton();
        op2Button.setBackground(new Color(209, 190, 150));
        op2Button.setForeground(Color.BLACK);
        op2Button.setBorder(new BevelBorder(0,new Color(67, 56, 50),new Color(31,26,17)));
        op3Button = new JButton();
        op3Button.setBackground(new Color(209, 190, 150));
        op3Button.setForeground(Color.BLACK);
        op3Button.setBorder(new BevelBorder(0,new Color(67, 56, 50),new Color(31,26,17)));
        JPanel panelBotones = new JPanel(new GridLayout(5, 1));
        panelBotones.setBorder(new EmptyBorder(0, 5, 20, 5));
        panelBotones.setOpaque(false);
        op1Button.addActionListener(this);
        op2Button.addActionListener(this);
        op3Button.addActionListener(this);
        textYButtonsPanel = new JPanelWithBackground2();
        textYButtonsPanel.setLayout(new BorderLayout());
        textYButtonsPanel.setPreferredSize(new Dimension(717, 720));
        NpcPanel.setPreferredSize(new Dimension(1280, 720));
        NpcPanel.setLayout(new BorderLayout());
        imagenNPC = new JPanelWithBackground();
        imagenNPC.setPreferredSize(new Dimension(566, 720));
        NpcDialog = new JTextArea();
        NpcDialog.setEditable(false);
        NpcDialog.setLineWrap(true);
        NpcDialog.setWrapStyleWord(true);
        NpcDialog.setBorder(BorderFactory.createCompoundBorder(NpcDialog.getBorder(), BorderFactory.createEmptyBorder(200, 35, 10, 45)));
        NpcDialog.setOpaque(false);
        textYButtonsPanel.add(NpcDialog, BorderLayout.CENTER);
        panelBotones.add(op1Button);
        panelBotones.add(Box.createVerticalStrut(10));
        panelBotones.add(op2Button);
        panelBotones.add(Box.createVerticalStrut(10));
        panelBotones.add(op3Button);
        textYButtonsPanel.add(panelBotones, BorderLayout.SOUTH);
        NpcPanel.add(imagenNPC, BorderLayout.WEST);
        NpcPanel.add(textYButtonsPanel, BorderLayout.CENTER);
        add(NpcPanel, BorderLayout.CENTER);

        try {
            // Cargar la fuente desde el archivo OTF
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File("src/main/java/com/proyecto/fonts/Mantinia Regular.otf")).deriveFont(12f);

            // Registrar la fuente personalizada en el entorno de gráficos
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(customFont);

            // Obtener el nombre de la fuente cargada
            String fontName = customFont.getFamily();

            NpcDialog.setFont(new Font(fontName, Font.PLAIN, 20));
            op1Button.setFont(new Font(fontName, Font.PLAIN, 20));
            op2Button.setFont(new Font(fontName, Font.PLAIN, 20));
            op3Button.setFont(new Font(fontName, Font.PLAIN, 20));

        }catch (IOException | FontFormatException e) {
            e.printStackTrace();
        }

        NpcAleatorio();
        textoNPCs();

        pack();
        setLocationRelativeTo(null);
        setVisible(true);


    }
}

