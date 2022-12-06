package day05;

import java.util.Scanner;

//캡슐화하고 setter/getter를 구상하세요 
public class Student {

	private int no;
	private String name;
	private String className;
	
	public void setNo(int no) {
		this.no = no;
	};

	public void setName(String name) {
		// 지역변수와 멤버변수의 이름이 같을 경우에는 지역변수가 우선이다.
		// 이것을 구분하기 위해 멤버변수 앞에는 this. 을 붙인다.
		// this.변수 : 자기 객체의 인스턴스변수를 참조할 때 this를 붙인다.
		this.name = name;// 지역변수=지역변수 형태
	};

	public void setclassName(String className) {
		this.className = className;
	};

	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	public String getclassName() {
		return className;
	}

	/** 학생정보를 출력해 보여주는 메서드 */
	public void printInfo() {
		System.out.println("-------학생 정보-------");
		System.out.println("학  번: " + getNo());
		System.out.println("이  름: " + getName());
		System.out.println("학급명 : " + getclassName());
	}

	/** 학생정보를 입력받아 멤버변수에 저장하는 메서드 */
	public void inputInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학번 입력: ");
		// this.no=sc.nextInt();
		setNo(sc.nextInt());
		System.out.println("이름 입력: ");
		String nm = sc.next();
		this.name = nm;
		System.out.println("학급명 입력: ");
		this.className = sc.next();
	}
	/** 학생정보 없애는 메서드 */
	public void deleteInfo() {
		this.no=0;
		this.name=null;
		this.className=null;
	}

}
