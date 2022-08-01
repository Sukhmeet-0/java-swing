import java.awt.Container;
import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class JCheckBoxx {
    public static void main(String[] args) {
        JFrame f=new JFrame("Check Box");
        f.setBounds(100,100,700,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JCheckBox b=new JCheckBox("High School");
        JCheckBox bb=new JCheckBox("Intermediate");
        JCheckBox bbb=new JCheckBox("Graduation");
        JCheckBox bbbb=new JCheckBox("Post Graduation");
        b.setBounds(100,50,100,20);
        bb.setBounds(100,100,100,20);
        bbb.setBounds(100,150,100,20);
        bbbb.setBounds(100,200,100,20);

        // b.setSelected(true);

        Font font=new Font("Arial",Font.ITALIC,13);

        b.setFont(font);
        bb.setFont(font);
        bbb.setFont(font);
        bbbb.setFont(font);

        Container c=f.getContentPane();
        c.setLayout(null);

        c.add(b);
        c.add(bb);
        c.add(bbb);
        c.add(bbbb);

        f.setVisible(true);
    }
}
