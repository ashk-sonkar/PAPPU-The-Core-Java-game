package Demo.Main.Entity;

import Demo.Main.Resources;

import java.awt.*;

/**
 * Created by Ashk on 24-Mar-17.
 */
public class ball extends Entity {
    public ball(int xCord, int yCord) {
        super(xCord, yCord, 40, 39);
    }

    @Override
    public Image getImage() {
        return Resources.ball;
    }
}
