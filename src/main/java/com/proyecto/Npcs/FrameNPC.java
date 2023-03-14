package com.proyecto.Npcs;

import com.proyecto.core.FrameCombate;
import com.proyecto.core.Historia;
import com.proyecto.inventario.Item;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.EventObject;

public class FrameNPC extends JFrame implements ActionListener {

    public static Historia h = new Historia();

    String npc;
    int numOp1 = (int) (Math.random() * 2 + 1);
    int numOp2 = (int) (Math.random() * 2 + 1);
    int numOp3 = (int) (Math.random() * 2 + 1);
    int numNpc = (int) (Math.random() * 6 + 1);


    private JPanel imagenPj;
    private JPanel textYButtonsPanel;
    private JPanel NpcPanel;
    private JTextArea NpcDialog;
    public static JButton op1Button;
    public static JButton op2Button;
    public static JButton op3Button;

    private static String npcImage;


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
            g.drawImage(new ImageIcon("src/main/java/com/proyecto/imagenes/bgNPC.png").getImage(), 0, 0, getWidth(), getHeight(), this);
            super.paintComponent(g);
        }
    }

    private static class JPanelWithBackground2 extends JPanel {

        private Image background;

        public JPanelWithBackground2() {
            background = new ImageIcon("src/main/java/com/proyecto/imagenes/fondo2.jpg").getImage();
            setOpaque(false);
        }

        @Override
        protected void paintComponent(Graphics g) {
            g.drawImage(background, 0, 0, getWidth(), getHeight(), this);
            super.paintComponent(g);
        }
    }

    private static class JPanelWithBackground3 extends JPanel {

        private Image background;

        public JPanelWithBackground3() {
            background = new ImageIcon("src/main/java/com/proyecto/imagenes/fondoNPC.png").getImage();
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
            File backgroundFile = new File("src/main/java/com/proyecto/imagenes/fondoNPC.png");
            File imageFile = new File(path);
            BufferedImage backgroundImage = ImageIO.read(backgroundFile);
            BufferedImage image = ImageIO.read(imageFile);

            // crear una nueva imagen con el mismo tamaño que el background
            BufferedImage combined = new BufferedImage(563, 720, BufferedImage.TYPE_INT_ARGB);

            // dibujar el background en la nueva imagen
            Graphics2D g = (Graphics2D) combined.getGraphics();
            g.drawImage(backgroundImage, 0, 0, null);

            // dibujar la imagen encima del background
            g.drawImage(image, 68, 5, null);

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
                npcImage= "src/main/java/com/proyecto/imagenes/Alex.png";
                break;
            case 2:
                npc = "Archibald";
                op1Button.setText(Archibald.metodo2Archibald(1, numOp1));
                op2Button.setText(Archibald.metodo2Archibald(2, numOp2));
                op3Button.setText(Archibald.metodo2Archibald(3, numOp3));
                npcImage= "src/main/java/com/proyecto/imagenes/Archibald.png";
                break;
            case 3:
                npc = "Damian";
                op1Button.setText(Damian.metodo2Damian(1, numOp1));
                op2Button.setText(Damian.metodo2Damian(2, numOp2));
                op3Button.setText(Damian.metodo2Damian(3, numOp3));
                npcImage= "src/main/java/com/proyecto/imagenes/Damian.png";
                break;
            case 4:
                npc = "Diana";
                op1Button.setText(Diana.metodo2Hechizera(1, numOp1));
                op2Button.setText(Diana.metodo2Hechizera(2, numOp2));
                op3Button.setText(Diana.metodo2Hechizera(3, numOp3));
                npcImage= "src/main/java/com/proyecto/imagenes/Diana.png";
                break;
            case 5:
                npc = "Ladrón";
                op1Button.setText(Ladron.metodo2Ladron(1, numOp1));
                op2Button.setText(Ladron.metodo2Ladron(2, numOp2));
                op3Button.setText(Ladron.metodo2Ladron(3, numOp3));
                npcImage= "src/main/java/com/proyecto/imagenes/Ladron.png";
                break;
            case 6:
                npc = "Vigilante";
                op1Button.setText(Vigilante.metodo2Vigilante(1, numOp1));
                op2Button.setText(Vigilante.metodo2Vigilante(2, numOp2));
                op3Button.setText(Vigilante.metodo2Vigilante(3, numOp3));
                npcImage= "src/main/java/com/proyecto/imagenes/Vigilante.png";
                break;
        }
        return npc;
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
        NpcPanel = new JPanel();
        op1Button = new JButton();
        op2Button = new JButton();
        op3Button = new JButton();
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
        imagenPj = new JPanelWithBackground();
        imagenPj.setPreferredSize(new Dimension(563, 720));
        NpcDialog = new JTextArea();
        NpcDialog.setEditable(false);
        NpcDialog.setLineWrap(true);
        NpcDialog.setWrapStyleWord(true);
        NpcDialog.setBorder(BorderFactory.createCompoundBorder(NpcDialog.getBorder(), BorderFactory.createEmptyBorder(280, 10, 10, 10)));
        NpcDialog.setOpaque(false);
        NpcDialog.setText(Alex.metodo1Alex());
        textYButtonsPanel.add(NpcDialog, BorderLayout.CENTER);
        panelBotones.add(op1Button);
        panelBotones.add(Box.createVerticalStrut(10));
        panelBotones.add(op2Button);
        panelBotones.add(Box.createVerticalStrut(10));
        panelBotones.add(op3Button);
        textYButtonsPanel.add(panelBotones, BorderLayout.SOUTH);
        NpcPanel.add(imagenPj, BorderLayout.WEST);
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

        }catch (IOException | FontFormatException e) {
            e.printStackTrace();
        }

        NpcAleatorio();
        crearImagen(npcImage);
        textoNPCs();

        pack();
        setLocationRelativeTo(null);
        setVisible(true);


    }
}

