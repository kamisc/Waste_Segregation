package pl.wastesegregation.segregation;

import java.awt.GridLayout;

import javax.swing.JPanel;

public class SegregationPanel extends JPanel {

    ButtonPanel buttons = new ButtonPanel();
    TextAreaPanel text = new TextAreaPanel();

    public SegregationPanel() {
        super();
        setLayout(new GridLayout(1, 2));
        this.add(buttons);
        this.add(text);

    }

}
