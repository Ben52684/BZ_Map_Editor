package Helpers;

import javax.swing.*;

public class CellPanel extends JPanel {
    private int row, col;

    public CellPanel(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}