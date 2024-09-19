package Views;

import Main.EditorPanel;

import javax.swing.*;
import java.awt.*;

public class MainMenuView extends JFrame {

    public MainMenuView(EditorPanel editorPanel) {

        setTitle("BZ Level Editor");
        setSize(1280, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 1));

        JButton newLevelButton = new JButton("New Level");
        JButton loadLevelButton = new JButton("Load Level");

        newLevelButton.addActionListener(e -> {
            new EditorView(editorPanel);
            dispose();
        });
        loadLevelButton.addActionListener(e -> {
        });

        add(newLevelButton);
        add(loadLevelButton);
        setVisible(true);
    }

//    public void render(Graphics g) {
//
//    }
}
