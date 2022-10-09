import java.awt.Color;
import java.awt.Container;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class JColorChooserr extends JFrame{
    JColorChooserr(){
        this.setSize(400,400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

        Container c = this.getContentPane();
        // c.setLayout(new GridBagLayout());
        JButton b=new JButton("Choose color");
        b.setBounds(20,100,100,40);
        c.add(b);
        b.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                Color color=JColorChooser.showDialog(null, "Select a color", Color.BLACK);
                c.setBackground(color);
            }
            
        });
        

        this.revalidate();

    }
    public static void main(String [] args){
        JColorChooserr j =new JColorChooserr();
    }
}