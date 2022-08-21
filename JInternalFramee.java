/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poppupmenu;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

/**
 *
 * @author sukhm
 */
public class JInternalFramee  extends JFrame{
    JInternalFramee(){
        this.setSize(400,300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        
        JInternalFrame jj=new JInternalFrame("JInternal Frame",true,true,true,true);
        jj.setSize(150,100);
        jj.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        jj.setVisible(true);
        jj.add(new JButton("MyButton"));
        
        
        add(jj);
        
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        JInternalFramee j=new JInternalFramee();
        
    }
}
