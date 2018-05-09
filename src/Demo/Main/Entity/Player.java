package Demo.Main.Entity;

import Demo.Main.Resources;

import java.awt.*;

/**
 * Created by Ashk on 05-Mar-17.
 */
public class Player extends Entity {
   private Image[] pappuimages ={
           Resources.playerImage1,
           Resources.playerImage2,
           Resources.playerImage3,
           Resources.playerImage4,
           Resources.playerImage5,
           Resources.playerImage6,
           Resources.playerImage7,
   };
   private int currentImageIndex = 0;

    public Player(int xCord, int yCord) {
        super(xCord, yCord, 59,55 );
    }


    @Override
    public Image getImage() {
        return pappuimages[currentImageIndex];
    }
    @Override
    public void update()
    {
        super.update();
        currentImageIndex++;
        currentImageIndex %= 7;
    }
}
