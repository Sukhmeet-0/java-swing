/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poppupmenu;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

/**
 *
 * @author sukhm
 */
public class JCheckBoxMenuItemm extends JFrame {
    public JCheckBoxMenuItemm(){
        this.setSize(400,300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        JMenuBar menuBar=new JMenuBar();
        add(menuBar,BorderLayout.PAGE_START);
        
        JMenu file=new JMenu("File");
        JMenu edit=new JMenu("Edit");
        JMenu format=new JMenu("Format");
        
        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(format);
        
        JMenuItem newFile=new JMenuItem("New");
        JMenuItem open=new JMenuItem("Open");
        JMenuItem save=new JMenuItem("Save");
        JMenuItem close=new JMenuItem("Close");
        JMenuItem undo=new JMenuItem("Undo");
        JMenuItem redo=new JMenuItem("Redo");
        JCheckBoxMenuItem wordWrap=new JCheckBoxMenuItem("Word Wrap");
        JTextArea t=new JTextArea("I am sukhmeet singh doing btech cse from gndu amritsar i am not happy with university life.");
        add(t);
        wordWrap.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(wordWrap.isSelected()){
                    t.setLineWrap(true);
                    t.setWrapStyleWord(true);
                }else{
                    t.setLineWrap(false);
                }
            }
        });
        
        
        file.add(newFile);
        file.add(open);
        file.add(save);
        file.add(close);
        edit.add(undo);
        edit.add(redo);
        format.add(wordWrap);
        
        
        this.setVisible(true);
    }
    public static void main(String[] args) {
        JCheckBoxMenuItemm j=new JCheckBoxMenuItemm();
    }
}
