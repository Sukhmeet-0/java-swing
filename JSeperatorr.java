/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poppupmenu;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

/**
 *
 * @author sukhm
 */
public class JSeperatorr extends JFrame {
    JSeperatorr(){
        this.setSize(400,300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        JPanel panel=new JPanel();
        panel.setLayout(new GridLayout(0,1));
        panel.add(new JLabel("Sukhmeet Singh"));
        panel.add(new JSeparator());
//        panel.add(new JSeparator(SwingConstants.VERTICAL));
        panel.add(new JLabel("Harmeet Singh"));
        
        add(panel);
        
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
        
        file.add(newFile);
        file.addSeparator();
        file.add(open);
        file.addSeparator();
        file.add(save);
        file.addSeparator();
        file.add(close);
        edit.add(undo);
        file.addSeparator();
        edit.add(redo);
        format.add(wordWrap);
        
        
        this.setVisible(true);
    }
    public static void main(String[] args) {
        JSeperatorr j=new JSeperatorr();
    }
    
}
