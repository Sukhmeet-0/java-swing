//we can also use itemListener class with overriding method of itemStateChanged
// using ItemEvent as functions parameter

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Listenerrs extends JFrame{
    Listenerrs(){
        setSize(400,300);
        setLocation(100,100);
        setTitle("Event Listener");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JTextField f=new JTextField();
        f.setBounds(100,50,100,20);
        f.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ee){
                String t=f.getText();
                f.setText(t.toUpperCase());
                f.setEnabled(false);
            }
        });
        
        JButton b=new JButton("Ok");
        b.setBounds(100,20,100,20);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                b.setText("Clicked !!".toUpperCase());
                
            }
        });


        JMenuBar m=new JMenuBar();

        JMenu mm=new JMenu("File");
        JMenu mmm=new JMenu("Edit");

        JMenuItem i=new JMenuItem("New");
        JMenuItem i1=new JMenuItem("Open");
        JMenuItem i2=new JMenuItem("Save");
        JMenuItem i3=new JMenuItem("Close");
        JMenuItem i4=new JMenuItem("Cut");
        JMenuItem i5=new JMenuItem("Paste");
        JMenuItem i6=new JMenuItem("Select All");
        
        
        mm.add(i);
        mm.add(i1);
        mm.add(i2);
        mm.add(i3);
        
        mmm.add(i4);
        mmm.add(i5);
        mmm.add(i6);
        
        m.add(mm);
        m.add(mmm);
        
        JTextArea tt=new JTextArea();
        tt.setBounds(20,80,350,120);
        
        i.addActionListener((ActionListener) new ActionListener(){
            public void actionPerformed(ActionEvent eee){
                tt.setText("New file..");
            }
        });
        i1.addActionListener((ActionListener) new ActionListener(){
            public void actionPerformed(ActionEvent eee){
                tt.setText("Opening file..");
            }
        });
        i2.addActionListener((ActionListener) new ActionListener(){
            public void actionPerformed(ActionEvent eee){
                tt.setText("Saving file..");
            }
        });
        i3.addActionListener((ActionListener) new ActionListener(){
            public void actionPerformed(ActionEvent eee){
                tt.setText("Closing file..");
            }
        });
        i4.addActionListener((ActionListener) new ActionListener(){
            public void actionPerformed(ActionEvent eee){
                tt.cut();
            }
        });
        i5.addActionListener((ActionListener) new ActionListener(){
            public void actionPerformed(ActionEvent eee){
                tt.paste();
            }
        });
        i6.addActionListener((ActionListener) new ActionListener(){
            public void actionPerformed(ActionEvent eee){
                tt.selectAll();
            }
        });

        Container c=this.getContentPane();
        c.setLayout(null);
        c.add(b);
        c.add(f);
        c.add(tt);


        setJMenuBar(m);
        setVisible(true);
    }
    public static void main(String[] args) {
        Listenerrs e=new Listenerrs();
    }
}
;