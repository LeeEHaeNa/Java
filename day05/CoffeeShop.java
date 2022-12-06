package day05;

public class CoffeeShop {

	public static void main(String[] args) {
		VendingMachine vm=new VendingMachine();
		// 밀크 커피 내오기
		vm.makeTea(1, 2, 3);
		// 설탕 커피 내오기 
		vm.makeTea(1, 2);
		// 블랙 커피 내오기 
		String black=vm.makeTea(1);
		System.out.println(black);
		// 크림 커피 내오기
		vm.makeTea((short)1, 3);
		// 유자차 내오기 
		Yuja y1=new Yuja();
		y1.setSugar(2);
		y1.setYuja(3);
		vm.makeTea(y1);
	}

}
