import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import java.awt.*;

public class JTextpanee extends JFrame {
    JTextpanee() throws BadLocationException {
        this.setSize(400,400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        JTextPane p=new JTextPane();
        p.setText("Hello, ");
        SimpleAttributeSet attr=new SimpleAttributeSet();
        StyleConstants.setBold(attr, true);
//        p.setCharacterAttributes(attr, true);

        Document doc=p.getStyledDocument();
        doc.insertString(doc.getLength(), "Welcome", attr);

        attr = new SimpleAttributeSet();
        StyleConstants.setItalic(attr,true);
        doc.insertString(doc.getLength()," to ",attr);

        attr = new SimpleAttributeSet();
        StyleConstants.setForeground(attr, Color.red);
        doc.insertString(doc.getLength()," JAVA ",attr);

        attr = new SimpleAttributeSet();
        StyleConstants.setUnderline(attr,true);
        doc.insertString(doc.getLength()," swing ",attr);

        this.getContentPane().add(p);

        this.setVisible(true);
    }

    public static void main(String[] args) throws BadLocationException {
        JTextpanee t=new JTextpanee();
    }
}
