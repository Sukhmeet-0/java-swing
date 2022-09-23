import javax.swing.*;
import java.awt.*;

public class JToolBarr extends JFrame {
    JToolBar toolbox=new JToolBar();
    JButton b=new JButton("Button1");
    JButton bb=new JButton("Button2");
    JTextField tf=new JTextField();
    JComboBox combo=new JComboBox(new String[]{"Item1","Item2","Item3"});
    JToolBarr(){
        this.setSize(400,500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        toolbox.setFloatable(false);
        toolbox.add(combo);
        toolbox.addSeparator();
        toolbox.add(tf);
        toolbox.addSeparator();
        toolbox.add(b);
        toolbox.addSeparator();
        toolbox.add(bb);
        this.add(BorderLayout.NORTH,toolbox);

        this.revalidate();
    }

    public static void main(String[] args) {
        JToolBarr j=new JToolBarr();
    }
}
