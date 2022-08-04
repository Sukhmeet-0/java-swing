import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class FocusListenerr extends JFrame{
    FocusListenerr(){
        setSize(400,300);
        setLocation(200,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Mouse Listener");

        JTextField l=new JTextField();
        l.setBounds(20,20,100,20);
        JTextArea t=new JTextArea();
        t.setBounds(20,50,340,200);
        l.addFocusListener(new FocusListener(){
            
            @Override
            public void focusGained(FocusEvent e) {
                t.setText("Focus gained");
                
            }

            @Override
            public void focusLost(FocusEvent e) {
                t.setText("Focus lost");
                
            }
            
        });


        Container c=this.getContentPane();
        c.setLayout(null);
        c.add(l);
        c.add(t);


        setVisible(true);
    }
    public static void main(String[] args) {
        FocusListenerr f=new FocusListenerr();   
    }
}
