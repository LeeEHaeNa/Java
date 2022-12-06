package day05;

public class SchoolApp {

	public static void main(String[] args) {
		//단위 테스트
		Student st=new Student();
		st.printInfo();
		st.setNo(1);
		st.setName("홍길동");
		st.setclassName("자바반");
		
		st.printInfo();
		
		String cname=st.getclassName();
		System.out.println(cname);
		
		Teacher tc=new Teacher();
		tc.setNo(100);
		tc.setName("김교사");
		tc.setSubject("C");
		
		tc.printInfo();
		
		
		Student st1=new Student();
		Student st2=new Student();
		st1.setNo(2);
		st1.setName("공부한다");
		st1.setclassName("알고리즘");
		
		st2.setNo(3);
		st2.setName("일한다");
		st2.setclassName("문법");
		
		Student starr[]= {st,st1,st2};
		for(int i=0; i<starr.length; i++) {
		starr[i].printInfo();
		}
		System.out.println("*******************");
		for(Student student:starr) {
			student.printInfo();
		}
		
		Staff wk1=new Staff();
		
		wk1.setNo(1111);
		wk1.setName("일한다");
		wk1.setDept("자바");
		
		wk1.printInfo();
	}
	
}
