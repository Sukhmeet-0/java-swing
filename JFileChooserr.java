import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class JFileChooserr extends JFrame  implements  ActionListener{
    JFileChooser filechooser;
    JFileChooserr(){
        this.setSize(400,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        JPanel panel =new JPanel();
        add(panel);
        JButton open = new JButton("Open");
        JButton save = new JButton("Save");
        panel.add(open);
        panel.add(save);

        open.addActionListener(this);
        save.addActionListener(this);
        filechooser = new JFileChooser(); // add path of default location in the constructor

        // for directory selection only
//        filechooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        // multiple file selection
        filechooser.setAcceptAllFileFilterUsed(false);
        filechooser.setMultiSelectionEnabled(true);
        FileNameExtensionFilter filter1=new FileNameExtensionFilter("only text files(.txt)","txt");
        filechooser.addChoosableFileFilter(filter1);
        revalidate();

    }

    public static void main(String[] args) {
        JFileChooserr j = new JFileChooserr();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
////        int selectedOption = filechooser.showDialog(null,"Open My File");
//        int selectedOption = filechooser.showOpenDialog(null);
//        if (selectedOption == JFileChooser.APPROVE_OPTION){
//            System.out.println("Selected file is : " + filechooser.getSelectedFile().getAbsolutePath());
//        }else{
//            System.out.println("User canceled dialog");
//        }

        if (e.getActionCommand().equalsIgnoreCase("Open")){
            int selectedOption = filechooser.showOpenDialog(null);
            if (selectedOption == JFileChooser.APPROVE_OPTION){
                File[] files = filechooser.getSelectedFiles();
//                System.out.println("Selected files are : " + filechooser.getSelectedFile().getAbsolutePath());
                for ( int i =0;i<files.length;i++){
                    File file =files[i];
                    System.out.println("\nSelected files are : " + file.getAbsolutePath());

                }
            }
            else
            {
            System.out.println("User canceled dialog");
            }
        }
        else{
            int selectedOption = filechooser.showSaveDialog(null);
            if (selectedOption == JFileChooser.APPROVE_OPTION){
                System.out.println("Selected file is : " + filechooser.getSelectedFile().getAbsolutePath());
            }
            else
            {
            System.out.println("User canceled dialog");
            }
        }


        // download http://www.jtattoo.net/Download.html
    }
}
