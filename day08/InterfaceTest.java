package day08;

interface MyInter{
	void foo(); //public abstract가 자동으로 붙는다. 
}////////////////////////
interface YourInter{
	
	String STR="Hi";//public static final 이 자동으로 붙는다.
	
	String bar();
	
}/////////////////////////////
//인터페이스를 상속받을 때는 implements로 받으며,
//다중 상속이 가능하다.
//concrete class
class MyClass implements MyInter, YourInter
{
	public void foo() {
		System.out.println("foo()");
	}
	public String bar() {
		return "bar()";
	}
	
}/////////////////////////////
public class InterfaceTest {
	
	public static void main(String[] args) {
//		MyInter mi=new MyInter();
		MyInter mi=new MyClass();
		//foo(), bar()
		mi.foo();
		//mi.bar()[x]
		String s=((MyClass)mi).bar();
		System.out.println(s);
	
		System.out.println(((YourInter)mi).bar());
		
		MyClass mc=new MyClass();
		mc.foo();
		System.out.println(mc.bar());
		
		//YourInter타입의 변수 선언하고 MyClass객체 생성해서
		//foo(),bar().STR 출력
		
		YourInter yi=new MyClass();
		((MyInter)yi).foo();
		String s2=yi.bar();
		System.out.println(s2);
		System.out.println(yi.STR);
		System.out.println(MyClass.STR);
	}
	
}
