import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Fram extends JFrame implements ActionListener{
    public JLabel name,no,add,gen,dob,terms,success,warning,detail;
    public JButton b;
    public JTextField t,tt;
    public JTextArea ttt,tttt;
    public JCheckBox ch;
    public JRadioButton ma,f;
    public JComboBox<String> d,y,m;
   
    Fram(){
        setTitle("Registration Form");
        setSize(700,450);
        setLocation(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        name=new JLabel("Full Name: ");
        name.setBounds(20,20,100,20);
        t=new JTextField();
        t.setBounds(90,20,150,20);

        no=new JLabel("Number : ");
        no.setBounds(20,60,100,20);
        tt=new JTextField();
        tt.setBounds(90,60,150,20);

        gen=new JLabel("Gender");
        gen.setBounds(20,100,100,20);
        ma=new JRadioButton("Male");
        ma.setBounds(90,100,80,20);
        f=new JRadioButton("Female");
        f.setBounds(170,100,80,20);

        ButtonGroup bg =new ButtonGroup();
        bg.add(f);
        bg.add(ma);

        dob=new JLabel("DOB : ");
        dob.setBounds(20,140,100,20);
        
        String []days={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        d=new JComboBox<>(days);
        d.setBounds(90,140,40,20);

        String []months={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        m=new JComboBox<>(months);
        m.setBounds(150,140,50,20);

        String []years={"2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022"};
        y=new JComboBox<>(years);
        y.setBounds(210,140,60,20);

        add=new JLabel("Address : ");
        add.setBounds(20,180,100,20);
        ttt =new JTextArea();
        ttt.setBounds(90,180,180,50);
        ttt.setLineWrap(true);

        ch=new JCheckBox();
        ch.setBounds(20,260,20,20);
        terms=new JLabel("I agree to the terms and conditions");
        terms.setBounds(90,260,200,20);

        b=new JButton("Submit");
        b.setBounds(130,300,100,30);
        b.addActionListener(this);

        success =new JLabel("Registration successfull !!");
        success.setBounds(90,360,200,20);
        success.setForeground(Color.GREEN);
        success.setVisible(false);

        Font font=new Font("Arial",Font.BOLD,20);
        Font font2=new Font("Arial",Font.BOLD,15);

        detail=new JLabel("User Information :-> ");
        detail.setBounds(300,20,200,20);
        detail.setFont(font);

        tttt=new JTextArea();
        tttt.setBounds(300,60,370,320);
        tttt.setFont(font2);
        tttt.setEditable(false);
        tttt.setLineWrap(true);

        warning=new JLabel("Agree to the terms and conditions!!");
        warning.setBounds(60,340,200,20);
        warning.setForeground(Color.red);
        warning.setVisible(false);


        Container c=this.getContentPane();
        c.setLayout(null);
        c.add(name);
        c.add(t);
        c.add(no);
        c.add(tt);
        c.add(gen);
        c.add(ma);
        c.add(f);
        c.add(dob);
        c.add(d);
        c.add(m);
        c.add(y);
        c.add(add);
        c.add(ttt);
        c.add(ch);
        c.add(terms);
        c.add(b);
        c.add(success);
        c.add(detail);
        c.add(tttt);
        c.add(warning);

        setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        if(ch.isSelected()==false){
            warning.setVisible(true);
        }
        else{
            warning.setVisible(false);
            String gend;
            String nam=t.getText();
            String nu=tt.getText();
            if(f.isSelected()==false){
                gend=ma.getText();
            }else{
                gend=f.getText();
            }
            String dobb=(String)d.getSelectedItem()+" - "+(String)m.getSelectedItem()+" - "+y.getSelectedItem();
            String addd=ttt.getText();

            tttt.setText("Name : "+nam+"\n"+"Contact : "+nu+"\n"+"Gender : "+gend+"\n"+"D.O.B : "+dobb+"\n"+"Address : "+addd);
            success.setVisible(true);
        }
    }
}
public class RegistrationForm{
    public static void main(String[] args) {
        Fram f=new Fram();
        f.setVisible(true);
    }
}