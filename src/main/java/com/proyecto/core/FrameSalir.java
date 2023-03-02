package com.proyecto.core;

import com.proyecto.features.GuardadoObj;
import com.proyecto.features.Inventario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class FrameSalir extends JFrame {

    static Historia h = new Historia();


    public FrameSalir() {
        super("Frame de salida");

        this.setUndecorated(true);
        this.setLocationRelativeTo(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panel = new JPanel(new GridLayout(1, 2));

        JButton guardarYSalirButton = new JButton("Salir guardando");
        guardarYSalirButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // aquí iría el código para guardar y salir
                System.exit(0);
            }
        });
        panel.add(guardarYSalirButton);

        JButton salirSinGuardarButton = new JButton("Salir sin guardar");
        salirSinGuardarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // aquí iría el código para salir sin guardar
                GuardadoObj.borrarObjetos();
                h.inventary.vaciarInventario();
                h.inventary.guardarInventario();
                System.exit(0);
            }
        });
        panel.add(salirSinGuardarButton);

        JLabel textoSalida = new JLabel("Selecciona una de las dos opciones");
        add(textoSalida,BorderLayout.CENTER);
        add(panel,BorderLayout.SOUTH);


        pack();
        setLocationRelativeTo(null);
        setVisible(true);

    }

}
