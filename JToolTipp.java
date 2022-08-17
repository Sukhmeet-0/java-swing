/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poppupmenu;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JToolTip;

/**
 *
 * @author sukhm
 */
public class JToolTipp extends JFrame{
    JToolTipp(){
    this.setSize(400,300);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    this.setLayout(null);
    
    JLabel label=new JLabel("Password: ");
    label.setBounds(50,100,80,30);
    add(label);
    
//    JToolTip tp=new JToolTip();

    String str="<html>"
            + "<div bgcolor='#800080' color='#ffffff'>"
            + "Enter your password<br>"
            +"Password should be atleast 8 characters long"
            + "</div>"
            + "</html>";
    
    JPasswordField pwd=new JPasswordField();
    pwd.setBounds(140,100,100,30);
    pwd.setToolTipText(str);
    add(pwd);
    
    
    
    
    this.setVisible(true);
    }
    public static void main(String[] args) {
        JToolTipp j=new JToolTipp(); 
    }
    
}
