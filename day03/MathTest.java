package day03;
/*java.lang.Math클래스의 주요 메서드
 * 
 * 		static final double PI : 원주율 (상수) "클래스명.변수" 
 * 
 * 		static int	abs(int a): 절대값을 반환 
 * 		static double floor(double a): 내림값을 반환 
 * 		static double ceil(double a): 올림값을 반환 
 * 		//round() : 반올림 
 * 
 * 		//random() : 0.0<= r <1.0 사이의 임의의 실수를 발생시켜 반환한다 
 * */
public class MathTest {

	public static void main(String[] args) {
		System.out.println(Math.PI);//3.141592653589793
		int x=Math.abs(-100);
		System.out.printf("-100의 절대값: %d%n", x);
		//12.001 실수값의 내림값과 올림값을 구해 출력하세요 
		double down=Math.floor(12.001);
		double up=Math.ceil(12.001);
		System.out.printf("내림값: %.3f%n",down);
		System.out.printf("올림값: %.3f%n",up);
		
		//12.456의 반올림값을 구해 출력하세요
		int halfup=Math.round(12.456f);
		System.out.printf("반올림값: %d%n",halfup);
		
		//random()메서드 이용해서 임의의 실수를 3번 발생시키세요 
		double tempnum=Math.random();
		double tempnum1=Math.random();
		double tempnum2=Math.random();
		System.out.printf("임의의 실수1: %f%n",tempnum);
		System.out.printf("임의의 실수2: %f%n",tempnum1);
		System.out.printf("임의의 실수3: %f%n",tempnum2);
		
		for(int i=0;i<3;i++) {
			double r=Math.random();
			System.out.println(r);
		}
		
		/*
		[문제1] 0<= v2 <10 사이의 임의의 정수를 발생시키세요.		
		[문제2] 5<= v3 <15 사이의 임의의 정수를 발생시키세요.				
		*/
		
		
		//문제1
		int v2=(int)(Math.random()*10);
		System.out.println(v2);
		//문제2
		int v3=(int)(Math.random()*10+5);
		System.out.println(v3);
		
		//(int)(Math.random()*범위 + 시작수)
		
		//23<= v4 <55 사이의 임의의 정수를 발생시켜 출력하기 
		
		int alpa=(int)(Math.random()*32+23);
		System.out.println(alpa);
		
		//랜덤하게 알파벳 대문자를 발생시켜 출력하세요 

				
		char beta=(char)(Math.random()*26+65);
		System.out.println(beta);
		
		//아래와 같은 형태로 랜덤한 알파벳을 출력하세요 
		for(int i=0; i<3; i++) {
			for(int j=0; j<5; j++) {
				char mega=(char)(Math.random()*26+65);
				System.out.print(mega+" ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
