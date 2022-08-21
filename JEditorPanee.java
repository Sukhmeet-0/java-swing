/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poppupmenu;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;

/**
 *
 * @author sukhm
 */

public class JEditorPanee extends JFrame {
    JEditorPanee(){
        this.setSize(400,400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
//        this.setLayout(new FlowLayout());
        
        
        JEditorPane p =new JEditorPane();
//        p.setContentType("text/plain");
//        p.setText("kjsfkijbwsakbcvksabkcbkbcdsakjck kjfk;jwabkjc bka  fkjnbkqfcbkijsab jksakb kjsjkbc kablifu uiw3qebfljh szncv jlkh ablbfkiabljkh fbjmnabfjlkhbsalkjhbflkjhsasbcn kblkj kjb kabc baw sajlkb jb qlk");
//        add(p,BorderLayout.CENTER);


          p.setContentType("text/html");
          p.setText("<html>\n" +
"  <head>\n" +
"    <title>Href Attribute Example</title>\n" +
"  </head>\n" +
"  <body>\n" +
"    <h1>Href Attribute Example</h1>\n" +
"    <p>\n" +
"      <a href=\"https://www.freecodecamp.org/contribute/\">The freeCodeCamp Contribution Page</a> shows you how and where you can contribute to freeCodeCamp's community and growth.\n" +
"    </p>\n" +
"  </body>\n" +
"</html>");
          
          JButton b=new JButton("Show code");
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            System.out.println(""+p.getText());
                 
            }
        });
        add(p,BorderLayout.CENTER);
        add(b,BorderLayout.PAGE_END);
        
        
        this.setVisible(true);
    }
    public static void main(String[] args) {
        JEditorPanee j=new  JEditorPanee();
    }
    
}
