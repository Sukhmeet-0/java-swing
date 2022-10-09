import javax.swing.*;
import java.awt.*;

public class Graphicss  extends JFrame {
    Graphicss(){
        setSize(800,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

//        MyPanel panel = new MyPanel();
//        panel.setBackground(Color.black);
//        add(panel);

        Animation1 a =new Animation1(780,560);
        a.setBackground(Color.black);
        add(a);

        revalidate();
    }
    public static void main(String[] args) {
        new Graphicss().setVisible(true);
    }
}
