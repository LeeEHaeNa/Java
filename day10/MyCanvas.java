package day10;

import java.awt.*;

public class MyCanvas extends Canvas {
	int x=-50;
	int y=-50;
	Color cr=Color.blue;
	int w=7;
	int h=7;
	
	@Override
	public void paint(Graphics g) {
		g.setColor(cr);
//		g.drawRect(50,50,100,100);//x,y,w,h
//		g.drawOval(50,50,100,100);//원그리기 
		g.fillOval(x,y,w,h);//원그리기 
	}
	
	@Override
	public void update(Graphics g) {
		//지우기=> paint(g)
		paint(g);
	}
	
}//////////////////////////////////////
