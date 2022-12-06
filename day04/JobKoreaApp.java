package day04;

public class JobKoreaApp {

	public static void main(String[] args) {
		Employee p1=new Employee();
		Employee p2=new Employee();
		
		
		p1.name="이해나";
		p1.major="BusinessAdminstration";
		p1.age=31;
		
		p2.name="일해나";
		p2.major="Physics";
		p2.age=29;
		
		p1.Experience();
		p2.Experience();
		
	
		String info1=p1.apply("스타트업","신입");
		System.out.println(info1);
		
		String info2=p2.apply("네카라쿠배","경력");
		System.out.println(info2);
		
		
		}

	}