package package08;

public class MemberDTO {
	String name;
	String phone;
	int age;
	
	public MemberDTO() {}
	public MemberDTO(String name) {
		this.name = name;
	}
	
	public MemberDTO(String name,String phone) {
		this.name = name;
		this.phone = phone;
	}
}
