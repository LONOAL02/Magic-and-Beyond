package com.proyecto.core;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;


public class FrameMapa {

    JLayeredPane capas;
    private JFrame ventana;
    private JPanel panelMapa;
    JLabel personajeLabel = new JLabel(new ImageIcon("src/main/java/com/proyecto/imagenes/pjPrincipal.png"));
    private Habitacion[][] mapa;
    private Habitacion habitacionActual;
    private int tamañoTablero = 100; // Tamaño del tablero en casillas
    private int tamañoCasillaH = 174;
    private int tamañoCasillaV= 98;

    // Establecer la casilla inicial del personaje
    private int posX =5;
    private int posY =5;
    private int metay;
    private int metax;
    private int filas;
    private int columnas;



    public FrameMapa(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        mapa = new Habitacion[filas][columnas];
        crearVentana();
        crearPanelMapa();
        crearMapa();
        generarMeta();
        generarParedes();
        mapa[posX][posY].setEsPared(false);
        agregarListenerTeclado(); // Agregar el listener de teclado
        ventana.setVisible(true);
    }

    private String establecerColumnas(int numCol){
        return Character.toString((char) ('A' + (numCol - 1)));
    }

    public static int getNumber(String letter) {
        return letter.toUpperCase().charAt(0) - 'A' + 1;
    }

    private void crearVentana() {
        ventana = new JFrame("Juego");
        ventana.setUndecorated(true);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(1920, 1080);
        ventana.setLocationRelativeTo(null);
        ventana.setFocusable(true);
        ventana.requestFocusInWindow();

        // Crea un JLayeredPane y añade los componentes en diferentes capas
        capas = new JLayeredPane();
        capas.setPreferredSize(new Dimension(1920, 1080));
        ventana.getContentPane().add(capas);

        ventana.pack();
        ventana.setVisible(true);
    }

    private void crearPanelMapa() {
        panelMapa = new JPanel(new GridLayout(filas, columnas));
        panelMapa.setOpaque(true);
        // Agregar el panel de mapas y el personaje a la misma capa
        capas.add(panelMapa, JLayeredPane.DEFAULT_LAYER);
        capas.add(personajeLabel, JLayeredPane.PALETTE_LAYER);
        // Establecer la posición inicial del personaje
        personajeLabel.setBounds(1044-tamañoCasillaH, 451, tamañoCasillaH, tamañoCasillaV);
        ventana.getContentPane().add(panelMapa);
    }

    private void crearMapa() {

        // Crear las casillas del mapa
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i == posX & j == posY) {
                    mapa[i][j] = new Habitacion(establecerColumnas(j)+i, true);
                    panelMapa.add(mapa[i][j]);
                    habitacionActual = mapa[i][j];
                } else
                    mapa[i][j] = new Habitacion(establecerColumnas(j)+i, false);
                panelMapa.add(mapa[i][j]);
            }
        }
        // Establecer la posición inicial del personaje
        habitacionActual.setCasillaOcupada(true);
        habitacionActual.repaint();
    }



    private void moverPersonaje(KeyEvent e) {
        int filaActual = Integer.parseInt(habitacionActual.getId().substring(1,2));
        int columnaActual = getNumber(habitacionActual.getId().substring(0,1));
        Habitacion nuevaCasilla = null;

        System.out.println(habitacionActual.getId());
        System.out.println(filaActual);
        System.out.println(columnaActual);


        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                if (filaActual > 0) {
                    nuevaCasilla = mapa[filaActual - 1][columnaActual];
                    habitacionActual = nuevaCasilla;
                    personajeLabel.setLocation(personajeLabel.getX(), personajeLabel.getY() - tamañoCasillaV);
                    panelMapa.repaint();
                    personajeLabel.repaint();
                }
                break;
            case KeyEvent.VK_DOWN:
                if (filaActual < tamañoTablero - 1) {
                    nuevaCasilla = mapa[filaActual + 1][columnaActual];
                    habitacionActual = nuevaCasilla;
                    personajeLabel.setLocation(personajeLabel.getX(), personajeLabel.getY() + tamañoCasillaV);
                    panelMapa.repaint();
                    personajeLabel.repaint();
                }
                break;
            case KeyEvent.VK_LEFT:
                if (columnaActual > 0) {
                    nuevaCasilla = mapa[filaActual][columnaActual - 1];
                    habitacionActual = nuevaCasilla;
                    personajeLabel.setLocation(personajeLabel.getX() - tamañoCasillaH, personajeLabel.getY());
                    panelMapa.repaint();
                    personajeLabel.repaint();
                }
                break;
            case KeyEvent.VK_RIGHT:
                if (columnaActual < tamañoTablero - 1) {
                    nuevaCasilla = mapa[filaActual][columnaActual + 1];
                    habitacionActual = nuevaCasilla;
                    personajeLabel.setLocation(personajeLabel.getX() + tamañoCasillaH, personajeLabel.getY());
                    panelMapa.repaint();
                    personajeLabel.repaint();
                }
                break;
        }

        // Si se encontró una nueva casilla válida, mover al personaje
        if (nuevaCasilla != null && !nuevaCasilla.esPared() && !nuevaCasilla.esCasillaOcupada()) {
            habitacionActual.setCasillaOcupada(false);
            nuevaCasilla.setCasillaOcupada(true);
            habitacionActual = nuevaCasilla;
            habitacionActual.repaint();
            int x = columnaActual;
            int y = filaActual;
            // Si el personaje llegó a la meta, mostrar un mensaje de felicitación y cerrar el juego
            if (habitacionActual.esMeta()) {
                JOptionPane.showMessageDialog(ventana, "¡Felicidades, has llegado a la meta!");
                ventana.dispose();
            }
        }
    }
    private void generarParedes() {
        Random rand = new Random();
        // Generar entre 1 y 3 paredes por fila
        for (int i = 0; i < filas; i++) {
            int numParedes = rand.nextInt(3) + 1;
            for (int j = 0; j < numParedes; j++) {
                if ((i!= posX &&j!= posY)&&(i!= metax &&j!= metay)) {
                    int columna = rand.nextInt(columnas);
                    mapa[i][columna].setEsPared(true);
                    mapa[i][columna].setColor(Color.GRAY);
                }
            }
        }
    }

    private void generarMeta() {
        Random rand = new Random();
        int fila = rand.nextInt(filas);
        int columna = rand.nextInt(columnas);
        // Establecer la casilla como meta
        mapa[fila][columna].setEsMeta(true);
        mapa[fila][columna].setColor(Color.GREEN);
        metax=filas;
        metay=columnas;
    }

    private void agregarListenerTeclado() {
        ventana.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                moverPersonaje(e);
            }
        });
    }


}





