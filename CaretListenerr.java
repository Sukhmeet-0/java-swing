import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

public class CaretListenerr extends JFrame{
    CaretListenerr(){
        setSize(400,300);
        setLocation(200,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Mouse Listener");

        JTextField l=new JTextField();
        l.setBounds(20,20,100,20);
        JTextArea t=new JTextArea();
        t.setBounds(20,50,340,200);
        l.addCaretListener(new CaretListener(){

            @Override
            public void caretUpdate(CaretEvent e) {
                t.setText("Caret update"+"\n"+t.getText());
                
            }
            
        });


        Container c=this.getContentPane();
        c.setLayout(null);
        c.add(t);
        c.add(l);


        setVisible(true);
    }
    public static void main(String[] args) {
        CaretListenerr c=new CaretListenerr();
    }
}
