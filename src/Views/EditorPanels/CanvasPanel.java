package Views.EditorPanels;

import Helpers.MapSize;
import Main.EditorPanel;

import javax.swing.*;
import java.awt.*;

public class CanvasPanel extends JPanel {

    private MapSize[] listOfMapSizes = {MapSize.SMALL, MapSize.MEDIUM, MapSize.LARGE};
    private MapSize selectedSize = MapSize.SMALL;
    private JPanel gridPanel;

    public CanvasPanel() {

        setLayout((new BorderLayout()));

        gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(selectedSize.getWidth(), selectedSize.getHeight()));
        gridPanel.setBorder(BorderFactory.createTitledBorder("Canvas"));
        gridPanel.setBackground(Color.LIGHT_GRAY);

        JScrollPane scrollPane = new JScrollPane(gridPanel);
        scrollPane.setPreferredSize(new Dimension(2000, 2000));
        add(scrollPane, BorderLayout.CENTER);

        updateGrid();
    }

    private void updateGrid() {

        // Remove all current components from gridPanel
        gridPanel.removeAll();

        // Create grid cells based on selected size
        int width = selectedSize.getWidth();
        int height = selectedSize.getHeight();

        // Update layout based on selected size
        gridPanel.setLayout(new GridLayout(height, width));

        // Create cells for the grid
        for (int i = 1; i <= width * height; i++) {
            JPanel panel = new JPanel();
            panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
            panel.add(new JLabel("Cell " + i));
            gridPanel.add(panel);
        }

        // Repaint and revalidate to reflect the new components
        revalidate();
        repaint();
    }

}
