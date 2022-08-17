/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poppupmenu;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author sukhm
 */
public class JSpinnerr extends JFrame implements ChangeListener 
{
    JSpinner s1,s2,s3;
    JLabel label;
    public String []months={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
    JSpinnerr(){
     
        this.setSize(400,300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        this.setLayout(null);
        
        
        String str=String.valueOf(java.time.Year.now());
        int y=Integer.parseInt(str);
        
        SpinnerNumberModel model1=new SpinnerNumberModel(1,1,31,1);
        SpinnerListModel model2=new SpinnerListModel(months);
        SpinnerNumberModel model3=new SpinnerNumberModel(y,y-100,y,1);
        
        s1=new JSpinner(model1);
        s1.setBounds(100,20,100,50);
        s1.addChangeListener(this);
        s2=new JSpinner(model2);
        s2.setBounds(100,100,100,50);
        s2.addChangeListener(this);
        s3=new JSpinner(model3);
        s3.setBounds(100,200,100,50);
        s3.addChangeListener(this);
        
        add(s1);
        add(s2);
        add(s3);
        
        label=new JLabel();
        label.setBounds(100,300,150,20);
        add(label);
       
        
        
        int date=(int) s1.getValue();
        int year=(int) s3.getValue();
        String month=(String) s2.getValue();
        
        
        label.setText("DOB: "+date+" / "+month+" / "+year);
        
        
        
        this.setVisible(true);
    }
   
    public static void main(String[] args) {
        JSpinnerr s=new JSpinnerr();
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        int date=(int) s1.getValue();
        int year=(int) s3.getValue();
        String month=(String) s2.getValue();
        
        
        label.setText("DOB: "+date+" / "+month+" / "+year);
    }
    
}
