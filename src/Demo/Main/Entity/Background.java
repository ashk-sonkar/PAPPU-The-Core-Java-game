package Demo.Main.Entity;

import Demo.Main.Resources;

import java.awt.*;

/**
 * Created by Ashk on 21-Mar-17.
 */
public class Background extends Entity {
    public Background(int xCord, int yCord) {
        super(xCord, yCord,800, 450);
        this.xVel = -4;
    }

    @Override
    public Image getImage() {
        return Resources.backGround;
    }
}
