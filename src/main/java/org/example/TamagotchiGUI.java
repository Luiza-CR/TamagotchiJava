package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TamagotchiGUI extends JFrame {

    private Tamagotchi tamagotchi;
    private JLabel tamagotchiNameLabel;
    private JLabel fomeLabel;

    private JButton[] actionButtons;

    public TamagotchiGUI(Tamagotchi name) {
        super("Meu Tamagotchi");

        //tamagotchi = new Tamagotchi();
        tamagotchi = name;

        // Cria label de nome
        tamagotchiNameLabel = new JLabel("Nome: " + tamagotchi.getName());



        // Cria botões de ação

        String[] actionLabels = {"Alimentar", "Brincar", "Colocar para dormir", "Dar banho", "Passear"};
        actionButtons = new JButton[actionLabels.length];
        for (int i = 0; i < actionButtons.length; i++) {
            actionButtons[i] = new JButton(actionLabels[i]);
            int actionNumber = i + 1;
            actionButtons[i].addActionListener(e -> handleAction(actionNumber));
        }



        // Layout da interface
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));
        panel.add(tamagotchiNameLabel);


        JPanel buttonPanel = new JPanel();
        for (JButton button : actionButtons) {
            buttonPanel.add(button);
        }
        panel.add(buttonPanel);
        panel.add(fomeLabel);
        getContentPane().add(panel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    private void handleAction(int actionNumber) {
        switch (actionNumber) {
            case 1:
                tamagotchi.comer();
                //fomeLabel = new JLabel (tamagotchi.getFome ())
                break;
            case 2:
                tamagotchi.brincar();
                                break;
            case 3:
                tamagotchi.dormir();
                break;
            case 4:
                tamagotchi.limpar();
                break;
            case 5:
                tamagotchi.passear();

        }
    }

    public static void main(String[] args) {
        Tamagotchi tamagotchi = new Tamagotchi("Luiza");
        new TamagotchiGUI(tamagotchi).setVisible(true);
    }
}
