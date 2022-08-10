/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package option_pane;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JSplitPane;

/**
 *
 * @author sukhm
 */
public class JSplitPanee extends JFrame {
    JSplitPanee(){
        setTitle("JSplitPane");
        setSize(400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JButton btn1=new JButton("Left");
        JButton btn2=new JButton("Right");
        
        JSplitPane js=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        js.setTopComponent(btn1);
        js.setBottomComponent(btn2);
        
        js.setDividerSize(10);
        js.setDividerLocation(100);
        js.setOneTouchExpandable(true);
        
//        add(btn1);
//        add(btn2);
        add(js);
//        validate();
        
        
        setVisible(true);
    }
    public static void main(String[] args) {
       JSplitPanee sp=new JSplitPanee();
    }
}
