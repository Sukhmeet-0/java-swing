import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.JScrollPane.*;

public class JViewportt extends JFrame {
    JViewportt(){
        this.setSize(800,800);
//        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        ImageIcon img =new ImageIcon(ClassLoader.getSystemResource("img.jpg"));
        JLabel label = new JLabel(img);
        JScrollPane scrollPane =new JScrollPane(label);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        this.add(scrollPane);


        scrollPane.setViewportBorder(BorderFactory.createLineBorder(Color.red));
        JViewport viewport = scrollPane.getViewport();
        JButton up=new JButton("Move up");
        JButton down = new JButton("Move down");
        JButton right = new JButton("Move right");
        JButton left = new JButton("Move left");

        JPanel panel =new JPanel();
        panel.add(up);
        panel.add(down);
        panel.add(left);
        panel.add(right);
        this.add(panel,BorderLayout.NORTH);

        up.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Point origin = viewport.getViewPosition();
                Point newOrigin = new Point(origin.x,origin.y +100);
                viewport.setViewPosition(newOrigin);
            }
        });
        down.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Point origin = viewport.getViewPosition();
                Point newOrigin = new Point(origin.x,origin.y -100);
                viewport.setViewPosition(newOrigin);
            }
        });
        left.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Point origin = viewport.getViewPosition();
                Point newOrigin = new Point(origin.x+100,origin.y);
                viewport.setViewPosition(newOrigin);
            }
        });
        right.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Point origin = viewport.getViewPosition();
                Point newOrigin = new Point(origin.x-100,origin.y);
                viewport.setViewPosition(newOrigin);
            }
        });



        this.revalidate();
    }

    public static void main(String[] args) {

        JViewportt j =new JViewportt();
    }
}
