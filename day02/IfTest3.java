package day02;
//java 11버전 이후: java.base모듈만 사용 가능함 (java.lang, java.util, java.io, java.net)
import javax.swing.JOptionPane;
//=> java.desktop모듈이 필요
public class IfTest3 {

	public static void main(String[] args) {
		//Ctrl+D : 현재 커서 라인을 삭제함
		String kor=JOptionPane.showInputDialog("국어 점수를 입력하세요");
		String eng=JOptionPane.showInputDialog("영어 점수를 입력하세요");
		if(kor==null||eng==null) {
			System.out.println("값을 입력해야 해요");
			return;
		}
		
		
		//java.lang.Integer클래스의 메서드 
		//public static int parseInt(String s):문자열s를 정수로 변환해서 반환해준다.
		//static 메서드(클래스 메서드): "클래스명.메서드명()" 접근해야 함
		int total=Integer.parseInt(kor)+Integer.parseInt(eng);
		System.out.println("합계 점수: "+total);
		//합계점수를 출력하세요
		
		//평균점수 구해서
		//if문 이용해서 학점을 출력하세요
		//90점대:A
		//80점대:B
		//70점대:C
		//60점대:D
		//그외:F
		
		int average=total/2;
		char hakjum=' ';
		if(average>=90) {
//			System.out.println("학점: A, "+"평균: "+average);
			hakjum='A';
		}else if(average>=80) {
//			System.out.println("학점: B, "+"평균: "+average);
			hakjum='B';
		}else if(average>=70) {
//			System.out.println("학점: C, "+"평균: "+average);
			hakjum='C';
		}else if(average>=60) {
//			System.out.println("학점: D, "+"평균: "+average);
			hakjum='D';
		}else{
//			System.out.println("학점: F "+"평균: "+average);
			hakjum='F';
		}
		System.out.println("국어\t영어");
		System.out.println("-----------------");
		System.out.println(kor+"\t"+eng);
		System.out.println("-----------------");
		System.out.println("총합계: "+total);
		System.out.println("평 균: "+average);
		System.out.println("학 점: "+hakjum);
	}

}
