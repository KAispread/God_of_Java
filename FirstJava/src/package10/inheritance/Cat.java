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
	
	public void sliding() {
		
	}
}
