import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JButton3 {
    public static Container c;
    public static void main(String[] args) {
        JFrame f=new JFrame("Action Demo 4");
        f.setVisible(true);
        f.setBounds(100,100,700,500);
        f.setLocation(400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c=f.getContentPane();
        c.setLayout(null);
        
        JButton b=new JButton("Red");
        JButton bb=new JButton("Blue");
        JButton bbb=new JButton("Green");
        b.setBounds(100,100,100,50);
        bb.setBounds(250,100,100,50);
        bbb.setBounds(400,100,100,50);
        c.add(b);
        c.add(bb);
        c.add(bbb);

        b.addActionListener(new Red());
        bb.addActionListener(new Blue());
        bbb.addActionListener(new Green());
    }
}
class Red implements ActionListener{
    public void actionPerformed(ActionEvent e){
        JButton3.c.setBackground(Color.red);
    }
}
class Blue implements ActionListener{
    public void actionPerformed(ActionEvent e){
        JButton3.c.setBackground(Color.blue);
    }
}
class Green implements ActionListener{
    public void actionPerformed(ActionEvent e){
        JButton3.c.setBackground(Color.green);
    }
}
