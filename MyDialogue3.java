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
public class MyDialogue3{
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        JButton b=new JButton("Click");
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int a= JOptionPane.showConfirmDialog(frame, "Do you want to exit?", "Confirmation",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE );
                if(JOptionPane.YES_OPTION==a){
                   System.out.println("Yes option is selected");
                }else if(a==JOptionPane.NO_OPTION){
                   System.out.println("NO option is selected");
                }else if(a==JOptionPane.CANCEL_OPTION){{
                   System.out.println("Cancel option is selected");
                }
            }
        }
        });        
        frame.add(b);
        frame.setVisible(true);
    }
}
