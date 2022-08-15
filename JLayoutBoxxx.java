import javax.swing.*;
import java.awt.*;
public class JLayoutBoxxx extends JFrame {
    JLayoutBoxxx(){
        setSize(400,300);
        setLocation(400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c=this.getContentPane();
        c.setLayout(null);

        setVisible(true);
    }
    public static void main(String[] args) {
        JLayoutBoxxx l=new JLayoutBoxxx();
    }
}
