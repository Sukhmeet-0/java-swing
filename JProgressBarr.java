/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poppupmenu;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;

/**
 *
 * @author sukhm
 */
public class JProgressBarr extends JFrame {
    JProgressBarr() throws InterruptedException{
        this.setSize(400,300);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        JProgressBar pb=new JProgressBar(0,100);
        pb.setStringPainted(true);
//        pb.setOrientation(SwingConstants.VERTICAL);
      
        
        //to increase the progress
        
        add(pb);
        this.setVisible(true);
        
        int i=0;
        while(i<=100){
            
            if(i>0&&i<=50){
                pb.setString("Processing..");
            }else if(i>50&&i<=80){
                pb.setString("About to complete..");
            }else if(i==100){
                pb.setString("Task completed.");
            }
            
            
            
            pb.setValue(i);
            Thread.sleep(300);
            i=i+5;
        }
        
        
    }
    public static void main(String[] args) throws InterruptedException {
        JProgressBarr j=new JProgressBarr();
    }
}
