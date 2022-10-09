import javax.swing.*;
import java.awt.*;

public class Animation1 extends JPanel {
//    int x=0,y=100,w=100,h=50,stepSize=10,max_x,max_y;

//------------------------------------------------------------------
    //    int x=0,y=0,w=50,h=50,max_x,max_y,speedX=10,speedY=10;

    //-------------------------------------------------------------
    int x,y,fanWidth=300,fanHeight=300,centerX,centerY,angle=0;
    Animation1(int w,int h){
//        this.max_x = w-this.w;
//        this.max_y=h-this.h;

        this.centerX=w/2;
        this.centerY=h/2;
        this.x=centerX-fanWidth/2;
        this.y=centerY-fanHeight/2;
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
//        g.setColor(Color.WHITE);
//        g.fillRect(x,y,w,h);
//
//        if(x+w>max_x || x<0){
//            stepSize=-stepSize;
//        }
//        x=x+stepSize;
//        try {
//            Thread.sleep(40);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        repaint();





//  ------------------------------------------------------------
        // bouncing ball
//        g.setColor(Color.red);
//        g.fillOval(x,y,w,h);
//
//        if(x>max_x || x<0){
//            speedX=-speedX;
//        }
//        if(y>max_y||y<0){
//            speedY=-speedY;
//        }
//
//        x=x+speedX;
//        y=y+speedY;
//        try {
//            Thread.sleep(20);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        repaint();

//------------------------------------------------------------------
        // Fan animation
        g.setColor(Color.red);
        g.fillArc(x,y,fanWidth,fanHeight,angle,30);
        g.setColor(Color.green);
        g.fillArc(x,y,fanWidth,fanHeight,angle+120,30);
        g.setColor(Color.blue);
        g.fillArc(x,y,fanWidth,fanHeight,angle+240,30);
        g.setColor(Color.YELLOW);
        g.fillRect(centerX-3,centerY-5,6,2*fanHeight);
        angle-=30%360;
        try {
            Thread.sleep(35);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        repaint();


    }
}
