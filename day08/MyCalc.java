package day08;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyCalc extends JFrame implements ActionListener{

	Container cp;
	JPanel p=new JPanel();
	JLabel lb1,lb2,lb3;
	JTextField tf1, tf2, tf3;
	JButton btPlus, btReset;
	
	
	public MyCalc() {
		super("::MyCalc::");
		cp=this.getContentPane();
		cp.add(p);
		p.setBackground(Color.white);
		
		p.setLayout(new GridLayout(4,2,10,10));
		lb1=new JLabel("정수 1: ", JLabel.CENTER);
		lb2=new JLabel("정수 2: ", JLabel.CENTER);
		lb3=new JLabel("정수 3: ", JLabel.CENTER);
		
		tf1=new JTextField(20);
		tf2=new JTextField(20);
		tf3=new JTextField(20);
		
		btPlus=new JButton("Plus");
		btReset=new JButton("Reset");
		
		p.add(lb1); p.add(tf1);
		p.add(lb2); p.add(tf2);
		p.add(lb3); p.add(tf3);
		p.add(btPlus); p.add(btReset);
		
		this.setBackground(Color.white);
		
		tf3.setEditable(false);//편집 못하게 <=결과만 보여주게
		btPlus.addActionListener(this);
		btReset.addActionListener(this);
		
		setSize(300,300);//w, h
		setLocation(500,200);//x,y
		setVisible(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//--------------------------
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object o=e.getSource();
		
		if(o==btPlus) {
				try {	
					String s1=tf1.getText();
					String s2=tf2.getText();
					
					String s3=s1+s2;
					int result=Integer.parseInt(s1)+Integer.parseInt(s2);
					s3=Integer.toString(result);
					tf3.setText(s3);
					
				}catch(NumberFormatException e1) {
					tf3.setText("정수를 입력해야 해요");
				}
			
		}else if(o==btReset) {
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
		}
	}//--------------------
	
	
	@Override
	public Insets getInsets() {
		return new Insets(40,15,15,15);
	}
	public static void main(String[] args) {
		new MyCalc();
	}

//	btPlus, btReset버튼에 대한 이벤트처리);
//	ActionEvent 
//	ActionListener상속받아 구현
//	btPlus-----------------------------
//	tf1에 입력한 값 얻어오기
//	tf2에 입력한 값 얻어오기
//
//	더하기하여 tf3에 보여주기
//
//	btReset------------------------
//	tf1,tf2,tf3에 입력한 값을 비워주기
	
	
	
	
//	==============================
//			정수값을 입력하지 않은 경우
//			에러발생 확인한 뒤,
//			==> 예외 처리하기
//			==>tf3에 "정수를 입력해야해요"
	
}
