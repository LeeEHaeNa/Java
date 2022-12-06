package day11;
import javax.swing.*;
import java.awt.*;
import java.util.Random;
/*[1]Runnable을 상속받아 스레드가 할 일을 구현하세요 
 * => MyPanel의 x좌표를 반복돌면서 증가시켜주고, 갱신된 값을 적용 
 * [2] 시작,중지버튼 이벤트 처리 Anonymous class로 처리해보기 
 * 		시작버튼 눌렀을 때 스레드를 동작시키세요 
 * */
public class MyPanel extends JPanel {
	
	int x=50, y=130, w=70, h=70;
	Color cr=Color.blue;
	
	public MyPanel() {
		//int r=(int)(Math.random()*256)+0;
		Random ran=new Random();
		int r=ran.nextInt(256)+0; //0~255사이의 랜덤한 정수를 발생시킨다 
		int g=ran.nextInt(256);
		int b=ran.nextInt(256);
		cr=new Color(r,g,b);
	}
	
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(cr);
		g.fillOval(x, y, w, h);
	}
	
	
	
	
}
