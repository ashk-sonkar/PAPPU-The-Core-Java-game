package Demo.Main.State;

import Demo.Main.Resources;

import java.awt.*;

/**
 * Created by Ashk on 06-Mar-17.
 */
public class ExitState extends State {
    @Override
    public void update() {

    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Resources.exit,0,0,null);

    }

    @Override
    public void onKeyPressed(int pressedKeyCode) {

    }
}
