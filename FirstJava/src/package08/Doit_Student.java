package package08;

public class Doit_Student {
	String name;
	String address;
	String phone;
	String email;
	
	public Doit_Student(String name) {
		this.name = name;
	}
	
	public Doit_Student(String name, String address, String phone, String email) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}
	
	public String toString() {
		return ""+name+" "+address+" "+phone+" "+email+"";
	}
}
