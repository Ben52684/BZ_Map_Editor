package Main;

import MyInputs.KeyboardInputs;
import MyInputs.MouseInputs;

import javax.swing.*;
import java.awt.*;

public class EditorPanel extends JPanel {

    private MouseInputs mouseInputs;
    private Editor editor;

    public EditorPanel (Editor editor) {
        mouseInputs = new MouseInputs(this);
        this.editor = editor;
        setupPanel();
        addKeyListener(new KeyboardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
    }

    private void setupPanel() {
        setPanelSize();
    }


    private void setPanelSize() {
        Dimension size = new Dimension(1280, 720);
        setMinimumSize(size);
        setPreferredSize(size);
        setMaximumSize(size);

    }

    public void paintComponent (Graphics g) {
        super.paintComponent(g);
        editor.render(g);
    }

}
