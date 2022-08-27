/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poppupmenu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author sukhm
 */
public class JDialgue  implements ActionListener{
    JFrame frame=new JFrame();
    JDialog d;
    JDialgue(){
     frame.setSize(500,500);
     frame.setLocationRelativeTo(null);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setTitle("JDialgue");
     
     JPanel panel=new JPanel();
     frame.add(panel);
     
     JButton b=new JButton("click1");
     b.addActionListener(this);
     panel.add(b);
     
     frame.setVisible(true);
    }
    
    
    public static void main(String[] args) {
        
        JDialgue d=new JDialgue();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getActionCommand().equals("Click1")){
          showFirst();
      }
      else if(e.getActionCommand().equals("click2")){
          showSecond();
      }
    }
    private void showFirst(){
        d=new JDialog(frame,"JD1");
        d.setSize(200,200);
        
        JPanel panel=new JPanel();
        d.add(panel);
        JButton b=new JButton("Click2");
        panel.add(b);
        b.addActionListener(this);
        
        d.setVisible(true);
    }
    private void showSecond(){
        JDialog d1=new JDialog(d,"JD1");
        d1.setSize(200,200);

        JPanel panel=new JPanel();
        d1.add(panel);
        panel.add(new JLabel("Second Dialog"));
        
        d1.setVisible(true);
    }
}
