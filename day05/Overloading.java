package day05;

class Superman {
	String name;
	int height;
	int power;

	// 생성자 오버로딩
	public Superman() {// 디폴트생성자
		this("아무개슈퍼맨", 160, 100);
//	this()는 생성자 안에서만 호출 가능하며
//	첫번째 줄에서 호출해야 한다 
//	super()와는 함께 사용할 수 없다.  
	}

	public Superman(String name) {
		this(name, 165, 200);
//		this.name=name;
//		height=165;
//		power=200;
	}

	public Superman(String name, int height) {
		this(name, height, 300);
//		this.name=name;
//		this.height=height;
//		power=300;
	}

	// target
	public Superman(String name, int height, int power) {
		this.name = name;
		this.height = height;
		this.power = power;
	}

	public String showInfo() {
		String str = "---슈퍼맨 정보----\n";
		str += "이름: " + name + "\n키 :" + height + "\n초능력: " + power;
		return str;
	}

}/////////////////////////

class Aquaman {
	String name;
	int height;
	double speed;

	// 생성자를 오버로딩 하세요 2개 이상
	// main()에서 Aquaman객체 생성해서 정보 출력해보기
	public Aquaman(String name, double speed) {
		this.name = name;
		height = 180;
		this.speed = speed;
	}

	public Aquaman(int height) {
		name = "바다의왕";
		this.height = height;
		speed = 400.11;
	}

	public String showInfo() {
		String str = "---아쿠아맨 정보----\n";
		str += "이름: " + name + "\n" + height + "\n초능력: " + speed;
		return str;
	}
}////////////////////////

public class Overloading {

	public static void main(String[] args) {
		// 슈퍼맨객체 생성후 showInfo()호출해서 정보 출력
		Superman sm = new Superman();
		sm.name = "나는";// sm.setName("나는");
		sm.height = 170;// sm.setHeight(170);
		sm.power = 500;

		String info = sm.showInfo();
		System.out.println(info);

		Superman s2 = new Superman("최슈퍼");
		System.out.println(s2.showInfo());

		Superman s3 = new Superman("장슈퍼", 159, 600);
		System.out.println(s3.showInfo());

		Aquaman aq = new Aquaman("아쿠아맨", 400.22);
		String info1 = aq.showInfo();
		System.out.println(info1);

		Aquaman aq1 = new Aquaman(175);
		String info2 = aq1.showInfo();
		System.out.println(info2);

//		슈퍼맨을 저장할 배열을 생성하고 저장한 뒤 반복문돌려 정보 출력하기 
		Superman spArr[] = { sm, s2, s3 };
		for (Superman superman : spArr) {
			System.out.println(superman.showInfo());
		}

		Object[] arr = { sm, s2, s3, aq, aq1 };
		// 반복문 써서 정보출력
		// instanceof 연산자
		/*
		 * 참조변수 instanceof 클래스명 :참조변수가 클래스의 객체이면 true, 아니면 false를 반환
		 * 
		 */
		System.out.println("##################");
		for (Object obj : arr) {
			if (obj instanceof Superman) {
				Superman st = (Superman) obj;
				System.out.println(st.showInfo());
			} else if (obj instanceof Aquaman) {
				Aquaman am = (Aquaman) obj;
				System.out.println(am.showInfo());
			}
		}

	}

}////////////////////////////
//상속받을 때는 extends 부모클래스
//"is a"관계가 성립되어야 한다.
//Superman is a Human [o]
// class Superman extends Human{}

