package day08;
//CLI : Command Line Interface
//GUI : Graphic User Interface
//Window계열: JFrame => 독립적 
//Panel 계열: JPanel => 비독립적  
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;//[1]
/*이벤트 처리 절차 
 * [1] import java.awt.event.*;
 * [2] XXXListener 인터페이스를 상속받는다 (ActionListener)
 * [3] 추상메서드를 오버라이딩한다. (빈블럭으로) => 이벤트 처리 메서드 
 * [4] 이벤트소스에 리스너를 붙인다. addXXXListener()메서드 이용 
 * 		=> b1.addActionListner(핸들러객체)
 * [5] 오버라이딩한 메서드에 이벤트 처리코드를 구현 
 * */
public class MyGui extends JFrame implements ActionListener //[2]
{
	
	Container cp;//기본 레이아웃=> BorderLayout
	JPanel p;//기본 레이아웃=> FlowLayout
	JButton b1,b2,b3;
	public MyGui() {
		super("::MyGui::");
		cp=this.getContentPane();
		
		p=new JPanel();
		cp.add(p);
		p.setBackground(Color.white);
		
		b1=new JButton("Red"/*,new ImageIcon("images.icon2.JPG")*/);
		b2=new JButton("Green"/*,new ImageIcon("images.icon3.JPG")*/);
		b3=new JButton("Blue"/*,new ImageIcon("images.icon1.JPG")*/);
		
		b1.setMnemonic('R');//Alt+R
		b2.setMnemonic('G');
		b3.setMnemonic('B');
		
		p.add(b1);
		p.add(b2);
		p.add(b3);
		//리스너 부착----
		b1.addActionListener(this);//[4]
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		//창닫기 처리 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//생성자----------------------
	
	@Override
	public void actionPerformed(ActionEvent e) {//[3]
		//[5] 이벤트 처리코드 구현 
		Object obj=e.getSource();
		if(obj==b1) {
			p.setBackground(Color.red);
		}else if(obj==b2) {
			p.setBackground(Color.green);
		}else if(obj==b3) {
			p.setBackground(Color.blue);
		}
		
	}//---------------------------

	public static void main(String[] args) {
		MyGui my=new MyGui();
		my.setSize(500, 500);
		my.setVisible(true);
	}

}
