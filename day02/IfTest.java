package day02;

import java.util.Scanner;

public class IfTest {
//if , if~ else, if~else if ~ else
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//System.in : 키보드 입력을 받을 수 있는 입력장치와 연결된 클래스
		System.out.println("정수를 입력하세요=>");
		int num=sc.nextInt();//사용자가 입력한 정수값을 반환 
		System.out.println("num: "+num);
		//입력받은 값을 홀수=>Odd, 짝수=> Even
		if(num%2==1) {
			System.out.println("Odd");
		}else if(num%2==0){
			System.out.println("Even");
		}
		System.out.println("************");
		
		
		
		
		
	}

}
