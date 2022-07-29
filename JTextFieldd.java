import javax.swing.*;
import java.awt.*;
public class JTextFieldd {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        f.setVisible(true);
        f.setSize(400,200);
        f.setLocation(300,300);
        Container c=f.getContentPane();
        c.setLayout(null);

        JTextField t=new JTextField();
        t.setText("Enter your email...");
        t.setBounds(50,25,120,30);
        Font font=new Font("Arial",Font.ITALIC,10);
        t.setForeground(Color.cyan);
        t.setBackground(Color.black);
        t.setEditable(false);
        t.setFont(font);
        c.add(t);


    }
}
