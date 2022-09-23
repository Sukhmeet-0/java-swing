import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class JWindoww extends JFrame implements ActionListener {
    JWindoww(){
        this.setSize(400,400);
        this.setLocationRelativeTo(null);
//        this.setLayout(null);
        this.setTitle("JWindow");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel p=new JPanel();
        JButton b=new JButton("Click");
        b.addActionListener(this);
        p.add(b);
        this.add(p);


        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        JWindow w=new JWindow(this);
        w.setSize(300,300);
        w.setLocationRelativeTo(null);

        JPanel j=new JPanel();
        j.add(new JLabel("This is a window"));
        j.setBackground(Color.yellow);
        j.setBorder(BorderFactory.createLineBorder(Color.black));
        w.add(j);
        w.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getClickCount()==2){
                    w.dispose();
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        w.setVisible(true);
    }
    public static void main(String[] args) {
        JWindoww j=new JWindoww();
    }
}
