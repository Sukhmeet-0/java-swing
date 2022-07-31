import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JButtonn2{
    public static void main(String[] args) {
        JFrame f=new JFrame("Action demo 3");
        f.setBounds(100,100,700,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c=f.getContentPane();
        c.setLayout(null);

        JButton b=new JButton("Click Me !!");
        b.setBounds(100,100,100,50);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                c.setBackground(Color.red);
            }
        });
        c.add(b);

        
    }
}
