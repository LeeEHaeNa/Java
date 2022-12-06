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
	public class Employer {
		boolean likeornot=true;
		String experiencing="주니어 개발자";
		String personality="테스트통과자";
		
	public void Wanting(){
		System.out.println("----인재상 정보---------");
		System.out.println("코드리뷰회의좋아하는가 : "+likeornot);
		System.out.println("경력 : "+experiencing);
		System.out.println("인성 : "+personality);
	}
	
	public String Finding(String companyName) {
		String whatwant="같이 일하실분을 찾습니다.\n";
		whatwant+="저희는 "+companyName+"입니다."; 
		whatwant+="많은 지원 바랍니다. ";
		return whatwant;
		
	}
	
	public static void main(String args[]) {
		Employer employer=new Employer();
		employer.Wanting();
		System.out.println();
		String reply=employer.Finding("좋은회사");
		System.out.println(reply);
	}
}


