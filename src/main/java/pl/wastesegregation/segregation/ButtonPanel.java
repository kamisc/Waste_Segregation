package pl.wastesegregation.segregation;

import pl.wastesegregation.listeners.*;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel {

    private JButton bioButton;
    private JButton metalPlasticButton;
    private JButton paperButton;
    private JButton glassButton;
    private JButton mixedWasteButton;
    private JButton ashButton;
    private JButton otherWasteButton;

    private BioListener bioListener;

    public ButtonPanel() {

        bioButton = new JButton("BIO");
        metalPlasticButton = new JButton("METAL I PLASTIK");
        paperButton = new JButton("PAPIER");
        glassButton = new JButton("SZKŁO");
        mixedWasteButton = new JButton("ODPADY ZMIESZANE");
        ashButton = new JButton("POPIÓŁ");
        otherWasteButton = new JButton("POZOSTAŁE ODPADY");

        setLayout(new GridLayout(7, 1));
        setPreferredSize(new Dimension(WIDTH, HEIGHT));

        bioButton.addActionListener(bioListener);

        add(bioButton);
        add(metalPlasticButton);
        add(paperButton);
        add(glassButton);
        add(mixedWasteButton);
        add(ashButton);
        add(otherWasteButton);

        setVisible(true);
    }

}
