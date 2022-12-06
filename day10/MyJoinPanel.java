package day10;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class MyJoinPanel extends JPanel{

	JTextField name,pwd,tel;
	JButton btApply,btHome;
	JPanel p=new JPanel();
	public Insets getInsets() {
		return new Insets(60,20,20,20);
	}
	public MyJoinPanel() {
		this.setBackground(Color.cyan);
		this.setLayout(null);
		this.add(name=new JTextField(20));
		this.add(pwd=new JTextField(20));
		this.add(tel=new JTextField(20));
		name.setBounds(95,140,200,50);
		pwd.setBounds(95,200,200,50);
		tel.setBounds(95,260,200,50);
		
		p.setBounds(95,320,200,200);
		
		btApply=new JButton("ȸ������");
		btHome = new JButton("Home");
		
		p.setBackground(Color.cyan);
		
		p.add(btApply);
		p.add(btHome);
		
		this.add(p);
		name.setBorder(new TitledBorder("Name"));
		pwd.setBorder(new TitledBorder("PassWord"));
		tel.setBorder(new TitledBorder("Tel"));
		
		
		
	}
	
}
