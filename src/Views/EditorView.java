package Views;

import Main.EditorPanel;
import Views.EditorPanels.ActionPanel;
import Views.EditorPanels.CanvasPanel;
import Views.EditorPanels.SpritePanel;

import javax.swing.*;

public class EditorView extends JFrame {

    CanvasPanel canvasPanel;
    ActionPanel actionsPanel;
    SpritePanel spritePanel;

    public EditorView(EditorPanel editorPanel) {
        setTitle("BZ Level Editor");
        setSize(1280, 720); // Full screen size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initPanels(editorPanel);

        // Create SpringLayout
        SpringLayout layout = new SpringLayout();
        initConstraints(layout);
        setLayout(layout);

        // Add components to the frame
        add(canvasPanel);
        add(spritePanel);
        add(actionsPanel);

        setVisible(true);
    }

    private void initPanels(EditorPanel editorPanel) {
        canvasPanel = new CanvasPanel();
        actionsPanel = new ActionPanel();
        spritePanel = new SpritePanel();
    }

    private void initConstraints(SpringLayout layout) {

        // Constraints for the canvas (Top-left quarter)
        layout.putConstraint(SpringLayout.WEST, canvasPanel, 0, SpringLayout.WEST, getContentPane());
        layout.putConstraint(SpringLayout.NORTH, canvasPanel, 0, SpringLayout.NORTH, getContentPane());
        layout.putConstraint(SpringLayout.EAST, canvasPanel, -640, SpringLayout.EAST, getContentPane());
        layout.putConstraint(SpringLayout.SOUTH, canvasPanel, -360, SpringLayout.SOUTH, getContentPane());

        // Constraints for the sprite library (Right half)
        layout.putConstraint(SpringLayout.WEST, spritePanel, 640, SpringLayout.WEST, getContentPane());
        layout.putConstraint(SpringLayout.NORTH, spritePanel, 0, SpringLayout.NORTH, getContentPane());
        layout.putConstraint(SpringLayout.EAST, spritePanel, 0, SpringLayout.EAST, getContentPane());
        layout.putConstraint(SpringLayout.SOUTH, spritePanel, 0, SpringLayout.SOUTH, getContentPane());

        // Constraints for the actions panel (Bottom-left)
        layout.putConstraint(SpringLayout.WEST, actionsPanel, 0, SpringLayout.WEST, getContentPane());
        layout.putConstraint(SpringLayout.NORTH, actionsPanel, -360, SpringLayout.SOUTH, getContentPane());
        layout.putConstraint(SpringLayout.EAST, actionsPanel, -640, SpringLayout.EAST, getContentPane());
        layout.putConstraint(SpringLayout.SOUTH, actionsPanel, 0, SpringLayout.SOUTH, getContentPane());
    }
}
