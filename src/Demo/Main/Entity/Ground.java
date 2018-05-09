package Demo.Main.Entity;

import Demo.Main.Resources;

import java.awt.*;

/**
 * Created by Ashk on 06-Mar-17.
 */
public class Ground extends Entity {
    public Ground(int xCord, int yCord) {
        super(xCord, yCord, 0, 0);
        this.xVel = -10;
    }

    @Override
    public Image getImage() {
        return Resources.grassImage;
    }
}
