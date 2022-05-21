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
	
	@Override
	public void move() {
		System.out.print("The "+nameOfThis+"");
		super.move();
	}
	
	@Override
	public void eatFood() {
		System.out.print("The "+nameOfThis+"");
		super.eatFood();
	}
	
	@Override
	public void attack() {
		System.out.print("The "+nameOfThis+" that has "+power+" power point");
		super.attack();
	}
}
