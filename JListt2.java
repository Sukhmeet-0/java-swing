import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JListt2 extends JFrame  {
    JTextField tf=new JTextField(15);
    JButton b=new JButton("Add");
    JButton bb=new JButton("Update");
    JButton bbb=new JButton("Delete");
    int updateIndex=0;
    JListt2(){
        this.setSize(400,500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new GridLayout(1,2));

        JList list =new JList();
        JPanel panel=new JPanel();
        panel.add(new JScrollPane(list));
        this.add(panel);

        DefaultListModel model = new DefaultListModel<>();
        model.addElement("10th");
        model.addElement("11th");
        model.addElement("12th");
        model.addElement("B.Tech");
        list.setModel(model);

        JPanel panel2=new JPanel();
        panel2.add(tf);
        panel2.add(b);
        panel2.add(bb);
        panel2.add(bbb);
        this.add(panel2);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(!tf.getText().toString().isEmpty()){
                    String item=tf.getText().toString();
                    model.addElement(item);
                    tf.setText(null);
                }
            }
        });

        list.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getClickCount()==2){
                    updateIndex =list.getSelectedIndex();
                    tf.setText((String) model.get(updateIndex));
                }
            }
        });
        bb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!tf.getText().toString().isEmpty()){
                    String item=tf.getText().toString();
                    model.set(updateIndex,item);
                    tf.setText(null);
                }
            }
        });

        bbb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.remove(list.getSelectedIndex());
                tf.setText(null);
            }
        });

        this.setVisible(true);
    }

    public static void main(String[] args) {
        JListt2 l=new JListt2();
    }
}
