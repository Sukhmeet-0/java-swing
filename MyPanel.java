import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    @Override
    public void paint(Graphics g){
        super.paint(g);

        g.setColor(Color.white);
        g.setFont(new Font(Font.SANS_SERIF,Font.BOLD,30));
        g.drawString("Hello World" , 50,50);

        g.drawLine(100,100,200,150);

//        g.drawRect(100,200,100,50);
        g.fillRect(100,200,100,50);
//        g.drawOval(300,200,100,100);
        g.fillOval(300,200,100,100);

//        g.drawArc(400,200,100,100,0,90);
        g.fillArc(400,200,100,100,0,90);
        int[] x={100,200,300};
        int[] y={400,300,400};
        int n =3;

//        g.drawPolygon(x,y,n);
        g.fillPolygon(x,y,n);

        int[]xx={100,200,300};
        int[]yy={500,450,500};
        int nn=3;
        g.drawPolyline(xx,yy,nn);

        Image img = new ImageIcon(ClassLoader.getSystemResource("img.jpg")).getImage();

        g.drawImage(img,300,50,200,100,null);
//        g.clearRect(0,0,500,500);
    }
}
