package Views.EditorPanels;

import Main.EditorPanel;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class SpritePanel extends JPanel {

    public SpritePanel() {
        // Create the sprite library (Right half)
        TitledBorder border = BorderFactory.createTitledBorder("Sprite Library");
        border.setTitleColor(Color.WHITE);
        setBackground(Color.DARK_GRAY);
        setBorder(border);
    }

}
