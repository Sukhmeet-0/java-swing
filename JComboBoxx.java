import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class JComboBoxx {
    public static void main(String[] args) {
        JFrame f=new JFrame("Check Box");
        f.setBounds(100,100,700,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[]values={"A","B","C","D"};
        JComboBox<String> b=new JComboBox<>(values);
        b.setBounds(100,100,100,30);
        // b.setEditable(true);
        b.setSelectedIndex(3);
        // b.setSelectedItem("D");
        JLabel l=new JLabel("");
        l.setBounds(100,240,100,30);

        JButton j=new JButton("OK");
        j.setBounds(100,180,100,30);
        

        

        Container c=f.getContentPane();
        c.setLayout(null);
        c.add(b);
        c.add(j);
        c.add(l);

        j.addActionListener((ActionListener) new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                l.setText((String)b.getSelectedItem());
            }
        });


        f.setVisible(true);
    }
}
