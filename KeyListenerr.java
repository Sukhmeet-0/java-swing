import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class KeyListenerr extends JFrame {
    KeyListenerr(){
        setSize(400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(200,200);
        setTitle("Key Listener");

        JTextArea t=new JTextArea();
        t.setBounds(10,10,360,240);
        t.addKeyListener(new KeyListener(){

            @Override
            public void keyTyped(KeyEvent e) {
                
                t.setText("KeyTyped : "+e.getKeyChar());
                System.out.println("kt");
                
            }
            
            @Override
            public void keyPressed(KeyEvent e) {
                t.setText("Keypressed : "+e.getKeyChar());
                System.out.println("kp");
            }
            
            @Override
            public void keyReleased(KeyEvent e) {
                t.setText("Keyreleased : "+e.getKeyChar());
                System.out.println("kr");
                
                
            }
            
        });

        Container c=this.getContentPane();
        c.setLayout(null);
        c.add(t);



        setVisible(true);
    }
    public static void main(String[] args) {
        KeyListenerr k=new KeyListenerr();
    }
}
