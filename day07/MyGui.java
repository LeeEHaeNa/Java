package day07;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
//JFrame : Window계열의 컨테이너==> 내부에 contentPane 이라는 컨테이너가 별도로 있다. 
//JButton을 JFrame에 붙일 예정=> contentPane을 얻어와서 여기에 붙이자. 
public class MyGui extends JFrame{
	JButton b1, b2, b3, b4;
	Container cp;
//	Icon icon1,icon2,icon3;
	public MyGui() {
		super("::MyGui v1.1:::");//super()
		cp=this.getContentPane();
		//내용물들(컴포넌트)을 붙일 수 있는 패널(Panel)
		//창닫기 처리 메서드
//		icon1=new ImageIcon("images/icon1.jpg");
//		icon2=new ImageIcon("images/icon2.jpg");
//		icon3=new ImageIcon("images/icon3.jpg");
		
		b1=new JButton("Home");
//		b2=new JButton(icon1);
//		b3=new JButton("로그인",icon2);
//		b4=new JButton("Help",icon3);
//		b2.setOpaque(true);
		b1.setBackground(Color.white);
		//컨텐트페인의 디폴트레이아웃=> BorderLayout(동,서,남,북,중앙);
		//레이아웃 설정 
		cp.setLayout(new FlowLayout());
		cp.add(b1);
		cp.add(b2);
		cp.add(b3);
		cp.add(b4);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		MyGui my= new MyGui();//JFrame은 사이즈 지정하고 setVisible(true)줘야 확인 가능 
		my.setSize(500, 500);//width, height 
		my.setVisible(true);
	}

}
