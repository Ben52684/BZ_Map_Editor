package Main;

import Views.MainMenuView;

import java.awt.*;

public class Editor implements Runnable {

    private EditorPanel editorPanel;
    private Thread editorLoop;
    private MainMenuView viewMenu;

    public Editor () {
        initClasses();
        editorPanel = new EditorPanel(this);
        viewMenu = new MainMenuView();
        editorPanel.requestFocus();
        startEditor();
    }

    private void initClasses() {
    }

    private void startEditor() {
        editorLoop = new Thread(this);
        editorLoop.start();
    }

    public void render (Graphics g) {

    }

    @Override
    public void run() {

        while (true) {
            editorPanel.repaint();
            Toolkit.getDefaultToolkit().sync();
        }
    }
}
