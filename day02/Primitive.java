package day02;//패키지 선언문은 최상단에 와야 함  
//import문: java.lang패키지는 생략해도 된다 
public class Primitive {

	//public static : modifier(지정자,제한자,한정자) 
	//void : 반환타입을 지정하는 부분에 void를 기술하면 반환값이 없다는 의미 
	//String[] : 문자열 유형의 배열타입 
	public static void main(String a[]) {
		System.out.println("1.정수형-----------------");
		//byte < short < int[*] <long 
		byte bt1=-128; //1byte (8bit) : -128 ~ 127 
		byte bt2=127;
		System.out.println("bt1="+bt1);//문자열 + 변수 : 문자열 결합이 발생함 
		System.out.println("bt2="+bt2);
		
		
		short st=-25000;//2byte(16bit) : -2^15 ~ 2^15-1 
		System.out.println("st="+st);
		
		int it=250000;//4byte(32bit): -2^31 ~ 2^31-1
		//정수형의 디폴트
		
		long ln1=40; //8byte(64bit): -2^63 ~ 2^63-1
		long ln2=40L; //뒤에 접미사 L, l 을 붙인다. 
		System.out.println("ln1="+ln1);
		System.out.println("ln2="+ln2);
		
		int i=1000000000;//0이 9개 
		long j=10000000000L;//0이 10개 int형의 최대값:2147483647 
		System.out.println("i="+i);
		System.out.println("j="+j);
		
		int a1=010;//8진수의 정수 8진수는 앞에 0을 붙인다(접두어) 
		int b=011; //0~7
		int c=0217;//2*8^2 + 1*8 + 7
		System.out.println("a1="+a1);
		System.out.println("b="+b);
		System.out.println("c="+c);
		//16진수: 0 ~15, 0~9,a,b,c,d,e,f
		int d=0x1af;//앞에 0x를 붙인다 (접두어:0x)
		System.out.println("d="+d);
		
		//1*16^2 + 10*16 + 15 = 431;
	//0 1 0
	}
	public static int getNum() {
		
		return 100;
	}
	public static void getStr() {
		System.out.println("문자열 출력");
	}
}
