package Views;

import Main.EditorPanel;
import Main.Main;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class EditorView extends JFrame {



    public EditorView(EditorPanel editorPanel) {
        setTitle("BZ Level Editor");
        setSize(1280, 720); // Full screen size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create SpringLayout
        SpringLayout layout = new SpringLayout();
        setLayout(layout);

        // Create the canvas (Top-left quarter)
        JPanel canvasPanel = new JPanel();
        canvasPanel.setLayout(new GridLayout());
        canvasPanel.setBorder(BorderFactory.createTitledBorder("Canvas"));
        canvasPanel.setBackground(Color.LIGHT_GRAY);

        // Create the sprite library (Right half)
        JPanel spriteLibraryPanel = new JPanel();
        spriteLibraryPanel.setBorder(BorderFactory.createTitledBorder("Sprite Library"));
        spriteLibraryPanel.setBackground(Color.DARK_GRAY);

        // Create the actions panel (Bottom-left)
        JPanel actionsPanel = new JPanel();
        actionsPanel.setBorder(BorderFactory.createTitledBorder("Actions"));
        actionsPanel.setBackground(Color.LIGHT_GRAY);

        actionsPanel.setLayout(new GridLayout(3, 1));
        JButton saveButton = new JButton("Save");
        saveButton.addActionListener(e -> {

        });
        JButton loadButton = new JButton("Load");
        JButton backButton = new JButton("Back to Main Menu");
        backButton.addActionListener(_ -> {
            new MainMenuView(editorPanel);
            dispose();
        });

        actionsPanel.add(saveButton);
        actionsPanel.add(loadButton);
        actionsPanel.add(backButton);
//        actionsPanel.add()

        // Add components to the frame
        add(canvasPanel);
        add(spriteLibraryPanel);
        add(actionsPanel);

        // Constraints for the canvas (Top-left quarter)
        layout.putConstraint(SpringLayout.WEST, canvasPanel, 0, SpringLayout.WEST, getContentPane());
        layout.putConstraint(SpringLayout.NORTH, canvasPanel, 0, SpringLayout.NORTH, getContentPane());
        layout.putConstraint(SpringLayout.EAST, canvasPanel, -640, SpringLayout.EAST, getContentPane());
        layout.putConstraint(SpringLayout.SOUTH, canvasPanel, -360, SpringLayout.SOUTH, getContentPane());

        // Constraints for the sprite library (Right half)
        layout.putConstraint(SpringLayout.WEST, spriteLibraryPanel, 640, SpringLayout.WEST, getContentPane());
        layout.putConstraint(SpringLayout.NORTH, spriteLibraryPanel, 0, SpringLayout.NORTH, getContentPane());
        layout.putConstraint(SpringLayout.EAST, spriteLibraryPanel, 0, SpringLayout.EAST, getContentPane());
        layout.putConstraint(SpringLayout.SOUTH, spriteLibraryPanel, 0, SpringLayout.SOUTH, getContentPane());

        // Constraints for the actions panel (Bottom-left)
        layout.putConstraint(SpringLayout.WEST, actionsPanel, 0, SpringLayout.WEST, getContentPane());
        layout.putConstraint(SpringLayout.NORTH, actionsPanel, -360, SpringLayout.SOUTH, getContentPane());
        layout.putConstraint(SpringLayout.EAST, actionsPanel, -640, SpringLayout.EAST, getContentPane());
        layout.putConstraint(SpringLayout.SOUTH, actionsPanel, 0, SpringLayout.SOUTH, getContentPane());

        setVisible(true);
    }
}
