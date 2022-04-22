package package10;

public class ChildOverriding extends ParentOverriding {

	public ChildOverriding() {
		System.out.println("ChildOverriding Constructor");
	}
	
	//Overriding
	public void printName() {
		System.out.println("ChildOverriding printName()");
	}

}
