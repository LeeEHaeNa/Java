package day10;

import java.util.HashSet;

public class HashSetTest2 {

	public static void main(String[] args) {
		//Person객체 3개 생성해서
		//HashSet에 저장한 뒤
		//반복문 이용해서 사람 정보를 출력하세요(이름, 나이);
		
		Person p1=new Person("공부한다",11);
		Person p2=new Person("일한다",22);
		Person p3=new Person("먹는다",33);
		
		HashSet<Person> hs=new HashSet<>();
		hs.add(p1);
		hs.add(p2);
		hs.add(p3);
		
		for(Person p:hs) {
			System.out.println(p.getName()+p.getAge());
		}
		System.out.println("*****************");
		Person ps4=new Person("일한다",22);
		Person ps5=p1;
		hs.add(ps4);
		hs.add(ps5);
		System.out.println("hs.size(): "+hs.size());
		
		for(Person p:hs) {
			System.out.println(p.getName()+p.getAge());
		}
		
	}

}
