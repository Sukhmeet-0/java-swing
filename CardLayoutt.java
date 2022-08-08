import javax.swing.JFrame;

import javax.swing.*;
import java.awt.*;
public class CardLayoutt extends JFrame {
    CardLayoutt(){
        setSize(400,300);
        setLocation(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c=this.getContentPane();
        c.setLayout(null);

        CardLayout cc=new CardLayout();

        JButton b=new JButton("Page 1");
        JButton b1=new JButton("Page 2");
        JButton b2=new JButton("Page 3");
        JButton b3=new JButton("Page 4");
        
        c.setBackground(Color.BLACK);
        c.setLayout(cc);
        c.add(b,"1");
        c.add(b1,"2");
        c.add(b2,"3");
        c.add(b3,"4");

        cc.next(c);
        cc.previous(c);
        cc.first(c);
        cc.last(c);
        cc.show(c, "3");

        setVisible(true);

    }
    public static void main(String[] args) {
        CardLayoutt c=new CardLayoutt();
    }
}
