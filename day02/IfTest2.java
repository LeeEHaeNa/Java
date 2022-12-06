package day02;

import java.util.Scanner;

public class IfTest2 {
	
	public static void main(String[] args) {
		//2자리 정수를 입력받으세요 
		//11, 22, 33, 44, 55,...
		//==> "OK 10의 자리와 1의 자리가 같아요" 
		//그렇지 않다면 No 10의 자리와 1의 자리가 달라요" 
		Scanner sc=new Scanner(System.in);
		System.out.println("2자리 정수를 입력하세요=>");
		int inputnum=sc.nextInt();
		if(inputnum<10 || inputnum>=100) {
			System.out.println("입력오류: 2자리 정수를 입력해야 해요!!");
			return;
			//main()메서드를 호출할 쪽으로 돌아간다. ==> JVM이 호출 => 프로세스 종료 
		}
		int inputnum2=(inputnum/10);
		int inputnum3=(inputnum%10);
			if(inputnum2==inputnum3) {
				System.out.println("OK 10의 자리와 1의 자리가 같아요");
			}else {
				System.out.println("No 10의 자리와 1의 자리가 달라요");
		}
		
		//if ~ else문으로 구현한 것을 삼항연산자로 바꿔 구현해보세요
			String str="OK 10의 자리와 1의 자리가 같아요";
			String str1="No 10의 자리와 1의 자리가 달라요";
			String str3=(inputnum2==inputnum3)? str : str1;
			System.out.println(str3);
		
		
		
	}

}
