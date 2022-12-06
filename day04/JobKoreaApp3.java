package day04;

public class JobKoreaApp3 {

	public static void main(String[] args) {
		Company company = new Company();

		String item[] = { "당근마켓", "이스트소프트", "쿠쿠홀딩스" };
		for (String value : item) {
			if (value == "당근마켓") {
				System.out.printf(company.Introduction("당근마켓", "대기업", 20));
				company.Wanting(value);
				company.welfare(value);

				System.out.println("-----------------------------");
				System.out.println();
			}
			if (value == "이스트소프트") {
				System.out.println(company.Introduction("이스트소프트", "중소기업", 8));
				company.Wanting(value);
				company.welfare(value);

				System.out.println("-----------------------------");
				System.out.println();
			}
			if (value == "쿠쿠홀딩스") {
				System.out.println(company.Introduction("쿠쿠홀딩스", "중견기업", 14));
				company.Wanting(value);
				company.welfare(value);

				System.out.println("-----------------------------");
				System.out.println();
			}
		}
	}

}