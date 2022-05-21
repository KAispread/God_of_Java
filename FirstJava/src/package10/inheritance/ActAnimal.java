package package10.inheritance;

public class ActAnimal {

	public static void main(String[] args) {
		Animal [] ani = new Animal[3];
		ani[0] = new Dog("doogie", 60, 15);
		ani[1] = new Cat("hariang", 90, 10);
		ani[2] = new Animal();
		
		ani[0].attack();
		ani[1].attack();
		
		Animal sample = new Cat();
		sample.move();
		
	}
}
