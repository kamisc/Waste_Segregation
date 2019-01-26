package pl.wastesegregation.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JEditorPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import pl.wastesegregation.containers.*;
import pl.wastesegregation.segregation.*;

public class BioListener extends JPanel implements ActionListener {

    Bio bio = new Bio();
    TextAreaPanel msg = new TextAreaPanel();

    @Override
    public void actionPerformed(ActionEvent event) {

        // zmiana wyglądu dokonywana w wątku dystrybucji zdarzeń
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JEditorPane mess = new JEditorPane();
                String text = bio.bioContainerAllowed() + bio.bioContainerNotAllowed() + bio.bioContainerMore();
                mess.setText(text);
                msg.setEditorPane(mess);
                msg.revalidate();

            }
        });

    }

}
