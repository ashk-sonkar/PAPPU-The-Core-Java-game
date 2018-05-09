package Demo.Main.Entity;

import Demo.Main.Resources;

import java.awt.*;

/**
 * Created by Ashk on 05-Mar-17.
 */
public class fork extends Entity {

    public fork(int xCord, int yCord) {
        super(xCord, yCord, 22, 312);
        this.xVel =-10;
    }

    @Override
    public Image getImage() {
       return Resources.fork;
    }
}
