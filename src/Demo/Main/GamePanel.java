package Demo.Main;

import Demo.Main.State.MenuState;
import Demo.Main.State.State;


//import javax.annotation.Resources;
import javax.swing.*;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

/**
 * Created by Ashk on 01-Mar-17.
 */
public class GamePanel extends JPanel implements KeyListener, Runnable {

    public static State currentState;

    public GamePanel() {
        this.setPreferredSize(new Dimension(800, 450));
        this.setFocusable(true);
        this.addKeyListener(this);
        GamePanel.currentState = new MenuState();
    }
    @Override

    public void addNotify() {
        super.addNotify();
        Resources.load();
        Thread thread = new Thread(this);
        thread.setName("Game Thread");
        thread.start();
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {

        GamePanel.currentState.onKeyPressed(e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    public void run() {
        Image img = new BufferedImage(800, 450, BufferedImage.TYPE_INT_RGB);

        while (true) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
            }

            GamePanel.currentState.update();

            Graphics panelGraphics = this.getGraphics();
            Graphics imageGraphics = img.getGraphics();
            imageGraphics.clearRect(0, 0, 800, 450);

            GamePanel.currentState.render(imageGraphics);
            imageGraphics.dispose();
            panelGraphics.drawImage(img, 0, 0, null);
            panelGraphics.dispose();
        }
    }
}
