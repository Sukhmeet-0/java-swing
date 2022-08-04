import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MouseListenerr extends JFrame{
    MouseListenerr(){
        setSize(400,300);
        setLocation(200,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Mouse Listener");


        JLabel l=new JLabel("Label");
        l.setBounds(20,20,100,20);
        l.addMouseListener(new MouseListener(){

            @Override
            public void mouseClicked(MouseEvent e) {
                l.setText("Clicked");
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                l.setText("Pressed");
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                l.setText("Released");
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                l.setText("Entered");
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                l.setText("Exited");
                
            }

        });

        l.addMouseMotionListener(new MouseMotionListener(){

            @Override
            public void mouseDragged(MouseEvent e) {
                l.setText("Mouse Moved");
                
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                l.setText("Mouse dragged");
                
            }

        });
        JTextArea t=new JTextArea();
        t.setBounds(20,50,340,200);


        Container c=this.getContentPane();
        c.setLayout(null);
        c.add(l);
        c.add(t);

        setVisible(true);
    }
    public static void main(String[] args) {
        MouseListenerr m=new MouseListenerr();
    }
}
