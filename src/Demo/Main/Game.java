package Demo.Main;

import javax.swing.*;

/**
 * Created by Ashk on 01-Mar-17.
 */
public class Game {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        GamePanel panel = new GamePanel();
        f.add(panel);
        f.pack();
        f.setVisible(true);
    }
}