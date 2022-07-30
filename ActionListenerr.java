import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyFrame extends JFrame implements ActionListener{
    Container c;
    JButton b;
    JButton bb;
    JButton bbb;
    MyFrame(){
        c=this.getContentPane();
        c.setLayout(null);

        b=new JButton("BLACK");
        bbb=new JButton("GREEN");
        bb=new JButton("BLUE");
        b.setBounds(100,100,100,20);
        bb.setBounds(250,100,100,20);
        bbb.setBounds(400,100,100,20);
        c.add(b);
        c.add(bb);
        c.add(bbb);
        b.addActionListener(this);
        bb.addActionListener(this);
        bbb.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b){
            c.setBackground(Color.black);
            b.setBackground(Color.white);
            b.setForeground(Color.black);
        }
        else if(e.getSource()==bb){
            c.setBackground(Color.blue);
        }
        else if(e.getSource()==bbb){
            c.setBackground(Color.green);
        }
    }
}
public class ActionListenerr {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setTitle("Action Listener");
        f.setSize(700,500);
        f.setLocation(100,100);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
