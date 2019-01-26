package pl.wastesegregation.segregation;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import pl.wastesegregation.containers.*;

public class StartingPanel extends JPanel {

    private JButton segregationBtn; // przycik do przejścia dalej
    private StartingListener listener; // słuchacz przycisku

    public StartingPanel(StartingListener listener) {
        super();

        // ustawiamy layout
        GridBagLayout gridBag = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.CENTER;
        gridBag.setConstraints(this, constraints);
        setLayout(gridBag);

        // komponenty po uruchomieniu
        this.listener = listener;
        this.listener.setPanel(this);
        createComponents();
    }

    // Metoda, która tworzy etykiety i pola do wprowadzania danych.

    private void createComponents() {
        // etykieta tytułowa
        JLabel mainLabel = new JLabel("SEGREGACJA ŚMIECI W SOSNOWCU W 2019 ROKU");

        // etykieta z tekstem informacyjnym
        Information infoLabel = new Information();
        JLabel msgLabel = new JLabel(infoLabel.information());

        // przycisk przechodzenia dalej
        segregationBtn = new JButton("SEGREGUJ!");
        segregationBtn.addActionListener(listener);

        // panel do ustawienia elementów
        JPanel parentPanel = new JPanel();
        parentPanel.setLayout(new BorderLayout());
        parentPanel.add(segregationBtn, BorderLayout.SOUTH);
        parentPanel.add(mainLabel, BorderLayout.NORTH);
        parentPanel.add(msgLabel, BorderLayout.CENTER);

        // dodajemy do głównego panelu
        this.add(parentPanel);
    }

}
