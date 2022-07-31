import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFramee extends JFrame implements ActionListener{
    Container c;
    JLabel l1;
    JLabel l2;
    JTextField t1;
    JPasswordField t2;
    JButton b;
    MyFramee(){
        setTitle("Login Form");
        setSize(400,300);
        setLocation(100,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        c=getContentPane();
        c.setLayout(null);
        l1=new JLabel("Username.. ");
        l2=new JLabel("Password.. ");
        l1.setBounds(10,50,100,20);
        l2.setBounds(10,100,100,20);

        c.add(l1);
        c.add(l2);

        t1=new JTextField();
        t1.setBounds(120,50,120,20);
        c.add(t1);

        t2=new JPasswordField();
        t2.setBounds(120,100,120,20);
        c.add(t2);

        b=new JButton("Login");
        b.setBounds(100,150,70,20);
        c.add(b);
        
        
        b.addActionListener(this);
        setVisible(true);


    }
    public void actionPerformed(ActionEvent e){
        System.out.println("Username : "+t1.getText());
        System.out.println("Password : "+t2.getPassword().toString());
    }

}
public class LoginForm {
    public static void main(String[] args) {
        MyFramee f=new MyFramee();
        f.setVisible(true);
    }
}
