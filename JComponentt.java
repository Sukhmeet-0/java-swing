import javax.swing.*;
import java.awt.*;

public class JComponentt extends JComponent {
    @Override
    protected void paintComponent(Graphics g){
        g.setColor(Color.blue);
        g.fillRect(10,10,200,200);

    }

    public static void main(String[] args) {
        JFrame frame=new JFrame("Component example");
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JComponentt j =new JComponentt();
        frame.getContentPane().add(j);

    }
}
