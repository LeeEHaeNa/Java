package day04;

public class YourDemo {
	String str="Your Demo's Variable";
	float pi;//생성자를 구성하고 초기값을 부여하기
	static int add;//초기화하기 
	
	
	static {
		//static 블럭은 main()메서드 보다도 먼저 메모리에 올라감 
		add=9;
	}

	public YourDemo() {
		pi=3.14f;
		System.out.println(str);
		System.out.println(pi);
		System.out.println(add);
	}
	//인스턴스 메서드 
	public void foo() {
		System.out.println("foo()------------------");
		System.out.println("pi: "+pi);
	}
	//클래스 메서드
	public static void bar() {
		System.out.println("bar()------------------");
		System.out.println("pi: "+new YourDemo().pi);
	}
	
	public static void main(String[] args) {
		System.out.println("main()메서드--------");
		//pi값 출력하세요
		//add값 출력 
		System.out.println(YourDemo.add);
		System.out.println(add);
		
		YourDemo yourdemo1=new YourDemo();
		System.out.println(yourdemo1.pi);
		System.out.println(yourdemo1.str);
//		System.out.println(pi);//[x]
		
		//bar()메서드 호출하기 
		bar();
		//foo()메서드 호출하기 
		yourdemo1.foo();
		
		}
		
}
