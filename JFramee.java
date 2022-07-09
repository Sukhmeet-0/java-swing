// import java.applet.*;
import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
public class JFramee{
	public static void main(String[]args){
		JFrame frame=new JFrame();
		frame.setVisible(true);
		frame.setTitle("Java Swing");
		frame.setSize(400,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(1000,500);
		ImageIcon icon=new ImageIcon("yo.webp");
		frame.setIconImage(icon.getImage());

		Container c=frame.getContentPane();
		// Color color=new Color(255,0,0);
		c.setBackground(Color.black);
		frame.setResizable(false);
	}
}