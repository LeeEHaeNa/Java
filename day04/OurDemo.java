package day04;

public class OurDemo {

	//메서드 유형 
	/*[1] 반환타입x 매개변수x
	 *[2] 반환타입x 매개변수o 
	 *[3] 반환타입o 매개변수x 
	 *[4] 반환타입o 매개변수o 
	*/
	int a;
	String str;
//	public OurDemo(){
//		a=0;
//		str=null;
//	};
	
	public static void showStar() {
		System.out.println("#");
	}
	public void showChar(char ch) {
		System.out.println(ch);
	}
	public long giveMe() {
		System.out.println("--giveMe()------------");
		return 10000000L; 
		//반환타입이 지정된 메서드는 메서드 블럭 끝에서 return문을 이용해 값을 반환해야 함 
	}
	public static long giveUs(int money) {
		System.out.println("--giveUs()------------");
		return 2*money;
	}
	
	public static void main(String[] args) {
		//showStar()호출 
		showStar();
		//showChar()호출
		OurDemo ourdemo=new OurDemo();//생성자를 구성하지 않으면 컴파일러가 디폴트 생성자를 제공한다 
		ourdemo.showChar('A');
		
		long m=ourdemo.giveMe();
		System.out.println(m);
		long m2=giveUs(100000000);
		System.out.println(m2);
		
	}

}

/*OOP의 4가지 특징
1. 추상화(Abstraction)
2. 캡슐화(Encapsulation)
3. 상속성(Inheritance)
4. 다형성(Plymorphism)
 * */
