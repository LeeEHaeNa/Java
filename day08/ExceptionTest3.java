package day08;
//for루프 안에서 예외 처리해보기 
public class ExceptionTest3 {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			try {
				int a=50/(i-3);
				System.out.println("a: "+a);
			}catch(ArithmeticException e){
				System.out.println("0으로 나눌수 없어요!!");
			}
			
		}//for----
		
		
		System.out.println("The End~~~~~");
		
		
	}

}
