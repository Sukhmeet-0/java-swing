/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poppupmenu;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

/**
 *
 * @author sukhm
 */
public class JPoppUpMenu extends JFrame implements ActionListener{
    JPopupMenu pm;
    JMenuItem m1,m2,m3;
    JPoppUpMenu(){
        this.setSize(400,400);
        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
        m1=new JMenuItem("item 1");
        m2=new JMenuItem("item 2");
        m3=new JMenuItem("item 3");
        
        m1.addActionListener(this);
        m2.addActionListener(this);
        m3.addActionListener(this);
        
        pm=new JPopupMenu();
        pm.add(m1);
        pm.add(m2);
        pm.add(m3);
        
        this.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                if(e.getButton()==MouseEvent.BUTTON3){
                    int x=e.getX();
                    int y=e.getY();
                    pm.show(JPoppUpMenu.this, x, y);
                }
            }
        });
        
        
    
        
        this.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==m1){
            System.out.println("item 1 selected");
        }else if(e.getSource()==m2){
            System.out.println("item 2 selected");
        }else if(e.getSource()==m3){
            System.out.println("item 3 selected");
        }
    }
    public static void main(String[] args) {
        JPoppUpMenu j=new JPoppUpMenu();
    }
    
}
