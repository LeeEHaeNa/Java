package day09;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

import day10.Person;

public class VectorTest2 {

	public static void main(String[] args) {
		//[1] person객체 3개 생성 
		//[2] person저장할 vector생성하고 3개 객체 저장 
		//[3] for루프이용해서 벡터에저장된 person이름과 나이 출력 
		
		Person p1=new Person("공부한다",10);
		Person p2=new Person("일한다",20);
		Person p3=new Person("농사짓는다",30);

		Vector<Person> vp=new Vector<>(10,5);
		vp.add(p1);
		vp.add(p2);
		vp.add(p3);
		
		for(int i=0; i<vp.size(); i++) {
			Person p=vp.get(i);
			System.out.println(p.getName()+p.getAge());
		}
		//Enumeration<E>	elements()
		//Iterator<E>	iterator()
		
		/*Enumeration<E> elements()
		 * : 벡터에 저장된 객체들을 한꺼번에 꺼내오고자 할 때 사용.
		 * Enumeration과 Iterator인터페이스는 객체들을 집합체로
		 * 관리하도록 해주는 인터페이스이다.
		 * 이들 인터페이스에서는 각각의 객체들을 한 순간에 하나씩
		 * 처리할 수 있는 메소드를 제공한다.
		 * # Enumeration의 경우**********************************
		 * 	- boolean hasMoreElements() : 논리적 커서(첫번째 요소 직전에
		 * 				위치) 이후에 요소들이 있는지 물어서 있으면true
		 * 				없으면 false를 반환
		 *  - E nextElement(): 논리적 커서를 다음 요소로 이동하고
		 *  			현재 가리키고 있는 요소를 반환한다.
		 * # Iterator의 경우**************************************
		 * 	- boolean hasNext()
		 *  - E next() 
		 * */
		Enumeration<Person> en=vp.elements();
		while(en.hasMoreElements()) {
			Person p=en.nextElement();
			System.out.println(p.getName());
		}
		System.out.println("***************");
//		while(en.hasMoreElements()) {
//			Person p=en.nextElement();
//			System.out.println(p.getName());
//		}
		//Iterator<E>	iterator() 메서드 활용해서 vp의 요소들 이름 나이 출력하기
		
		Iterator<Person> it=vp.iterator();
		for(int i=1;it.hasNext();i++) {
			Person p=it.next();
			System.out.println(p.getName()+"#"+p.getAge());
		}
		//벡터에 저장된 요소들을 배열로 카피해보자.
//	void copyInto(Object[] anArray)
		Person[]arr=new Person[vp.size()];
		vp.copyInto(arr);
		for(Person a:arr) {
			System.out.println(a.getName());
		}
//		void removeAllElements()
	
//	void clear()
		//벡터에 저장된 객체 모두 지우기
		vp.clear();
		System.out.println("--clear 이후------");
		for(Person p:vp) {
			System.out.println(p.getName());
		}
	}


}
