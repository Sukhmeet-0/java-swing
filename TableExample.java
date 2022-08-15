/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package option_pane;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author sukhm
 */
public class TableExample {
    public static void main(String[] args) {
       MyTable t=new MyTable();
    }
}
class MyTable extends JFrame{
    JTextField t1,t2,t3;
    JButton b1,b2,b3;
    
    MyTable(){
        setSize(500,300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); 
        
        Object[][]data={
            {469,"Sukhmeet",21},
            {498,"Navreen",19},
            {477,"Shubham",20}
        };
        String[]columnName={"Roll No","Name","Age"};
        
        DefaultTableModel model=new DefaultTableModel(data,columnName);
        
        JTable t=new JTable(model);
        
        setLayout(new GridLayout(3,1));
        
        JPanel panel=new JPanel();
        add(new JScrollPane(t));
        add(new JPanel());
        add(panel);
        
        t1=new JTextField();
        t2=new JTextField();
        t3=new JTextField();
        
        b1=new JButton("Add");
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(t1.getText().isEmpty()||t2.getText().isEmpty()||t3.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Please fill all the fields !!","Error Message",JOptionPane.ERROR_MESSAGE);
                    
                }else{
                int roll =Integer.parseInt(t1.getText());
                String name=t2.getText().toString();
                int age=Integer.parseInt(t3.getText().toString());
                
                Object[]newRow={roll,name,age};
                model.addRow(newRow);
                
                
                t1.setText(null);
                t2.setText(null);
                t3.setText(null); 
                }  
            }
        });
        b2=new JButton("Update");
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(t1.getText().isEmpty()||t2.getText().isEmpty()||t3.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Please fill all the fields !!","Error Message",JOptionPane.ERROR_MESSAGE);
                    
                }else{
                int roll =Integer.parseInt(t1.getText());
                String name=t2.getText().toString();
                int age=Integer.parseInt(t3.getText().toString());
                
                int row=t.getSelectedRow();
                model.setValueAt(roll, row, 0);
                model.setValueAt(name, row, 1);
                model.setValueAt(age, row, 2);
                
                t1.setText(null);
                t2.setText(null);
                t3.setText(null); 
                }
            }
        });
           
//        b2.addActionListener(this);
        b3=new JButton("Delete");
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(t.getSelectedRow()==-1){
                    JOptionPane.showMessageDialog(null, "Please select any entry first!!","Error",JOptionPane.PLAIN_MESSAGE);
                }
                int selection=JOptionPane.showConfirmDialog(null, "Do you want to delete this entry?","Confirmation",JOptionPane.YES_NO_OPTION);
                if(selection==JOptionPane.YES_OPTION){
                    model.removeRow(t.getSelectedRow());
                }
            }
        });
//        b3.addActionListener(this);
        
        panel.setLayout(new GridLayout(3,3));
        panel.add(new JLabel("Roll No: "));
        panel.add(t1);
        panel.add(b1);
        
        
        panel.add(new JLabel("Name: "));
        panel.add(t2);
        panel.add(b2);
        
       
        panel.add(new JLabel("Age: "));
        panel.add(t3);
        panel.add(b3);
//        add(new JScrollPane(t));
//
//        
        
    t.addMouseListener(new MouseAdapter(){
        @Override
        public void mouseClicked(MouseEvent e){
           int rowIndex=t.getSelectedRow();
            int rollNo= (int) model.getValueAt(rowIndex, 0);
            String name=(String) model.getValueAt(rowIndex, 1);
            int age=(int)model.getValueAt(rowIndex, 2);
            
            t1.setText(String.valueOf(rollNo));
            t2.setText(String.valueOf(name));
            t3.setText(String.valueOf(age));
        }
        
    });
    t.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        this.setVisible(true);
    }
}
