package Views.EditorPanels;

import Helpers.CellPanel;
import Helpers.MapSize;
import MyInputs.MouseInputs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class CanvasPanel extends JPanel {


    private MapSize[] listOfMapSizes = {MapSize.SMALL, MapSize.MEDIUM, MapSize.LARGE};
    private MapSize selectedSize = MapSize.SMALL;
    private JPanel gridPanel;
    private int cellClicked = 0;

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
        int rows = selectedSize.getHeight();
        int cols = selectedSize.getWidth();

        // Update layout based on selected size
        gridPanel.setLayout(new GridLayout(rows, cols));

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                CellPanel cell = new CellPanel(row, col);
                cell.setPreferredSize(new Dimension(32, 32));
                cell.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                cell.addMouseListener(new MouseInputs() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        int cellRow = cell.getRow();
                        int cellCol = cell.getCol();
                        System.out.println("Clicked on cell at row: " + cellRow + " col: " + cellCol);
                    }
                });
                gridPanel.add(cell);
            }
        }

        // Repaint and revalidate to reflect the new components
        revalidate();
        repaint();
    }

}
