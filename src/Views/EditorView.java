package Views;

import Main.EditorPanel;
import MyInputs.MouseInputs;
import Views.EditorPanels.ActionPanel;
import Views.EditorPanels.CanvasPanel;
import Views.EditorPanels.SpritePanel;

import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class EditorView extends JFrame {


    private MouseInputs mouseInputs;
    private CanvasPanel canvasPanel;
    private ActionPanel actionsPanel;
    private SpritePanel spritePanel;
    private BufferedImage[][] spriteGrid;

//    SpriteManager spriteManager;

    public EditorView() throws IOException {

        mouseInputs = new MouseInputs();
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);

        setTitle("BZ Level Editor");
        setSize(1800, 900); // Full screen size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initPanels();

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

    private void initPanels() throws IOException {
        canvasPanel = new CanvasPanel();
        actionsPanel = new ActionPanel(this);
        spritePanel = new SpritePanel();
    }

    private void initConstraints(SpringLayout layout) {
        // CanvasPanel constraints (top half)
        layout.putConstraint(SpringLayout.WEST, canvasPanel, 0, SpringLayout.WEST, getContentPane());
        layout.putConstraint(SpringLayout.NORTH, canvasPanel, 0, SpringLayout.NORTH, getContentPane());
        layout.putConstraint(SpringLayout.EAST, canvasPanel, 0, SpringLayout.EAST, getContentPane());
        layout.putConstraint(SpringLayout.SOUTH, canvasPanel, 0, SpringLayout.VERTICAL_CENTER, getContentPane());

        // ActionPanel constraints (bottom-left quarter)
        layout.putConstraint(SpringLayout.WEST, actionsPanel, 0, SpringLayout.WEST, getContentPane());
        layout.putConstraint(SpringLayout.NORTH, actionsPanel, 0, SpringLayout.VERTICAL_CENTER, getContentPane());
        layout.putConstraint(SpringLayout.EAST, actionsPanel, 900, SpringLayout.WEST, getContentPane());
        layout.putConstraint(SpringLayout.SOUTH, actionsPanel, 0, SpringLayout.SOUTH, getContentPane());

        // SpritePanel constraints (bottom-right quarter)
        layout.putConstraint(SpringLayout.WEST, spritePanel, 900, SpringLayout.WEST, getContentPane());
        layout.putConstraint(SpringLayout.NORTH, spritePanel, 0, SpringLayout.VERTICAL_CENTER, getContentPane());
        layout.putConstraint(SpringLayout.EAST, spritePanel, 0, SpringLayout.EAST, getContentPane());
        layout.putConstraint(SpringLayout.SOUTH, spritePanel, 0, SpringLayout.SOUTH, getContentPane());
    }
}
