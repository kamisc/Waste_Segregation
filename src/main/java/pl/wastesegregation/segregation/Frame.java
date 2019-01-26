package pl.wastesegregation.segregation;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame extends JFrame {

    public Frame() {
        super("SEGREGACJA ŚMIECI - SOSNOWIEC 2019");
        StartingListener listener = new StartingListener(this);
        JPanel startInfo = new StartingPanel(listener);
        add(startInfo);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(600,400));
        setLocation(400, 150);
        pack();
        setVisible(true);
    }

}
