package com.proyecto.core;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class FramePrincipal extends JFrame implements ActionListener {

    static Historia h = new Historia();
    DecimalFormat format1 = new DecimalFormat("#");

    private JLabel playerLabel;
    private JLabel enemyLabel;
    private JLabel playerHealthLabel;
    private JLabel enemyHealthLabel;
    private JButton attackButton;
    private JButton healthButton;
    private JButton seeButton;
    private JButton useButton;
    private JComboBox<String> attacksComboBox;
    private JComboBox<String> healthComboBox;
    private JComboBox<String> inventoryComboBox;
    private JTextArea logTextArea;

    private float playerHealth= h.pj.getVida();
    private float enemyHealth= h.pj.getVida();


    public static Historia save(Historia h1){
        h = h1;
        return h;
    }

    public static Historia update(Historia h1){
        h1 = h;
        return h1;
    }




    public FramePrincipal() {
        super("Magic and Beyond");
        //Línea 1
        this.setSize(new Dimension(800, 600));

        //Línea 2
        this.setMinimumSize(new Dimension(600, 400));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Crear los paneles de los PJs
        JPanel playerPanel = new JPanel(new BorderLayout());
        playerLabel = new JLabel(h.pj.nombre, JLabel.CENTER);
        playerHealthLabel = new JLabel("HP: " + format1.format(playerHealth), JLabel.CENTER);
        playerPanel.add(playerLabel, BorderLayout.CENTER);
        playerPanel.add(playerHealthLabel, BorderLayout.SOUTH);
        add(playerPanel, BorderLayout.WEST);

        JPanel opponentPanel = new JPanel(new BorderLayout());
        enemyLabel = new JLabel(h.enemy.nombre, JLabel.CENTER);
        enemyHealthLabel = new JLabel("HP: " + format1.format(enemyHealth), JLabel.CENTER);
        opponentPanel.add(enemyLabel, BorderLayout.CENTER);
        opponentPanel.add(enemyHealthLabel, BorderLayout.SOUTH);
        add(opponentPanel, BorderLayout.EAST);

        // Crear el panel de ataque
        JPanel attackPanel = new JPanel(new BorderLayout());
        attacksComboBox = new JComboBox<>(new String[]{"Cuerpo (90% Daño x1)", "Piernas (70% Daño x2)", "Cabeza (50% Daño x3)"});
        attackPanel.add(attacksComboBox, BorderLayout.CENTER);
        attackButton = new JButton("Atacar");
        attackButton.addActionListener(this);
        attackPanel.add(attackButton, BorderLayout.EAST);
        add(attackPanel, BorderLayout.SOUTH);

        // Crear el panel de vida
        JPanel healthPanel = new JPanel(new BorderLayout());
        healthComboBox = new JComboBox<>(new String[]{"Viales de 50.","Viales de 100.","Viales de 200."});
        healthPanel.add(healthComboBox, BorderLayout.CENTER);
        healthButton = new JButton("Curar");
        healthButton.addActionListener(this);
        healthPanel.add(healthButton, BorderLayout.EAST);
        attackPanel.add(healthPanel, BorderLayout.SOUTH);

        // Crear el panel de inventario
        JPanel inventoryPanel = new JPanel(new BorderLayout());
        inventoryComboBox = new JComboBox<>(h.inventary.obtenerNombresComoArray());
        inventoryPanel.add(inventoryComboBox, BorderLayout.CENTER);
        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        seeButton = new JButton("Ver");
        useButton = new JButton("usar");
        seeButton.addActionListener(this);
        useButton.addActionListener(this);
        panelBotones.add(seeButton);
        panelBotones.add(useButton);
        inventoryPanel.add(panelBotones,BorderLayout.EAST);
        healthPanel.add(inventoryPanel, BorderLayout.SOUTH);


        // Crear el área de registro de ataques
        logTextArea = new JTextArea();
        logTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(logTextArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(scrollPane, BorderLayout.CENTER);

        // Añadir todo al JFrame
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

        logTextArea.append("Te encuentras con "+h.enemy.nombre+"\n");
        logTextArea.append("Te quedan: \n" + h.curas.curas50.getCantidad() + " viales de 50"+"\n"+h.curas.curas100.getCantidad() + " viales de 100"+"\n"+h.curas.curas200.getCantidad() + " viales de 200"+"\n");

    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == attackButton) {
            String attack = (String) attacksComboBox.getSelectedItem();
            int precision = calculateDamage(attack);
            float daño = h.combate.atacar(precision, h.pj.calcularAtaque(), h.arma.getDaño());
            enemyHealth -= daño;
            if (enemyHealth <= 0) {
                enemyHealth = 0;
                enemyHealthLabel.setText("HP: " + format1.format(enemyHealth));
                logTextArea.append("Enemigo derrotado!\n");
                attackButton.setEnabled(false);
                healthButton.setEnabled(false);
            } else {
                enemyHealthLabel.setText("HP: " + format1.format(enemyHealth));
                if (daño == 0) {
                    logTextArea.append("Fallaste" + "!\n");
                } else {
                    logTextArea.append("Ataque realizado" + "!\n");
                    logTextArea.append("El oponente " + enemyLabel.getText() + " recibió " + format1.format(daño) + " de daño.\n");
                }
                opponentAttack();
            }
        }
        if (e.getSource() == healthButton) {
            String health = (String) healthComboBox.getSelectedItem();
            int elecCuras = calculateHealth(health);
            switch (elecCuras) {
                case 1 -> playerHealth=(h.curas.curacion50(playerHealth, h.vidaMax));
                case 2 -> playerHealth=(h.curas.curacion100(playerHealth, h.vidaMax));
                case 3 -> playerHealth=(h.curas.curacion200(playerHealth, h.vidaMax));
            }
            playerHealthLabel.setText("HP: " + format1.format(playerHealth));
            logTextArea.append("Te quedan: \n" + h.curas.curas50.getCantidad() + " viales de 50"+"\n"+h.curas.curas100.getCantidad() + " viales de 100"+"\n"+h.curas.curas200.getCantidad() + " viales de 200"+"\n");
        }
        if (e.getSource() == seeButton) {
        String item = (String) inventoryComboBox.getSelectedItem();
        logTextArea.append(h.inventary.mostrarValores(item));
        }
        if (e.getSource() == useButton) {

        }

    }


    private int calculateDamage(String attack) {
        switch (attack) {
            case "Cuerpo (90% Daño x1)":
                return 1;
            case "Piernas (70% Daño x2)":
                return 2;
            case "Cabeza (50% Daño x3)":
                return 3;
            default:
                return 0;
        }
    }

    private int calculateHealth(String health) {
        switch (health) {
            case "Viales de 50.":
                return 1;
            case "Viales de 100.":
                return 2;
            case "Viales de 200.":
                return 3;
            default:
                return 0;
        }
    }

    private void opponentAttack() {
        float daño =h.combate.recibirAtaque(h.enemy.getAtaque());
        playerHealth -= daño;
        if (playerHealth <= 0) {
            playerHealth = 0;
            playerHealthLabel.setText("HP: " + format1.format(playerHealth));
            logTextArea.append("Has muerto\n");
            attackButton.setEnabled(false);
        } else {
            playerHealthLabel.setText("HP: " + format1.format(playerHealth));
            if (daño==0){
                logTextArea.append("El oponente " + enemyLabel.getText()+ " falló" + "!\n");
            }else {
                logTextArea.append("El oponente " + enemyLabel.getText()+ " realizó un ataque" + "!\n");
                logTextArea.append("Recibiste " + format1.format(daño) + " de daño.\n");
            }
        }
    }


}
