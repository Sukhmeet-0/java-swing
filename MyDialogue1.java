/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package option_pane;

/**
 *
 * @author sukhm
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MyDialogue1 {
    public static void main(String []args){
        JFrame frame=new JFrame();
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        
        JButton b=new JButton("Click Me");
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String name=JOptionPane.showInputDialog("Enter your name:");
                if(name.length()>0){
                    System.out.println("The name of user is "+name);
                }else{
                    System.out.println("No name added");
                }
            }
        });
        frame.add(b);
        frame.setVisible(true);
    }
}
