import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class WindowListenerr extends JFrame{
    WindowListenerr(){
        setSize(400,300);
        setLocation(200,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Window Listener");


        this.addWindowListener(new WindowListener(){

            @Override
            public void windowOpened(WindowEvent e) {
               System.out.println("Window opened");
                
            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Window closing");
                
            }
            
            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("Window closed");
                
                
            }
            
            @Override
            public void windowIconified(WindowEvent e) {
                System.out.println("Window iconified");
                
                
            }
            
            @Override
            public void windowDeiconified(WindowEvent e) {
                System.out.println("Window deiconified");
                
                
            }
            
            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("Window activated");
                
                
            }
            
            @Override
            public void windowDeactivated(WindowEvent e) {
                System.out.println("Window deactivated");
                
                
            }

        });


        setVisible(true);

    }
    public static void main(String[] args) {
        WindowListenerr w=new WindowListenerr();
    }
}
