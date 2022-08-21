/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poppupmenu;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author sukhm
 */
public class JSliderr extends JFrame implements ChangeListener{
    JSlider js;
    JLabel label;
    JSliderr(){
        this.setSize(400,300);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        js=new JSlider();
        js.setMinimum(0);
        js.setMaximum(200);
        js.setPaintTicks(true);
        js.setPaintLabels(true);
        js.setMajorTickSpacing(50);
        js.setMinorTickSpacing(5);
        js.addChangeListener(this);
        
        label=new JLabel();
        
        
        add(js);
        add(label);
        
        this.setVisible(true);
    }    
    public static void main(String[] args) {
        JSliderr js=new JSliderr();
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("The value of slider is: "+js.getValue());
    }
    
}
