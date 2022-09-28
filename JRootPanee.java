import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

public class JRootPanee extends JFrame {
    JRootPanee(){
        this.setSize(400,400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

//        JRootPane r=this.getRootPane();
//        JButton b=new JButton("PRess me");
//        JMenuBar mb=new JMenuBar();
//        JMenu m=new JMenu("File");
//        m.add("New File");
//        m.add("New File");
//        m.add("New File");
//        m.add("New File");
//        m.add("New File");
//        mb.add(m);
//
//        r.getContentPane().add(b);
//        r.setJMenuBar(mb);

//        JLayeredPane lp=getLayeredPane();
//        JButton b=new JButton("Red");
//        b.setBackground(Color.red);
//        b.setBounds(20,20,50,50);
//
//        JButton bb=new JButton("Blue");
//        bb.setBackground(Color.blue);
//        bb.setBounds(40,40,50,50);
//
//        JButton bbb=new JButton("Black");
//        bbb.setBackground(Color.black);
//        bbb.setBounds(60,60,50,50);
//
//        lp.add(b,new Integer(10));
//        lp.add(bb,new Integer(20));
//        lp.add(bbb,new Integer(30));

        JPanel p=new JPanel();
        JLabel l = new JLabel("GlassPane");
        JButton b=new JButton("Click Me");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l.setVisible(!l.isVisible());
            }
        });
        this.setGlassPane(new JComponent() {
            protected void paintComponent(Graphics g){
                g.setColor(new Color(0,0,0,150));
                g.fillRect(0,0,getWidth(),getHeight());
            }
        });
        Container glasspane= (Container) this.getGlassPane();
        glasspane.setLayout(new GridBagLayout());
        JButton hide=new JButton("Hide");


//        glasspane.setVisible(true);
        JButton bb=new JButton("Show");
        bb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                glasspane.add(hide);
                glasspane.setVisible(true);
                b.setEnabled(false);
                bb.setEnabled(false);
            }
        });
        hide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                glasspane.setVisible(false);
                b.setEnabled(true);
                bb.setEnabled(true);

            }
        });

        p.add(l);
        p.add(b);
        p.add(bb);

        this.getContentPane().add(p);


        this.revalidate();
    }

    public static void main(String[] args) {
        JRootPanee r=new JRootPanee();
    }
}
