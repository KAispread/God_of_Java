package package10.inheritance;

public class Animal {
	public String name;
	public int legCount;
	public int iq;
	public boolean hasWing;
	public int power;
	
	public Animal() {
		
	}
	
	public Animal(String name) {
		this.name = name;
	}
	
	public Animal(String name, int legCount, boolean hasWing) {
		this.name = name;
		this.legCount = legCount;
		this.hasWing = hasWing;
	}

	public Animal(String name, int legCount, boolean hasWing, int iq, int power) {
		this.name = name;
		this.legCount = legCount;
		this.hasWing = hasWing;
		this.iq = iq;
		this.power = power;
	}

	public void move() {
		System.out.println(":has moved");
	}
	public void eatFood() {
		System.out.println(":is eating Food");
	}
	public void attack() {
		System.out.println(":attack enemy");
	}
}
