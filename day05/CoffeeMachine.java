package day05;

public class CoffeeMachine {
	//public : 어디서든 접근 가능 
	//private: access modifier(접근 지정자) 자기 클래스 내에서만 접근 가능 
	private int coffee;
	private int sugar;
	private short cream;
	
	//setter----- setCoffee(), set_coffee() 
	public void setCoffee(int c) {
		coffee=c;
	}
	
	public void setSugar(int d) {
		sugar=d;
	}
	
	public void setCream(short e) {
		cream=e;
	}
	
	//getter-----
	public int getCoffee() {
		return coffee;
	}
	
	public int getSugar() {
		return sugar;
	}
	
	public int getCream() {
		return cream;
	}
	
}////////////////////////////////
