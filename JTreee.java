import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTreee extends JFrame {
    JTreee(){
        this.setSize(400,300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

//        JTree t =new JTree();
        DefaultMutableTreeNode rootnode =new DefaultMutableTreeNode("Top");

        DefaultMutableTreeNode A =new DefaultMutableTreeNode("A");
        DefaultMutableTreeNode B =new DefaultMutableTreeNode("B");

        DefaultMutableTreeNode A1 =new DefaultMutableTreeNode("A1");
        DefaultMutableTreeNode A2 =new DefaultMutableTreeNode("A2");

        DefaultMutableTreeNode b1 =new DefaultMutableTreeNode("B1");
        DefaultMutableTreeNode b2 =new DefaultMutableTreeNode("B2");
        DefaultMutableTreeNode b3 =new DefaultMutableTreeNode("B3");

        A.add(A1);
        A.add(A2);

        B.add(b1);
        B.add(b2);
        B.add(b3);

        rootnode.add(A);
        rootnode.add(B);

        JTree tree = new JTree(rootnode);
        this.add(tree);
        this.revalidate();

    }

    public static void main(String[] args) {
        JTreee t = new JTreee();
    }

}
