package day03;

public class ForTest2 {

	public static void main(String[] args) {
		for(int i=1; i<3; i++) {//2 행의조건 
			for(int k=1; k<4; k++) {//3 열의 조건 
				System.out.println("i="+i+", k="+k);
			}
			System.out.println("---------------");
		}
		
		/*[1]
		 * 	*****
		 * 	*****
		 * 	*****
		 * 	*****
		 * 
		 *	4행 5열 
		 * 
		 * */
		for(int a=1;a<=4;a++) {
			for(int b=1;b<=5;b++) {
			}
			System.out.println("*****");
		}
		
		/*[2]
		 * 	*
		 * 	**
		 * 	***
		 * 	**** 
		 * 
		 * */
		for(int a=1;a<=4;a++) {
			for(int b=1;b<=a;b++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		System.out.println();
			
		/*[3]
		 * 	
		 * 		 *
		 * 		**
		 * 	   *** 
		 * 	  ****
		 * 
		 * */
		for(int a=0;a<4;a++) {
			for(int b=0;b<4;b++) {
				if(a+b<3) {
				System.out.print(" ");
				}else{
				System.out.print("*");
				}
			}//for
			System.out.println();
		}
		
		/*[4]
		 * 	
		 * 		 *
		 * 		***
		 * 	   ***** 
		 * 	 
		 * 
		 * */
		System.out.println("-----------------");
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<5;j++) {
				if((i+j>=2) && (j-i<=2))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
