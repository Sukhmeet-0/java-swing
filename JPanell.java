import javax.swing.*;
import java.awt.*;
class JPanell extends JFrame{

    JPanell(){
        setSize(400,300);
        setLocation(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c=this.getContentPane();
        c.setLayout(null);
        
        c.setBackground(Color.BLACK);

        JPanel panel=new JPanel();
        panel.setBounds(10,10,365,240);
        panel.setBackground(Color.yellow);

        JButton b=new JButton("Ok");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.white);
        panel.add(b);

        c.add(panel);

        setVisible(true);
    }
    public static void main(String[] args) {
        JPanell j=new JPanell();
    }
}