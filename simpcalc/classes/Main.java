import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Framee extends JFrame implements ActionListener{
    Container c;
    JLabel first,second,result;
    JTextField f,s;
    JButton add,mul,div,sub;
    Framee(){
        setTitle("Simple Calculator");
        setSize(400,300);
        setLocation(200,200);
        
        c=getContentPane();
        c.setBackground(Color.BLACK);
        c.setLayout(null);

        first = new JLabel("First number :");
        first.setBounds(20,20,100,20);
        first.setForeground(Color.white);
        c.add(first);

        f=new JTextField();
        f.setBounds(130,20,100,20);
        f.setForeground(Color.black);
        c.add(f);

        second =new JLabel("Second number:");
        second.setBounds(20,60,100,20);
        second.setForeground(Color.white);
        c.add(second);

        s=new JTextField();
        s.setBounds(130,60,100,20);
        s.setForeground(Color.black);
        c.add(s);

        add=new JButton("+");
        add.setBounds(20,110,70,40);
        add.addActionListener(this);
        c.add(add);
        
        sub=new JButton("-");
        sub.setBounds(110,110,70,40);
        sub.addActionListener(this);
        c.add(sub);
        
        mul=new JButton("x");
        mul.setBounds(200,110,70,40);
        mul.addActionListener(this);
        c.add(mul);
        
        div=new JButton("/");
        div.setBounds(290,110,70,40);
        div.addActionListener(this);
        c.add(div);

        result = new JLabel("Result : ");
        result.setBounds(20,180,500,20);
        result.setForeground(Color.white);
        c.add(result);
        

        setVisible(true);
    }public void actionPerformed(ActionEvent e){
        try{

        if(e.getSource()==add){
            int ff=Integer.parseInt(f.getText());
            int ss=Integer.parseInt(s.getText());
            int c=ff+ss;
            result.setText("Result : "+c);

        }
        if(e.getSource()==sub){
            int ff=Integer.parseInt(f.getText());
            int ss=Integer.parseInt(s.getText());
            int c=ff-ss;
            result.setText("Result : "+c);

        }
        if(e.getSource()==mul){
            int ff=Integer.parseInt(f.getText());
            int ss=Integer.parseInt(s.getText());
            int c=ff*ss;
            result.setText("Result : "+c);

        }
        if(e.getSource()==div){
            int ff=Integer.parseInt(f.getText());
            int ss=Integer.parseInt(s.getText());
            int c=ff/ss;
            result.setText("Result : "+c);

        }
    }catch(ArithmeticException e1ArithmeticException){
        System.out.println("Cannot divide by zero");
    }catch(NumberFormatException e2){
        System.out.println("Please enter Integers only!!");
    }

    }
}
public class Main{
    public static void main(String[] args) {
        // Framee f=new Framee();
        
    }
}