package Views.EditorPanels;


import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class SpritePanel extends JPanel {

    private BufferedImage spriteSheet = ImageIO.read(new File("res/outside_sprites.png"));

    public SpritePanel() throws IOException {



        // Create the sprite library (Right half)
        TitledBorder border = BorderFactory.createTitledBorder("Sprite Library");
        border.setTitleColor(Color.WHITE);
        setBackground(Color.DARK_GRAY);
        setBorder(border);
        setLayout(new GridLayout());


    }

}
