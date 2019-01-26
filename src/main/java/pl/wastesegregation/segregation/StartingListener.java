package pl.wastesegregation.segregation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class StartingListener implements ActionListener {

    // Główna ramka programu
    private final JFrame frame;

    // Panel informacyjny
    private StartingPanel startInformation;

    public void setPanel(StartingPanel startInformation) {
        this.startInformation = startInformation;
    }

    public StartingListener(JFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // panel z guzikami i kontenerami
                JPanel segregationPanel = new SegregationPanel();

                // usuwamy panel logowania
                frame.getContentPane().removeAll();

                // dodajemy panel z guzikami
                frame.add(segregationPanel);
                frame.validate();

            }
        });

    }

}

