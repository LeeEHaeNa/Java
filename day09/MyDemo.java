package day09;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MyDemo extends JFrame{

	Container cp;
	JPanel rootp=new JPanel();
	public MyDemo() {
		super("::MyDemo::");
		cp=this.getContentPane();
		cp.add(rootp);
		rootp.setBackground(Color.white);
		
		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//-----------------------------

	public static void main(String[] args) {
		MyDemo my=new MyDemo();
		my.setBounds(700, 100, 500, 500);
					//x, y, w, h
		my.setVisible(true);
	}//--------------------------------

}//class//////////////////////////
