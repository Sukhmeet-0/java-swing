import javax.swing.*;
import java.awt.*;
public class JRadioButtonn {
    public static void main(String[] args) {
        JFrame f=new JFrame("Check Box");
        f.setBounds(100,100,700,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        Container c=f.getContentPane();
        c.setLayout(null);
        
        ButtonGroup gg=new ButtonGroup();
        JRadioButton b=new JRadioButton("Male");
        JRadioButton bb=new JRadioButton("Female");
        b.setBounds(100,50,100,20);
        // b.setEnabled(true);
        bb.setBounds(200,50,100,20);
        gg.add(b);
        gg.add(bb);
        c.add(b);
        c.add(bb);

        ButtonGroup g=new ButtonGroup();
        JRadioButton obc=new JRadioButton("obc");
        obc.setBounds(100,200,100,20);
        JRadioButton sc=new JRadioButton("sc/st");
        sc.setBounds(250,200,100,20);
        JRadioButton gen=new JRadioButton("gen");
        gen.setBounds(400,200,100,20);

        g.add(obc);
        g.add(sc);
        g.add(gen);

        c.add(obc);
        c.add(sc);
        c.add(gen);
        

        f.setVisible(true);
    }
}
