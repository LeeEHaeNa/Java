package day09;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
public class SubFrame extends JFrame{

	JTextField tfR,tfG,tfB;
	JButton btApply, btClose;
	Container cp;
	JPanel p=new JPanel();
	public SubFrame() {
		super("::SubFrame::");
		cp=this.getContentPane();
		cp.setLayout(new GridLayout(0,1,10,10));//1열은 고정, 행은 가변적으로 
		
		cp.add(tfR=new JTextField());
		cp.add(tfG=new JTextField());
		cp.add(tfB=new JTextField());
		cp.add(p);
		
		p.add(btApply=new JButton("Apply"));
		p.add(btClose=new JButton("Close"));
		
		tfR.setBorder(new TitledBorder("Red"));
		tfG.setBorder(new TitledBorder("Green"));
		tfB.setBorder(new TitledBorder("Blue"));
		
		this.setBackground(Color.white);
		setSize(200,300);
		
		
	}

}/////////////////////////////////////
//[1] Close버튼 누르면 SubFrame만 닫기도록 처리
//
//[2] Apply버튼 누르면 tfR, tfG, tfB에 입력한 값 얻어와서
//Color객체를 생성한뒤
//can에 적용
