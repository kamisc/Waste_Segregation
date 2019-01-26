package pl.wastesegregation.segregation;

import java.awt.BorderLayout;

import javax.swing.JEditorPane;

public class TextAreaPanel extends JEditorPane {

    // pole z wygenerowanym tekstem
    public JEditorPane editorPane = new JEditorPane();

    public JEditorPane getEditorPane() {
        return editorPane;
    }

    public void setEditorPane(JEditorPane editorPane) {
        this.editorPane = editorPane;
    }

    public TextAreaPanel() {
        super();
        setLayout(new BorderLayout());
        this.add(editorPane);
        editorPane.setEditable(false);

    }

}

