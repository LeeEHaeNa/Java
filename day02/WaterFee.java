package day02;

import java.util.Scanner;

public class WaterFee {

	public static void main(String[] args) {
		
		System.out.println("1.가정용,2.상업용,3.공업용 중 사용하곳 번호를 입력하세요 ");
		Scanner sc=new Scanner(System.in);
		int where=sc.nextInt();
		Scanner sc1=new Scanner(System.in);
		System.out.println("사용량을 입력하세요 ");
		int using=sc1.nextInt();
		switch(where) {
		case 1:{
			System.out.println("메뉴번호: 1"+"\n"
					+"수도요금: "+50*using+"원\n"
					+"세금 (5%): "+Math.round((50*using)*0.05)+"원"
					+"\n 총수도요금: "+Math.round((50*using+(50*using)*0.05))+"원");
			break;
		}
		case 2:{
			System.out.println("메뉴번호: 2"+"\n"
					+"수도요금: "+45*using+"원\n"
					+"세금 (5%): "+Math.round((45*using)*0.05)+"원"
					+"\n 총수도요금: "+Math.round((45*using+(45*using)*0.05))+"원");
			break;
		}
		case 3:{
			System.out.println("메뉴번호: 3"+"\n"
					+"수도요금: "+30*using+"원\n"
					+"세금 (5%): "+Math.round((30*using)*0.05)+"원\n"
					+"총수도요금: "+Math.round((30*using+(30*using)*0.05))+"원");
			break;
		}
		}
		
		
		}
	}

