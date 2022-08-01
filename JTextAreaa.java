import javax.swing.*;
import java.awt.*;
public class JTextAreaa {
    public static void main(String[] args) {
        JFrame f=new JFrame("Text Area");
        f.setBounds(100,100,700,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c=f.getContentPane();
        c.setLayout(null);

        JTextArea t=new JTextArea();
        t.setBounds(100,100,400,200);
        t.setFont(new Font("Sen-Serif",Font.BOLD,15));
        t.setLineWrap(true);
        c.add(t);

        f.setVisible(true);
    }
}
