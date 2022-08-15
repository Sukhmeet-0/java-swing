package option_pane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author sukhm
 */

public class JTablee {
    
    public static void main(String[] args) {
        String[][]data={
            {"469","Sukhmeet","21"},
            {"498","Navreen","19"},
            {"477","Shubham","20"}
        };
        String[]columnName={"Roll No","Name","Age"};
        
        
        
        JTable table=new JTable(data,columnName);
        
        
        
        JFrame frame=new JFrame();
        frame.setTitle("JTable");
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.add(new JScrollPane(table));
//        frame.add(table);
        
        
        frame.setVisible(true);
    }
}
