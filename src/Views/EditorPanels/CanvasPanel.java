package Views.EditorPanels;

import Helpers.MapSize;
import Main.EditorPanel;

import javax.swing.*;
import java.awt.*;

public class CanvasPanel extends JPanel {

    MapSize[] listOfMapSizes = {MapSize.SMALL, MapSize.MEDIUM, MapSize.LARGE};
    MapSize selectedSize = MapSize.SMALL;

    public CanvasPanel() {

        // Create the canvas (Top-left quarter)
        setLayout(new GridLayout(selectedSize.getWidth(), selectedSize.getHeight()));
        setBorder(BorderFactory.createTitledBorder("Canvas"));
        setBackground(Color.LIGHT_GRAY);
        JComboBox<MapSize> sizeDropdown = new JComboBox<>(listOfMapSizes);





    }

    public void createGridOfCanvas() {
        for (int i = 1; i <= 9; i++) {
            JPanel panel = new JPanel(); // Create a new JPanel for each cell
            panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2)); // Add a black border of thickness 2
            panel.add(new JLabel("Cell " + i)); // Add a label inside the panel
            add(panel); // Add the panel to the frame (GridLayout will arrange them)
        }
    }

}
