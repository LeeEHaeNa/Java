package day09;
import java.util.*;
/*ArrayList
 * 	- java.util.List계열
 * 	- Vector와 기능은 동일
 *  - Vector는 메서드들이 동기화가 구현되어 있는 반면,
 *	  ArrayList는 동기화되어 있지 않음 => 가볍다 => 웹에서 주로 사용 
 * */
public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> arrList=new ArrayList<>();
		arrList.add("Java");
		arrList.add("HTML");
		arrList.add("CSS");
		System.out.println(arrList.size()+"개 저장");
		
		//iterator()메서드 이용해서 한꺼번에 출력하기 
		
		Iterator it=arrList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
//		Object[] toArray()
		Object[] arr=arrList.toArray();
		for(Object obj:arr) {
			System.out.println(obj);
			
		String str=arrList.get(2);
		System.out.println(str);
		Collections.sort(arrList);
		System.out.println("sort이후----------");
		it=arrList.iterator();
		for(int i=1;it.hasNext();i++) {
			String p=(String) it.next();
			System.out.println(i+": "+p);
		}
		
		
		}
	}

}
