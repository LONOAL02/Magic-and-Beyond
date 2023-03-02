package com.proyecto.core;
import javax.swing.*;
import java.awt.*;
public class FrameMapa extends JFrame {


        public FrameMapa() {
            super("Magic and Beyond");
            this.setUndecorated(true);
            this.setLocationRelativeTo(null);
            setSize(800, 600);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setResizable(false);
            setLayout(new GridLayout(3, 3)); // Puedes ajustar el número de habitaciones del mapa aquí

            // Agregar las habitaciones al mapa
            for (int i = 0; i < 9; i++) {
                Habitacion habitacion = new Habitacion(i, i == 4); // La primera habitación es la casilla inicial
                add(habitacion);
            }

            setVisible(true);
        }


    }

    class Habitacion extends JPanel {
        private int id;
        private boolean esCasillaInicial;

        public Habitacion(int id, boolean esCasillaInicial) {
            this.id = id;
            this.esCasillaInicial = esCasillaInicial;
            setBorder(BorderFactory.createLineBorder(Color.BLACK));

            if (esCasillaInicial) {
                // Agregar un icono para representar al personaje en la casilla inicial
                JPanel panelInterno = new JPanel(new GridBagLayout());
                GridBagConstraints c = new GridBagConstraints();
                c.gridx = 0;
                c.gridy = 0;
                c.weightx = 1.0;
                c.weighty = 1.0;
                c.anchor = GridBagConstraints.CENTER;
                JLabel personaje = new JLabel(new ImageIcon("src/main/java/com/proyecto/imagenes/pjPrincipal.png"));
                panelInterno.add(personaje, c);
                add(panelInterno);
            }
        }

        public int getId() {
            return id;
        }

        public boolean esCasillaInicial() {
            return esCasillaInicial;
        }
    }



