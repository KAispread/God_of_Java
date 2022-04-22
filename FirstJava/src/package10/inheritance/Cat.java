package package10.inheritance;

public class Cat extends Animal {
	public String nameOfThis;
	
	public Cat() {
		super("cat", 4, false);
	}
	public Cat(String nameOfThis, int iq, int power) {
		super("cat", 4, false, iq, power);
		this.nameOfThis = nameOfThis;
	}
	
	//Overriding 
	public void move() {
		System.out.print("The "+nameOfThis+"");
		super.move();
	}
	
	public void eatFood() {
		System.out.print("The "+nameOfThis+"");
		super.eatFood();
	}
	
	public void attack() {
		System.out.print("The "+nameOfThis+" that has "+power+" power point");
		super.attack();
	}
}
