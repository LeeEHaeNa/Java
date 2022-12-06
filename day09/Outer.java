package day09;

public class Outer {
			int a=10;//인스턴스 변수
	static int b=20;//클래스 변수
	
	public void test() {
		Inner in=new Inner();
		Outer.Inner in2=this.new Inner();
		
		System.out.println(in.c);
		System.out.println(in2.c);
	}
	class Inner{//Inner Member - [1] non-static
		int c=30;
		public void sub() {
			System.out.println("sub(0****");
		}
	}///////////

	static class SInner{//Inner Member - [2] static
				int d=30;
		static int e=40;
		void foo() {
			System.out.println("foo()@@@");
		}
		static void bar() {
			System.out.println("bar()###");
		}
	}//////////////////
	
	
	
	
}/////////////////////////
