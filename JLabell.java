import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

import java.awt.*;

import javax.swing.*;
// import javax.swing.filechooser.*;
public class JLabell {
    public static void main(String[] args) {
        
        JFrame f=new JFrame();
        f.setVisible(true);
        f.setSize(400,300);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setLocation(200,200);
        f.setBackground(Color.black);
        Container c=f.getContentPane();
        c.setBackground(Color.black);

        c.setLayout(null);
        

        JLabel l=new JLabel("Waho Waho");
        l.setForeground(Color.white);
        l.setBackground(Color.GREEN);
        l.setBounds(100,50,100,30);
        l.setText("Password");


        Font font=new Font("san_serif",Font.PLAIN,20);
        l.setFont(font);

        ImageIcon i=new ImageIcon("yo.webp");
        // JLabel la=new JLabel(i);
        // la.setBounds(100,50,100,30);
        JLabel laa=new JLabel("text",i,JLabel.LEFT);
        laa.setBounds(100,50,i.getIconWidth(),i.getIconHeight());

        c.add(l);
    }
}
