/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package option_pane;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author sukhm
 */
public class JTabbedPanee {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        JTabbedPane jt=new JTabbedPane();
        jt.setBounds(20,40,300,180);
        
        JPanel panel1=new JPanel();
        JPanel panel2=new JPanel();
        JPanel panel3=new JPanel();
        
        panel1.add(new JLabel("This is first page"));
        panel2.add(new JLabel("This is second page"));
        panel3.add(new JLabel("This is third page"));
        
        jt.add("First",panel1);
        jt.add("Second",panel2);
        jt.add("Third",panel3);
        
        frame.add(jt);
        
        frame.setVisible(true);
    }
}
