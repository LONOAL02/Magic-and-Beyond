package com.proyecto.core;
import com.proyecto.Npcs.FrameNPC;
import Random.RandomLibreria;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;


public class FrameMapa {

    JLayeredPane capas;
    public static JFrame ventana;
    private JPanel panelMapa;
    private Habitacion[][] mapa;
    private Habitacion habitacionActual;
    private int tamañoTablero = 122; // Tamaño del tablero en casillas
    private int tamañoCasillaH = 174;
    private int tamañoCasillaV= 98;

    // Establecer la casilla inicial del personaje
    private int posX =5;
    private int posY =5;
    private int metay;
    private int metax;
    private int filas;
    private int columnas;
    private int idy;
    private int idx;
    private int x = 5;
    private int y = 5;
    int iLejana=5;
    int jLejana=5;



    public FrameMapa(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        mapa = new Habitacion[filas][columnas];
        crearVentana();
        crearPanelMapa();
        crearMapa();
        generarMeta();
        generarParedes();
        añadirCasillas();
        mapa[posX][posY].setEsPared(false);
        agregarListenerTeclado(); // Agregar el listener de teclado
        ventana.setVisible(true);


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
        // Establecer la posición inicial del personaje
        ventana.getContentPane().add(panelMapa);
    }

    private void crearMapa() {

        // Define la posición inicial del jugador
        Random rand = new Random();
        String id = Integer.toString(y) + "," + Integer.toString(x);
        mapa[y][x] = new Habitacion(id,false);
        mapa[y][x].setEsCasillaInicial(true);
        mapa[y][x].setEsDescubierta(true);
        habitacionActual = mapa[y][x];


        // Define el número mínimo de casillas
        int minNumCells = 20;
        int numCells = 1; // Inicia el contador de casillas en 1

        // Define el número de ramas que saldrán de la posición inicial
        int numBranches = rand.nextInt(10) + 2;

        // Genera las ramas aleatoriamente
        while (numCells < minNumCells) {
            int branchLength = rand.nextInt(3) + 3;
            int branchDirection = rand.nextInt(4);

            switch (branchDirection) {
                case 0: // izquierda
                    for (int j = 0; j < branchLength; j++) {
                        if (x - j - 1 >= 0 && mapa[idy=y][idx=(x - j - 1)] == null) {
                            id = Integer.toString(idy) + "," + Integer.toString(idx);
                            mapa[idy][idx] = new Habitacion(id, false);
                            mapa[idy][idx].setEsDescubierta(false);
                            numCells++;
                        }
                    }
                    x = Math.max(x - branchLength, 0);
                    break;
                case 1: // derecha
                    for (int j = 0; j < branchLength; j++) {
                        if (x + j + 1 < columnas && mapa[idy=y][idx=(x + j + 1)] == null) {
                            id = Integer.toString(idy) + "," + Integer.toString(idx);
                            mapa[idy][idx] = new Habitacion(id, false);
                            mapa[idy][idx].setEsDescubierta(false);
                            numCells++;
                        }
                    }
                    x = Math.min(x + branchLength, columnas - 1);
                    break;
                case 2: // arriba
                    for (int j = 0; j < branchLength; j++) {
                        if (y - j - 1 >= 0 && mapa[idy=(y - j - 1)][idx=x] == null) {
                            id = Integer.toString(idy) + "," + Integer.toString(idx);
                            mapa[idy][idx] = new Habitacion(id, false);
                            mapa[idy][idx].setEsDescubierta(false);
                            numCells++;
                        }
                    }
                    y = Math.max(y - branchLength, 0);
                    break;
                case 3: // abajo
                    for (int j = 0; j < branchLength; j++) {
                        if (y + j + 1 < filas && mapa[idy=(y + j + 1)][idx=x] == null) {
                            id = Integer.toString(idy) + "," + Integer.toString(idx);
                            mapa[idy][idx] = new Habitacion(id, false);
                            mapa[idy][idx].setEsDescubierta(false);
                            numCells++;
                        }
                    }
                    y = Math.min(y + branchLength, filas - 1);
                    break;
            }
        }

        int cLejana=0;


        for (int i =0; i<filas;i++){
            for (int j=0; j<columnas; j++){
                if (mapa[i][j]!= null){
                    int resta = Math.abs(5 - i) + Math.abs(5 - j);
                    if (resta >cLejana){
                        cLejana= resta;
                        iLejana=i;
                        jLejana=j;
                    }
                }
            }
        }

        // Establecer la posición inicial del personaje
        habitacionActual.setCasillaOcupada(true);
        habitacionActual.repaint();

    }



    private void moverPersonaje(KeyEvent e) {
        String[] subcadena = habitacionActual.getId().split(",");
        int filaActual = Integer.parseInt(subcadena[0]);
        int columnaActual = Integer.parseInt(subcadena[1]);
        Habitacion nuevaCasilla = null;

        System.out.println(habitacionActual.getId());
        System.out.println(filaActual);
        System.out.println(columnaActual);


        try {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_UP:
                    if (filaActual > 0) {
                        nuevaCasilla = mapa[filaActual - 1][columnaActual];

                    }
                    break;
                case KeyEvent.VK_DOWN:
                    if (filaActual < tamañoTablero - 1) {
                        nuevaCasilla = mapa[filaActual + 1][columnaActual];

                    }
                    break;
                case KeyEvent.VK_LEFT:
                    if (columnaActual > 0) {
                        nuevaCasilla = mapa[filaActual][columnaActual - 1];

                    }
                    break;
                case KeyEvent.VK_RIGHT:
                    if (columnaActual < tamañoTablero - 1) {
                        nuevaCasilla = mapa[filaActual][columnaActual + 1];

                    }
                    break;
            }
        } catch (IndexOutOfBoundsException exc) {
            System.out.println(exc.getMessage());
        }

        // Si se encontró una nueva casilla válida, mover al personaje
        try {
            if (nuevaCasilla != null && !nuevaCasilla.esPared() && !nuevaCasilla.esCasillaOcupada()) {
                habitacionActual.setCasillaOcupada(false);
                boolean estabaDescubierta = nuevaCasilla.esDescubierta();
                nuevaCasilla.setCasillaOcupada(true);
                nuevaCasilla.setEsDescubierta(true);
                habitacionActual.repaint();
                habitacionActual = nuevaCasilla;
                habitacionActual.repaint();
                int x = columnaActual;
                int y = filaActual;
                String[] subcadenaNueva = nuevaCasilla.getId().split(",");
                int filaNueva = Integer.parseInt(subcadenaNueva[0]);
                int columnaNueva = Integer.parseInt(subcadenaNueva[1]);
                if (filaNueva + 1 <= 10) {
                    mapa[filaNueva + 1][columnaNueva].setEsCercana(true);
                    mapa[filaNueva + 1][columnaNueva].repaint();
                }
                if (filaNueva - 1 >= 0) {
                    mapa[filaNueva - 1][columnaNueva].setEsCercana(true);
                    mapa[filaNueva - 1][columnaNueva].repaint();
                }
                if (columnaActual + 1 <= 10) {
                    mapa[filaNueva][columnaNueva + 1].setEsCercana(true);
                    mapa[filaNueva][columnaNueva + 1].repaint();
                }
                if (columnaActual - 1 >= 0) {
                    mapa[filaNueva][columnaNueva - 1].setEsCercana(true);
                    mapa[filaNueva][columnaNueva - 1].repaint();
                }
                // Si el personaje llegó a la meta, mostrar un mensaje de felicitación y cerrar el juego
                if (habitacionActual.esMeta()) {
                    JOptionPane.showMessageDialog(ventana, "¡Felicidades, has llegado a la meta!");
                    ventana.dispose();
                }
                else if (!estabaDescubierta) {
                    int random =  RandomLibreria.numeroAleatorio(10,1);
                    if (random < 7) {
                        // Minimiza el primer JFrame
                        Main.h.inventary.limpiarInventario();
                        FrameCombate.save(Main.h);
                        Main.h.empezarCombate(0);
                        ventana.setExtendedState(JFrame.ICONIFIED);
                        // Crea una instancia del segundo JFrame
                        new FrameCombate(FrameMapa.this);
                    }else {
                        FrameNPC.save(Main.h);
                        ventana.setExtendedState(JFrame.ICONIFIED);
                        new FrameNPC(FrameMapa.this);
                    }
                }
            }
        }catch (IndexOutOfBoundsException exc) {
            System.out.println(exc.getMessage());
        }
    }
    private void generarParedes() {
        // Generar entre 1 y 3 paredes por fila
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
            String id = Integer.toString(j) + "," + Integer.toString(i);
                if (mapa[i][j] == null) {
                    mapa[i][j] = new Habitacion(id, true);
                    mapa[i][j].setColor(Color.GRAY);
                }
            }
        }
            mapa[6][5].setEsCercana(true);
            mapa[6][5].repaint();
            mapa[4][5].setEsCercana(true);
            mapa[4][5].repaint();
            mapa[5][6].setEsCercana(true);
            mapa[5][6].repaint();
            mapa[5][4].setEsCercana(true);
            mapa[5][4].repaint();
    }

    private void generarMeta() {
        // Establecer la casilla como meta
        mapa[iLejana][jLejana].setEsMeta(true);
    }

    private void añadirCasillas(){
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                panelMapa.add(mapa[i][j]);
            }
        }
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





