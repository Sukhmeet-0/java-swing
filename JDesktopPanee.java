/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poppupmenu;

import java.awt.BorderLayout;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;

/**
 *
 * @author sukhm
 */
public class JDesktopPanee extends JFrame {
    JDesktopPanee(){
        this.setSize(400,300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
//        this.setLayout(null);
        
        JDesktopPane d=new JDesktopPane();
        add(d,BorderLayout.CENTER);
        
        
        display(d);
        
        this.setVisible(true);
    }
    public static void main(String[] args) {
        JDesktopPanee d=new JDesktopPanee();
    }

    private void display(JDesktopPane d) {
        int numFrame=3,x=30,y=30;
        for(int i=0;i<numFrame;i++){
            JInternalFrame iframe=new JInternalFrame("Internal Frame"+i+1,true,true,true,true);
            iframe.setBounds(x,y,250,100);
            iframe.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
            iframe.add(new JLabel("I love java"));
            iframe.setVisible(true);
            d.add(iframe);
            y+=100;
        }    
    }
}
