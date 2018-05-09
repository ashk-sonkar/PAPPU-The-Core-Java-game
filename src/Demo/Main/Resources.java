package Demo.Main;

import Demo.Main.Game;

import javax.imageio.ImageIO;
import java.applet.Applet;
import java.awt.*;
import java.io.IOException;

/**
 * Created by cerebro on 10/02/17.
 */
public class Resources {
    public static Image grassImage;
    public static Image welcomeImage;
    public static Image star;
    public static Image fork;
    public static Image playerImage1;
    public static Image playerImage2;
    public static Image playerImage3;
    public static Image playerImage4;
    public static Image playerImage5;
    public static Image playerImage6;
    public static Image playerImage7;
    public static Image backGround;
    public static Image exit;
    static Image grass;
    public static Image ball;

    public static void load() {
        try {
            Resources.grassImage = ImageIO.read(Game.class.getResource("../Resources/img/ground.png"));
            //  Resources.blockImage = ImageIO.read(Game.class.getResource("../Resources/img/block.png"));
            Resources.welcomeImage = ImageIO.read(Game.class.getResource("../Resources/img/welcome.png"));
            Resources.star = ImageIO.read(Game.class.getResource("../Resources/img/star.png"));
            Resources.playerImage1 = ImageIO.read(Game.class.getResource("../Resources/img/pappu0.png"));
            Resources.playerImage2 = ImageIO.read(Game.class.getResource("../Resources/img/pappu1.png"));
            Resources.playerImage3 = ImageIO.read(Game.class.getResource("../Resources/img/pappu2.png"));
            Resources.playerImage4 = ImageIO.read(Game.class.getResource("../Resources/img/pappu3.png"));
            Resources.playerImage5 = ImageIO.read(Game.class.getResource("../Resources/img/pappu4.png"));
            Resources.playerImage6 = ImageIO.read(Game.class.getResource("../Resources/img/pappu5.png"));
            Resources.playerImage7 = ImageIO.read(Game.class.getResource("../Resources/img/pappu6.png"));
            Resources.fork = ImageIO.read(Game.class.getResource("../Resources/img/fork_handle.png"));
            Resources.backGround = ImageIO.read(Game.class.getResource("../Resources/img/bg_combined.png"));
            Resources.exit = ImageIO.read(Game.class.getResource("../Resources/img/over.png"));
            Resources.ball = ImageIO.read(Game.class.getResource("../Resources/img/ball.png"));

        } catch (IOException e) {
            System.out.println("unable to load resources");
        }
    }
}
