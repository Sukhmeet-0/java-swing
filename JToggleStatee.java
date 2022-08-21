/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poppupmenu;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JToggleButton;

/**
 *
 * @author sukhm
 */
public class JToggleStatee extends JFrame {
    private Color defaultColor;
    JToggleStatee(){
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        JToggleButton b=new JToggleButton("Turn On");
        Container c=this.getContentPane();
        c.setLayout(null);
        defaultColor=c.getBackground();
        
        b.setBounds(200,200,100,50);
        add(b);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(b.isSelected()){
                    b.setText("Turn Off");
                    c.setBackground(Color.yellow);
                }
                else{
                    b.setText("Turn On");
                    c.setBackground(defaultColor);
                }
            }
        });
        
        
        this.setVisible(true);
    }
    public static void main(String[] args) {
        JToggleStatee s=new JToggleStatee();
    }
}
