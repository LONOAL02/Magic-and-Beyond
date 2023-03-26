
package com.proyecto.core;


import Random.RandomLibreria;
import com.proyecto.inv.Item;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameCofre extends javax.swing.JFrame implements ActionListener {

    public static Historia h = new Historia();

    private FrameMapa frameMapa;

    int eleccion=0;

    int num1 =  RandomLibreria.numeroAleatorio(29,1);
    int num2 = RandomLibreria.numeroAleatorio(29,1);
    int num3 = RandomLibreria.numeroAleatorio(29,1);

    private JLabel bg;
    private JLabel cofreAbierto;
    private JLabel cofreCerrado;
    private JButton botonP;
    private JPanel panelP;
    private JLabel labelObj;

    public static Historia save(Historia h1){
        h = h1;
        return h;
    }

    public static Historia update(Historia h1){
        h1 = h;
        return h1;
    }

    public FrameCofre(FrameMapa frameMapa) {
        this.frameMapa = frameMapa;

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
        panelP.add(labelObj, new AbsoluteConstraints(520, 20,400,70));

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


    public String generarItem(){
        int random=RandomLibreria.numeroAleatorio(6,1);
        Item item;
        switch (random){
            case 1:
                item=FrameCofre.h.arma.armaComun(num1);
                FrameCofre.h.inventary.agregarItem(item);
                return item.getNombre();
            case 2:
                item= FrameCofre.h.curas.getCuraRandom();
                FrameCofre.h.inventary.agregarItem(item);
                return item.getNombre();
            case 3:
                item= FrameCofre.h.dmgI.getDmgIRandom();
                FrameCofre.h.inventary.agregarItem(item);
                return item.getNombre();
            case 4:
                item = FrameCofre.h.hechizos.getHechizoBase(RandomLibreria.numeroAleatorio(4,1));
                FrameCofre.h.inventary.agregarItem(item);
                return item.getNombre();
            case 5:
                item= FrameCofre.h.reliq.relNormales(RandomLibreria.numeroAleatorio(6,1));
                FrameCofre.h.inventary.agregarItem(item);
                return item.getNombre();
            case 6:
                int cantOro= RandomLibreria.numeroAleatorio(200,100);
                FrameCofre.h.oro.ganarOro(cantOro);
                return cantOro+" de Oro.";
            default:
                return null;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== botonP){
            if(botonP.getText().equals("ABRIR")){
                String nombre= generarItem();
                labelObj.setText(nombre);
                cofreAbierto.setVisible(true);
                cofreCerrado.setVisible(false);
                botonP.setText("COGER");

            }else{
                Main.h=FrameCofre.update(Main.h);
                FrameMapa.ventana.setExtendedState(JFrame.NORMAL);
                this.dispose();
            }
        }
    }
}
