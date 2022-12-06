package day08;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*이벤트 소스: JButton
 * 이벤트: ActionEvent
 * 이벤트핸들러: ActionListener
 * */
public class MyEngine extends JFrame implements ActionListener{

	Container cp;
	JPanel p;
	JButton[]bt;
	String str[]= {"Naver","Google","Daum","Yahoo"};
	public MyEngine() {
		super("::MyEngine::");
		cp=this.getContentPane();
		cp.add(p=new JPanel());
		p.setLayout(new GridLayout(2,2, 10, 10));
		//2행2열, 수평간격:10, 수직간격:10 
		
		//버튼 4개 생성해서 배열 bt에 저장한 뒤 p에 부착
		
		bt=new JButton[4];
		for(int i=0; i<bt.length; i++) {
			bt[i]=new JButton(str[i]);
			p.add(bt[i]);
			bt[i].addActionListener(this);
			}//--------------------------
		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//----------------------------
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object o=e.getSource();
		if(o==bt[0]) {
			bt[0].setBackground(Color.green);
			bt[0].setOpaque(true);
			bt[0].setBorderPainted(false);
		}else if(o==bt[1]){
			bt[1].setBackground(Color.orange);
			bt[1].setOpaque(true);
			bt[1].setBorderPainted(false);
		}else if(o==bt[2]){
			bt[2].setBackground(Color.magenta);
			bt[2].setOpaque(true);
			bt[2].setBorderPainted(false);
		}else if(o==bt[3]) {
			bt[3].setBackground(Color.cyan);
			bt[3].setOpaque(true);
			bt[3].setBorderPainted(false);

		}
	}//--------------------------------------
	
	//JFrame의 바깥 여백을 주는 메서드 재정의 
	@Override
	public Insets getInsets() {
		Insets in=new Insets(42,20,20,20);//top, left, bottom, right
		return in;
	}

	
	public static void main(String[] args) {
		MyEngine my=new MyEngine();
		my.setSize(500,500);
		my.setVisible(true);
	}

}
