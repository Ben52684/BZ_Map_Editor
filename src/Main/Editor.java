package Main;

import Views.MainMenuView;

import java.awt.*;

public class Editor implements Runnable {

    private Thread editorLoop;
    private MainMenuView viewMenu;

    public Editor () {
        initClasses();
        viewMenu = new MainMenuView();
//        startEditor();
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
            Toolkit.getDefaultToolkit().sync();
        }
    }
}
