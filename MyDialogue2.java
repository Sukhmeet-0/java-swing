/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package option_pane;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author sukhm
 */
public class MyDialogue2 {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        
        JButton b=new JButton("Plain");
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(frame, "Hello there this is a plain message","Message",JOptionPane.PLAIN_MESSAGE);
            }
        });
        JButton b1=new JButton("Info");
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(frame, "Hello there this is a info message","Message",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        JButton b2=new JButton("Ques");
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(frame, "Hello there this is a ques message","Message",JOptionPane.QUESTION_MESSAGE);
            }
        });
        JButton b3=new JButton("Error");
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(frame, "Hello there this is a error message","Message",JOptionPane.ERROR_MESSAGE);
            }
        });
        JButton b4=new JButton("Warning");
        b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(frame, "Hello there this is a warning message","Message",JOptionPane.WARNING_MESSAGE);
            }
        });
        frame.add(b);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.setVisible(true);
    }
}
