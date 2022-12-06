package day10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyAnimation extends JFrame {

	Container cp;
	
	JPanel rootp = new JPanel();
	MyImagePanel imgP;
	JButton btStart, btStop;
	Toolkit toolkit;
	Image img;
	MyThread tr;
	boolean isStop=false;
	
	public MyAnimation() {
		super("::MyAnimation::");
		toolkit=Toolkit.getDefaultToolkit();
		img=toolkit.getImage("Users/haenalee/슈퍼펫.jpeg");
		//이미지를 메모리에 로드 
		imgP=new MyImagePanel();
		imgP.setImg(img);
		
		cp = this.getContentPane();
		cp.add(rootp, BorderLayout.NORTH);
		cp.add(imgP,BorderLayout.CENTER);
		
		rootp.add(btStart=new JButton("Start"));
		rootp.add(btStop=new JButton("Stop"));
		
		//시작버튼 누르면 스레드 생성해서 동작시키기 
		btStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				isStop=false;
				tr=new MyThread();
				tr.start();
			}
		});
		
		btStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				isStop=true;
				//tr.stop(); //이건 사용하면 안된다 
				//자연스럽게 run()수행을 마치도록 코드 구현해야 함 
				tr.interrupt();
				//InterruptedException을 발생시킴 
			}
		});
		
		
		rootp.setBackground(Color.white);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//-----------------------------
	
	class MyThread extends Thread{
		
		public void run() {
			
			int i=0;
			while(!isStop) {
				i%=10;
				img=toolkit.getImage("images/T"+i+".gif");
				i++;
				imgP.setImg(img);
				imgP.repaint();
				try {
					Thread.sleep(100);
				}catch(InterruptedException e) {
					System.out.println(e);
					break;
				}
				
				
			}//while--------
			
			
			
			

			//반복문 돌면서 T0.gif ~ T10.gif파일을 toolkit을 통해서
			//이미지 얻어오고, imgP에게 얻어온 이미지를 전달 => 다시 그려주기 
			//적당히 스레드를 쉬어준다 (sleep)
		}
		
	}//inner class/////////////////////
	
	
	

	public static void main(String[] args) {
		
		
		
		
		MyAnimation my = new MyAnimation();
		my.setBounds(1200, 100, 500, 500);
		//x, y, w, h
		my.setVisible(true);
	}//--------------------------------

}//class//////////////////////////
