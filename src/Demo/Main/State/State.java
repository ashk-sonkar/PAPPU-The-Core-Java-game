package Demo.Main.State;

import java.awt.*;

/**
 * Created by Ashk on 04-Mar-17.
 */
abstract public class State {
    abstract public void update();
    abstract public void render(Graphics g);
    abstract public void onKeyPressed(int pressedKeyCode);
}
