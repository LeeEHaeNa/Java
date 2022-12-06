package day08;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PongGui extends JFrame{

	Container cp;
	JPanel p2;
	MyLoginPanel p1;
	CardLayout card;
	public PongGui() {
		cp=this.getContentPane();
		cp.setLayout(card=new CardLayout());//카드레이아웃 설정
		p1=new MyLoginPanel();
		p2=new MyLoginPanel();
		
		cp.add(p1,"Login");
		cp.add(p2,"Home");
		
		p1.setBackground(Color.yellow);
		p2.setBackground(Color.pink);
		
//		card.show(cp, "Home");
//		p1.btnLogin.addActionListener(this);
		
		this.setSize(400,600);
		this.setLocation(1000,100);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new PongGui();
	}

}
