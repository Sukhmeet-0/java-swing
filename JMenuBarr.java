import java.awt.*;
import javax.swing.*;
public class JMenuBarr extends JFrame{
    JMenuBar m;
    JMenuBarr(){
        setTitle("Menu Bar");
        setSize(700,450);
        setLocation(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JMenuBar j=new JMenuBar();
        JMenu file=new JMenu("File");
        JMenu edit=new JMenu("Edit");

        JMenuItem mi=new JMenuItem("New");
        JMenuItem mi2=new JMenuItem("Open");
        JMenuItem mi3=new JMenuItem("Save");
        JMenuItem mi4=new JMenuItem("undo");
        JMenuItem mi5=new JMenuItem("Redo");

        file.add(mi);
        file.add(mi2);
        file.add(mi3);

        edit.add(mi4);
        edit.add(mi5);

        j.add(file);
        j.add(edit);
        // file.add(edit);

        this.setJMenuBar(j);

        Container c=this.getContentPane();
        c.setLayout(null);
        




        setVisible(true);
    }
    public static void main(String[] args) {
        JMenuBarr j=new JMenuBarr();
        j.setVisible(true);
    }
}
