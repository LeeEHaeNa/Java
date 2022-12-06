package day10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;


public class Member {

	private static String name="이름";
	private static String pwd="비밀번호";
	private static String pnum="전화번호";


	public static String getName() {
		return name;
	}


	public static void setName(String name) {
		Member.name = name;
	}


	public static String getPwd() {
		return pwd;
	}


	public static void setPwd(String pwd) {
		Member.pwd = pwd;
	}


	public static String getPnum() {
		return pnum;
	}


	public static void setPnum(String pnum) {
		Member.pnum = pnum;
	}


	public static void main(String[] args) {
		
		HashMap<String, ArrayList> hm=new HashMap<>();
		
		ArrayList<String> v1List=new ArrayList<>();
		v1List.add(name+": 마동석");
		v1List.add(pwd+": hhh012");
		v1List.add(pnum+": 010-5555-1111");
		
		hm.put("멤버1", v1List);
		
		ArrayList<String> v2List=new ArrayList<>();
		v2List.add(name+": 주지훈");
		v2List.add(pwd+": q1w2e3r4");
		v2List.add(pnum+": 010-1111-2222");
		
		hm.put("멤버2", v2List);
		
		ArrayList<String> v3List=new ArrayList<>();
		v3List.add(name+": 하정우");
		v3List.add(pwd+": ab1234");
		v3List.add(pnum+": 010-1234-1234");
		
		hm.put("멤버3", v3List);
		
		Collection<ArrayList> ca=hm.values();
		
		for(ArrayList a:ca) {
			System.out.println(a);
		}
		
		
		
		
	}

}
/*
[실행결과]
[이름: 주지훈, 비밀번호: q1w2e3r4, 전화번호: 010-1111-2222]
[이름: 하정우, 비밀번호: ab1234, 전화번호: 010-1234-1234]
[이름: 마동석, 비밀번호: hhh012, 전화번호: 010-5555-1111]
*/


