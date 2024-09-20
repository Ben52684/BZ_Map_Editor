package Views;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class MainMenuView extends JFrame {

    public MainMenuView() {

        setTitle("BZ Level Editor");
        setSize(1280, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 1));

        JButton newLevelButton = new JButton("New Level");
        JButton loadLevelButton = new JButton("Load Level");

        newLevelButton.addActionListener(e -> {
            try {
                new EditorView();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
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
