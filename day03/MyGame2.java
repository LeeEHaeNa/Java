package day03;

import javax.swing.JOptionPane;

public class MyGame2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=JOptionPane.showInputDialog("알파벳,0~9사이의 숫자,그외 문자 중 하나를 입력하세요");
//		
//		int num=(int)(Math.random()*10);
//		char alphabet1=(char)(Math.random()*32+23);
//		char alphabet2=(char)(Math.random()*26+97);
//		System.out.println(str);
//		if(str==null)return;
//		if(str.charAt(0)==num) {
//			System.out.println("숫자이군요!");
//		}else if(str.charAt(0)==alphabet1){
//			System.out.println("알파벳입니다");
//		}else if(str.charAt(0)==alphabet2){
//			System.out.println("알파벳입니다");
//		}
//		else {
//			System.out.println("기타 문자입니다");
//		}

		
		char ch=str.charAt(0);
		String res="";
		if(ch>='0' && ch<='9') {
			res="숫자입니다";
		}else if(ch>='A' && ch<='z') {
			res="알파벳입니다";
		}else {
			res="기타문자입니다";
		}
		
//		
//		isDigit(char ch)
//		isAlphabetic(int codePoint)
//		isLowerCase(char ch)
//		isUpperCase(char ch)

		if(Character.isDigit(ch)==true) {
			System.out.println("숫자에요~");
		}else if(Character.isUpperCase(ch)) {
			System.out.println("알파벳 대문자요~");
		}else if(Character.isLowerCase(ch)) {
			System.out.println("알파벳 소문자요~");
		}
		else {
			System.out.println("기타 문자요~");
		}
		
	}

}
