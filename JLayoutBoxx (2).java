import javax.swing.*;
import java.awt.*;
class JLayoutBoxx extends JFrame {
    JLayoutBoxx(){
        setSize(400,300);
        setLocation(400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c=this.getContentPane();

        JButton b=new JButton("Button 1");
        JButton b2=new JButton("Button 2");
        JButton b3=new JButton("Button 3");
        JButton b4=new JButton("Button 4");

        b.setAlignmentX(Component.RIGHT_ALIGNMENT);
        b3.setAlignmentX(Component.RIGHT_ALIGNMENT);
        b4.setAlignmentX(Component.RIGHT_ALIGNMENT);
        b2.setAlignmentX(Component.RIGHT_ALIGNMENT);


//        BoxLayout bl=new BoxLayout(c,BoxLayout.X_AXIS);
        BoxLayout bl=new BoxLayout(c,BoxLayout.Y_AXIS);
        c.setLayout(bl);
        c.add(b);
        c.add(Box.createRigidArea(new Dimension(0,20)));
        c.add(b2);
        c.add(Box.createRigidArea(new Dimension(0,20)));
        c.add(b3);
        c.add(Box.createRigidArea(new Dimension(0,20)));
        c.add(b4);

        setVisible(true);
    }
    public static void main(String[] args) {
        JLayoutBoxx l=new JLayoutBoxx();
    }
}
