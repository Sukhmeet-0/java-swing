import javax.swing.*;
import java.awt.*;
public class JPasswordd {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        f.setVisible(true);
        f.setSize(300,200);
        f.setLocation(200,300);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container c=f.getContentPane();
        c.setLayout(null);
        // JTextField t=new JTextField("Enter your email..");
        // t.setBounds(100,50,120,30);
        JPasswordField p=new JPasswordField("1234");
        p.setBounds(50,50,100,20);
        p.setBackground(Color.BLACK);
        p.setForeground(Color.yellow);
        p.setEchoChar('*');
        p.setEchoChar((char)0);
        // c.add(t);
        c.add(p);
    }
}
