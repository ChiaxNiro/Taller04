package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiEquipos extends JFrame {
    private JButton chileButton;
    private JButton alemaniaButton;
    private JButton cameroonButton;
    private JButton australiaButton;
    private JButton exitButton;
    private JButton jugadoresButton;
    private JButton botonExit;
    private JButton BotonJugadores;

    public GuiEquipos() {
        setTitle("Menu Equipos");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2, 10, 10));

        chileButton = new JButton("Chile");
        alemaniaButton = new JButton("Alemania");
        cameroonButton = new JButton("Cameroon");
        australiaButton = new JButton("Australia");
        botonExit = new JButton("Exit");
        BotonJugadores = new JButton("Ver Jugadores");

        panel.add(chileButton);
        panel.add(alemaniaButton);
        panel.add(cameroonButton);
        panel.add(australiaButton);
        panel.add(botonExit);
        panel.add(BotonJugadores);

        add(panel);
        setVisible(true);

        botonExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        BotonJugadores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Botón 'Ver Jugadores' presionado");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GuiEquipos();
            }
        });
    }
}
