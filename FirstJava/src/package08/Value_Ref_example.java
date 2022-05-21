package package08;

public class Value_Ref_example {

	public static void main(String[] args) {
		Value_Ref_example sample = new Value_Ref_example(); 
		Dog dog = new Dog();
		
		System.out.println("Before Call By Reference    :: age = "+dog.age+" name = "+dog.name+"");
		sample.changeParameters(dog);
		System.out.println("After Call By Reference     :: age = "+dog.age+" name = "+dog.name+"");
	}

	public void changeParameters(Dog ddg) {
		ddg.age = 3;
		ddg.name = "Hariang";
		System.out.println("In Method Call By Reference :: age = "+ddg.age+" name = "+ddg.name+"");
	}
}

class Dog {
	int age;
	String name;
	
	Dog() {
		this.age = 10;
		this.name = "Boogie"; 
	}
	
	public int getAge() {
		return this.age;
	}
	public String getName() {
		return this.name;
	}
}