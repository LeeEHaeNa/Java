package day04;

//속성 3~4, 기능: 2개 이상
//JobKoreaÅpp에서 객체 생성해서 메서드 호출하기 
//배열에 회사객체 저장후 반복문 돌려 출력하기 
public class Company {
	String likeornot;
	String experiencing;
	String personality = "테스트통과자";

	public static void welfare(String name) {
		System.out.println("-------------복지-------------");
		if (name == "당근마켓") {
			System.out.println("경조사 및 상여금 지원");
			System.out.println("복지카드 있음");
			System.out.println("수면실 있음");
		} else if (name == "이스트소프트") {
			System.out.println("복지카드 있음");
			System.out.println("명절귀향비 지원");
		} else if (name == "쿠쿠홀딩스") {
			System.out.println("커피머신 있음");
			System.out.println("휴게실 있음");
			System.out.println("오후4시에 간식줌");
		}
	}

	public void Wanting(String name) {
		System.out.println("-----------인재상 정보----------");
		if (name == "당근마켓") {
			likeornot = "즐겨하시는분";
			experiencing = "4년 이상";
		} else if (name == "이스트소프트") {
			likeornot = "가끔 참여가능하신분";
			experiencing = "2년 이상";
		} else if (name == "쿠쿠홀딩스") {
			likeornot = "상관없음";
			experiencing = "경력무관";
		}
		System.out.println("코드리뷰회의좋아하는가 : " + likeornot);
		System.out.println("경력 : " + experiencing);
		System.out.println("인성 : " + personality);
	}

	public String Introduction(String company, String companySize, int fdWorkersnum) {
		String talking = "저희는 " + company + "이고 " + companySize + "입니다.\n";
		talking += "같이 일하실분을 " + fdWorkersnum + "명 찾습니다.\n";
		talking += "많은 지원 바랍니다. ";
		return talking;

	}

}
