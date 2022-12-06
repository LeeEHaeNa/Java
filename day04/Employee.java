package day04;

//---------------------------------------------------
//잡코리아, 사람인 같은 프로그램을 작성한다고 가정하고
//객체를 추출
//1. 구직자
//2. 기업
//3. 헤드헌터
//.....
//
//===> 클래스로 구현해보기
//	속성 +   행동양식
//	3~4       2개이상
//===> JobKorea클래스=>main()메서드에서 객체를 몇개 생성해서
//	속성값 주고 메서드 호출해보기
public class Employee {
	String name;
	String major;
	int age;
	
public void Experience(){
	System.out.println("----지원 정보---------");
	System.out.println("지원자: "+name);
	System.out.println("전공: "+major);
	System.out.println("나이: "+age);
}

public void Opinion() {
	System.out.println("4차 산업혁명시대에 맞춰 성장하는 개발자가 되겠습니다.");
	
}

public String apply(String company, String type) {
	String intro="안녕하세요,\n";
	intro+="저는 "+company+type+"에 지원한"+name+"이라고 합니다.\n";
	return intro;
};
	
	
}
