import javax.swing.*;

public class JListt extends JFrame {
    String []items={"item1","item2","item3","item4","item5","item1","item2","item3","item4","item5"};
    JListt(){
        this.setSize(400,500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);


        JList list=new JList(items);
        list.setVisibleRowCount(5);
        JPanel panel=new JPanel();
        panel.add(new JScrollPane(list));

        this.add(panel);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        JListt l=new JListt();
    }
}
