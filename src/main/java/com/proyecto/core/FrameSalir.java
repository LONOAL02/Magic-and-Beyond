package com.proyecto.core;

import com.proyecto.features.ClonarArchivo;
import com.proyecto.features.GuardadoObj;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class FrameSalir extends JFrame implements ActionListener{

    public static File archivoG1 = new File("src/main/java/com/proyecto/files/save1.txt");
    public static File archivoG2 = new File("src/main/java/com/proyecto/files/save2.txt");
    public static File archivoG3 = new File("src/main/java/com/proyecto/files/save3.txt");

    static Historia h = new Historia();
    private JButton guardarYSalirButton;
    private JButton salirSinGuardarButton;
    private JButton save1Button;
    private JButton save2Button;
    private JButton save3Button;
    private JLabel textoSalida;


    public FrameSalir() {

        super("Frame de salida");

        this.setUndecorated(true);
        this.setLocationRelativeTo(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panel = new JPanel(new GridLayout(5, 1));

        salirSinGuardarButton = new JButton("Salir sin guardar");
        salirSinGuardarButton.addActionListener(this);
        panel.add(salirSinGuardarButton);

        guardarYSalirButton = new JButton("Guardar y Salir");
        guardarYSalirButton.addActionListener(this);
        panel.add(guardarYSalirButton);

        save1Button = new JButton("Archivo Guardado 1");
        save1Button.addActionListener(this);
        save1Button.setEnabled(false);
        panel.add(save1Button);


        save2Button = new JButton("Archivo Guardado 2");
        save2Button.addActionListener(this);
        save2Button.setEnabled(false);
        panel.add(save2Button);

        save3Button = new JButton("Archivo Guardado 3");
        save3Button.addActionListener(this);
        save3Button.setEnabled(false);
        panel.add(save3Button);

        textoSalida = new JLabel("Selecciona una de las dos opciones");
        add(textoSalida,BorderLayout.CENTER);
        add(panel,BorderLayout.SOUTH);



        pack();
        setLocationRelativeTo(null);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==salirSinGuardarButton){
            GuardadoObj.borrarObjetos();
            h.inventary.vaciarInventario();
            h.inventary.guardarInventario();
            System.exit(0);
        }
        if (e.getSource()==guardarYSalirButton){
            guardarYSalirButton.setEnabled(false);
            salirSinGuardarButton.setEnabled(false);
            save1Button.setEnabled(true);
            save2Button.setEnabled(true);
            save3Button.setEnabled(true);
            if (archivoG1.length()==0){
                save1Button.setText("Archivo Guardado 1, Vacio");
            }
            if (archivoG2.length()==0){
                save2Button.setText("Archivo Guardado 2, Vacio");
            }
            if (archivoG3.length()==0){
                save3Button.setText("Archivo Guardado 3, Vacio");
            }
        }
        if (e.getSource()==save1Button){
            ClonarArchivo.clonarInventario("inventarioP.txt","save1.txt");
            ClonarArchivo.clonarInventario("pjObjetoP.dat","pj1.dat");
            GuardadoObj.borrarObjetos();
            h.inventary.vaciarInventario();
            h.inventary.guardarInventario();
            System.exit(0);
        }
        if (e.getSource()==save2Button){
            ClonarArchivo.clonarInventario("inventarioP.txt","save2");
            ClonarArchivo.clonarInventario("pjObjetoP.dat","pj2.dat");
            GuardadoObj.borrarObjetos();
            h.inventary.vaciarInventario();
            h.inventary.guardarInventario();
            System.exit(0);
        }
        if (e.getSource()==save3Button){
            ClonarArchivo.clonarInventario("inventarioP.txt","save3");
            ClonarArchivo.clonarInventario("pjObjetoP.dat","pj2.dat");
            GuardadoObj.borrarObjetos();
            h.inventary.vaciarInventario();
            h.inventary.guardarInventario();
            System.exit(0);
        }
    }
}
