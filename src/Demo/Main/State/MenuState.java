package Demo.Main.State;

import Demo.Main.GamePanel;
import Demo.Main.Resources;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by Ashk on 04-Mar-17.
 */
public class MenuState extends State {
    private int selectedOption = 0;

    @Override
    public void update() {

    }
//just a comment
    @Override
    public void render(Graphics g) {
        g.drawImage(Resources.welcomeImage,0,0,null);

        if(selectedOption==0) {
            g.drawImage(Resources.star, 335, 241, null);
        } else
            g.drawImage(Resources.star,335,291,null);

    }



    @Override
    public void onKeyPressed(int pressedKeyCode) {
        if(pressedKeyCode== KeyEvent.VK_UP){
            selectedOption=0;
        }else if(pressedKeyCode== KeyEvent.VK_DOWN){
            selectedOption=1;
        }else if(pressedKeyCode == KeyEvent.VK_SPACE){
            if(selectedOption ==0 ) {
                  GamePanel.currentState = new Stage1State();
            }else {
                // exit the game
            }
        }
    }
}
