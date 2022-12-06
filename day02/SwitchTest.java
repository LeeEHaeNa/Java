package day02;

import javax.swing.JOptionPane;

public class SwitchTest {

	public static void main(String[] args) {
		//월을 입력하세요
		//일수를 알려주는 프로그램
		//1,3,5,7,8,10,12: 31일
		//2 : 28일 or 29일
		//4,6,9,11:30
		/*
		 * switch(변수|수식){
		 * 	case 값1: 실행문; break;
		 * 	case 값2: 실행문; break;
		 *  ...
		 *  default: 실행문;
		 *  }
		 *  이 때 변수 또는 수식은 int형 이하의 자료형 이거나 String유형만 가능하다.
		 * */
//	int a=1;
//	switch(a) {
//		case 1: System.out.println("One");break;
//		case 2: System.out.println("Two");break;
//	}
		Integer month=Integer.parseInt(JOptionPane.showInputDialog("일수를 알고싶은 월을 입력하세요 "));
		
		for(int i=1; i<=7;i++) {
			int arr1[]= {1,3,5,7,8,10,12};
			int arr2[]= {4,6,9,11};
			int arr3=2;
			int month1=arr1[i];
			int month2=arr2[i];
		
		switch(month) {
		
		case 1:{
			System.out.println("31일 입니다.");
			break;
		}
		case 2:{
			System.out.println("30일 입니다.");
			break;
		}
		case 3 :{
			System.out.println("28일 or 29일 입니다.");
			break;
			}
		}
	}
		
	}

}
