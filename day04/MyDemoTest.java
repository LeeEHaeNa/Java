package day04;

public class MyDemoTest {

	public static void main(String[] args) {
		
		MyDemo md1=new MyDemo();// MyDemo객체가 생성되어 메모리에 올라감 
		
		MyDemo md2=new MyDemo();
		MyDemo md3=md2;
		System.out.println(md1);
		System.out.println(md2);
		System.out.println(md1==md2);//주소값을 비교 
		System.out.println(md2==md3);//주소값을 비교 
		
		//MyDemo 의 x값 출력하기 
		System.out.println("md1.x="+md1.x);
		System.out.println("md2.x="+md2.x);
		
		md2.x=500;
		System.out.println("md1.x="+md1.x);
		System.out.println("md2.x="+md2.x);
		System.out.println("md3.x="+md3.x);
		
		//MyDemo의 y값을 출력하세요 
		System.out.println(MyDemo.y);
		
		
		//[1] YourDemo의 str ,pi, add 변수값을 출력하기 
		YourDemo yourdemo=new YourDemo();//(MyDemoTest.java)
//		System.out.println(YourDemo.add);
//		
//		System.out.println(yourdemo.str);
//		System.out.println(yourdemo.pi);
//		YourDemo y2=new YourDemo();
		YourDemo.add=200;
		
		System.out.println(YourDemo.add);//200
	}

}
