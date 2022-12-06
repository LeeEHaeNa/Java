package day03;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		System.out.println("*******MyGame v1.1*********");
		System.out.println("1.가위 2.바위 3.보 9.종료");
		System.out.println("***************************");
		System.out.println("입력하세요 =>");
		System.out.println("***************************");
		Scanner sc=new Scanner(System.in);
		int hand=sc.nextInt();
		String Arr[]= {"","[가위]","[바위]","[보]"};
		int k=(int)(Math.random()*3+1);
		switch(hand) {
			case 1:{
				System.out.println("당 신: 1 [가위]");
				System.out.println("컴퓨터: "+k+Arr[k]);
				if(k==1) {
					System.out.println("비겼어요!!");
					return;
				}else if(k==2) {
					System.out.println("졌어요 ㅠ.ㅠ");
					return;
				}else if(k==3) {
					System.out.println("당신이 이겼네요*^^*");
					return;
				}
			}
			
			case 2:{
				System.out.println("당 신: 2 [바위]");
				System.out.println("컴퓨터: "+k+Arr[k]);
				if(k==1) {
					System.out.println("당신이 이겼네요*^^*");
					return;
				}else if(k==2) {
					System.out.println("비겼어요!!");
					return;
				}else if(k==3) {
					System.out.println("졌어요 ㅠ.ㅠ");
					return;
				}
				}
			
			case 3:{
				System.out.println("당 신: 3 [보]");
				System.out.println("컴퓨터: "+k+Arr[k]);
				if(k==1) {
					System.out.println("졌어요 ㅠ.ㅠ");
					return;
				}else if(k==2) {
					System.out.println("당신이 이겼네요*^^*");
					return;
				}else if(k==3) {
					System.out.println("비겼어요!!");
					return;
				}
				}
			
			case 9:{
				System.out.println(9);
				System.out.println("Bye Bye~");
				System.out.println("계속하려면 아무 키나 누르십시오 . . .");
			}
			case 4:{
				System.out.println("1,2,3,9중 입력하세요");
				return;
			}
			case 5:{
				System.out.println("1,2,3,9중 입력하세요");
				return;
			}
			case 6:{
				System.out.println("1,2,3,9중 입력하세요");
				return;
			}
			case 7:{
				System.out.println("1,2,3,9중 입력하세요");
				return;
			}
			case 8:{
				System.out.println("1,2,3,9중 입력하세요");
				return;
			}
			
			
			}
		}
	}
		
	
		
		


