package Demo.Main.State;

import Demo.Main.Entity.*;
import Demo.Main.GamePanel;
import Demo.Main.Resources;
import codekamp.main.RandomGenerator;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ashk on 05-Mar-17.
 */
public class Stage1State extends State {
   private int forksCrossed=0;

   private List<fork> forks;
   private Player pappu;
   private ball b1;
    private List<Ground> grounds;
    private List<Background> bg;
   private List<Entity> entities;
   int collisions = 0;

   public Stage1State()
   {
    forks= new ArrayList<>();
    entities = new ArrayList<>();
    grounds = new ArrayList<>();
    bg = new ArrayList<>();

       forks.add(new fork(1100, 220));
       forks.add(new fork(1300, 200));
       forks.add(new fork(1500, 300));
       forks.add(new fork(1700, 100));
       pappu = new Player(40, 200);
       grounds.add(new Ground(0, 0));
       grounds.add(new Ground(1000, 0));
       bg.add(new Background(0, 0));
       bg.add(new Background(1000, 0));
       b1= new ball(pappu.xCord,pappu.yCord);
       b1.visible= false;


       entities.addAll(bg);
       entities.addAll(grounds);
       entities.addAll(forks);
       entities.add(pappu);
       entities.add(b1);

   }
    @Override
    public void update() {
        for (Entity e : entities) {
            e.update();
        }
        for (fork f : forks) {
            if (f.xCord < -20) {
                f.xCord = 980;

                if (RandomGenerator.getInt(2) == 0) {
                    f.yCord = 238;
                } else {
                    f.yCord = -100;
                }
                if (f.visible) {
                    forksCrossed++;
                    if (forksCrossed == 2) {
                        //Stage2
                    }
                }
                else{

                }
                f.visible = true;
            }
            for (Ground g1 : grounds) {
                if (g1.xCord < -1190) {
                    g1.xCord = 800;
                }
            }
                for (Background bg1 : bg) {
                    if (bg1.xCord < -1000) {
                        bg1.xCord = 990   ;
                    }

            }
            if(pappu.yCord> 500 )
                GamePanel.currentState = new ExitState();
            if(pappu.yCord < 0)
                pappu.yCord = 0;
            if (pappu.isCollidingWith(f)) {
                f.visible = false;
                collisions++;
                if(collisions == 2){
                    GamePanel.currentState = new ExitState();
                }

            }

            if (b1.isCollidingWith(f)) {
                f.visible = false;
//                b1.visible = false;
            }
            if(b1.yCord>350)
            {
               b1.yCord= 350;
                b1.yVel= b1.yVel*-1+4;
//                b1.yAcc= b1.yAcc+2;
            }
            if(b1.yCord<0)
            {
                b1.yCord=0;
                b1.yVel= b1.yVel*-1;
//                b1.yAcc= b1.yAcc+2;
            }
            if(b1.xCord>800)
            {
                b1.visible= false;
            }
        }
    }
    @Override
    public void render(Graphics g) {
      // g.drawImage(Resources.backGround,0,0,null);
    //    g.drawImage(Resources.grassImage,0,0,null);

       for(Entity e :entities ){
           if(e.visible ) {
               g.drawImage(e.getImage(), e.xCord, e.yCord, null);
           }
       }

    }

    @Override
    public void onKeyPressed(int pressedKeyCode) {
        if(pressedKeyCode == KeyEvent.VK_SPACE ) {
            pappu.yVel = -10;
            pappu.yAcc = 2;

    }
    else if(pressedKeyCode==KeyEvent.VK_SHIFT && b1.visible== false){
            b1.xCord= pappu.xCord;
            b1.yCord= pappu.yCord;
            b1.visible= true;

            b1.yVel= 0;
            b1.yAcc= 2;
            b1.xVel=9;
    }
}}
