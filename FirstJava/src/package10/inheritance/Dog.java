package package10.inheritance;

public class Dog extends Animal{
	
	public String nameOfThis;
	
	public Dog() {
		super("dog", 4, false);
	}
	public Dog(String nameOfThis, int iq, int power) {
		super("dog", 4, false, iq, power);
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
