package day11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MoveCircle extends JFrame implements Runnable{

	Container cp;
	JPanel rootP = new JPanel();
	JButton btStart, btStop;
	MyPanel myP=new MyPanel();
	Thread tr;
	boolean flag;
	
	public MoveCircle() {
		super("::MoveCircle::");
		cp = this.getContentPane();
		cp.add(rootP, BorderLayout.NORTH);
		cp.add(myP, BorderLayout.CENTER);
		myP.setBackground(Color.white);
		
		rootP.setBackground(Color.white);

		rootP.add(btStart=new JButton("Start"));
		rootP.add(btStop=new JButton("Stop"));
		
		btStart.addActionListener(e->{
			setTitle("$$$");
			flag=true;
			tr=new Thread(this);
			tr.start();
		});
		
		btStop.addActionListener(e->{
			flag=false;
			tr.interrupt();
		});
		
		
		
		
		
		
		
		
		
		/*
		btStart.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				setTitle("###");
				MoveCircle r=new MoveCircle();
				tr=new Thread(MoveCircle.this);
				tr.start();
				//Runnable객체를 생성 => 스레드 생성할때 인자로 넘기기 => 스레드 스타트 
			}
		});
		btStop.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				setTitle("@@@");
				MoveCircle r=new MoveCircle();
				Thread tr=new Thread(r);
				tr.interrupt();
				//Runnable객체를 생성 => 스레드 생성할때 인자로 넘기기 => 스레드 스타트 
			}
		});
		*/
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//-------------------------

	
		public void run() {
			while(true) {
				//myP.x값을 증가 
				myP.x++;
				System.out.println(myP.x);
				//repaint()해서 적용 
				myP.repaint();
				//sleep() 
				try {
					Thread.sleep(100);
				}catch(InterruptedException e) {
					System.out.println(e);
					break;
				}
			}
		}
	
	public static void main(String[] args) {
		MoveCircle my = new MoveCircle();
		my.setBounds(1200, 100, 500, 500);
		//x, y, w, h
		my.setVisible(true);
	}//------------------------

}//class/////////////////////////////////////