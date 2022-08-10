/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package option_pane;

import java.awt.FlowLayout;
import javax.swing.*;
import javax.swing.*;
//import javax.swing.JScrollPane;
//import javax.swing.JTextArea;

/**
 *
 * @author sukhm
 */
public class JScrollPanee {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        
        
        
        JTextArea t=new JTextArea(15,15);
        JScrollPane js=new JScrollPane(t,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        
        frame.add(js);
        
        frame.setVisible(true);
    }
}
