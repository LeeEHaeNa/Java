package day11;
//매개변수없고 반환값도 없는 람다식 
@FunctionalInterface
interface MyFunc{
	void method();
}

@FunctionalInterface
interface YourFuc{
	void method(int a);
}
@FunctionalInterface
interface OurFunc{
	int method(int a, int b);
}
public class LambdaTest3 {
	static Thread tr;
	public static void main(String[] args) {
		MyFunc m1=()->System.out.println("###");
		m1.method();
		
		YourFuc m2=(x)->System.out.println("x: "+x);
		m2.method(3);
	
		m2= a ->{
			int res=a*5;
			System.out.println(res);
		};
		m2.method(10);
		
		m2= a -> System.out.println(a-3);
		m2.method(10);
		
		OurFunc o= (x, y) -> (int)Math.pow(x, y);
		int z=o.method(2, 5);
		System.out.println(z);
		
		tr=new Thread(()->{
			for(int i=0;i<5;i++) {
				System.out.println(tr.getName()+"달팽이가 기어갑니다");
				try {
					Thread.sleep(100);
				}catch(Exception e){
				}
				
			}
		});
		tr.start();
	}

}
