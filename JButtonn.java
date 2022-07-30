import javax.swing.*;
import java.awt.*;

class JButtonn{
    public static void main(String[] args) {
        JFrame ff=new JFrame();
        ff.setVisible(true);
        ff.setSize(600,300);
        Container c = ff.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.black);
        ff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // ImageIcon i=new ImageIcon("/yo.webp");
        // JButton b=new JButton(i);
        JButton b=new JButton("Click Me!!");
        b.setSize(100,20);
        b.setLocation(100,100);
        Font f=new Font("Arial",Font.ITALIC,13);
        b.setForeground(Color.black);
        b.setBackground(Color.white);
        b.setFont(f);


        Cursor cu=new Cursor(Cursor.HAND_CURSOR);
        b.setCursor(cu);
        b.setEnabled(true);
        b.setVisible(true);
        c.add(b);
    }
}