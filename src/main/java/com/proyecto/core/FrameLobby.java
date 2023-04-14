
package com.proyecto.core;

import com.Random.RandomLibreria;
import com.proyecto.features.ClonarArchivo;
import com.proyecto.features.GuardadoObj;
import com.proyecto.personajes.PPrincipal;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FrameLobby extends JFrame implements ActionListener {

    private JLabel bg;
    private JButton btnJugar;
    private JButton btnTienda;
    private JTextField fieldNombre;
    private JLabel imagenPJ;
    private JScrollPane infoClase;
    private JPanel jPanel1;
    private JTextArea jTextArea1;
    private JButton btnSalir;
    private JLabel labelClase;
    private JLabel labelArma;
    private JLabel labelNombre;
    private JLabel labelPartida;
    private JComboBox<String> selecClase;
    private JComboBox<String> selecPartida;
    private JComboBox<String> selecArma;
    private JLabel titulo;
    int eleccion=0;

    int num1 =  RandomLibreria.numeroAleatorio(29,1);
    int num2 = RandomLibreria.numeroAleatorio(29,1);
    int num3 = RandomLibreria.numeroAleatorio(29,1);

    public FrameLobby() {

        jPanel1 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        labelPartida = new javax.swing.JLabel();
        selecPartida = new javax.swing.JComboBox<>();
        labelNombre = new javax.swing.JLabel();
        labelArma = new javax.swing.JLabel();
        fieldNombre = new javax.swing.JTextField();
        labelClase = new javax.swing.JLabel();
        selecClase = new javax.swing.JComboBox<>();
        selecArma = new javax.swing.JComboBox<>();
        btnJugar = new javax.swing.JButton();
        btnTienda = new javax.swing.JButton();
        infoClase = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        imagenPJ = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();



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



        jPanel1.setPreferredSize(new Dimension(1280, 720));
        jPanel1.setLayout(new AbsoluteLayout());

        btnSalir.setBackground(new Color(0, 51, 51));
        btnSalir.setFont(new Font("Arial", 0, 24));
        btnSalir.setForeground(new Color(255, 255, 255));
        btnSalir.setText("X");
        btnSalir.setAlignmentY(0.0F);
        btnSalir.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(this);
        jPanel1.add(btnSalir, new AbsoluteConstraints(0, 0, 50, 50));

        titulo.setFont(new Font("Mantinia", 1, 36));
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setText("MAGIC AND BEYOND");
        titulo.setToolTipText("");
        titulo.setForeground(new Color(187, 187, 187));
        jPanel1.add(titulo, new AbsoluteConstraints(370, 50, 500, 110));


        labelPartida.setFont(new Font("Mantinia", 1, 14));
        labelPartida.setText("SELECCIONA LA PARTIDA:");
        labelPartida.setForeground(new Color(187, 187, 187));
        jPanel1.add(labelPartida, new AbsoluteConstraints(110, 240, 220, 30));

        selecPartida.setModel(new DefaultComboBoxModel<>(new String[] { " ","Nueva Partida"}));
        if (FrameSalir.archivoG1.length()!=0){
            selecPartida.addItem("Archivo Guardado 1");
        }
        if (FrameSalir.archivoG2.length()!=0){
            selecPartida.addItem("Archivo Guardado 2");
        }
        if (FrameSalir.archivoG3.length()!=0){
            selecPartida.addItem("Archivo Guardado 3");
        }
        selecPartida.addActionListener(this);
        jPanel1.add(selecPartida, new AbsoluteConstraints(100, 280, 310, 40));

        labelArma.setFont(new Font("Mantinia", 1, 14));
        labelArma.setText("ARMA:");
        labelArma.setForeground(new Color(187, 187, 187));
        jPanel1.add(labelArma, new AbsoluteConstraints(110, 520, 120, 20));

        selecArma.setModel(new DefaultComboBoxModel<>(new String[] { " ","Arma 1","Arma 2","Arma 3"}));
        selecArma.addActionListener(this);
        selecArma.setEnabled(false);
        jPanel1.add(selecArma, new AbsoluteConstraints(100, 560, 310, 40));

        labelNombre.setFont(new Font("Mantinia", 1, 14));
        labelNombre.setText("NOMBRE:");
        labelNombre.setForeground(new Color(187, 187, 187));
        jPanel1.add(labelNombre, new AbsoluteConstraints(110, 340, 120, 20));

        fieldNombre.setFont(new Font("Mantinia", 1, 18));
        fieldNombre.setEnabled(false);
        fieldNombre.addActionListener(this);

        jPanel1.add(fieldNombre, new AbsoluteConstraints(100, 370, 310, 40));

        labelClase.setFont(new Font("Mantinia", 1, 14));
        labelClase.setText("CLASE:");
        labelClase.setForeground(new Color(187, 187, 187));
        jPanel1.add(labelClase, new AbsoluteConstraints(110, 420, 220, 30));

        selecClase.setModel(new DefaultComboBoxModel<>(new String[] { " ","Heroe", "Guerrero", "Astrólogo", "Profeta" }));
        selecClase.addActionListener(this);
        selecClase.setEnabled(false);
        jPanel1.add(selecClase, new AbsoluteConstraints(100, 460, 310, 40));

        btnJugar.setFont(new Font("Mantinia", 1, 24));
        btnJugar.setText("JUGAR");
        btnJugar.setEnabled(false);
        btnJugar.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
        btnJugar.addActionListener(this);

        jPanel1.add(btnJugar, new AbsoluteConstraints(470, 550, 300, 60));

        btnTienda.setFont(new Font("Mantinia", 1, 24));
        btnTienda.setText("COMING SOON");
        btnTienda.setEnabled(false);
        btnTienda.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnTienda, new AbsoluteConstraints(470, 630, 300, 60));

        jTextArea1.setFont(new Font("Mantinia", 0, 18));
        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        infoClase.setViewportView(jTextArea1);
        infoClase.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel1.add(infoClase, new AbsoluteConstraints(490, 230, 270, 280));

        imagenPJ.setIcon(new javax.swing.ImageIcon("src/main/java/com/proyecto/imagenes/ui/lobby/pj.png"));
        jPanel1.add(imagenPJ, new AbsoluteConstraints(870, 210, -1, -1));

        bg.setBackground(new java.awt.Color(102, 102, 102));
        bg.setIcon(new javax.swing.ImageIcon("src/main/java/com/proyecto/imagenes/ui/lobby/bg.jpg"));
        bg.setText("jLabel2");
        jPanel1.add(bg, new AbsoluteConstraints(0, 0, 1280, 720));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSalir) {
            System.exit(0);
        }
        if (e.getSource() == fieldNombre) {
            Main.h.pj.setNombre(fieldNombre.getText());
            if(fieldNombre.getText().isEmpty()){
                selecClase.setEnabled(false);
            }else {
                selecClase.setEnabled(true);
            }
        }
        if (e.getSource() == selecClase) {
            String selection = (String) selecClase.getSelectedItem();
            Main.h.selecClase(selection);
            if (selection.equals("Heroe")| selection.equals("Profeta")|selection.equals("Guerrero")|selection.equals("Astrólogo")) {
                selecArma.setEnabled(true);
                jTextArea1.setText("Nombre: "+selection+"\n"+"Vida: "+Main.h.vidaMax+"\n"+Main.h.pj.toString()+"\nMana: "+Main.h.pj.getMana());
            }else {
                jTextArea1.setText("");
                selecArma.setEnabled(false);
            }
        }
        if (e.getSource() == selecPartida) {
            String selection = (String) selecPartida.getSelectedItem();
            if (selection.equals("Nueva Partida")) {
                fieldNombre.setEnabled(true);
            }else if (selection.contains("Archivo Guardado")) {
                selecClase.setEnabled(false);
                btnJugar.setEnabled(true);
            }else{
                selecClase.setEnabled(false);
                btnJugar.setEnabled(false);
            }
        }
        if (e.getSource() == btnJugar) {
            if (selecPartida.getSelectedItem().equals("Nueva Partida")) {
                Main.h.inventary.agregarItem(Main.h.oro.getOro());
                Main.h.pjSave = new PPrincipal(Main.h.pj.getNombre(),Main.h.pj.getVida(), Main.h.pj.getAtaque(), Main.h.pj.getVelAtaque(), Main.h.pj.getMana(),Main.h.pj.getNivel(),Main.h.pj.getClase(),Main.h.pj.getNumarma(),Main.h.pj.getFuerza(),Main.h.pj.getDestreza(),Main.h.pj.getInteligencia(),Main.h.pj.getFe());
                Main.h.eleccionArma(eleccion,num1,num2,num3);
                GuardadoObj.guardarObjeto(Main.h.pjSave);
                Main.h.addCuras();
                Main.h.inventary.guardarInventario();
                ClonarArchivo.clonarInventario("inventario.txt","inventarioP.txt");
                ClonarArchivo.clonarInventario("pjObjeto.dat","pjObjetoP.dat");
            }
            else if (selecPartida.getSelectedItem().equals("Archivo Guardado 1")) {
                ClonarArchivo.clonarInventario("save1.txt","inventario.txt");
                ClonarArchivo.clonarInventario("pj1.dat","pjObjeto.dat");
                Main.h.inventary.cargarInventario();
                Main.h.pj=GuardadoObj.cargarObjeto();
            }
            else if (selecPartida.getSelectedItem().equals("Archivo Guardado 2")) {
                ClonarArchivo.clonarInventario("save2.txt","inventario.txt");
                ClonarArchivo.clonarInventario("pj2.dat","pjObjeto.dat");
                Main.h.inventary.cargarInventario();
                Main.h.pj=GuardadoObj.cargarObjeto();
            }
            else if (selecPartida.getSelectedItem().equals("Archivo Guardado 3")) {
                ClonarArchivo.clonarInventario("save3.txt","inventario.txt");
                ClonarArchivo.clonarInventario("pj3.dat","pjObjeto.dat");
                Main.h.inventary.cargarInventario();
                Main.h.pj=GuardadoObj.cargarObjeto();
            }
            new FrameMapa(11,11);
            this.dispose();
        }

        if (e.getSource() == selecArma) {

            if (selecArma.getSelectedItem().equals("Arma 1")) {
                Main.h.arma.armaComun(num1);
                jTextArea1.setText("Arma 1:\n" + Main.h.arma.nombreArma + "\n" + Main.h.arma.toString());
                eleccion=1;
                btnJugar.setEnabled(true);
            }
            else if (selecArma.getSelectedItem().equals("Arma 2")){
                Main.h.arma.armaComun(num2);
                jTextArea1.setText("Arma 2:\n" + Main.h.arma.nombreArma+"\n"+Main.h.arma.toString());
                eleccion=2;
                btnJugar.setEnabled(true);
            }
            else if (selecArma.getSelectedItem().equals("Arma 3")) {
                Main.h.arma.armaComun(num3);
                jTextArea1.setText("Arma 3:\n" + Main.h.arma.nombreArma + "\n" + Main.h.arma.toString());
                eleccion=3;
                btnJugar.setEnabled(true);
            }else {
                btnJugar.setEnabled(false);
            }
        }
    }
}
