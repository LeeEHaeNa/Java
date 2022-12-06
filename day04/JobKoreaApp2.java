package day04;

public class JobKoreaApp2 {

	public static void main(String[] args) {
		Person p=new Person();
		String info=p.memberInfo();
		System.out.println(info);
		
		p.name="이상화";
		p.age=22;
		p.skill="Java 중급";
		p.profile="개발경력 3년";
		
		info=p.memberInfo();
//		System.out.println(info);
		
		
		p.openProfile();
		
		System.out.println(p.state);
		
		p.changeState();
		System.out.println(p.state);
		
		p.openProfile();
		
//		[1]
//			객체를 2개 더 생성하세요. 이름,나이,스킬,프로필 정보를 할당하고
//			공개여부 설정한 뒤 프로필을 출력하세요  
		Person p1=new Person();
		Person p2=new Person();
		
		p1.name="일한다";
		p1.age=27;
		p1.skill="초급";
		p1.profile="개발경력 3년";
		
		p1.openProfile();
		
		System.out.println(p1.memberInfo());
		
		
		p2.name="공부한다";
		p2.age=44;
		p2.skill="특급";
		p2.profile="개발경력 20년";
		
		p2.openProfile();
		
		System.out.println(p2.memberInfo());
		

//		[2] 구직자 객체 3개를 저장할 배열을 선언하고 해당 배열에 저장하세요
//			반복문 이용해서 모든 구직자 정보를 출력하세요 
		Person[] arr=new Person[3];
		arr[0]=p;
		arr[1]=p1;
		arr[2]=p2;
		for(int i=0; i<arr.length; i++) {
			if(!arr[i].state)
				arr[i].changeState();
			arr[i].openProfile();
		}
		
		String []Employees;
		Employees=new String[3];
		Employees[0]=p.memberInfo();
		Employees[1]=p1.memberInfo();
		Employees[2]=p2.memberInfo();
		for(int i=0; i<Employees.length;i++) {
			System.out.println(Employees[i]);
		}
		
		}

	}