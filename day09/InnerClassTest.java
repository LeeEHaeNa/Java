package day09;

public class InnerClassTest {

	public static void main(String[] args) {
		//[1] Outer클래스의 변수 a, b값을 출력하세요 
		Outer ot1=new Outer();
		System.out.println(ot1.a);
		System.out.println(Outer.b);
		//[2] Outer.Inner클래스의 변수 c값 출력, sub()호출 
		Outer ot2=new Outer();
		Outer.Inner in=ot2.new Inner();
		System.out.println(in.c);
		in.sub();
		
		
		//[3] Outer.SInner클래스의 d,e,foo(),bar()호출 
		Outer.SInner si=new Outer.SInner();
		
		System.out.println(si.d);
		System.out.println(Outer.SInner.e);
		si.foo();
		si.bar();
		
		
		
		ot1.test();
	}

}
