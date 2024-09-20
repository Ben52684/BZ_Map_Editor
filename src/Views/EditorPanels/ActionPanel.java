package Views.EditorPanels;

import Main.EditorPanel;
import Views.EditorView;
import Views.MainMenuView;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ActionPanel extends JPanel{

    private JPanel actionPanel;
    private JButton saveButton = new JButton("Save");
    private JButton loadButton = new JButton("Load");
    private JButton backButton = new JButton("Back To Main Menu");
//    private JButton Button;


    public ActionPanel(EditorView editorView) {

        // Create the actions panel (Bottom-left)
        setBorder(BorderFactory.createTitledBorder("Actions"));
        setBackground(Color.LIGHT_GRAY);

        actionPanel = new JPanel();
        actionPanel.setLayout(new GridLayout(1, 3));

        add(backButton);
        add(saveButton);
        add(loadButton);

        backButton.addActionListener(_ -> {
            editorView.dispose();
            new MainMenuView();
        });

        saveButton.addActionListener(_ -> {
            String fileName = "";
//            exportSpriteSheet(fileName);
        });
    }


// TO DO \/\/\/\/\/\/\/\/\/\/

//    private void exportSpriteSheet(String fileName) {
//        int cellSize = 32;
//        int gridWidth = editorView.spriteGrid[0].length;  // Number of columns
//        int gridHeight = editorView.spriteGrid.length;    // Number of rows
//
//        // Create a BufferedImage with the size of the entire grid
//        BufferedImage spriteSheet = new BufferedImage(
//                gridWidth * cellSize,
//                gridHeight * cellSize,
//                BufferedImage.TYPE_INT_ARGB
//        );
//        Graphics2D g2d = spriteSheet.createGraphics();
//
//        // Render each sprite into the correct position on the sprite sheet
//        for (int row = 0; row < gridHeight; row++) {
//            for (int col = 0; col < gridWidth; col++) {
//                if (spriteGrid[row][col] != null) {
//                    g2d.drawImage(spriteGrid[row][col], col * cellSize, row * cellSize, null);
//                }
//            }
//        }
//
//        g2d.dispose();
//
//        // Save the BufferedImage as a PNG file
//        try {
//            File outputFile = new File(fileName + ".png");
//            ImageIO.write(spriteSheet, "png", outputFile);
//            System.out.println("Sprite sheet exported to: " + outputFile.getAbsolutePath());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}
